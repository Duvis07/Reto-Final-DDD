package pedidosUseCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.entrenamiento.heladeria.heladeria.Heladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CrearHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.Pedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.CrearPedido;

/**
 * se crea caso de uso crear pedido
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CrearPedidoUseCase extends UseCase<RequestCommand<CrearPedido>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPedido> crearPedidoRequestCommand) {
        var command = crearPedidoRequestCommand.getCommand();
        var pedido = new Pedido(command.IdPedido(), command.Fecha(), command.Descripcion(), command.Cliente());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}
