package co.com.sofkau.entrenamiento.heladeria.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdRuta;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Ciudad;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Direccion;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirRuta extends Command {

    private final IdEnvio idEnvio;
    private final IdRuta idRuta;

    private final Nombre nombre;

    private final Ciudad ciudad;

    private final Direccion direccion;


    public AñadirRuta(IdEnvio idEnvio, IdRuta idRuta, Nombre nombre, Ciudad ciudad, Direccion direccion) {
        this.idEnvio = idEnvio;
        this.idRuta = idRuta;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }


    public IdEnvio IdEnvio() {
        return idEnvio;
    }

    public IdRuta IdRuta() {
        return idRuta;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ciudad Ciudad() {
        return ciudad;
    }

    public Direccion Direccion() {
        return direccion;
    }
}
