package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;

public class AsignarCliente extends Command {


    private final IdPedido idPedido;
    private final IdCliente idCliente;

    private final Nombre nombre;

    private final Telefono telefono;

    public AsignarCliente(IdPedido idPedido, IdCliente idCliente, Nombre nombre, Telefono telefono) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public IdPedido IdPedido() {
        return idPedido;
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
