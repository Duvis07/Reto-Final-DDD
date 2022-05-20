package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Marca;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Tipo;

public class VehiculoCambiado extends DomainEvent {

    private final IdVehiculo idVehiculo;

    private  final Marca marca;

    private  final Tipo tipo;

    public VehiculoCambiado(IdVehiculo idVehiculo, Marca marca, Tipo tipo) {
        super("co.com.sofkau.entrenamiento.curso.VehiculoCambiado");
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.tipo = tipo;
    }

    public IdVehiculo IdVehiculo() {
        return idVehiculo;
    }

    public Marca Marca() {
        return marca;
    }

    public Tipo Tipo() {
        return tipo;
    }
}
