package pedidosUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.pedido.Pedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.BorrarProducto;

public class BorrarProductoUseCase extends UseCase<RequestCommand<BorrarProducto>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<BorrarProducto> borrarProductoRequestCommand) {
        var command = borrarProductoRequestCommand.getCommand();
        var pedido = Pedido.from(command.IdPedido(), retrieveEvents(command.IdProducto().value()));
        pedido.borrarProducto(command.IdPedido(), command.IdProducto());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}

