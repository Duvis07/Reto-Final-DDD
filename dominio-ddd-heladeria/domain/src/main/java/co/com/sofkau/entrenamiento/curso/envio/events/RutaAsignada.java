package co.com.sofkau.entrenamiento.curso.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdRuta;

public class RutaAsignada  extends DomainEvent {

    private final IdRuta idRuta;

    public RutaAsignada(IdRuta idRuta) {
        super("co.com.sofkau.entrenamiento.curso.EnvioLocalizado");
        this.idRuta = idRuta;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }
}
