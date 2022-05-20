package co.com.sofkau.entrenamiento.curso.heladeria;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdProveedor;
import co.com.sofkau.entrenamiento.curso.heladeria.value.Ubicacion;

import java.util.List;

public class Heladeria extends AggregateEvent<IdHeladeria> {

    protected List <IdProveedor> proveedor;

    protected IdAdministrador idAdministrador;

    protected IdMesero idMesero;

    protected Nombre nombre;

    protected Ubicacion ubicacion;


    public Heladeria(IdHeladeria entityId, List<IdProveedor> proveedor, IdAdministrador idAdministrador, IdMesero idMesero, Nombre nombre, Ubicacion ubicacion) {
        super(entityId);
        this.proveedor = proveedor;
        this.idAdministrador = idAdministrador;
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Heladeria(IdHeladeria entityId) {
        super(entityId);
    }

    public List<IdProveedor> Proveedor() {
        return proveedor;
    }

    public IdAdministrador IdAdministrador() {
        return idAdministrador;
    }

    public IdMesero IdMesero() {
        return idMesero;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }


    public void cambiarMesero(){

    }

    public void cambiarAdmin(){

    }

    public void asignarProveedor(){

    }

    public void cambiarNombreHeladeria(){

    }

}