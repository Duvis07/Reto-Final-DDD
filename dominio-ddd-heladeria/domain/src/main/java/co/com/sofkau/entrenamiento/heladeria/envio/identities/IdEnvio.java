package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdEnvio extends Identity {

    public IdEnvio() {
    }


    public IdEnvio(String id) {
        super(id);
    }

    public static IdEnvio of(String id) {
        return new IdEnvio(id);
    }
}


