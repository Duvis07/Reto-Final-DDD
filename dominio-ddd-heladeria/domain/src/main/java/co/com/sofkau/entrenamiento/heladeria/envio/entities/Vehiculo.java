package co.com.sofkau.entrenamiento.heladeria.envio.entities;


import co.com.sofka.domain.generic.Entity;

import co.com.sofkau.entrenamiento.heladeria.envio.Envio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Marca;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Modelo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Tipo;

import java.util.Objects;

/**
 * entidad vehiculo con sus comportamientos y objetos de valor
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Vehiculo extends Entity<IdVehiculo> {
    protected IdEnvio idEnvio;

    protected Marca marca;

    protected Modelo modelo;

    protected Tipo tipo;

    public Vehiculo(IdVehiculo idVehiculo, IdEnvio idEnvio, Marca marca, Modelo modelo, Tipo tipo) {
        super(idVehiculo);
        this.idEnvio = idEnvio;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Marca Marca() {
        return marca;
    }

    public Modelo Modelo() {
        return modelo;
    }

    public Tipo Tipo() {
        return tipo;
    }

    public void cambiarMarca(Marca marca) {
        this.marca = Objects.requireNonNull(marca);
    }

    public void cambiarModelo(Modelo modelo) {
        this.modelo = Objects.requireNonNull(modelo);
    }

    public void cambiarTipo(Tipo tipo) {
        this.tipo = Objects.requireNonNull(tipo);
    }
}



