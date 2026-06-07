package tests;

import domain.agenda.entities.Consulta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaTest {

    @Test
    void deveCriarConsultaComSucesso() {
        Consulta consulta = new Consulta(
                "1",
                "2026-06-07 14:00"
        );

        assertEquals("1", consulta.getId());
        assertEquals("2026-06-07 14:00", consulta.getHorario());
    }
}