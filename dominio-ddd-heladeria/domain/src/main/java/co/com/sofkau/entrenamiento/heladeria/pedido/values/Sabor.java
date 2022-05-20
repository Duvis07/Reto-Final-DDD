package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sabor implements ValueObject<String> {

    private final String sabor;

    public Sabor(String sabor) {
        this.sabor = Objects.requireNonNull(sabor, "Sabor Requerido");

        if (this.sabor.isBlank()) {
            throw new IllegalArgumentException("EL sabor no puede estar en blanco");
        }

        if (this.sabor.length() > 20) {
            throw new IllegalArgumentException("El sabor no permite mas de 20 caracteres");
        }
    }


    public static Sabor of(String sabor) {
        return new Sabor(sabor);
    }

    @Override
    public String value() {
        return sabor;
    }


}
