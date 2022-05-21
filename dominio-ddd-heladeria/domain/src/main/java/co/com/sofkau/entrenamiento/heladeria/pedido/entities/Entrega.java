package co.com.sofkau.entrenamiento.heladeria.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Entrega extends Entity<IdEntrega> {

    protected NombreProducto nombreProducto;

    protected Fecha fecha;
    protected Precio precio;

    public Entrega(IdEntrega idEntrega, NombreProducto nombreProducto, Fecha fecha, Precio precio) {
        super(idEntrega);
        this.nombreProducto = nombreProducto;
        this.fecha = fecha;
        this.precio = precio;
    }


    public NombreProducto NombreProducto() {
        return nombreProducto;
    }


    public Fecha Fecha() {
        return fecha;
    }

    public Precio Precio() {
        return precio;
    }

    public void cambiarNombre(NombreProducto nombreProducto) {
        this.nombreProducto = Objects.requireNonNull(nombreProducto);
    }

    public void cambiarPrecio(Precio precio) {
        this.precio = Objects.requireNonNull(precio);
    }

}
