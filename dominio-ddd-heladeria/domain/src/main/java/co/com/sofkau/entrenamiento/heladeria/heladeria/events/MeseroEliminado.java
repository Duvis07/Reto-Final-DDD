package co.com.sofkau.entrenamiento.heladeria.heladeria.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdMesero;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class MeseroEliminado extends DomainEvent {

    private final IdHeladeria idHeladeria;
    private final IdMesero idMesero;

    public MeseroEliminado(IdHeladeria idHeladeria, IdMesero idMesero) {
        super("co.com.sofkau.entrenamiento.heladeria.MeseroEliminado");
        this.idHeladeria = idHeladeria;
        this.idMesero = idMesero;


    }

    public IdHeladeria IdHeladeria() {
        return idHeladeria;
    }

    public IdMesero IdMesero() {
        return idMesero;
    }
}
