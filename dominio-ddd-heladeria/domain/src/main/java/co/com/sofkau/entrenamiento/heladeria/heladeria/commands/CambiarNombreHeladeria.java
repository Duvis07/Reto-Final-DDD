package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;

public class CambiarNombreHeladeria extends Command {

    private final IdHeladeria idHeladeria;
    private final Nombre nombre;

    private final Ubicacion ubicacion;

    public CambiarNombreHeladeria(IdHeladeria idHeladeria, Nombre nombre, Ubicacion ubicacion) {
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}
