package co.com.sofkau.entrenamiento.heladeria.pedido.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdPedido extends Identity {

    public IdPedido() {
    }

    public IdPedido(String id) {
        super(id);
    }

    public static IdPedido of(String id) {
        return new IdPedido(id);
    }
}
