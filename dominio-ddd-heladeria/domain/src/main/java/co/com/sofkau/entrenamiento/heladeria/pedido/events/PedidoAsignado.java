package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

public class PedidoAsignado extends DomainEvent {

    private final IdPedido idPedido;

    private final Nombre nombre;

    private final Descripcion descripcion;

    public PedidoAsignado(IdPedido idPedido, Nombre nombre, Descripcion descripcion){
        super("co.com.sofkau.entrenamiento.curso.PedidoAsignado ");

        this.idPedido = idPedido;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }
}
