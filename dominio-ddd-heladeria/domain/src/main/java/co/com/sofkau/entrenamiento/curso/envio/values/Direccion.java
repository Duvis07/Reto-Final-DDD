package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String direccion;

    public Direccion(String direccion) {
            this.direccion = Objects.requireNonNull(direccion);
            if(this.direccion.isBlank()){
                throw new IllegalArgumentException("La direccion no puede estar en blanco");
            }

            if(this.direccion.length() > 200){
                throw new IllegalArgumentException("La direccion no permite mas de 200 caracteres");
            }
        }

    @Override
    public String value() {
        return direccion;
    }
}
