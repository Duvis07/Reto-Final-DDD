package co.com.sofkau.entrenamiento.curso.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.curso.pedido.values.Descripcion;

public class AsignarPedido  extends Command {


    private final IdPedido idPedido;

    private final Nombre nombre;

    private final Descripcion descripcion;

    public AsignarPedido(IdPedido idPedido, Nombre nombre, Descripcion descripcion) {
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.descripcion = descripcion;
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
