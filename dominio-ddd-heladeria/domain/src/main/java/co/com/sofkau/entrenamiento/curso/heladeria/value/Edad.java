package co.com.sofkau.entrenamiento.curso.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.entrenamiento.curso.envio.values.Modelo;

import java.util.Objects;

public class Edad implements ValueObject<Integer> {
    private  final Integer edad;

    public Edad(Integer edad) {
        this.edad = Objects.requireNonNull(edad);

        if (this.edad <= 0) {
            throw new IllegalArgumentException("La edad no puede estar vacio");
        }

        if (String.valueOf(this.edad).isBlank()) {
            throw new IllegalArgumentException("La edad no puede estar en blanco");
        }

        if (this.edad.longValue() > 150) {
            throw new IllegalArgumentException("La edad no permite mas de 150 caracteres");
        }
    }

    public static Edad of(Integer edad) {
        return new Edad(edad);
    }

    @Override
    public Integer value() {
        return edad;
    }
}


