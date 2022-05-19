package co.com.sofkau.entrenamiento.curso.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

/**
 * Descripcion es un  objeto de valor del  agregado de paquete
 * se hacen  validaciones de campos requeridos y maxLength
 *
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */

public class Descripcion implements ValueObject<String> {
    private final String value;

    public Descripcion(String value) {

        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar en blanco");
        }

        if (this.value.length() > 200) {
            throw new IllegalArgumentException("El nombre no permite mas de 200 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
