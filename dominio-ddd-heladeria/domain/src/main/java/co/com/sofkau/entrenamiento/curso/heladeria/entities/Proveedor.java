package co.com.sofkau.entrenamiento.curso.heladeria.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.curso.envio.values.Correo;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdProveedor;

public class Proveedor extends Entity<IdProveedor> {

    private Nombre nombre;
    private Telefono telefono;
    private Correo correo;

    public Proveedor(IdProveedor entityId, Nombre nombre, Telefono telefono, Correo correo) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Proveedor(IdProveedor entityId) {
        super(entityId);
    }

    public void asignarProveedor(){

    }
}
