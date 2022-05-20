package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

public class PedidoCreado extends DomainEvent {

    private final IdPedido idPedido;

    private final Nombre nombre;

    private final Descripcion descripcion;

    private final Cliente cliente;

    public PedidoCreado(IdPedido idPedido, Nombre nombre, Descripcion descripcion, Cliente cliente){
        super("co.com.sofkau.entrenamiento.heladeria.PedidoCreado");
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cliente = cliente;
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

    public Cliente Cliente() {
        return cliente;
    }
}
