package co.com.sofkau.entrenamiento.curso.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Factura implements ValueObject<String> {


    private String descripcion;
    private LocalDateTime hora;
    private static LocalDate dia;


    public Factura(String descripcion, LocalDateTime hora, LocalDate dia) {
        this.descripcion = descripcion;
        this.hora = hora;
        this.dia = dia;
    }


    public void Descripcion(String descripcion, LocalDateTime hora, LocalDate dia) {
        this.descripcion = Objects.requireNonNull(descripcion, "Descripcion Requerida");
        this.hora = Objects.requireNonNull(hora);
        this.dia = Objects.requireNonNull(dia);

        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar en blanco");
        }

        if (this.descripcion.length() > 100) {
            throw new IllegalArgumentException("La descripcion no permite mas de 100  caracteres");
        }
    }

    public static Descripcion of(String descripcion) {
        return new Descripcion(descripcion);
    }

    @Override
    public String value() {
        return descripcion;
    }

}




