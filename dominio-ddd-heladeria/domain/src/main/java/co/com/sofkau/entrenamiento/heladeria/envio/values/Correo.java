package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Correo implements ValueObject<String> {

    private final String value;

    public Correo(String value) {
        this.value = Objects.requireNonNull(value, "Correo Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El correo no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("La correo no permite mas de 100  caracteres");
        }
    }
    public static Correo of(String correo) {
        return new Correo(correo);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Correo correo = (Correo) o;
        return value == correo.value;
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

