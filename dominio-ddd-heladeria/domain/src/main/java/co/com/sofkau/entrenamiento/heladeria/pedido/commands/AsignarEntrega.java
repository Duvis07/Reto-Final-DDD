package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;

import java.time.LocalDate;

public class AsignarEntrega extends Command {

    private final IdEntrega idEntrega;

    private final IdPedido idPedido;

    private final NombreProducto  nombreProducto;

    private final Precio precio;

    private final LocalDate Fecha;

    public AsignarEntrega(IdEntrega idEntrega, IdPedido idPedido, NombreProducto nombreProducto, Precio precio, LocalDate fecha) {
        this.idEntrega = idEntrega;
        this.idPedido = idPedido;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        Fecha = fecha;
    }

    public IdEntrega IdEntrega() {
        return idEntrega;
    }


    public IdPedido IdPedido() {
        return idPedido;
    }

    public NombreProducto NombreProducto() {
        return nombreProducto;
    }

    public Precio Precio() {
        return precio;
    }

    public LocalDate Fecha() {
        return Fecha;
    }
}
