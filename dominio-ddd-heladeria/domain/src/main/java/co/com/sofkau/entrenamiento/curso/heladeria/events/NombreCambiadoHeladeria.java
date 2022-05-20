package co.com.sofkau.entrenamiento.curso.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdHeladeria;


public class NombreCambiadoHeladeria extends DomainEvent {

    private final IdHeladeria idHeladeria;

    public NombreCambiadoHeladeria(IdHeladeria idHeladeria) {
        super("co.com.sofkau.entrenamiento.curso.NombreCambiadoHeladeria");
        this.idHeladeria = idHeladeria;
    }

    public IdHeladeria idHeladeria() {
        return idHeladeria;
    }
}
