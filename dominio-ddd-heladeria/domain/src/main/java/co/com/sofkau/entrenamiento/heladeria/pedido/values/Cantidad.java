package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;


import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private final Integer value;

    public Cantidad(Integer value) {
        this.value = value;
    }

    public static Cantidad of(Integer cantidad) {
        return new Cantidad(cantidad);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cantidad cantidad = (Cantidad) o;
        return Objects.equals(value, cantidad.value);
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



