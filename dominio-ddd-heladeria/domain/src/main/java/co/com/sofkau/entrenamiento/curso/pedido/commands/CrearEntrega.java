package co.com.sofkau.entrenamiento.curso.pedido.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.entrenamiento.curso.pedido.identities.PaqueteID;
import co.com.sofkau.entrenamiento.curso.pedido.values.Peso;
import co.com.sofkau.entrenamiento.curso.pedido.values.TipoEntrega;
import co.com.sofkau.entrenamiento.curso.pedido.values.ValorAsegurado;
/**
 *
 * comando CrearEntrega
 * @Version 1.0
 * @Author Duvan Botero
 * @Email duvanarleybotero@gmail.com
 * *
 */
public class CrearEntrega extends Command {
    private final PaqueteID paqueteID;
    private final TipoEntrega tipoEntrega;
    private final Peso peso;
    private final ValorAsegurado valorAsegurado;


    public CrearEntrega(PaqueteID paqueteID, TipoEntrega tipoEntrega, Peso peso, ValorAsegurado valorAsegurado) {
        this.paqueteID = paqueteID;
        this.tipoEntrega = tipoEntrega;
        this.peso = peso;
        this.valorAsegurado = valorAsegurado;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public Peso getPeso() {
        return peso;
    }

    public ValorAsegurado getValorAsegurado() {
        return valorAsegurado;
    }
}
