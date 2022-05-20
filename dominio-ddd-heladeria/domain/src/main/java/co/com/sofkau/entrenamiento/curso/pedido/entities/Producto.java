package co.com.sofkau.entrenamiento.curso.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.values.Correo;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.curso.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.curso.pedido.values.Sabor;

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
