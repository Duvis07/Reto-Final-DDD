package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;

public class ClienteActualizado extends DomainEvent {

    private final IdCliente idCliente;

    private final Nombre nombre;

    private final Telefono telefono;


    public ClienteActualizado(IdCliente idCliente, Nombre nombre, Telefono telefono) {
        super("co.com.sofkau.entrenamiento.curso.ClienteActualizado");
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdCliente IdCliente() {
        return idCliente;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}


