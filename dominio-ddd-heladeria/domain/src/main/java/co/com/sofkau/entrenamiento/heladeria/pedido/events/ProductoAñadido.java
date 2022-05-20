package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;

public class ProductoAñadido extends DomainEvent {

    private final IdPedido idPedido;
    private final IdProducto idProducto;
    private final Sabor sabor;

    public ProductoAñadido(IdPedido idPedido, IdProducto idProducto, Sabor sabor) {
        super("co.com.sofkau.entrenamiento.heladeria.PedidoAñadido");
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.sabor = sabor;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }

    public IdProducto IdProducto() {
        return idProducto;
    }

    public Sabor Sabor() {
        return sabor;
    }
}
