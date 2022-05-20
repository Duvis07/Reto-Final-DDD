package co.com.sofkau.entrenamiento.curso.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Sexo implements ValueObject<String> {
    private final String sexo;


    public Sexo(String sexo) {
        this.sexo = Objects.requireNonNull(sexo, "Sexo Requerido");

        if (this.sexo.isBlank()) {
            throw new IllegalArgumentException("El sexo no puede estar en blanco");
        }

        if (this.sexo.length() > 12) {
            throw new IllegalArgumentException("El sexo no permite mas de 12  caracteres");
        }
    }

    public static Sexo of(String sexo) {
        return new Sexo(sexo);
    }

    @Override
    public String value() {
        return sexo;
    }
}

