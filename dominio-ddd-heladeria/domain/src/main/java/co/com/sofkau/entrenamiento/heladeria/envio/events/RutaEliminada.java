package co.com.sofkau.entrenamiento.heladeria.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;

public class RutaEliminada extends DomainEvent {

    private final IdRuta idRuta;

    public RutaEliminada(IdRuta idRuta) {
        super("co.com.sofkau.entrenamiento.heladeria.RutaEliminada");
        this.idRuta = idRuta;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }
}
