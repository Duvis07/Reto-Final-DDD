package heladeriaUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CambiarNombreHeladeria;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CambiarNombreHeladeriaUseCase extends UseCase<RequestCommand<CambiarNombreHeladeria>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarNombreHeladeria> cambiarNombreHeladeriaRequestCommand) {
        var command = cambiarNombreHeladeriaRequestCommand.getCommand();
        var heladeria = Heladeria.from(command.IdHeladeria(), retrieveEvents(command.IdHeladeria().value()));
        heladeria.cambiarNombreHeladeria(command.IdHeladeria(), command.Nombre(), command.Ubicacion());
        emit().onResponse(new ResponseEvents(heladeria.getUncommittedChanges()));
    }
}
