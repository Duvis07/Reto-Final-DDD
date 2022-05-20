package co.com.sofkau.entrenamiento.curso.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdCliente;

public class ClienteActualizado extends DomainEvent {

    private final IdCliente idCliente;

    public ClienteActualizado( IdCliente idCliente) {
        super("co.com.sofkau.entrenamiento.curso.ClienteActualizado");
        this.idCliente = idCliente;


    }

    public IdCliente idCliente() {
        return idCliente;
    }
}


