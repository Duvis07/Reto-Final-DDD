package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ciudad implements ValueObject<String> {
    private final String value;

    public Ciudad(String value) {
        this.value = Objects.requireNonNull(value, "Ciudad Requerida");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La ciudad no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("La ciudad no permite mas de 100  caracteres");
        }
    }

    public static Ciudad of(String ciudad) {
        return new Ciudad(ciudad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad = (Ciudad) o;
        return value == ciudad.value;
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

