package co.com.sofkau.entrenamiento.heladeria.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;

import java.time.LocalDate;
import java.util.Objects;

public class Entrega extends Entity<IdEntrega> {

    protected NombreProducto nombreProducto;
    protected LocalDate fecha;
    protected Precio precio;

    public Entrega(IdEntrega idEntrega, NombreProducto nombreProducto, LocalDate fecha, Precio precio) {
        super(idEntrega);
        this.nombreProducto = nombreProducto;
        this.fecha = fecha;
        this.precio = precio;
    }


    public NombreProducto NombreProducto() {
        return nombreProducto;
    }

    public LocalDate Fecha() {
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
