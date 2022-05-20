package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;

import java.time.LocalDate;

public class EntregaAsignada extends DomainEvent {
    private final IdEntrega idEntrega;

    private final NombreProducto nombreProducto;

    private final Precio precio;

    private final LocalDate Fecha;


    public EntregaAsignada(IdEntrega idEntrega, NombreProducto nombreProducto, Precio precio, LocalDate fecha) {
        super("co.com.sofkau.entrenamiento.curso.EntregaAsignada");
        this.idEntrega = idEntrega;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        Fecha = fecha;


    }

    public IdEntrega IdEntrega() {
        return idEntrega;
    }

    public NombreProducto NombreProducto() {
        return nombreProducto;
    }

    public Precio Precio() {
        return precio;
    }

    public LocalDate Fecha() {
        return Fecha;
    }


}

