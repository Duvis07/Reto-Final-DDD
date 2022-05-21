package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class NombreProducto implements ValueObject<String> {

    private final String value;

    public NombreProducto(String value) {
        this.value = Objects.requireNonNull(value, "NombreProducto Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("EL nombreProducto no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("El nombreProducto no permite mas de 100 caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreProducto nombreProducto = (NombreProducto) o;
        return value == nombreProducto.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value() {
        return value;
    }


}


