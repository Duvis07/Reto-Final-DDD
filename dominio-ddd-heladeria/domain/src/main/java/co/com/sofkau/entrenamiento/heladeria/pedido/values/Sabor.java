package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sabor implements ValueObject<String> {

    private final String value;

    public Sabor(String value) {
        this.value = Objects.requireNonNull(value, "Sabor Requerido");

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("EL sabor no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("El sabor no permite mas de 100 caracteres");
        }
    }

    public static Sabor of(String sabor) {
        return new Sabor(sabor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sabor sabor = (Sabor) o;
        return value == sabor.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value() {
        return value;
    }

}
