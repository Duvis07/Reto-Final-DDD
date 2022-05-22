package co.com.sofkau.entrenamiento.heladeria.pedidoUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.pedido.Pedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AsignarEntrega;

/**
 * se crea caso de uso asignar entrega
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AsignarEntregaUseCase  extends UseCase<RequestCommand<AsignarEntrega>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AsignarEntrega> asignarEntregaRequestCommand) {

        var command = asignarEntregaRequestCommand.getCommand();
        var pedido = Pedido.from(command.IdPedido(), retrieveEvents(command.IdEntrega().value()));
        pedido.asignarEntrega(command.IdEntrega(), command.IdPedido(), command.NombreProducto(), command.Precio(), command.Fecha());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }

}
