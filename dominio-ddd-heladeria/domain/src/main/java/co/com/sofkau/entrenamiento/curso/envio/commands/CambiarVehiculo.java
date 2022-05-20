package co.com.sofkau.entrenamiento.curso.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.curso.envio.values.*;

public class CambiarVehiculo extends Command {

    private  final IdVehiculo idVehiculo;

    private  final Marca marca;

    private  final Tipo tipo;


    public CambiarVehiculo(IdVehiculo idVehiculo, Marca marca, Tipo tipo) {
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