package co.com.sofkau.entrenamiento.curso.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdAdministrador;

public class AdminCambiado extends DomainEvent {

    private final IdAdministrador idAdministrador;


    public AdminCambiado(IdAdministrador idAdministrador) {
        super("co.com.sofkau.entrenamiento.curso.AdminCambiado");
        this.idAdministrador = idAdministrador;
    }

    public IdAdministrador idAdministrador() {
        return idAdministrador;
    }
}