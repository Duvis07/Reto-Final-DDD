package co.com.sofkau.entrenamiento.heladeria.envio;


import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.heladeria.envio.entities.Ruta;
import co.com.sofkau.entrenamiento.heladeria.envio.entities.Vehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.events.*;

import java.util.ArrayList;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class EnvioEventChange extends EventChange {

    public EnvioEventChange(Envio envio) {

        apply((EnvioCreado event) -> {
            envio.idEnvio = event.IdEnvio();
            envio.nombre = event.Nombre();
            envio.descripcion = event.Descripcion();
            envio.rutas = new ArrayList<>();


        });
        apply((RutaAñadida event) -> {
            int numRutas = envio.rutas.size();
            if (numRutas == 3) {
                throw new IllegalArgumentException("No puedes agregar más de 3 rutas");
            }
            envio.rutas.add(new Ruta(event.IdRuta(), event.Direccion(), event.Nombre(), event.Ciudad()));
        });

        apply((RutaEliminada event) -> {
            envio.rutas.removeIf(ruta -> ruta.identity().equals(event.IdRuta()));
        });

        apply((EmisarioCambiado event) -> {
            envio.nombre = event.Nombre();
        });


        apply((VehiculoAñadido event) -> {
            envio.vehiculo = new Vehiculo(event.IdVehiculo(), event.IdEnvio(), event.Marca(), event.Modelo(), event.Tipo());
        });

    }

}

