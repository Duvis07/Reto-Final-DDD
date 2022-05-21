package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;

public class AsignarProveedor  extends Command {

    private final IdProveedor idProveedor;

    private final IdHeladeria idHeladeria;

    private final Nombre nombre;

    private final Correo correo;

    private  final Telefono telefono;


    public AsignarProveedor(IdProveedor idProveedor, IdHeladeria idHeladeria, Nombre nombre, Correo correo, Telefono telefono) {
        this.idProveedor = idProveedor;
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public IdProveedor IdProveedor() {
        return idProveedor;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Correo Correo() {
        return correo;
    }
}
