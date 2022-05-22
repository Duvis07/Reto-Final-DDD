package co.com.sofkau.entrenamiento.heladeria.envioUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.EliminarRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EnvioCreado;
import co.com.sofkau.entrenamiento.heladeria.envio.events.RutaEliminada;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;

import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.envioUseCase.EliminarRutaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


import java.util.List;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EliminarRutaUseCaseTest {

    private EliminarRutaUseCase eliminarRutaUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        eliminarRutaUseCase = new EliminarRutaUseCase();
        repository = mock(DomainEventRepository.class);
        eliminarRutaUseCase.addRepository(repository);
    }

    @Test
    public void eliminarRuta() {
        //Arrange
        var command = new EliminarRuta(
                IdEnvio.of("4"),
                new IdRuta("4"));
        when(repository.getEventsBy("4")).thenReturn(events());

        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("4")
                .syncExecutor(eliminarRutaUseCase, new RequestCommand<>(command))
                .orElseThrow();

        var events = response.getDomainEvents();

        RutaEliminada rutaEliminada = (RutaEliminada) events.get(0);
        Assertions.assertEquals("4", rutaEliminada.IdRuta().value());
    }

    private List<DomainEvent> events() {
        return List.of(new EnvioCreado(
                IdEnvio.of("21"),
                new IdHeladeria("11"),
                new Nombre("Rincon de las delicias"),
                new Descripcion("enviar helados a bogota")

        ));
    }
}
