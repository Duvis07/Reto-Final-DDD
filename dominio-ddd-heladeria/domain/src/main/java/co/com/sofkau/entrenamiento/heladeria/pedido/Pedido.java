package co.com.sofkau.entrenamiento.heladeria.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Entrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Producto;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.*;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *Se crea agregado con sus comportamientos y objetos de valor
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Pedido extends AggregateEvent<IdPedido> {

    protected IdPedido idPedido;

    protected Nombre nombre;

    protected Fecha fecha;

    protected List<Producto> producto;

    protected Descripcion descripcion;

    protected Cliente cliente;

    protected Entrega entrega;


    private Pedido(IdPedido idPedido) {
        super(idPedido);
        subscribe(new PedidoEventChange(this));
    }

    public Pedido(IdPedido idPedido,Fecha fecha,Descripcion descripcion,Cliente cliente) {
        super(idPedido);
        appendChange(new PedidoCreado(idPedido,fecha,descripcion,cliente)).apply();
    }


    public static Pedido from(IdPedido idPedido, List<DomainEvent> events) {
        var pedido = new Pedido(idPedido);
        events.forEach(pedido::applyEvent);
        return pedido;
    }

    public void añadirProducto(IdPedido idPedido, IdProducto idProducto, Nombre nombre, Sabor sabor, Cantidad cantidad){
        Objects.requireNonNull(idPedido);
        Objects.requireNonNull(idProducto);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(sabor);
        Objects.requireNonNull(cantidad);
        appendChange(new ProductoAñadido(idPedido,idProducto,nombre,sabor,cantidad)).apply();
    }


    public void asignarCliente(IdPedido idPedido, IdCliente idCliente, Nombre nombre, Telefono telefono) {
        appendChange(new ClienteAsignado(idCliente, idPedido, nombre, telefono)).apply();
    }

    public void asignarEntrega(IdEntrega idEntrega, IdPedido idPedido, NombreProducto nombreProducto, Precio precio, Fecha fecha) {
        appendChange(new EntregaAsignada(idEntrega, idPedido, nombreProducto, precio, fecha)).apply();
    }

    public void borrarProducto(IdPedido idPedido, IdProducto idProducto) {
        appendChange(new ProductoBorrado(idProducto, idPedido)).apply();
    }


    public IdPedido IdPedido() {
        return idPedido;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public List<Producto> Producto() {
        return producto;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }

    public Cliente Cliente() {
        return cliente;
    }

    public Entrega Entrega() {
        return entrega;
    }
}