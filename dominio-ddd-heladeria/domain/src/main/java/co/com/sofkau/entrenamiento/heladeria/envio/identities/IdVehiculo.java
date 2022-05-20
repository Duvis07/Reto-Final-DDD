package co.com.sofkau.entrenamiento.heladeria.envio.identities;

import co.com.sofka.domain.generic.Identity;

public class IdVehiculo extends Identity {
    public IdVehiculo(String id) {
        super(id);
    }

    public static IdVehiculo of(String id) {
        return new IdVehiculo(id);
    }
}
