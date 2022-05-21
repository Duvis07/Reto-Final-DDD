package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Marca;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Modelo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Tipo;

public class VehiculoAsignado extends DomainEvent {

    private final IdVehiculo idVehiculo;

    private final IdEmisario idEmisario;

    private  final Marca marca;

    private  final Tipo tipo;

    private final Modelo modelo;

    public VehiculoAsignado(IdVehiculo idVehiculo, IdEmisario idEmisario, Marca marca, Tipo tipo, Modelo modelo) {
        super("co.com.sofkau.entrenamiento.heladeria.VehiculoAsignado");
        this.idVehiculo = idVehiculo;
        this.idEmisario = idEmisario;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public IdVehiculo IdVehiculo() {
        return idVehiculo;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }

    public Modelo Modelo() {
        return modelo;
    }

    public Marca Marca() {
        return marca;
    }

    public Tipo Tipo() {
        return tipo;
    }
}
