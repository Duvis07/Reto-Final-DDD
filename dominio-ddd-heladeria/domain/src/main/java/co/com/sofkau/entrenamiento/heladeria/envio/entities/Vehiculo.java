package co.com.sofkau.entrenamiento.heladeria.envio.entities;



import co.com.sofka.domain.generic.Entity;

import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Marca;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Modelo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Tipo;

public class Vehiculo extends Entity<IdVehiculo> {

   protected Marca marca;

  protected Modelo modelo;

 protected Tipo tipo;

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