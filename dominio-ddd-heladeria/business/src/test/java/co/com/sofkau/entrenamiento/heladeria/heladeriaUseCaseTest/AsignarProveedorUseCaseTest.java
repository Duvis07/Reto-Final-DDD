package co.com.sofkau.entrenamiento.heladeria.heladeriaUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AsignarProveedor;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.ProveedorAsignado;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdProveedor;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.heladeria.heladeriaUseCase.AsignarProveedorUseCase;
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
public class AsignarProveedorUseCaseTest {

    private AsignarProveedorUseCase asignarProveedorUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        asignarProveedorUseCase = new AsignarProveedorUseCase();
        repository = mock(DomainEventRepository.class);
        asignarProveedorUseCase.addRepository(repository);
    }

    @Test
    public void asignarAdmin() {

        //Arrange
        var command = new AsignarProveedor(
                new IdProveedor("1"),
                IdHeladeria.of("21"),
                new Nombre("Mario"),
                new Correo("mario@gmail.com"),
                new Telefono(30452213));
        when(repository.getEventsBy("21")).thenReturn(events());

        //Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("21")
                .syncExecutor(asignarProveedorUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        ProveedorAsignado proveedorAsignado = (ProveedorAsignado) events.get(0);
        Assertions.assertEquals("21", proveedorAsignado.IdHeladeria().value());
        Assertions.assertEquals("Mario", proveedorAsignado.Nombre().value());
        Assertions.assertEquals("mario@gmail.com", proveedorAsignado.Correo().value());
        Assertions.assertEquals(30452213, proveedorAsignado.Telefono().value());


    }

    private List<DomainEvent> events() {
        return List.of(new HeladeriaCreada(
                IdHeladeria.of("21"),
                new Nombre("Rincon de las delicias"),
                new Telefono(3114593),
                new Ubicacion("Medellin")
        ));
    }


}


