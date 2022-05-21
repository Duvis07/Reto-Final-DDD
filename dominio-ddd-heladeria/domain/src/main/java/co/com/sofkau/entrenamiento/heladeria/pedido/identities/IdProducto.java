package co.com.sofkau.entrenamiento.heladeria.pedido.identities;

import co.com.sofka.domain.generic.Identity;


/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class IdProducto extends Identity {

    public IdProducto() {
    }

    public IdProducto(String id) {
        super(id);
    }

    public static IdProducto of(String id) {
        return new IdProducto(id);
    }
}
