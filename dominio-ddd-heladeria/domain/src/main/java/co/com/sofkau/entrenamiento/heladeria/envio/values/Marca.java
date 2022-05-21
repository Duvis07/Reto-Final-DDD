package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Marca implements ValueObject<String> {
    private final String value;

    public Marca(String value) {
        this.value = Objects.requireNonNull(value, "Marca Requerida");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La marca no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("La marca no permite mas de 100  caracteres");
        }
    }

    public static Marca of(String marca) {
        return new Marca(marca);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return value == marca.value;
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

