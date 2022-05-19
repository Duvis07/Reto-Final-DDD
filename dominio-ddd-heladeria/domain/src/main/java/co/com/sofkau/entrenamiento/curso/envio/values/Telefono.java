package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<Integer> {
    private final Integer telefono;

    public Telefono(Integer telefono) {
        this.telefono = Objects.requireNonNull(telefono);

        if (this.telefono <= 0) {
            throw new IllegalArgumentException("El telefono no puede estar vacio");
        }

        if (String.valueOf(this.telefono).isBlank()) {
            throw new IllegalArgumentException("El telefono no puede estar en blanco");
        }

        if (this.telefono.longValue() > 11) {
            throw new IllegalArgumentException("La marca no permite mas de 11 caracteres");
        }
    }


    @Override
    public Integer value() {
        return telefono;
    }
}
