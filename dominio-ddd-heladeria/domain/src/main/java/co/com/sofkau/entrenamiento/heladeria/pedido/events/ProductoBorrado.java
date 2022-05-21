package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class ProductoBorrado extends DomainEvent {

    private final IdProducto idProducto;

    private final IdPedido idPedido;


    public ProductoBorrado(IdProducto idProducto, IdPedido idPedido) {
        super("co.com.sofkau.entrenamiento.heladeria.ProductoBorrado");
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
