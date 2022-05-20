package co.com.sofkau.entrenamiento.curso.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.curso.heladeria.value.Edad;

public class CambiarMesero  extends Command {

    private final IdMesero idMesero;
    private final Nombre nombre;

    private final Telefono telefono;

    private final Edad edad;

    public CambiarMesero(IdMesero idMesero, Nombre nombre, Telefono telefono, Edad edad) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public IdMesero IdMesero() {
        return idMesero;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Edad Edad() {
        return edad;
    }
}
