package domain.agenda.valueobjects;

import java.time.LocalDateTime;

public class Horario {

    private final LocalDateTime dataHora;

    public Horario(LocalDateTime dataHora) {
        if (dataHora == null) {
            throw new IllegalArgumentException("Horário não pode ser nulo");
        }
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}