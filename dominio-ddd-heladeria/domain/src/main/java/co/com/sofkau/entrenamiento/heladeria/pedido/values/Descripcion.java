package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Descripcion implements ValueObject<String> {

    private final String value;

    public Descripcion(String value) {
        this.value = Objects.requireNonNull(value, "Descripcion Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("La descripcion no permite mas de 100 caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion descripcion = (Descripcion) o;
        return value == descripcion.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value() {
        return value;
    }


}


