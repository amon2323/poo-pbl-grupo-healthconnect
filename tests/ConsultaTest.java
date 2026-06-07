package tests;

import domain.agenda.entities.Consulta;
import domain.agenda.valueobjects.Horario;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultaTest {

    @Test
    void deveCriarConsultaComSucesso() {

        Horario horario = new Horario(
                LocalDateTime.of(2026, 6, 7, 14, 0)
        );

        Consulta consulta = new Consulta("1", horario);

        assertEquals("1", consulta.getId());
        assertEquals(horario, consulta.getHorario());
        assertEquals("AGENDADA", consulta.getStatus().name());
    }

    @Test
    void deveCancelarConsulta() {

        Horario horario = new Horario(
                LocalDateTime.of(2026, 6, 7, 14, 0)
        );

        Consulta consulta = new Consulta("1", horario);

        consulta.cancelar();

        assertEquals("CANCELADA", consulta.getStatus().name());
    }
    @Test
void naoDeveCriarConsultaSemId() {

    Horario horario =
            new Horario(LocalDateTime.now());

    assertThrows(
            IllegalArgumentException.class,
            () -> new Consulta("", horario)
    );
}
@Test
void naoDeveCriarConsultaSemHorario() {

    assertThrows(
            IllegalArgumentException.class,
            () -> new Consulta("1", null)
    );
}
}