package co.com.sofkau.entrenamiento.heladeria.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;

import java.util.Objects;

/**
 * se crea entidad producto con sus comportamientos y objetos de valor
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */

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
