package co.com.sofkau.entrenamiento.heladeria.envio.entities;


import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Direccion;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

public class Ruta extends Entity<IdRuta> {

    protected Direccion direccion;

    protected  Nombre nombre;
    protected Ciudad ciudad;

    public Ruta(IdRuta entityId, Direccion direccion, Nombre nombre, Ciudad ciudad) {
        super(entityId);
        this.direccion = direccion;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Ruta(IdRuta entityId) {
        super(entityId);
    }


    public void addRuta() {

    }
}