package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;

public class PedidoCreado extends DomainEvent {

    private final IdPedido idPedido;

    private final Fecha fecha;

    private final Descripcion descripcion;

    private final Cliente cliente;

    public PedidoCreado(IdPedido idPedido, Fecha fecha, Descripcion descripcion, Cliente cliente) {
        super("co.com.sofkau.entrenamiento.heladeria.PedidoCreado");
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }

    public Cliente Cliente() {
        return cliente;
    }
}



