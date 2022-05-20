package co.com.sofkau.entrenamiento.heladeria.envio.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Direccion;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

public class AsignarRuta  extends Command {

    private  final IdRuta idRuta;

    private  final IdEnvio idEnvio;
    private  final Direccion direccion;
    private  final Ciudad ciudad;
    private  final Nombre nombre;

    public AsignarRuta(IdRuta idRuta, IdEnvio idEnvio, Direccion direccion, Ciudad ciudad, Nombre nombre) {
        this.idRuta = idRuta;
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

    public IdRuta IdRuta() {
        return idRuta;
    }
}
