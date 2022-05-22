package envioUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EmisarioCambiado;

/**
 * Se crea caso de uso cambiar emisario
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CambiarEmisarioUseCase extends UseCase<TriggeredEvent<EmisarioCambiado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<EmisarioCambiado> emisarioCambiadoTriggeredEvent) {
        var event = emisarioCambiadoTriggeredEvent.getDomainEvent();
        var envio = Envio.from(
                event.IdEnvio(),
                repository().getEventsBy(event.IdEnvio().value())
        );

        envio.cambiarEmisario(event.IdEmisario(), event.Nombre(), event.Telefono(), event.Correo());

        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}




