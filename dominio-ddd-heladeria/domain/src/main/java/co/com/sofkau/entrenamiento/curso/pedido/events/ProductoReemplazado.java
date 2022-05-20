package co.com.sofkau.entrenamiento.curso.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.curso.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.curso.pedido.values.Sabor;

public class ProductoReemplazado extends DomainEvent {

    private final IdProducto idProducto;

    private final Nombre nombre;

    private final Sabor sabor;

    private final Cantidad cantidad;

    public ProductoReemplazado(IdProducto idProducto, Nombre nombre, Sabor sabor, Cantidad cantidad) {
        super("co.com.sofkau.entrenamiento.curso.ProductoReemplazado");
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    public IdProducto IdProducto() {
        return idProducto;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Sabor Sabor() {
        return sabor;
    }

    public Cantidad Cantidad() {
        return cantidad;
    }
}
