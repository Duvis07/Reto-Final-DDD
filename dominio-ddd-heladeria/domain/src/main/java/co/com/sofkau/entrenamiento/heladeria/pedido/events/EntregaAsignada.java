package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;

import java.time.LocalDate;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EntregaAsignada extends DomainEvent {
    private final IdEntrega idEntrega;

    private final IdPedido idPedido;

    private final NombreProducto nombreProducto;

    private final Precio precio;

    private final Fecha fecha;


    public EntregaAsignada(IdEntrega idEntrega, IdPedido idPedido, NombreProducto nombreProducto, Precio precio, Fecha fecha) {
        super("co.com.sofkau.entrenamiento.heladeria.EntregaAsignada");
        this.idEntrega = idEntrega;
        this.idPedido = idPedido;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.fecha = fecha;


    }

    public IdEntrega IdEntrega() {
        return idEntrega;
    }


    public IdPedido IdPedido() {
        return idPedido;
    }

    public NombreProducto NombreProducto() {
        return nombreProducto;
    }

    public Precio Precio() {
        return precio;
    }

    public Fecha Fecha() {
        return fecha;
    }


}

