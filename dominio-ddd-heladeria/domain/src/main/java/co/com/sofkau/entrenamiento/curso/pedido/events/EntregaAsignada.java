package co.com.sofkau.entrenamiento.curso.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdPedido;

public class EntregaAsignada extends DomainEvent {
    private final IdEntrega idEntrega;

    public EntregaAsignada(IdEntrega idEntrega){
        super("co.com.sofkau.entrenamiento.curso.EntregaAsignada");

        this.idEntrega = idEntrega;
    }


    public IdEntrega idEntrega() {
        return idEntrega();
    }
}

