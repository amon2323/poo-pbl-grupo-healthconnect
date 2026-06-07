package domain.faturamento.entities;

public class Pagamento {

    private String id;
    private double valor;
    private boolean pago;

    public Pagamento(String id, double valor) {
        this.id = id;
        this.valor = valor;
        this.pago = false;
    }

    public void pagar() {
        this.pago = true;
    }

    public boolean isPago() {
        return pago;
    }

    public double getValor() {
        return valor;
    }
}
}
