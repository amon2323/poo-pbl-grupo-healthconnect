package domain.agenda;

import domain.agenda.entities.Consulta;

import java.util.ArrayList;
import java.util.List;

public class AgendaMedica {

    private final List<Consulta> consultas =
            new ArrayList<>();

    public void adicionarConsulta(
            Consulta consulta) {

        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}