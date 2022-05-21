package co.com.sofkau.entrenamiento.heladeria.heladeria.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;

public class EliminarMesero extends Command {

    private final IdHeladeria idHeladeria;
    private final IdMesero idMesero;


    public EliminarMesero(IdHeladeria idHeladeria, IdMesero idMesero) {
        this.idHeladeria = idHeladeria;
        this.idMesero = idMesero;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public IdMesero IdMesero() {
        return idMesero;
    }
}
