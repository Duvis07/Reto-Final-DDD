package co.com.sofkau.entrenamiento.curso.envio.entities;



import co.com.sofka.domain.generic.Entity;

import co.com.sofkau.entrenamiento.curso.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.curso.envio.values.Marca;
import co.com.sofkau.entrenamiento.curso.envio.values.Modelo;
import co.com.sofkau.entrenamiento.curso.envio.values.Tipo;

public class Vehiculo extends Entity<IdVehiculo> {

    private Marca marca;

    private Modelo modelo;

    private Tipo tipo;

    public Vehiculo(IdVehiculo entityId, Marca marca, Modelo modelo, Tipo tipo) {
        super(entityId);
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Vehiculo(IdVehiculo entityId) {
        super(entityId);
    }


    public void addVehiculo(){

    }
}