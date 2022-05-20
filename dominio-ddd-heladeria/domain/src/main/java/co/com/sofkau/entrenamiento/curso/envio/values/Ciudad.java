package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ciudad implements ValueObject<String> {
    private final String ciudad;

    public Ciudad(String ciudad) {
        this.ciudad = Objects.requireNonNull(ciudad, "Ciudad Requerida");

        if (this.ciudad.isBlank()) {
            throw new IllegalArgumentException("La ciudad no puede estar en blanco");
        }

        if (this.ciudad.length() > 100) {
            throw new IllegalArgumentException("La ciudad no permite mas de 100  caracteres");
        }
    }

    public static Ciudad of(String ciudad) {
        return new Ciudad(ciudad);
    }

    @Override
    public String value() {
        return ciudad;
    }
}

