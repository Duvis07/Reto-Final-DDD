package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion, "Descripcion Requerido");

        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }

        if (this.descripcion.length() > 100) {
            throw new IllegalArgumentException("La descripcion no permite mas de 100 caracteres");
        }
    }

    public static Descripcion of(String descripcion) {
        return new Descripcion(descripcion);
    }

    @Override
    public String value() {
        return descripcion;
    }


}


