package co.com.sofkau.entrenamiento.heladeria.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.*;

public class AsignarVehiculo extends Command {

    private final IdVehiculo idVehiculo;

    private final IdEmisario idEmisario;

    private final Marca marca;

    private final Tipo tipo;


    private final Modelo modelo;

    public AsignarVehiculo(IdVehiculo idVehiculo, IdEmisario idEmisario, Marca marca, Tipo tipo, Modelo modelo) {
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