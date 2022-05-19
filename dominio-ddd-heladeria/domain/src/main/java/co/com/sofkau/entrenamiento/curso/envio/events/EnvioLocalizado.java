package co.com.sofkau.entrenamiento.curso.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEnvio;

public class EnvioLocalizado  extends DomainEvent {

    private final IdEnvio idEnvio;


    public EnvioLocalizado(IdEnvio idEnvio) {
        super("co.com.sofkau.entrenamiento.curso.EnvioLocalizado ");
        this.idEnvio = idEnvio;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }
}
