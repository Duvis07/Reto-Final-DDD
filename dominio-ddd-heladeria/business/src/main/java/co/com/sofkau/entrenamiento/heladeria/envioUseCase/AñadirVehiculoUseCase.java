package co.com.sofkau.entrenamiento.heladeria.envioUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.AñadirVehiculo;
/**
 * Se crea caso de uso añadir vehiculo
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */

public class AñadirVehiculoUseCase extends UseCase<RequestCommand<AñadirVehiculo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AñadirVehiculo> asignarVehiculoRequestCommand) {
            var command = asignarVehiculoRequestCommand.getCommand();
            var envio = Envio.from(command.IdEnvio(), retrieveEvents(command.IdEnvio().value()));
            envio.añadirVehiculo(command.IdEnvio(), command.IdVehiculo(), command.Marca(), command.Tipo(),command.Modelo());
            emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
        }

    }


