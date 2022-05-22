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
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

import java.util.List;
import java.util.Objects;

/**
 * agregado envio con sus comportamientos y objetos de valor
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Envio extends AggregateEvent<IdEnvio> {

    protected Descripcion descripcion;

    protected IdEnvio idEnvio;
    protected Emisario emisario;

    protected List<Ruta> rutas;

    protected Vehiculo vehiculo;

    protected Nombre nombre;

    protected Factura factura;


    private Envio(IdEnvio idEnvio) {
        super(idEnvio);
        subscribe(new Enviochange(this));
    }

    public Envio(IdEnvio idEnvio, IdHeladeria idHeladeria, Nombre nombre, Descripcion descripcion) {
        super(idEnvio);
        appendChange(new EnvioCreado(idEnvio, idHeladeria, nombre, descripcion)).apply();
    }

    public static Envio from(IdEnvio idEnvio, List<DomainEvent> events) {
        var envio = new Envio(idEnvio);
        events.forEach(envio::applyEvent);
        return envio;
    }

    public void añadirRuta(IdRuta idRuta, Nombre nombre, Ciudad ciudad, Direccion direccion) {
        Objects.requireNonNull(idRuta);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(ciudad);
        Objects.requireNonNull(direccion);
        appendChange(new RutaAñadida(idEnvio, idRuta, direccion, ciudad, nombre)).apply();

    }

    public void cambiarEmisario(IdEmisario idEmisario, Nombre nombre, Telefono telefono, Correo correo) {
        Objects.requireNonNull(idEmisario);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(correo);
        appendChange(new EmisarioCambiado(idEnvio, idEmisario, nombre, telefono, correo)).apply();
    }

    public void añadirVehiculo(IdEnvio idEnvio, IdVehiculo idVehiculo, Marca marca, Tipo tipo, Modelo modelo) {
        Objects.requireNonNull(idEnvio);
        Objects.requireNonNull(idVehiculo);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(tipo);
        appendChange(new VehiculoAñadido(idEnvio, idVehiculo, marca, tipo, modelo)).apply();
    }

    public void eliminarRuta(IdEnvio idEnvio, IdRuta idRuta) {
        appendChange(new RutaEliminada(idEnvio, idRuta)).apply();
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

    public Descripcion Descripcion() {
        return descripcion;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Factura Factura() {
        return factura;
    }
}
