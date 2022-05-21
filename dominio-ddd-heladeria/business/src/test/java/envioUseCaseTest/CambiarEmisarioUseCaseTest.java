package envioUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EmisarioCambiado;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EnvioCreado;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import envioUseCase.CambiarEmisarioUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class CambiarEmisarioUseCaseTest {

    @Mock
    private DomainEventRepository repository;


    @InjectMocks
    private CambiarEmisarioUseCase useCase;

    @Test
    void actualizarEmisario(){
        var event = new EmisarioCambiado(new IdEnvio("2"), IdEmisario.of("1"), new  Nombre("carlos"), new Telefono(12345),new Correo( "marito"));
        when(repository.getEventsBy("2")).thenReturn(history());
        useCase.addRepository(repository);
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        var emisarioCambiado = (EmisarioCambiado)events.get(0);
        Assertions.assertEquals("1",emisarioCambiado.IdEmisario().value());
    }

    private List<DomainEvent> history() {
       var  idEnvio = new  IdEnvio("2");
        var idHeladeria = new IdHeladeria("2");
        var nombre = new Nombre("inter");
        var descripcion = new Descripcion("Medellin");
        var envioCreado= new EnvioCreado(idEnvio,idHeladeria,nombre,descripcion);
         envioCreado.setAggregateRootId("2");
        return List.of(envioCreado );
    }

}

