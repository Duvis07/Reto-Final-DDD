package co.com.sofkau.entrenamiento.heladeria.envio.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Factura implements ValueObject<String> {


    private String value;
    private LocalDateTime hora;
    private static LocalDate dia;


    public Factura(String value, LocalDateTime hora, LocalDate dia) {
        this.value = value;
        this.hora = hora;
        this.dia = dia;
    }


    public void Descripcion(String descripcion, LocalDateTime hora, LocalDate dia) {
        this.value = Objects.requireNonNull(descripcion, "Factura Requerida");
        this.hora = Objects.requireNonNull(hora);
        this.dia = Objects.requireNonNull(dia);

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La factura no puede estar en blanco");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("La factura no permite mas de 100  caracteres");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return value == factura.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }

}




