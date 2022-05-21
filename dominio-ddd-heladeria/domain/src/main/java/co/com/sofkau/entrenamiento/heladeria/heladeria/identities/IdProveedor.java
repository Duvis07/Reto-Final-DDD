package co.com.sofkau.entrenamiento.heladeria.heladeria.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdProveedor extends Identity {


    public IdProveedor() {
    }

    public IdProveedor(String id) {
        super(id);
    }

    public static IdProveedor of(String id) {
        return new IdProveedor(id);
    }
}
