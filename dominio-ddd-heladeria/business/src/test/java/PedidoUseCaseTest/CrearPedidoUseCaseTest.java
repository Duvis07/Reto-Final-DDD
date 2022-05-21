package PedidoUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CrearHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.CrearPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;
import heladeriaUseCase.CrearHeladeriaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedidosUseCase.CrearPedidoUseCase;

import java.util.List;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CrearPedidoUseCaseTest {

    private CrearPedidoUseCase crearPedidoUseCase;

    @BeforeEach
    public void setup() {
        crearPedidoUseCase = new CrearPedidoUseCase();
    }

    @Test
    public void crearPedido() {
        var command = new CrearPedido(
                IdPedido.of("13"),
                new Fecha(1, 10, 2021),
                new Descripcion("conos"),
                new Cliente(
                        new IdCliente("1"),
                        new Nombre("Mariana"),
                        new Telefono(321617879)));

        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("13")
                .syncExecutor(crearPedidoUseCase, new RequestCommand<>(command))
                .orElseThrow();
        List<DomainEvent> events = response.getDomainEvents();
        PedidoCreado pedidoCreado = (PedidoCreado) events.get(0);
        Assertions.assertEquals(1, 10, 2021, pedidoCreado.Fecha().value());
        Assertions.assertEquals("conos", pedidoCreado.Descripcion().value());
    }
}


