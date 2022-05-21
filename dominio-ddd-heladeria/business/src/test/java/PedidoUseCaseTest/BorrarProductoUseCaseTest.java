package PedidoUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CrearHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.heladeria.pedido.commands.BorrarProducto;
import co.com.sofkau.entrenamiento.heladeria.pedido.events.ProductoBorrado;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdPedido;
import co.com.sofkau.entrenamiento.heladeria.pedido.identities.IdProducto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import pedidosUseCase.BorrarProductoUseCase;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BorrarProductoUseCaseTest {


        private BorrarProductoUseCase  borrarProductoUseCase;

        @Mock
        private DomainEventRepository repository;

        @BeforeEach
        public void setup() {
            borrarProductoUseCase = new BorrarProductoUseCase();
            repository = mock(DomainEventRepository.class);
            borrarProductoUseCase.addRepository(repository);
        }

        @Test
        public void eliminarProducto(){
            //Arrange
            var command = new BorrarProducto(
                    new IdProducto("4"),
                    IdPedido.of("4"));
            when(repository.getEventsBy("4")).thenReturn(events());

            var response = UseCaseHandler
                    .getInstance()
                    .setIdentifyExecutor("4")
                    .syncExecutor(borrarProductoUseCase, new RequestCommand<>(command))
                    .orElseThrow();

            var events = response.getDomainEvents();

          ProductoBorrado productoBorrado = (ProductoBorrado) events.get(0);
            Assertions.assertEquals("4", productoBorrado.IdProducto().value());
        }

        private List<DomainEvent> events() {
            return List.of(

                    // se crea heladeria
                    new HeladeriaCreada(
                        IdHeladeria.of("13"),
                        new Nombre("helados rellenos de azucar"),
                        new Telefono(30452213),
                        new Ubicacion("Medellin"))
            );

        }
    }


