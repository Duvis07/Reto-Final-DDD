package co.com.sofkau.entrenamiento.heladeria.pedido.identities;

import co.com.sofka.domain.generic.Identity;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdCliente extends Identity {

    public IdCliente() {
    }


    public IdCliente(String id) {
        super(id);
    }

    public static IdCliente of(String id) {
        return new IdCliente(id);
    }
}
