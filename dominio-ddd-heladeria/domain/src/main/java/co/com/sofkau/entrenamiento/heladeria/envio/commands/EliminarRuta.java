package co.com.sofkau.entrenamiento.heladeria.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;

public class EliminarRuta extends Command {

    private final IdRuta idRuta;

    public EliminarRuta(IdRuta idRuta) {
        this.idRuta = idRuta;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }
}
