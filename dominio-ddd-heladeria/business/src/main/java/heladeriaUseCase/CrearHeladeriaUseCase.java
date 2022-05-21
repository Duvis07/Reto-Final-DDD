package heladeriaUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CrearHeladeria;

public class CrearHeladeriaUseCase extends UseCase<RequestCommand<CrearHeladeria>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearHeladeria> crearHeladeriaRequestCommand) {
        var command = crearHeladeriaRequestCommand.getCommand();
        var heladeria = new Heladeria(command.IdHeladeria(), command.Nombre(), command.Telefono(), command.Ubicacion());
        emit().onResponse(new ResponseEvents(heladeria.getUncommittedChanges()));
    }
}
