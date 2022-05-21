package heladeriausecasetest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AñadirMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.MeseroAñadido;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Sexo;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import heladeriaUseCase.AñadirMeseroUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AñadirMeseroUseCaseTest {
    private AñadirMeseroUseCase añadirMeseroUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        añadirMeseroUseCase = new AñadirMeseroUseCase();
        repository = mock(DomainEventRepository.class);
        añadirMeseroUseCase.addRepository(repository);
    }

    @Test
    public void añadirMesa(){

        //Arrange
        var command = new AñadirMesero(
                new IdMesero("2"),
                new Nombre("Azul"),
                IdHeladeria.of("22"),
                new Telefono(3216102),
                new Edad(32),
                 new Sexo("masculino"));

        when(repository.getEventsBy("22")).thenReturn(events());

        // Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("22")
                .syncExecutor(añadirMeseroUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        MeseroAñadido meseroAñadido = (MeseroAñadido) events.get(0);
        Assertions.assertEquals("2", meseroAñadido.IdMesero().value());
        Assertions.assertEquals("Azul", meseroAñadido.Nombre().value());
        Assertions.assertEquals(3216102, meseroAñadido.Telefono().value());
        Assertions.assertEquals(32, meseroAñadido.Edad().value());
        Assertions.assertEquals("masculino", meseroAñadido.Sexo().value());
    }

    private List<DomainEvent> events(){
        return List.of(new HeladeriaCreada(
                IdHeladeria.of("41"),
                new Nombre("Rincon de las delicias"),
                new Telefono(3114593),
                new Ubicacion("Medellin")
        ));
    }
}


