package co.com.sofkau.entrenamiento.heladeria.pedido.identities;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Entrega;

public class IdEntrega extends Identity {

    public IdEntrega() {
    }

    public IdEntrega(String id) {
        super(id);
    }

    public static IdEntrega of(String id) {
        return new IdEntrega(id);
    }
}
