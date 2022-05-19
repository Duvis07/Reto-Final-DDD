package co.com.sofkau.entrenamiento.curso.heladeria.identities;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;

public class IdHeladeria extends Identity {

    public IdHeladeria(String id) {
        super(id);
    }

    public static IdHeladeria of(String id) {
        return new IdHeladeria(id);
    }
}
