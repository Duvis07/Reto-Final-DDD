package co.com.sofkau.entrenamiento.curso.pedido.identities;

import co.com.sofka.domain.generic.Identity;

public class IdProducto extends Identity {

    public IdProducto(String id) {
        super(id);
    }

    public static IdProducto of(String id) {
        return new IdProducto(id);
    }
}
