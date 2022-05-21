package co.com.sofkau.entrenamiento.heladeria.heladeria;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.entities.Administrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.entities.Mesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.entities.Proveedor;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.*;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Sexo;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Heladeria extends AggregateEvent<IdHeladeria> {


    protected Nombre nombre;

    protected Ubicacion ubicacion;

    protected IdHeladeria idHeladeria;

    protected Set<IdPedido> idPedidos;

    protected Administrador administrador;

    protected Proveedor proveedor;

    protected List<Mesero> meseros;


    public Heladeria(IdHeladeria idHeladeria) {
        super(idHeladeria);
        subscribe(new HeladeriaEventChange(this));

    }

    public Heladeria(IdHeladeria idHeladeria, Nombre nombre, Telefono telefono, Ubicacion ubicacion) {
        super(idHeladeria);
        appendChange(new HeladeriaCreada(idHeladeria, nombre, telefono, ubicacion)).apply();
    }


    public static Heladeria from(IdHeladeria idHeladeria, List<DomainEvent> events) {
        var heladeria = new Heladeria(idHeladeria);
        events.forEach(heladeria::applyEvent);
        return heladeria;
    }

    public void asignarAdmin(IdAdministrador idAdministrador, Nombre nombre, Telefono telefono, Correo correo) {
        Objects.requireNonNull(idAdministrador);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(correo);
        appendChange(new AdminAsignado(idAdministrador, nombre, telefono, correo)).apply();
    }

    public void asignarProveedor(IdProveedor idProveedor, IdHeladeria idHeladeria, Nombre nombre, Correo correo, Telefono telefono) {
        Objects.requireNonNull(idProveedor);
        Objects.requireNonNull(idHeladeria);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(correo);
        appendChange(new ProveedorAsignado(idProveedor, idHeladeria, nombre, correo, telefono)).apply();
    }

    public void añadirMesero(IdMesero idMesero, Nombre nombre, Telefono telefono, Edad edad, Sexo sexo) {
        Objects.requireNonNull(idMesero);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(edad);
        Objects.requireNonNull(sexo);
        appendChange(new MeseroAñadido(idMesero, nombre, telefono, edad, sexo)).apply();
    }


    public void eliminarMesero(IdHeladeria idHeladeria, IdMesero idMesero) {
        Objects.requireNonNull(idHeladeria);
        Objects.requireNonNull(idMesero);
        appendChange(new MeseroEliminado(idHeladeria, idMesero)).apply();
    }

    public void cambiarNombreHeladeria(IdHeladeria idHeladeria, Nombre nombre, Ubicacion ubicacion) {
        Objects.requireNonNull(idHeladeria);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(ubicacion);
        appendChange(new NombreCambiadoHeladeria(idHeladeria, nombre, ubicacion)).apply();
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public Set<IdPedido> IdPedidos() {
        return idPedidos;
    }

    public Administrador Administrador() {
        return administrador;
    }

    public Proveedor Proveedor() {
        return proveedor;
    }

    public List<Mesero> Meseros() {
        return meseros;
    }
}