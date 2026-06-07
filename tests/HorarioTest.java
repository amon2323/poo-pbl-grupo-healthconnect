package tests

public class HorarioTest {
    @Test
void deveCriarHorarioValido() {

    Horario horario =
            new Horario(LocalDateTime.now());

    assertNotNull(horario);
}
@Test
void naoDevePermitirHorarioNulo() {

    assertThrows(
            IllegalArgumentException.class,
            () -> new Horario(null)
    );
}
}
