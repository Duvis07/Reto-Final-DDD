package envioUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.commands.AñadirVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.events.EnvioCreado;
import co.com.sofkau.entrenamiento.heladeria.envio.events.VehiculoAñadido;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdEnvio;
import co.com.sofkau.entrenamiento.heladeria.envio.identities.IdVehiculo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.*;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.pedido.values.Descripcion;
import envioUseCase.AñadirVehiculoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class AñadirVehiculoUseCaseTest {
    private AñadirVehiculoUseCase añadirVehiculoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        añadirVehiculoUseCase = new AñadirVehiculoUseCase();
        repository = mock(DomainEventRepository.class);
       añadirVehiculoUseCase.addRepository(repository);
    }

    @Test
    public void setAñadirVehiculoUseCase() {

        //Arrange
        var command = new AñadirVehiculo(
                IdEnvio.of("21"),
                new IdVehiculo("41"),
                new Marca("Toyota"),
                new Tipo("Campero"),
                new Modelo(2022));
        when(repository.getEventsBy("21")).thenReturn(events());

        //Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("21")
                .syncExecutor(añadirVehiculoUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        VehiculoAñadido vehiculoAñadido = (VehiculoAñadido) events.get(0);
        Assertions.assertEquals("41", vehiculoAñadido.IdVehiculo().value());
        Assertions.assertEquals("Toyota", vehiculoAñadido.Marca().value());
        Assertions.assertEquals("Campero", vehiculoAñadido.Tipo().value());
        Assertions.assertEquals(2022, vehiculoAñadido.Modelo().value());


    }
    private List<DomainEvent> events(){
        return List.of(new EnvioCreado(
                IdEnvio.of("21"),
                new IdHeladeria("11"),
                new Nombre("Rincon de las delicias"),
                new Descripcion("enviar helados a bogota")

        ));
    }


}
