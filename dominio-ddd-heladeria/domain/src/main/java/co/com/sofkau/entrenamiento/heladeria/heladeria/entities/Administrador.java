package co.com.sofkau.entrenamiento.heladeria.heladeria.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdAdministrador;

import java.util.Objects;


public class Administrador extends Entity<IdAdministrador> {
    protected Nombre nombre;
    protected Telefono telefono;
    protected Correo correo;

    public Administrador(IdAdministrador entityId, Nombre nombre, Telefono telefono, Correo correo) {
        super(entityId);
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


