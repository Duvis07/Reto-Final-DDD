package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;

public class BorrarProducto extends Command {

    private final IdProducto idProducto;


    private final IdPedido idPedido;


    public BorrarProducto(IdProducto idProducto, IdPedido idPedido) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
    }


    public IdProducto IdProducto() {
        return idProducto;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }
}
