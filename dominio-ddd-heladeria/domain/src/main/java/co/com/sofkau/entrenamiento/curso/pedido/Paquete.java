package co.com.sofkau.entrenamiento.curso.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.pedido.events.PaqueteCreado;
import co.com.sofkau.entrenamiento.curso.pedido.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.pedido.values.Entrega;
import co.com.sofkau.entrenamiento.curso.pedido.values.Mensajero;
import co.com.sofkau.entrenamiento.curso.pedido.values.Nombre;

import java.util.List;

/**
 * Agregado  paquete
 * Se hacen metodos get y set de todos sus atributos y metodo crear paquete
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class Paquete extends AggregateEvent<PaqueteID> {
    protected EnvioId enviosId;
    protected Mensajero mensajero;
    protected Entrega entrega;

    protected Nombre nombre;
    protected Descripcion descripcion;

    public Paquete(PaqueteID entityId, EnvioId enviosId, Mensajero mensajero,
                   Entrega entrega, Nombre nombre, Descripcion descripcion) {
        super(entityId);

        appendChange(new PaqueteCreado(mensajero, entrega, enviosId, nombre, descripcion)).apply();
        subscribe(new PaqueteEventChange(this));
    }


    public static Paquete from(PaqueteID entityId, List<DomainEvent> events) {
        var paquet = new Paquete(entityId);
        events.forEach(paquet::applyEvent);
        return paquet;
    }


    public EnvioId getEnviosId() {
        return enviosId;
    }

    public Mensajero getMensajero() {
        return mensajero;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Paquete(PaqueteID entityId) {
        super(entityId);
    }


    public void crearPaquete(Mensajero mensajero, Entrega entrega, EnvioId enviosId, Nombre nombre, Descripcion descripcion) {
        appendChange(new PaqueteCreado(mensajero, entrega, enviosId, nombre, descripcion)).apply();

    }
}
