package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

public class IdRuta extends Identity {

    public IdRuta(String id) {
        super(id);
    }

    public static IdRuta of(String id) {
        return new IdRuta(id);
    }
}
