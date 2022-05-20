package co.com.sofkau.entrenamiento.heladeria.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<Integer> {
    private final Integer value;

    public Edad(Integer value) {
        this.value = Objects.requireNonNull(value);

        if (this.value <= 0) {
            throw new IllegalArgumentException("La edad no puede estar vacio");
        }

        if (String.valueOf(this.value).isBlank()) {
            throw new IllegalArgumentException("La edad no puede estar en blanco");
        }

        if (this.value.longValue() > 3) {
            throw new IllegalArgumentException("La edad no permite mas de 3 caracteres");
        }
    }

    public static Edad of(Integer edad) {
        return new Edad(edad);
    }

    public Integer value() {
        return value;
    }

    public Integer Value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edad edad = (Edad) o;
        return Objects.equals(value, edad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


