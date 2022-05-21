package co.com.sofkau.entrenamiento.heladeria.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.entities.Emisario;
import co.com.sofkau.entrenamiento.heladeria.envio.entities.Ruta;
import co.com.sofkau.entrenamiento.heladeria.envio.entities.Vehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.events.*;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.*;

import java.util.List;
import java.util.Objects;

public class Envio extends AggregateEvent<IdEnvio> {

    protected IdEnvio idEnvio;
    protected Emisario emisario;

    protected List <Ruta> rutas;

    protected Vehiculo vehiculo;

    protected Nombre nombre;

    protected  Factura factura;


    private Envio(IdEnvio idEnvio) {
        super(idEnvio);
        subscribe(new Enviochange(this));
    }

    public Envio( Nombre nombre, IdEnvio idEnvio, IdEmisario idEmisario, IdVehiculo idVehiculo) {
        super(idEnvio);
        appendChange(new EnvioCreado(nombre,  idEnvio,  idEmisario, idVehiculo)).apply();
    }

    public static Envio from(IdEnvio idEnvio, List<DomainEvent> events) {
        var envio= new Envio(idEnvio );
        events.forEach(envio::applyEvent);
        return envio;
    }

    public void añadirRuta(IdRuta idRuta, Nombre nombre, Ciudad ciudad, Direccion direccion){
        Objects.requireNonNull(idRuta);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(ciudad);
        Objects.requireNonNull(direccion);
        appendChange(new RutaAñadida(idRuta, direccion,ciudad, nombre)).apply();

    }

    public void cambiarEmisario(IdEmisario idEmisario, Nombre nombre, Telefono telefono, Correo correo){
        Objects.requireNonNull(idEmisario);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(correo);
        appendChange(new EmisarioCambiado(idEmisario,nombre,telefono,correo)).apply();
    }

    public void asignarVehiculo(IdVehiculo idVehiculo,IdEmisario idEmisario, Marca marca, Tipo tipo,Modelo modelo){
        Objects.requireNonNull(idVehiculo);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(tipo);
        appendChange(new VehiculoAsignado(idVehiculo, idEmisario, marca,tipo, modelo)).apply();
    }

    public void eliminarHelado(IdRuta idRuta){
        appendChange(new RutaEliminada(idRuta)).apply();
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public Emisario Emisario() {
        return emisario;
    }

    public List<Ruta> Rutas() {
        return rutas;
    }

    public Vehiculo Vehiculo() {
        return vehiculo;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Factura Factura() {
        return factura;
    }
}
