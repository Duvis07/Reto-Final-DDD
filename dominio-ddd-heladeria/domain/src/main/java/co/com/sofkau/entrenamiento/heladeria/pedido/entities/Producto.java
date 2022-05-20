package co.com.sofkau.entrenamiento.heladeria.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;

public class Producto extends Entity<IdProducto> {

    protected Nombre nombre;
    protected Sabor sabor;
    protected Cantidad cantidad;

    public Producto(IdProducto entityId, Nombre nombre, Sabor sabor, Cantidad cantidad) {
        super(entityId);
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }


    public void reemplazarProducto() {

    }
}
