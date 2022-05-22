package co.com.sofkau.entrenamiento.heladeria.heladeria.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Sexo;

import java.util.Objects;

/**
 * entidad mesero con sus comportamientos y objetos de valor
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Mesero extends Entity<IdMesero> {

    protected Nombre nombre;

    protected Telefono telefono;

    protected Edad edad;

    protected Sexo sexo;

    public Mesero(IdMesero idMesero, Nombre nombre, Telefono telefono, Edad edad, Sexo sexo) {
        super(idMesero);
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Edad Edad() {
        return edad;
    }

    public Sexo Sexo() {
        return sexo;
    }

    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void cambiarTelefono(Telefono telefono) {
        this.telefono = Objects.requireNonNull(telefono);
    }
}
