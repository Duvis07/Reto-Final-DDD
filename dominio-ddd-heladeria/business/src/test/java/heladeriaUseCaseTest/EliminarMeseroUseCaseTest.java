package heladeriaUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.EliminarMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.MeseroAñadido;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.MeseroEliminado;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Sexo;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import heladeriaUseCase.EliminarMeseroUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EliminarMeseroUseCaseTest {

    private EliminarMeseroUseCase eliminarMeseroUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        eliminarMeseroUseCase = new EliminarMeseroUseCase();
        repository = mock(DomainEventRepository.class);
        eliminarMeseroUseCase.addRepository(repository);
    }

    @Test
    public void eliminarMesero() {
        //Arrange
        var command = new EliminarMesero(
                IdHeladeria.of("10"),
                new IdMesero("10"));
        when(repository.getEventsBy("10")).thenReturn(events());

        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("10")
                .syncExecutor(eliminarMeseroUseCase, new RequestCommand<>(command))
                .orElseThrow();

        var events = response.getDomainEvents();
        MeseroEliminado meseroEliminada = (MeseroEliminado) events.get(0);

        // Assertions
        Assertions.assertEquals("10", meseroEliminada.IdMesero().value());
    }

    private List<DomainEvent> events() {
        return List.of(

                new HeladeriaCreada(
                        IdHeladeria.of("41"),
                        new Nombre("deliSuper"),
                        new Telefono(3114593),
                        new Ubicacion("Abejorral")
                ),
                new MeseroAñadido(
                        new IdMesero("4"),
                        new Nombre("Pablo"),
                        new Telefono(3114593),
                        new Edad(32),
                        new Sexo("masculino")));


    }


}

