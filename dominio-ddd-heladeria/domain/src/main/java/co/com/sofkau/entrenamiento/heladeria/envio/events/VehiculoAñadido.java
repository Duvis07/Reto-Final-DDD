package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Marca;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Modelo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Tipo;

public class VehiculoAñadido extends DomainEvent {


    private final IdEnvio idEnvio;
    private final IdVehiculo idVehiculo;

    private  final Marca marca;

    private  final Tipo tipo;

    private final Modelo modelo;

    public VehiculoAñadido(IdEnvio idEnvio , IdVehiculo idVehiculo,  Marca marca, Tipo tipo, Modelo modelo) {
        super("co.com.sofkau.entrenamiento.heladeria.VehiculoAñadido");
        this.idEnvio = idEnvio;
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public IdVehiculo IdVehiculo() {
        return idVehiculo;
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
