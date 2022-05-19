package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {

    private final String tipo;

    public Tipo(String nombre) {
        this.tipo = Objects.requireNonNull(nombre, "Tipo Requerido");

        if (this.tipo.isBlank()) {
            throw new IllegalArgumentException("El tipo no puede estar en blanco");
        }

        if (this.tipo.length() > 100) {
            throw new IllegalArgumentException("El tipo no permite mas de 100  caracteres");
        }
    }


    @Override
    public String value() {
        return tipo;
    }
}
