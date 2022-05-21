package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value, "Nombre Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("El nombre no permite mas de 100 caracteres");
        }
    }

    public static Nombre of(String nombre) {
        return new Nombre(nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return value == nombre.value;
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
