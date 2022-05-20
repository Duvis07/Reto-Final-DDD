package co.com.sofkau.entrenamiento.curso.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdProveedor;
import co.com.sofkau.entrenamiento.curso.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.curso.pedido.entities.Producto;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.curso.pedido.values.Descripcion;

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


    protected Nombre nombre;

    protected Map<IdProducto, Producto> producto;

    protected Descripcion descripcion;

    protected IdCliente idCliente;

    protected IdEntrega idEntrega;


    public Nombre Nombre() {
        return nombre;
    }

    public Map<IdProducto, Producto>Producto() {
        return producto;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }

    public IdCliente IdCliente() {
        return idCliente;
    }

    public IdEntrega IdEntrega() {
        return idEntrega;
    }

    public Pedido(IdPedido entityId) {
        super(entityId);
    }

    public void actualizarCliente(){

    }

    public void asignarPedido(){

    }

    public void reemplazarProducto(){

    }

    public void asignarProducto(){

    }
}