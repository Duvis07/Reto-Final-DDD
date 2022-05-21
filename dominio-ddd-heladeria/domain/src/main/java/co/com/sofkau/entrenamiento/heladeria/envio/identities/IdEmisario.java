package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdEmisario extends Identity {


    public IdEmisario() {
    }


    public IdEmisario(String id) {
        super(id);
    }

    public static IdEmisario of(String id) {
        return new IdEmisario(id);
    }
}
