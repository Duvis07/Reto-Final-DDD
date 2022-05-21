package heladeriaUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CrearHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
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
public class CrearHeladeriaUseCaseTest {

    private CrearHeladeriaUseCase crearHeladeriaUseCase;

    @BeforeEach
    public void setup() {
        crearHeladeriaUseCase = new CrearHeladeriaUseCase();
    }

    @Test
    public void crearHeladeria() {
        var command = new CrearHeladeria(
                IdHeladeria.of("13"),
                new Nombre("Crepes & Waffles"),
                new Telefono(30452213),
                new Ubicacion("Medellin"));

        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("13")
                .syncExecutor(crearHeladeriaUseCase, new RequestCommand<>(command))
                .orElseThrow();
        List<DomainEvent> events = response.getDomainEvents();
        HeladeriaCreada heladeriaCreada = (HeladeriaCreada) events.get(0);
        Assertions.assertEquals("Crepes & Waffles", heladeriaCreada.Nombre().value());
        Assertions.assertEquals(30452213, heladeriaCreada.Telefono().value());
        Assertions.assertEquals("Medellin", heladeriaCreada.Ubicacion().value());
    }
}
