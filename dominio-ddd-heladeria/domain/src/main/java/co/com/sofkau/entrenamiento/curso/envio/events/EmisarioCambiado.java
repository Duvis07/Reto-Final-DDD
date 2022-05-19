package co.com.sofkau.entrenamiento.curso.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;

public class EmisarioCambiado extends DomainEvent {

    private final IdEmisario idEmisario;


    public EmisarioCambiado(IdEmisario idEmisario) {
        super("co.com.sofkau.entrenamiento.curso.EmisarioCreado");
        this.idEmisario = idEmisario;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }
}
