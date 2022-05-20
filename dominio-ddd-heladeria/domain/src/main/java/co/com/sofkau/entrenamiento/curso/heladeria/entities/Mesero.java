package co.com.sofkau.entrenamiento.curso.heladeria.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.values.Correo;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;
import co.com.sofkau.entrenamiento.curso.heladeria.identities.IdMesero;
import co.com.sofkau.entrenamiento.curso.heladeria.value.Edad;
import co.com.sofkau.entrenamiento.curso.heladeria.value.Sexo;

public class Mesero extends Entity<IdMesero> {

    protected Nombre nombre;
    protected Telefono telefono;

    protected Edad edad;

    protected Sexo sexo;

    public Mesero(IdMesero entityId, Nombre nombre, Telefono telefono, Edad edad, Sexo sexo) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
    }



    public void addMesero() {

    }
}
