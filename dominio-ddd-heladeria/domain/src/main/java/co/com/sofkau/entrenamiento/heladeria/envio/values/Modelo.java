package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modelo implements ValueObject<Integer> {
    private final Integer modelo;

    public Modelo(Integer precioUnitario) {
        this.modelo = Objects.requireNonNull(precioUnitario);

        if (this.modelo <= 0) {
            throw new IllegalArgumentException("El modelo no puede estar vacio");
        }

        if (String.valueOf(this.modelo).isBlank()) {
            throw new IllegalArgumentException("El modelo no puede estar en blanco");
        }

        if (!this.modelo.equals(this.modelo.intValue())) {
            throw new IllegalArgumentException(" El  modelo  no puede estar en blanco");
        }
    }

    public static Modelo of(Integer modelo) {
        return new Modelo(modelo);
    }

    @Override
    public Integer value() {
        return modelo;
    }
}
