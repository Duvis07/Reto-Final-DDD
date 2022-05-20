package heladeriausecasetest;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Correo;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.AsignarAdmin;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.AdminAsignado;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdAdministrador;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import heladeriaUseCase.AsignarAdminUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AsignarAdminUseCaseTest {

    private AsignarAdminUseCase asignarAdminUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        asignarAdminUseCase = new AsignarAdminUseCase();
        repository = mock(DomainEventRepository.class);
        asignarAdminUseCase.addRepository(repository);
    }

    @Test
    public void asignarAdmin() {

        //Arrange
        var command = new AsignarAdmin(
                new IdAdministrador("1"),
                IdHeladeria.of("21"),
                new Nombre("Mario"),
                new Telefono(311459),
                new Correo("mario@gmail.com"));
        when(repository.getEventsBy("21")).thenReturn(events());

        //Act
        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("21")
                .syncExecutor(asignarAdminUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();

        //Asserts
        AdminAsignado adminAsignado = (AdminAsignado) events.get(0);
        Assertions.assertEquals("1", adminAsignado.IdAdministrador().value());
        Assertions.assertEquals("Mario", adminAsignado.Nombre().value());
        Assertions.assertEquals(311459, adminAsignado.Telefono().value());
        Assertions.assertEquals("mario@gmail.com", adminAsignado.Correo().value());

    }
    private List<DomainEvent> events(){
        return List.of(new HeladeriaCreada(
                IdHeladeria.of("41"),
                new Nombre("Rincon de las delicias"),
                new Telefono(3114593),
                new Ubicacion("Medellin")
        ));
    }





}
