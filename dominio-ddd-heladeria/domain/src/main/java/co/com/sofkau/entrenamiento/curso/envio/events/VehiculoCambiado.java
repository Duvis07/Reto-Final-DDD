package co.com.sofkau.entrenamiento.curso.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdVehiculo;

public class VehiculoCambiado extends DomainEvent {

    private final IdVehiculo idVehiculo;

    public VehiculoCambiado(IdVehiculo idVehiculo) {
        super("co.com.sofkau.entrenamiento.curso.EnvioLocalizado");
        this.idVehiculo = idVehiculo;
    }

    public IdVehiculo IdVehiculo() {
        return idVehiculo;
    }
}
