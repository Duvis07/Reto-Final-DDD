package co.com.sofkau.entrenamiento.curso.heladeria.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.values.Correo;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdAdministrador;


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

    public Administrador(IdAdministrador entityId) {
        super(entityId);
    }

    public void cambiarAdmin(){

    }
}


