package co.com.sofkau.entrenamiento.curso.envio.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.curso.envio.values.Correo;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;
import co.com.sofkau.entrenamiento.curso.envio.values.Telefono;

public class Emisario extends Entity<IdEmisario> {

    private Nombre nombre;
    private Telefono telefono;

    private Correo correo;


    public Emisario(IdEmisario entityId, Nombre nombre, Telefono telefono, Correo correo) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Emisario(IdEmisario entityId) {
        super(entityId);
    }

    public void addEmisario(){

    }
}
