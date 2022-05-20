package co.com.sofkau.entrenamiento.heladeria.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;

public class ReemplazarProducto extends Command {

    private final IdProducto idProducto;

    private final Nombre nombre;

    private final Sabor sabor;

    private final Cantidad cantidad;

    public ReemplazarProducto(IdProducto idProducto, Nombre nombre, Sabor sabor, Cantidad cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    public IdProducto IdProducto() {
        return idProducto;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Sabor Sabor() {
        return sabor;
    }

    public Cantidad Cantidad() {
        return cantidad;
    }
}
