package co.com.sofkau.entrenamiento.heladeria.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;

public class ClienteAsignado extends DomainEvent {


    private final IdCliente idCliente;

    private  final  IdPedido idPedido;
    private final Nombre nombre;

    private final Telefono telefono;


    public ClienteAsignado(IdCliente idCliente, IdPedido idPedido, Nombre nombre, Telefono telefono) {
        super("co.com.sofkau.entrenamiento.heladeria.ClienteAsignado");
        this.idCliente = idCliente;
        this.idPedido = idPedido;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdCliente IdCliente() {
        return idCliente;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public IdPedido IdPedido() {
        return idPedido;
    }
}


