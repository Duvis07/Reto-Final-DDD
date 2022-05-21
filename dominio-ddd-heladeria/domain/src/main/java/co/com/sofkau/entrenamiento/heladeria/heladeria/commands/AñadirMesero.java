package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Sexo;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirMesero extends Command {

    private final IdMesero idMesero;
    private final Nombre nombre;
    private final IdHeladeria idHeladeria;
    private final Telefono telefono;
    private final Edad edad;
    private final Sexo sexo;

    public AñadirMesero(IdMesero idMesero, Nombre nombre, IdHeladeria idHeladeria, Telefono telefono, Edad edad, Sexo sexo) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.idHeladeria = idHeladeria;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
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


    public Sexo Sexo() {
        return sexo;
    }

    public Edad Edad() {
        return edad;
    }
}
