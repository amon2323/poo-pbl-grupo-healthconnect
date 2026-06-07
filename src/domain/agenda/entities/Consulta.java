package domain.agenda.entities;

import java.time.LocalDateTime;

public class Consulta {

    private String id;
    private String horario;

    public Consulta(String id, String horario) {
        this.id = id;
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }
}