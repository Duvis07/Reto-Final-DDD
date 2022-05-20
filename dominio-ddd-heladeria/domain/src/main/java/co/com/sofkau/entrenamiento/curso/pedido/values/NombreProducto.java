package co.com.sofkau.entrenamiento.curso.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreProducto implements ValueObject<String> {

    private final String nombreProducto;

    public NombreProducto(String nombreProducto) {
        this.nombreProducto = Objects.requireNonNull(nombreProducto, "NombreProducto Requerido");

        if (this.nombreProducto.isBlank()) {
            throw new IllegalArgumentException("EL nombreProducto no puede estar en blanco");
        }

        if (this.nombreProducto.length() > 30) {
            throw new IllegalArgumentException("El nombreProducto no permite mas de 30 caracteres");
        }
    }


    public static NombreProducto of(String nombreProducto) {
        return new NombreProducto(nombreProducto);
    }

    @Override
    public String value() {
        return nombreProducto;
    }


}


