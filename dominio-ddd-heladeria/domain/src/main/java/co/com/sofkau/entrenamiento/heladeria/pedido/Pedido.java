package co.com.sofkau.entrenamiento.heladeria.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Entrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Producto;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.ClienteAsignado;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.EntregaAsignada;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.ProductoBorrado;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Agregado  pedido
 * Se hacen metodos get y set de todos sus atributos y metodo crear paquete
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Pedido extends AggregateEvent<IdPedido> {


    protected IdPedido idPedido;

    protected Nombre nombre;

    protected List<Producto> producto;

    protected Descripcion descripcion;

    protected Cliente cliente;

    protected Entrega entrega;

    public Pedido(IdPedido idPedido) {
        super(idPedido);
        appendChange(new PedidoCreado(idPedido, nombre, descripcion, cliente)).apply();
    }


    public static Pedido from(IdPedido idPedido, List<DomainEvent> events) {
        var pedido = new Pedido(idPedido);
        events.forEach(pedido::applyEvent);
        return pedido;
    }


    public void asignarCliente(IdPedido idPedido, IdCliente idCliente, Nombre nombre, Telefono telefono) {
        appendChange(new ClienteAsignado(idCliente, idPedido, nombre, telefono)).apply();
    }

    public void asignarEntrega(IdEntrega idEntrega, IdPedido idPedido, NombreProducto nombreProducto, Precio precio, LocalDate fecha) {
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