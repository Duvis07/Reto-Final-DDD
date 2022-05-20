package co.com.sofkau.entrenamiento.curso.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdProveedor;

public class ProveedorAsignado extends DomainEvent {

    private final IdProveedor idProveedor;

    public ProveedorAsignado( IdProveedor idProveedor) {
        super("co.com.sofkau.entrenamiento.curso.ProveedorAsignado");

        this.idProveedor = idProveedor;
    }

    public IdProveedor idProveedor() {
        return idProveedor;
    }
}
