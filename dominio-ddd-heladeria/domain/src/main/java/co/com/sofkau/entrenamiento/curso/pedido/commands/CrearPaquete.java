package co.com.sofkau.entrenamiento.curso.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.curso.pedido.values.Entrega;
import co.com.sofkau.entrenamiento.curso.pedido.values.Mensajero;
import co.com.sofkau.entrenamiento.curso.pedido.values.Nombre;

/**
 *
 * comando CrearPaquete
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class CrearPaquete extends Command {


    private final Mensajero mensajero;
    private final Entrega entrega;
    private final EnvioId enviosId;
    private final Nombre nombre;
    private final Descripcion descripcion;


    public CrearPaquete(Mensajero mensajero, Entrega entrega, EnvioId enviosId, Nombre nombre, Descripcion descripcion) {
        this.mensajero = mensajero;
        this.entrega = entrega;
        this.enviosId = enviosId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Mensajero getMensajero() {
        return mensajero;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public EnvioId getEnviosId() {
        return enviosId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}



