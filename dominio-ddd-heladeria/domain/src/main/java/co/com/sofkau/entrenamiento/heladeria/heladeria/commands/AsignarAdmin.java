package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;

public class AsignarAdmin extends Command {

    private final IdAdministrador idAdministrador;

    private final IdHeladeria idHeladeria;
    private final Nombre nombre;

    private final Telefono telefono;

    public AsignarAdmin(IdAdministrador idAdministrador, IdHeladeria idHeladeria, Nombre nombre, Telefono telefono) {
        this.idAdministrador = idAdministrador;
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.telefono = telefono;
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
}
