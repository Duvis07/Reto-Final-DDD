package heladeriaUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AsignarAdmin;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AsignarProveedor;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;

public class AsignarProveedorUseCase extends UseCase<RequestCommand<AsignarProveedor>, ResponseEvents> {



    @Override
    public void executeUseCase(RequestCommand<AsignarProveedor> asignarProveedorRequestCommand) {

        var command = asignarProveedorRequestCommand.getCommand();
        var heladeria = Heladeria.from(command.IdHeladeria(), retrieveEvents(command.IdHeladeria().value()));
        heladeria.asignarProveedor(command.IdProveedor(),command.IdHeladeria(), command.Nombre(), command.Correo(),command.Telefono());
        emit().onResponse(new ResponseEvents(heladeria.getUncommittedChanges()));
    }

    }
