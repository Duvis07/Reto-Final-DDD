package co.com.sofkau.entrenamiento.heladeria.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class RutaEliminada extends DomainEvent {

    private IdEnvio idEnvio;
    private final IdRuta idRuta;

    public RutaEliminada(IdEnvio idEnvio, IdRuta idRuta) {
        super("co.com.sofkau.entrenamiento.heladeria.RutaEliminada");
        this.idRuta = idRuta;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }
}
