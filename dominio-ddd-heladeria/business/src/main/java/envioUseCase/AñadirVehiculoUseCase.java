package envioUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.AñadirVehiculo;


public class AñadirVehiculoUseCase extends UseCase<RequestCommand<AñadirVehiculo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AñadirVehiculo> asignarVehiculoRequestCommand) {
            var command = asignarVehiculoRequestCommand.getCommand();
            var envio = Envio.from(command.IdEnvio(), retrieveEvents(command.IdEnvio().value()));
            envio.añadirVehiculo(command.IdEnvio(), command.IdVehiculo(), command.Marca(), command.Tipo(),command.Modelo());
            emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
        }

    }


