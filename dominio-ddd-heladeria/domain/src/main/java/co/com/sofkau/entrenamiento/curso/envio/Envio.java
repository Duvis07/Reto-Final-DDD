package co.com.sofkau.entrenamiento.curso.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;

public class Envio extends AggregateEvent<IdEnvio> {


    protected IdEmisario idEmisario;

    protected IdRuta idRuta;

    protected IdVehiculo idVehiculo;

    protected Nombre nombre;


    public Envio(IdEnvio entityId, IdEmisario idEmisario, IdRuta idRuta, IdVehiculo idVehiculo, Nombre nombre) {
        super(entityId);
        this.idEmisario = idEmisario;
        this.idRuta = idRuta;
        this.idVehiculo = idVehiculo;
        this.nombre = nombre;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }

    public IdVehiculo dVehiculo() {
        return idVehiculo;
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
