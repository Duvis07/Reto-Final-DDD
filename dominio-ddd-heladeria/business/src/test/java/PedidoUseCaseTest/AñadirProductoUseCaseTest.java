package PedidoUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AñadirProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.ProductoAñadido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Cantidad;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Sabor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pedidosUseCase.AñadirProductoUseCase;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirProductoUseCaseTest {
    private AñadirProductoUseCase añadirProductoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        añadirProductoUseCase = new AñadirProductoUseCase();
        repository = mock(DomainEventRepository.class);
        añadirProductoUseCase.addRepository(repository);
    }

    @Test
    public void añadirProducto() {

        //Arrange
        var command = new AñadirProducto(
                IdPedido.of("22"),
                new IdProducto("2"),
                new Nombre("chococono"),
                new Sabor("chocolate"),
                new Cantidad(12));

        when(repository.getEventsBy("2")).thenReturn(events());

        // Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("2")
                .syncExecutor(añadirProductoUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        ProductoAñadido productoAñadido = (ProductoAñadido) events.get(0);
        Assertions.assertEquals("2", productoAñadido.IdProducto().value());
        Assertions.assertEquals("chococono", productoAñadido.Nombre().value());
        Assertions.assertEquals("chocolate", productoAñadido.Sabor().value());
        Assertions.assertEquals(12, productoAñadido.Cantidad().value());
    }

    private List<DomainEvent> events() {
        return List.of(new PedidoCreado(
                IdPedido.of("21"),
                new Fecha(1, 10, 2021),
                new Descripcion("dos helados"),
                new Cliente(
                        new IdCliente("1"),
                        new Nombre("duvan"),
                        new Telefono(321617879)
                )
        ));
    }
}
