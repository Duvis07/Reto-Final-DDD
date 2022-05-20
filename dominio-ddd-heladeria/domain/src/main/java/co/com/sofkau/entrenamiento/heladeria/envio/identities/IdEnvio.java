package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

public class IdEnvio extends Identity {


    public IdEnvio(String id) {
        super(id);
    }

    public static IdEnvio of(String id) {
        return new IdEnvio(id);
    }
}


