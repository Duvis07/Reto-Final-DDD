package heladeriaUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AñadirMesero;

/**
 * se crea caso de uso añadir mesero
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirMeseroUseCase extends UseCase<RequestCommand<AñadirMesero>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AñadirMesero> añadirMeseroRequestCommand) {
        var command = añadirMeseroRequestCommand.getCommand();
        var heladeria = Heladeria.from(command.IdHeladeria(), retrieveEvents(command.IdHeladeria().value()));
        heladeria.añadirMesero(command.IdMesero(), command.Nombre(), command.Telefono(), command.Edad(), command.Sexo());
        emit().onResponse(new ResponseEvents(heladeria.getUncommittedChanges()));
    }
}