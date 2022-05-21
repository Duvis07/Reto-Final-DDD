package PedidoUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.AsignarCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.entities.Cliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.ClienteAsignado;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdCliente;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Fecha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pedidosUseCase.AsignarClienteUseCase;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AsignarClienteUseCaseTest {

    private AsignarClienteUseCase asignarClienteUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        asignarClienteUseCase = new AsignarClienteUseCase();
        repository = mock(DomainEventRepository.class);
        asignarClienteUseCase.addRepository(repository);
    }

    @Test
    public void asignarAdmin() {

        //Arrange
        var command = new AsignarCliente(
                IdPedido.of("41"),
                new IdCliente("1"),
                new Nombre("Fausto"),
                new Telefono(31120564));
        when(repository.getEventsBy("1")).thenReturn(events());

        //Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(asignarClienteUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        ClienteAsignado clienteAsignado = (ClienteAsignado) events.get(0);
        Assertions.assertEquals("1", clienteAsignado.IdCliente().value());
        Assertions.assertEquals("Fausto", clienteAsignado.Nombre().value());
        Assertions.assertEquals(31120564, clienteAsignado.Telefono().value());

    }

    private List<DomainEvent> events(){
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



