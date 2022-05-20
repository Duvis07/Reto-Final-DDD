package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {
    private  final Double precio;

    public Precio(Double precio) {
        this.precio = Objects.requireNonNull(precio);

        if (this.precio <= 0) {
            throw new IllegalArgumentException("El precio no puede estar vacio");
        }

        if (String.valueOf(this.precio).isBlank()) {
            throw new IllegalArgumentException("EL precio no puede estar en blanco");
        }

        if (this.precio.longValue() > 5) {
            throw new IllegalArgumentException("El precio no permite mas de 5 caracteres");
        }
    }


    public static Precio of(Double precio) {
        return new Precio(precio);
    }
    @Override
    public Double value() {
        return precio;
    }
}


