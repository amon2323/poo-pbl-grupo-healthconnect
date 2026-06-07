package domain.agenda.entities;

import domain.agenda.valueobjects.Horario;
import domain.agenda.enums.StatusConsulta;

public class Consulta {

    private String id;
    private Horario horario;
    private StatusConsulta status;

    public Consulta(String id, Horario horario) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID inválido");
        }

        if (horario == null) {
            throw new IllegalArgumentException("Horário obrigatório");
        }

        this.id = id;
        this.horario = horario;
        this.status = StatusConsulta.AGENDADA;
    }

    public String getId() {
        return id;
    }

    public Horario getHorario() {
        return horario;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void cancelar() {
        this.status = StatusConsulta.CANCELADA;
    }

    public void realizar() {
        this.status = StatusConsulta.REALIZADA;
    }
}