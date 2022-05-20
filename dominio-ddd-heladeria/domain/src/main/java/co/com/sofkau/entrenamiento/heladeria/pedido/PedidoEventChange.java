package co.com.sofkau.entrenamiento.heladeria.pedido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Entrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Producto;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.*;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 * PedidoEventChange es el  encargado de disparar los diferentes eventos de nuestro agregado Pedido
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class PedidoEventChange extends EventChange {

    public PedidoEventChange(Pedido pedido) {

        apply((PedidoCreado event) -> {
            pedido.idPedido = event.IdPedido();
            pedido.nombre = event.Nombre();
            pedido.descripcion = event.Descripcion();
            pedido.cliente = event.Cliente();
        });

        apply((ProductoAñadido event) -> {
            pedido.producto = new ArrayList<>();
            int numHelados = pedido.producto.size();
            if (numHelados == 5) {
                throw new IllegalArgumentException("No puedes agregar más de 5 helados");
            }
            pedido.producto.add(new Producto(event.IdProducto(), event.Sabor()));
        });

        apply((ProductoBorrado event) -> {
            pedido.producto = new ArrayList<>();
            pedido.producto.removeIf(helado -> helado.identity().equals(event.IdProducto()));
        });

        apply((ClienteAsignado event) -> {
            pedido.cliente = new Cliente(event.IdCliente(), event.Nombre(), event.Telefono());
        });


        apply((EntregaAsignada event) -> {
            pedido.entrega = new Entrega(event.IdEntrega(), event.NombreProducto(), event.Fecha(), event.Precio());
        });

    }
}


