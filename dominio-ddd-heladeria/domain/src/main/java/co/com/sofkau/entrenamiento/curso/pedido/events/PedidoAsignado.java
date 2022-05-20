package co.com.sofkau.entrenamiento.curso.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdPedido;

public class PedidoAsignado extends DomainEvent {

    private final IdPedido idPedido;

    public PedidoAsignado(IdPedido idPedido ){
        super("co.com.sofkau.entrenamiento.curso.PedidoAsignado ");
        this.idPedido = idPedido;
    }


    public IdPedido getIdPedido() {
        return idPedido;
    }
}
