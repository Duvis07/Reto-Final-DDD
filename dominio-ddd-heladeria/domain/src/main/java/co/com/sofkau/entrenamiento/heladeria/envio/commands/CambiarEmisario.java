package co.com.sofkau.entrenamiento.heladeria.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;

public class CambiarEmisario extends Command {


    private final IdEmisario idEmisario;
    private final Nombre nombre;

    private final Telefono telefono;

    private final Correo correo;


    public CambiarEmisario(IdEmisario idEmisario, Nombre nombre, Telefono telefono, Correo correo) {
        this.idEmisario = idEmisario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Correo Correo() {
        return correo;
    }
}
