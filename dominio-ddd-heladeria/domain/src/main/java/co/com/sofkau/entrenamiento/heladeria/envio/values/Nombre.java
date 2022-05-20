package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "Nombre Requerido");

        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if (this.nombre.length() > 100) {
            throw new IllegalArgumentException("El nombre no permite mas de 100  caracteres");
        }
    }

    public static Nombre of(String nombre) {
        return new Nombre(nombre);
    }

    @Override
    public String value() {
        return nombre;
    }
}