package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;


public class CrearHeladeria extends Command {

        private final IdHeladeria idHeladeria;
        private final Nombre nombre;
        private final Telefono telefono;

    private final Ubicacion ubicacion;




    public CrearHeladeria(IdHeladeria idHeladeria, Nombre nombre, Telefono telefono, Ubicacion ubicacion) {
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
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

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}


