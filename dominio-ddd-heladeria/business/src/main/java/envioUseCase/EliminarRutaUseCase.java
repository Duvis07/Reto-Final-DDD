package envioUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.EliminarRuta;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EliminarRutaUseCase extends UseCase<RequestCommand<EliminarRuta>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarRuta> eliminarRutaRequestCommand) {
        var command = eliminarRutaRequestCommand.getCommand();
        var envio = Envio.from(command.IdEnvio(), retrieveEvents(command.IdEnvio().value()));
        envio.eliminarRuta(command.IdEnvio(), command.IdRuta());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
