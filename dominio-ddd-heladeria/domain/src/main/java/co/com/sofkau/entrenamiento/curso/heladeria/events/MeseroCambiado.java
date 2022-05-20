package co.com.sofkau.entrenamiento.curso.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdMesero;

public class MeseroCambiado extends DomainEvent {
    private final IdMesero idMesero;


    public MeseroCambiado(IdMesero idMesero) {
        super("co.com.sofkau.entrenamiento.curso.MeseroCambiado");
        this.idMesero = idMesero;
    }

    public IdMesero idMesero() {
        return idMesero;
    }
}

