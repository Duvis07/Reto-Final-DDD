package co.com.sofkau.entrenamiento.heladeria.envio.entities;


import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Direccion;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

import java.util.Objects;

public class Ruta extends Entity<IdRuta> {

    protected Direccion direccion;

    protected  Nombre nombre;
    protected Ciudad ciudad;

    public Ruta(IdRuta idRuta, Direccion direccion, Nombre nombre, Ciudad ciudad) {
        super(idRuta);
        this.direccion = direccion;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }


    public Direccion Direccion() {
        return direccion;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ciudad Ciudad() {
        return ciudad;
    }

    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
    public void cambiarCiudad(Ciudad ciudad) {
        this.ciudad = Objects.requireNonNull(ciudad);
    }
    public void cambiarDireccion(Direccion direccion) {
        this.direccion = Objects.requireNonNull(direccion);
    }

}