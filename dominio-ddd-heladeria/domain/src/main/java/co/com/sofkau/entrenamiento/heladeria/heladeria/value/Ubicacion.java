package co.com.sofkau.entrenamiento.heladeria.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {
    private final String value;


    public Ubicacion(String value) {
        this.value = Objects.requireNonNull(value, "Ubicacion Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La ubicacion no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("La ubicacion no permite mas de 100  caracteres");
        }
    }

    public static Ubicacion of(String ubicacion) {
        return new Ubicacion(ubicacion);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Objects.equals(value, ubicacion.value);
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



