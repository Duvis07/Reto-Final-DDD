package co.com.sofkau.entrenamiento.heladeria.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class HeladeriaCreada extends DomainEvent {

    private final IdHeladeria idHeladeria;
    private final Nombre nombre;
    private final Telefono telefono;

    private final Ubicacion ubicacion;

    public HeladeriaCreada(IdHeladeria idHeladeria, Nombre nombre, Telefono telefono, Ubicacion ubicacion) {
        super("co.com.sofkau.entrenamiento.heladeria.HeladeriaCreada");
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}
