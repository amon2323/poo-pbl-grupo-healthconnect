package domain.atendimento.entities;

public class Prontuario {

    private String id;
    private String descricao;

    public Prontuario(String id, String descricao) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID inválido");
        }

        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
} 
}
