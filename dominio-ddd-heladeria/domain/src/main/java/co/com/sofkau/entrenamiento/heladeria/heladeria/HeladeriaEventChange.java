package co.com.sofkau.entrenamiento.heladeria.heladeria;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.entrenamiento.heladeria.heladeria.entities.Administrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.entities.Mesero;
import co.com.sofkau.entrenamiento.heladeria.heladeria.entities.Proveedor;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.*;

import java.util.ArrayList;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class HeladeriaEventChange extends EventChange {
    public HeladeriaEventChange(Heladeria heladeria) {
        apply((HeladeriaCreada event) -> {
            heladeria.idHeladeria = event.IdHeladeria();
            heladeria.nombre = event.Nombre();
            heladeria.ubicacion = event.Ubicacion();
            heladeria.meseros = new ArrayList<>();
        });


        apply((AdminAsignado event) -> {
            heladeria.administrador = new Administrador(event.IdAdministrador(), event.Nombre(), event.Telefono(), event.Correo());
        });

        apply((ProveedorAsignado event) -> {
            heladeria.proveedor = new Proveedor(event.IdProveedor(), event.IdHeladeria(), event.Nombre(), event.Telefono(), event.Correo());
        });

        apply((MeseroAñadido event) -> {
            int numMeseros = heladeria.meseros.size();
            if (numMeseros == 5) {
                throw new IllegalArgumentException("No puedes agregar más de 5 meseros");
            }
            heladeria.meseros.add(new Mesero(event.IdMesero(), event.Nombre(), event.Telefono(), event.Edad(), event.Sexo()));
        });


        apply((MeseroEliminado event) -> {
            heladeria.meseros.removeIf(mesero -> mesero.identity().equals(event.IdMesero()));
        });


        apply((NombreCambiadoHeladeria event) -> {
            heladeria.nombre = event.Nombre();
        });
    }
}

