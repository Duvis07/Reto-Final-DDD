package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;

public class ActualizarCliente  extends Command {

    private final IdCliente idCliente;

    private final Nombre nombre;

    private final Telefono telefono;

    public ActualizarCliente(IdCliente idCliente, Nombre nombre, Telefono telefono) {
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
