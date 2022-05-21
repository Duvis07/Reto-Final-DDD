package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdRuta extends Identity {

    public IdRuta() {
    }

    public IdRuta(String id) {
        super(id);
    }

    public static IdRuta of(String id) {
        return new IdRuta(id);
    }
}
