package pedidosUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.pedido.Pedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AñadirProducto;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirProductoUseCase extends UseCase<RequestCommand<AñadirProducto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AñadirProducto> añadirProductoRequestCommand) {
        var command = añadirProductoRequestCommand.getCommand();
        var pedido = Pedido.from(command.IdPedido(), retrieveEvents(command.IdProducto().value()));
        pedido.añadirProducto(command.IdPedido(), command.IdProducto(), command.Nombre(), command.Sabor(), command.Cantidad());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));

    }
}