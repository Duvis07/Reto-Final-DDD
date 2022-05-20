package co.com.sofkau.entrenamiento.heladeria.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Sexo;

public class MeseroAñadido extends DomainEvent {
    private final IdMesero idMesero;

    private final Nombre nombre;
    private final Telefono telefono;

    private final Edad edad;

    private final Sexo sexo;


    public MeseroAñadido(IdMesero idMesero, Nombre nombre, Telefono telefono, Edad edad, Sexo sexo) {
        super("co.com.sofkau.entrenamiento.heladeria.MeseroAñadido");
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
    }

    public IdMesero IdMesero() {
        return idMesero;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Edad Edad() {
        return edad;
    }

    public Sexo Sexo() {
        return sexo;
    }
}

