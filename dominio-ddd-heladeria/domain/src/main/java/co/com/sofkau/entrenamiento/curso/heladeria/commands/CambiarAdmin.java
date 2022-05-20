package co.com.sofkau.entrenamiento.curso.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdAdministrador;

public class CambiarAdmin  extends Command {

    private final IdAdministrador  idAdministrador;

    private final Nombre nombre;

    private final Telefono telefono;

    public CambiarAdmin(IdAdministrador idAdministrador, Nombre nombre, Telefono telefono) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.telefono = telefono;
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
}
