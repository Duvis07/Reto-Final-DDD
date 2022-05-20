package co.com.sofkau.entrenamiento.curso.pedido.identities;

import co.com.sofka.domain.generic.Identity;


public class IdPedido extends Identity {

    public IdPedido(String id) {
        super(id);
    }

    public static IdPedido of(String id) {
        return new IdPedido(id);
    }
}
