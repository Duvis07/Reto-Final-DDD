package co.com.sofkau.entrenamiento.heladeria.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;

public class ProveedorAsignado extends DomainEvent {

    private final IdProveedor idProveedor;

    private final Nombre nombre;

    private final Correo correo;

    private final Telefono telefono;


    public ProveedorAsignado(IdProveedor idProveedor, Nombre nombre, Telefono telefono, Correo correo) {
        super("co.com.sofkau.entrenamiento.heladeria.ProveedorAsignado");
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public IdProveedor IdProveedor() {
        return idProveedor;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Correo Correo() {
        return correo;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
