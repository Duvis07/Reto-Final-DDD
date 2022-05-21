package co.com.sofkau.entrenamiento.heladeria.heladeria.identities;

import co.com.sofka.domain.generic.Identity;

public class IdAdministrador extends Identity {

    public IdAdministrador() {
    }

    public IdAdministrador(String id) {
        super(id);
    }

    public static IdAdministrador of(String id) {
        return new IdAdministrador(id);
    }
}
