package co.com.sofkau.entrenamiento.curso.heladeria.value;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.entrenamiento.curso.envio.values.Modelo;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {
    private final String ubicacion;


    public Ubicacion(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion, "Ubicacion Requerido");

        if (this.ubicacion.isBlank()) {
            throw new IllegalArgumentException("La ubicacion no puede estar en blanco");
        }

        if (this.ubicacion.length() > 100) {
            throw new IllegalArgumentException("La ubicacion no permite mas de 100  caracteres");
        }
    }

    public static Ubicacion of(String ubicacion) {
        return new Ubicacion(ubicacion);
    }
    @Override
    public String value() {
        return ubicacion;
    }
}

