package co.com.sofkau.entrenamiento.heladeria.pedido.identities;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Entrega;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdEntrega extends Identity {

    public IdEntrega() {
    }

    public IdEntrega(String id) {
        super(id);
    }

    public static IdEntrega of(String id) {
        return new IdEntrega(id);
    }
}
