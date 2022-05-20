package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

public class CrearPedido extends Command {


    private final IdPedido idPedido;

    private final IdCliente idCliente;
    private final Nombre nombre;

    private final Descripcion descripcion;

    public CrearPedido(IdPedido idPedido, IdCliente idCliente, Nombre nombre, Descripcion descripcion) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public IdCliente IdCliente() {
        return idCliente;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }
}
