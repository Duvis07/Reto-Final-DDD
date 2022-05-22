package heladeriaUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.EliminarMesero;

/**
 * se crea caso de uso eliminar mesero
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EliminarMeseroUseCase extends UseCase<RequestCommand<EliminarMesero>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<EliminarMesero> eliminarMeseroRequestCommand) {
        var command = eliminarMeseroRequestCommand.getCommand();
        var heladeria = Heladeria.from(command.IdHeladeria(), retrieveEvents(command.IdHeladeria().value()));
        heladeria.eliminarMesero(command.IdHeladeria(), command.IdMesero());
        emit().onResponse(new ResponseEvents(heladeria.getUncommittedChanges()));
    }
}


