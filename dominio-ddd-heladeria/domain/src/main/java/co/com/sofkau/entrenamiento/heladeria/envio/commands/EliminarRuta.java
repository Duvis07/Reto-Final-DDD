package co.com.sofkau.entrenamiento.heladeria.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EliminarRuta extends Command {

    private final IdEnvio idEnvio;
    private final IdRuta idRuta;

    public EliminarRuta(IdEnvio idEnvio, IdRuta idRuta) {
        this.idEnvio = idEnvio;
        this.idRuta = idRuta;
    }


    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }
}
