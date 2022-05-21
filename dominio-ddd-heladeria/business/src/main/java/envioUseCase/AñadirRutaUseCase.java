package envioUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EmisarioCambiado;
import co.com.sofkau.entrenamiento.heladeria.envio.events.RutaAñadida;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirRutaUseCase extends UseCase<TriggeredEvent<RutaAñadida>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<RutaAñadida> rutaAñadidaTriggeredEvent) {
        var event = rutaAñadidaTriggeredEvent.getDomainEvent();
        var envio= Envio.from(
                event.IdEnvio(),
                repository().getEventsBy(event.IdEnvio().value())
        );

        envio.añadirRuta(event.IdRuta(),event.Nombre(),event.Ciudad(),event.Direccion());

        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
