package co.com.sofkau.entrenamiento.heladeria.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Sexo implements ValueObject<String> {
    private final String value;


    public Sexo(String value) {
        this.value = Objects.requireNonNull(value, "Sexo Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El sexo no puede estar en blanco");
        }

        if (this.value.length() > 50) {
            throw new IllegalArgumentException("El sexo no permite mas de 50 caracteres");
        }
    }

    public static Sexo of(String sexo) {
        return new Sexo(sexo);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sexo  sexo = (Sexo) o;
        return Objects.equals(value, sexo.value);
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

