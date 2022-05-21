package co.com.sofkau.entrenamiento.heladeria.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Edad implements ValueObject<Integer> {
    private final Integer value;

    public Edad(Integer value) {
        this.value = value;
    }


    public static Edad of(Integer edad) {
        return new Edad(edad);
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

    @Override
    public Integer value() {
        return value;
    }
}


