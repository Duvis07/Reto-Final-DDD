package co.com.sofkau.entrenamiento.curso.heladeria.identities;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;

public class IdProveedor extends Identity {

    public IdProveedor(String id) {
        super(id);
    }

    public static IdProveedor of(String id) {
        return new IdProveedor(id);
    }
}
