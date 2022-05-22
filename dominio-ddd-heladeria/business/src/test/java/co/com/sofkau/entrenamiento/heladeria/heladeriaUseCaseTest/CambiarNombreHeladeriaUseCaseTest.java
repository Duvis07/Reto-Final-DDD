package co.com.sofkau.entrenamiento.heladeria.heladeriaUseCaseTest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Nombre;
import co.com.sofkau.entrenamiento.heladeria.envio.values.Telefono;
import co.com.sofkau.entrenamiento.heladeria.heladeria.commands.CambiarNombreHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.HeladeriaCreada;
import co.com.sofkau.entrenamiento.heladeria.heladeria.events.NombreCambiadoHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.identities.IdHeladeria;
import co.com.sofkau.entrenamiento.heladeria.heladeria.value.Ubicacion;
import co.com.sofkau.entrenamiento.heladeria.heladeriaUseCase.CambiarNombreHeladeriaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Duvan Botero
 * @version 1.0
 * @email duvanarleybotero@gmail.com
 */
public class CambiarNombreHeladeriaUseCaseTest {

    private CambiarNombreHeladeriaUseCase cambiarNombreHeladeriaUseCase;

    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        cambiarNombreHeladeriaUseCase = new CambiarNombreHeladeriaUseCase();
        repository = mock(DomainEventRepository.class);
        cambiarNombreHeladeriaUseCase.addRepository(repository);
    }

    @Test
    void cambiarNombreHeladeria() {

        var command = new CambiarNombreHeladeria(
                IdHeladeria.of("122"),
                new Nombre("4 esquinas"),
                new Ubicacion("Bogota")
        );

        when(repository.getEventsBy("122")).thenReturn(events());

        var response = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("122")
                .syncExecutor(cambiarNombreHeladeriaUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var events = response.getDomainEvents();
        NombreCambiadoHeladeria nombreHeladeriaCambiado = (NombreCambiadoHeladeria) events.get(0);
        Assertions.assertEquals("4 esquinas", nombreHeladeriaCambiado.Nombre().value());
        Assertions.assertEquals("Bogota", nombreHeladeriaCambiado.Ubicacion().value());
    }

    private List<DomainEvent> events() {
        return List.of(new HeladeriaCreada(
                IdHeladeria.of("41"),
                new Nombre("deliSuper"),
                new Telefono(3114593),
                new Ubicacion("Abejorral")
        ));
    }
}
