package ConsultaRepository
import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {
    private final List<Consulta> consultas =
            new ArrayList<>();

    public void salvar(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> listar() {
        return consultas;
    }
}
