package co.com.sofkau.entrenamiento.heladeria.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

public class CrearEnvio extends Command {


    private  final Nombre nombre;
    private  final IdEnvio idEnvio;
    private  final IdEmisario idEmisario;
    private  final IdVehiculo idVehiculo;


    public CrearEnvio(Nombre nombre, IdEnvio idEnvio, IdEmisario idEmisario, IdVehiculo idVehiculo) {
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

