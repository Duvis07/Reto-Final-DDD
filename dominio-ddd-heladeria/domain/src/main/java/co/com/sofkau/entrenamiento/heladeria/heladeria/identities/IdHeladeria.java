package co.com.sofkau.entrenamiento.heladeria.heladeria.identities;

import co.com.sofka.domain.generic.Identity;

public class IdHeladeria extends Identity {

    public IdHeladeria() {
    }

    public IdHeladeria(String id) {
        super(id);
    }

    public static IdHeladeria of(String id) {
        return new IdHeladeria(id);
    }
}
