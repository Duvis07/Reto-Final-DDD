package co.com.sofkau.entrenamiento.curso.envio.events;


import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.curso.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.curso.envio.values.Direccion;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;

public class RutaAsignada  extends DomainEvent {

    private final IdRuta idRuta;
    private  final Direccion direccion;
    private  final Ciudad ciudad;
    private  final Nombre nombre;

    public RutaAsignada(IdRuta idRuta, Direccion direccion, Ciudad ciudad, Nombre nombre) {
        super("co.com.sofkau.entrenamiento.curso.RutaAsignada");

        this.idRuta = idRuta;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nombre = nombre;
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
