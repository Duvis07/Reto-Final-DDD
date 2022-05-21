package PedidoUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AsignarCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AsignarEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.ClienteAsignado;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.EntregaAsignada;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdEntrega;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.NombreProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pedidosUseCase.AsignarClienteUseCase;
import pedidosUseCase.AsignarEntregaUseCase;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AsignarEntregaCaseUseTest {
    private AsignarEntregaUseCase asignarEntregaUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        asignarEntregaUseCase = new AsignarEntregaUseCase();
        repository = mock(DomainEventRepository.class);
        asignarEntregaUseCase.addRepository(repository);
    }

    @Test
    public void asignarEntrega() {

        //Arrange
        var command = new AsignarEntrega(
                new IdEntrega("1"),
                IdPedido.of("41"),
                new NombreProducto("Paletas"),
                new Precio(2.500),
                new Fecha(1, 10, 2021));

        when(repository.getEventsBy("1")).thenReturn(events());

        //Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(asignarEntregaUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        EntregaAsignada entregaAsignada = (EntregaAsignada) events.get(0);
        Assertions.assertEquals("1", entregaAsignada.IdEntrega().value());
        Assertions.assertEquals("Paletas", entregaAsignada.NombreProducto().value());
        Assertions.assertEquals(2.500, entregaAsignada.Precio().value());
        Assertions.assertEquals(1, 10, 2021, entregaAsignada.Fecha().value());

    }

    private List<DomainEvent> events() {
        return List.of(new PedidoCreado(
                IdPedido.of("21"),
                new Fecha(1, 10, 2021),
                new Descripcion("dos helados"),
                new Cliente(
                        new IdCliente("1"),
                        new Nombre("Mariana"),
                        new Telefono(321617879)
                )
        ));
    }
}


