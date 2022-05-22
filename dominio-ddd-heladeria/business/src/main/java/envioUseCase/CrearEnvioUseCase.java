package envioUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.CrearEnvio;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;

/**
 * Se crea caso de uso crear envio
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CrearEnvioUseCase extends UseCase<RequestCommand<CrearEnvio>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEnvio> crearEnvioRequestCommand) {
        var command = crearEnvioRequestCommand.getCommand();
        var envio = new Envio(command.IdEnvio(), command.IdHeladeria(), command.Nombre(), command.Descripcion());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
