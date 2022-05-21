package co.com.sofkau.entrenamiento.heladeria.envio.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */

public class Emisario extends Entity<IdEmisario> {

    protected Nombre nombre;

    protected Telefono telefono;

    protected Correo correo;


    public Emisario(IdEmisario idEmisario, Nombre nombre, Telefono telefono, Correo correo) {
        super(idEmisario);
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Correo Correo() {
        return correo;
    }


    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void cambiarTelefono(Telefono telefono) {
        this.telefono = Objects.requireNonNull(telefono);
    }

    public void cambiarCorreo(Correo correo) {
        this.correo = Objects.requireNonNull(correo);
    }
}
