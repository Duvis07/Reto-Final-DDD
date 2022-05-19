package co.com.sofkau.entrenamiento.curso.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.curso.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.curso.envio.values.Direccion;
import co.com.sofkau.entrenamiento.curso.envio.values.Nombre;

public class AsignarRuta  extends Command {

    private  final IdEnvio idEnvio;
    private  final Direccion direccion;
    private  final Ciudad ciudad;
    private  final Nombre nombre;

    public AsignarRuta( IdEnvio idEnvio, Direccion direccion, Ciudad ciudad, Nombre nombre) {
        this.idEnvio = idEnvio;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nombre = nombre;
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
