package co.com.sofkau.entrenamiento.heladeria.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;


public class NombreCambiadoHeladeria extends DomainEvent {

    private final IdHeladeria idHeladeria;

    private  final Nombre nombre;

    private final Ubicacion ubicacion;

    public NombreCambiadoHeladeria(IdHeladeria idHeladeria, Nombre nombre, Ubicacion ubicacion) {
        super("co.com.sofkau.entrenamiento.heladeria.NombreCambiadoHeladeria");
        this.idHeladeria = idHeladeria;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public IdHeladeria idHeladeria() {
        return idHeladeria;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}
