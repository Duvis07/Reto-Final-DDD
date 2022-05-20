package co.com.sofkau.entrenamiento.curso.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdProducto;

public class ProductoReemplazado extends DomainEvent {

    private final IdProducto idProducto;

    public ProductoReemplazado(IdProducto idProducto) {
        super("co.com.sofkau.entrenamiento.curso.ProductoReemplazado");

        this.idProducto = idProducto;
    }


    public IdProducto idProducto() {
        return idProducto;
    }

}
