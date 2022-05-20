package co.com.sofkau.entrenamiento.heladeria.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {
    private  final Double value;

    public Precio(Double value) {
        this.value = value;
    }


    public static Precio of(Double precio) {
        return new Precio(precio);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio = (Precio) o;
        return value == precio.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Double value() {
        return value;
    }
}


