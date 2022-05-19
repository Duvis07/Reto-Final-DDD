package co.com.sofkau.entrenamiento.curso.envio.entities;


import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.curso.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.curso.envio.values.Direccion;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;

public class Ruta extends Entity<IdRuta> {

    private Direccion direccion;
    private Nombre nombre;
    private Ciudad ciudad;

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