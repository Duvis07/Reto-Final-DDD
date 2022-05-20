package co.com.sofkau.entrenamiento.heladeria.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;

import java.util.Objects;

public class Producto extends Entity<IdProducto> {

    protected Nombre nombre;
    protected Sabor sabor;
    protected Cantidad cantidad;

    public Producto(IdProducto idProducto, Sabor sabor) {
        super(idProducto);
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidad = cantidad;
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

    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void cambiarSabor(Sabor sabor) {
        this.sabor = Objects.requireNonNull(sabor);
    }

    public void cambiarCantidad(Cantidad cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);
    }
}
