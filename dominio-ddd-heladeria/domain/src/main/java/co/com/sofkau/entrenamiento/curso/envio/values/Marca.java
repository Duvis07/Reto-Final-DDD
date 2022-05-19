package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<String> {
    private final String marca;

    public Marca(String marca) {
        this.marca = Objects.requireNonNull(marca, "Marca Requerida");

        if (this.marca.isBlank()) {
            throw new IllegalArgumentException("La marca no puede estar en blanco");
        }

        if (this.marca.length() > 100) {
            throw new IllegalArgumentException("La marca no permite mas de 100  caracteres");
        }
    }

    @Override
    public String value() {
        return marca;
    }
}

