package AgendamentoService

public class AgendamentoService {
   public Consulta criarConsulta(
            String id,
            Horario horario) {

        return new Consulta(id, horario);
    }
}
