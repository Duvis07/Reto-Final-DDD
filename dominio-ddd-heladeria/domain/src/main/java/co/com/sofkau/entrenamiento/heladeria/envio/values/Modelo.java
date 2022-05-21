package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Modelo implements ValueObject<Integer> {
    private final Integer value;

    public Modelo(Integer value) {
        this.value = Objects.requireNonNull(value);

        if (this.value <= 0) {
            throw new IllegalArgumentException("El modelo no puede estar vacio");
        }

        if (String.valueOf(this.value).isBlank()) {
            throw new IllegalArgumentException("El modelo no puede estar en blanco");
        }

    }

    public static Modelo of(Integer modelo) {
        return new Modelo(modelo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modelo modelo = (Modelo) o;
        return value == modelo.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


    @Override
    public Integer value() {
        return value;
    }
}

