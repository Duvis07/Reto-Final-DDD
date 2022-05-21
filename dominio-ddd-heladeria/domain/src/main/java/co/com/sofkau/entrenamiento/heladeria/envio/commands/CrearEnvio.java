package co.com.sofkau.entrenamiento.heladeria.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

public class CrearEnvio extends Command {


    private final IdEnvio idEnvio;
    private final IdHeladeria idHeladeria;

    private final Nombre nombre;
    private final Descripcion descripcion;

    public CrearEnvio(IdEnvio idEnvio, IdHeladeria idHeladeria, Nombre nombre, Descripcion descripcion) {
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
