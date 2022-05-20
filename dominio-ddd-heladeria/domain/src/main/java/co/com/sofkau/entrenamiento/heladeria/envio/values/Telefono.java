package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<Integer> {
    private final Integer value;

    public Telefono(Integer value) {
        this.value = value;
    }


    public static Telefono of(Integer telefono) {
        return new Telefono(telefono);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return value == telefono.value;
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
