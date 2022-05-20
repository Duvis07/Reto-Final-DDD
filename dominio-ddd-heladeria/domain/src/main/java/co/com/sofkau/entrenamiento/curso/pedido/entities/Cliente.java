package co.com.sofkau.entrenamiento.curso.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.pedido.identities.IdCliente;


public class Cliente extends Entity<IdCliente>  {

    protected Nombre nombre;
    protected Telefono telefono;

    public Cliente(IdCliente entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void ActualizarCliente(){

    }
}
