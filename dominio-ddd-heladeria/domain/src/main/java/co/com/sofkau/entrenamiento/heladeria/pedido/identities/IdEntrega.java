package co.com.sofkau.entrenamiento.heladeria.pedido.identities;

import co.com.sofka.domain.generic.Identity;

public class IdEntrega extends Identity {

    public IdEntrega(String id) {
        super(id);
    }

    public static IdEntrega of(String id) {
        return new IdEntrega(id);
    }
}
