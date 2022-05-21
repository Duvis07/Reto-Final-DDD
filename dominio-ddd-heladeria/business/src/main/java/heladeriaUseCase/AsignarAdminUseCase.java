package heladeriaUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AsignarAdmin;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AsignarAdminUseCase extends UseCase<RequestCommand<AsignarAdmin>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsignarAdmin> asignarAdminRequestCommand) {
        var command = asignarAdminRequestCommand.getCommand();
        var heladeria = Heladeria.from(command.IdHeladeria(), retrieveEvents(command.IdHeladeria().value()));
        heladeria.asignarAdmin(command.IdAdministrador(), command.Nombre(), command.Telefono(), command.Correo());
        emit().onResponse(new ResponseEvents(heladeria.getUncommittedChanges()));
    }
}