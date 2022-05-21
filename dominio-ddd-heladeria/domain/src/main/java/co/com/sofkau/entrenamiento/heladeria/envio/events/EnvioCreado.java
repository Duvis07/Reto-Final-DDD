package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

public class EnvioCreado extends DomainEvent {



    private  final Nombre nombre;
    private  final IdEnvio idEnvio;
    private  final IdEmisario idEmisario;
    private  final IdVehiculo idVehiculo;


    public EnvioCreado(Nombre nombre, IdEnvio idEnvio, IdEmisario idEmisario, IdVehiculo idVehiculo) {
        super("co.com.sofkau.entrenamiento.heladeria.EnvioCreado");
        this.nombre = nombre;
        this.idEnvio = idEnvio;
        this.idEmisario = idEmisario;
        this.idVehiculo = idVehiculo;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }

    public IdVehiculo IdVehiculo() {
        return idVehiculo;
    }
}
