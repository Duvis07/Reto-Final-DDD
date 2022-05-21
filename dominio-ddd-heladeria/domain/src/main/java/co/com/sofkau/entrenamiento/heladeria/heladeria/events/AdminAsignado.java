package co.com.sofkau.entrenamiento.heladeria.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AdminAsignado extends DomainEvent {

    private final IdAdministrador idAdministrador;

    private final Nombre nombre;
    private final Telefono telefono;
    private final Correo correo;


    public AdminAsignado(IdAdministrador idAdministrador, Nombre nombre, Telefono telefono, Correo correo) {
        super("co.com.sofkau.entrenamiento.heladeria.AdminAsignado");
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }


    public IdAdministrador IdAdministrador() {
        return idAdministrador;
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
}