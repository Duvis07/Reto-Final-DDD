package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

public class IdEmisario extends Identity {


    public IdEmisario () {
    }


    public IdEmisario(String id) {
        super(id);
    }

    public static IdEmisario of(String id) {
        return new IdEmisario(id);
    }
}
