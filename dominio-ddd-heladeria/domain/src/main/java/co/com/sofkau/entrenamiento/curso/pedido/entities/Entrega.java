package co.com.sofkau.entrenamiento.curso.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.curso.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.curso.pedido.values.Precio;

import java.time.LocalDate;

public class Entrega extends Entity<IdEntrega> {

    protected NombreProducto nombreProducto;
    protected LocalDate fecha;
    protected Precio precio;

    public Entrega(IdEntrega entityId, NombreProducto nombreProducto, LocalDate fecha, Precio precio) {
        super(entityId);
        this.nombreProducto = nombreProducto;
        this.fecha = fecha;
        this.precio = precio;
    }

    public void asignarEntrega(){

    }
}
