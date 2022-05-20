package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;

public class AñadirMesero extends Command {

    private final IdMesero idMesero;
    private final Nombre nombre;
    private final IdHeladeria idHeladeria;
    private final Telefono telefono;

    private final Edad edad;

    public AñadirMesero(IdMesero idMesero, Nombre nombre, IdHeladeria idHeladeria, Telefono telefono, Edad edad) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.idHeladeria = idHeladeria;
        this.telefono = telefono;
        this.edad = edad;
    }

    public IdMesero IdMesero() {
        return idMesero;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Edad Edad() {
        return edad;
    }
}
