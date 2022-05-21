package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdVehiculo extends Identity {

    public IdVehiculo() {
    }

    public IdVehiculo(String id) {
        super(id);
    }

    public static IdVehiculo of(String id) {
        return new IdVehiculo(id);
    }
}
