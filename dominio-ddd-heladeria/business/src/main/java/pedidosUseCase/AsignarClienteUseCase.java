package pedidosUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.pedido.Pedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AsignarCliente;

/**
 * se crea caso de uso asignar cliente
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AsignarClienteUseCase  extends UseCase<RequestCommand<AsignarCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarCliente> asignarClienteRequestCommand) {
        var command = asignarClienteRequestCommand.getCommand();
        var pedido = Pedido.from(command.IdPedido(), retrieveEvents(command.IdCliente().value()));
        pedido.asignarCliente(command.IdPedido(), command.IdCliente(), command.Nombre(), command.Telefono());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}