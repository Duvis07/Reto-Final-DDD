package co.com.sofkau.entrenamiento.curso.pedido.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private  final Integer cantidad;

    public Cantidad(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);

        if (this.cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad no puede estar vacio");
        }

        if (String.valueOf(this.cantidad).isBlank()) {
            throw new IllegalArgumentException("La cantidad no puede estar en blanco");
        }

        if (this.cantidad.longValue() > 5) {
            throw new IllegalArgumentException("La cantidad no permite mas de 5 caracteres");
        }
    }

    public static Cantidad of(Integer cantidad) {
        return new Cantidad(cantidad);
    }

    @Override
    public Integer value() {
        return cantidad;
    }
}


