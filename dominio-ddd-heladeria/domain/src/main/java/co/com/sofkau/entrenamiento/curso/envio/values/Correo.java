package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {

    private final String correo;

    public Correo(String correo) {
        this.correo = Objects.requireNonNull(correo, "Correo Requerida");

        if (this.correo.isBlank()) {
            throw new IllegalArgumentException("El correo no puede estar en blanco");
        }

        if (this.correo.length() > 100) {
            throw new IllegalArgumentException("La correo no permite mas de 100  caracteres");
        }
    }

    @Override
    public String value() {
        return correo;
    }
}

