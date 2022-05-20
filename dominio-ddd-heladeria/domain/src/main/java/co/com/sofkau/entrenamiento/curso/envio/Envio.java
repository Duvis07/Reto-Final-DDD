package co.com.sofkau.entrenamiento.curso.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.curso.envio.values.Factura;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;

public class Envio extends AggregateEvent<IdEnvio> {


    protected IdEmisario idEmisario;

    protected IdRuta idRuta;

    protected IdVehiculo idVehiculo;

    protected Nombre nombre;

    protected  Factura factura;


    public Envio(IdEnvio entityId, IdEmisario idEmisario, IdRuta idRuta, IdVehiculo idVehiculo, Nombre nombre,Factura factura) {
        super(entityId);
        this.idEmisario = idEmisario;
        this.idRuta = idRuta;
        this.idVehiculo = idVehiculo;
        this.nombre = nombre;
        this.factura = factura;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }

    public IdVehiculo IdVehiculo() {
        return idVehiculo;
    }

    public Factura Factura() {
        return factura;
    }

    public Nombre Nombre() {
        return nombre;
    }


    public void cambiarVehiculo() {

    }

    public void asignarRuta() {

    }

    public void LocalizarEnvio() {

    }

    public void cambiarEmisario() {

    }
}
