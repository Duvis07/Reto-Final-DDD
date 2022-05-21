package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La direccion no puede estar en blanco");
        }

        if (this.value.length() > 200) {
            throw new IllegalArgumentException("La direccion no permite mas de 200 caracteres");
        }
    }

    public static Direccion of(String direccion) {
        return new Direccion(direccion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return value == direccion.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }

}
