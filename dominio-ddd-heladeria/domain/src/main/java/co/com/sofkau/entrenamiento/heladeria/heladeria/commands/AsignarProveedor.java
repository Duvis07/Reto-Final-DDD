package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;

public class AsignarProveedor  extends Command {

    private final IdProveedor idProveedor;

    private final Nombre nombre;

    private final Correo correo;


    public AsignarProveedor(IdProveedor idProveedor, Nombre nombre, Correo correo) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.correo = correo;
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
}
