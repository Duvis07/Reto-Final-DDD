package co.com.sofkau.entrenamiento.heladeria.heladeria.identities;

import co.com.sofka.domain.generic.Identity;

public class IdMesero extends Identity {
    public IdMesero() {
    }

    public IdMesero(String id) {
        super(id);
    }

    public static IdMesero of(String id) {
        return new IdMesero(id);
    }
}
