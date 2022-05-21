package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EnvioCreado extends DomainEvent {


    private final IdEnvio idEnvio;

    private final IdHeladeria idHeladeria;

    private final Nombre nombre;

    private final Descripcion descripcion;


    public EnvioCreado(IdEnvio idEnvio, IdHeladeria idHeladeria, Nombre nombre, Descripcion descripcion) {
        super("co.com.sofkau.entrenamiento.heladeria.EnvioCreado");
        this.idEnvio = idEnvio;
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }
}