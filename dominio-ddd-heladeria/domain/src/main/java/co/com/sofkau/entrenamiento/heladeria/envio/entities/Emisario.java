package co.com.sofkau.entrenamiento.heladeria.envio.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;

public class Emisario extends Entity<IdEmisario> {

    protected  Nombre nombre;
   protected Telefono telefono;

    protected  Correo correo;


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
