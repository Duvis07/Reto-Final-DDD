package co.com.sofkau.entrenamiento.curso.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdHeladeria;


public class NombreCambiado extends DomainEvent {

    private final IdHeladeria idHeladeria;

    public NombreCambiado(IdHeladeria idHeladeria) {
        super("co.com.sofkau.entrenamiento.curso.NombreCambiado");
        this.idHeladeria = idHeladeria;
    }

    public IdHeladeria idHeladeria() {
        return idHeladeria;
    }
}
