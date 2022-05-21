package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEmisario;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;

public class EmisarioCambiado extends DomainEvent {


    private final IdEnvio idEnvio;

    private final IdEmisario idEmisario;

    private final Nombre nombre;

    private final Telefono telefono;

    private final Correo correo;


    public EmisarioCambiado(IdEnvio idEnvio, IdEmisario idEmisario, Nombre nombre, Telefono telefono, Correo correo) {
        super("co.com.sofkau.entrenamiento.heladeria.EmisarioCambiado");
        this.idEnvio = idEnvio;
        this.idEmisario = idEmisario;
        this.nombre = nombre;
        this.telefono = telefono;

        this.correo = correo;
    }

    public IdEmisario IdEmisario() {
        return idEmisario;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
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
