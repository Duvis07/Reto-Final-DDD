package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AsignarAdmin extends Command {

    private final IdAdministrador idAdministrador;

    private final IdHeladeria idHeladeria;
    private final Nombre nombre;

    private final Telefono telefono;

    private final Correo correo;

    public AsignarAdmin(IdAdministrador idAdministrador, IdHeladeria idHeladeria, Nombre nombre, Telefono telefono, Correo correo) {
        this.idAdministrador = idAdministrador;
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public IdAdministrador IdAdministrador() {
        return idAdministrador;
    }


    public IdHeladeria IdHeladeria() {
        return idHeladeria;
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
