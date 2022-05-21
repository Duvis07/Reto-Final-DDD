package envioUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.CrearEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EnvioCreado;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CrearHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import envioUseCase.CrearEnvioUseCase;
import heladeriaUseCase.CrearHeladeriaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CrearEnvioUseCaseTest {

    private CrearEnvioUseCase crearEnvioUseCase;

    @BeforeEach
    public void setup() {
        crearEnvioUseCase = new CrearEnvioUseCase();
    }

    @Test
    public void crearEnvio() {
        var command = new CrearEnvio(
                IdEnvio.of("13"),
                new IdHeladeria("2"),
                new Nombre("inter"),
                new Descripcion("Medellin"));

        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("13")
                .syncExecutor(crearEnvioUseCase, new RequestCommand<>(command))
                .orElseThrow();
        List<DomainEvent> events = response.getDomainEvents();
        EnvioCreado envioCreado = (EnvioCreado) events.get(0);
        Assertions.assertEquals("2", envioCreado.IdHeladeria().value());
        Assertions.assertEquals("inter", envioCreado.Nombre().value());
        Assertions.assertEquals("Medellin", envioCreado.Descripcion().value());
    }
}


