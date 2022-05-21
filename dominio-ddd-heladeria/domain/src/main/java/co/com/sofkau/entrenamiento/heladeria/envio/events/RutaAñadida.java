package co.com.sofkau.entrenamiento.heladeria.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Direccion;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

public class RutaAñadida extends DomainEvent {

    private final IdEnvio idEnvio;
    private final IdRuta idRuta;
    private  final Direccion direccion;
    private  final Ciudad ciudad;
    private  final Nombre nombre;

    public RutaAñadida(IdEnvio idEnvio, IdRuta idRuta, Direccion direccion, Ciudad ciudad, Nombre nombre) {
        super("co.com.sofkau.entrenamiento.heladeria.RutaAñadida");
        this.idEnvio = idEnvio;
        this.idRuta = idRuta;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nombre = nombre;
    }

    public IdEnvio IdEnvio() {
        return idEnvio;
    }
    public IdRuta IdRuta() {
        return idRuta;
    }

    public Direccion Direccion() {
        return direccion;
    }

    public Ciudad Ciudad() {
        return ciudad;
    }

    public Nombre Nombre() {
        return nombre;
    }
}
