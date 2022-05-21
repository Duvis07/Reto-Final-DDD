package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class Tipo implements ValueObject<String> {

    private final String value;

    public Tipo(String nombre) {
        this.value = Objects.requireNonNull(nombre, "Tipo Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El tipo no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("El tipo no permite mas de 100  caracteres");
        }
    }

    public static Tipo of(String tipo) {
        return new Tipo(tipo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipo tipo = (Tipo) o;
        return value == tipo.value;
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
