package co.com.sofkau.entrenamiento.heladeria.envioUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EnvioCreado;
import co.com.sofkau.entrenamiento.heladeria.envio.events.RutaAñadida;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.*;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.envioUseCase.AñadirRutaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.mockito.Mockito.when;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */

@ExtendWith(MockitoExtension.class)
public class AñadirRutaUseCaseTest {
    @Mock
    private DomainEventRepository repository;


    @InjectMocks
    private AñadirRutaUseCase useCase;

    @Test
    void añadirRuta(){
        var event = new RutaAñadida(new IdEnvio("2"), IdRuta.of("1"), new Direccion("Cr50-12-34"), new Ciudad("Cali"),new Nombre( "colmenas"));
        when(repository.getEventsBy("2")).thenReturn(history());
        useCase.addRepository(repository);
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        var rutaAñadida = (RutaAñadida)events.get(0);
        Assertions.assertEquals("1", rutaAñadida.IdRuta().value());
    }

    private List<DomainEvent> history() {

        var  idEnvio = new  IdEnvio("2");
        var idHeladeria = new IdHeladeria("3");
        var nombre = new Nombre("inter");
        var descripcion = new Descripcion("Medellin");
        var envioCreado= new EnvioCreado(idEnvio,idHeladeria,nombre,descripcion);
        envioCreado.setAggregateRootId("2");
        return List.of(envioCreado );

    }

}


