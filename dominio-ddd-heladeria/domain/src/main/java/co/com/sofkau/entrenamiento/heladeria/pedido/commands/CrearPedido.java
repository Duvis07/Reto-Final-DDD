package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CrearPedido extends Command {


    private final IdPedido idPedido;


    private final Fecha fecha;

    private final Descripcion descripcion;
    private final Cliente cliente;

    public CrearPedido(IdPedido idPedido, Fecha fecha, Descripcion descripcion, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }

    public Cliente Cliente() {
        return cliente;
    }
}
