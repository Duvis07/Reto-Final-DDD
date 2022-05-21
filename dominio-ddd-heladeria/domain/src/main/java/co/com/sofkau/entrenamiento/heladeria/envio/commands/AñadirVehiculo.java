package co.com.sofkau.entrenamiento.heladeria.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.*;

public class AñadirVehiculo extends Command {


    private  final IdEnvio idEnvio;
    private final IdVehiculo idVehiculo;

    private final Marca marca;

    private final Tipo tipo;

    private final Modelo modelo;

    public AñadirVehiculo(IdEnvio idEnvio, IdVehiculo idVehiculo, Marca marca, Tipo tipo, Modelo modelo) {
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