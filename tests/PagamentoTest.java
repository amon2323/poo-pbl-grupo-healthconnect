package tests;

import domain.faturamento.entities.Pagamento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    void deveRealizarPagamento() {

        Pagamento pagamento = new Pagamento("1", 100.0);

        pagamento.pagar();

        assertTrue(pagamento.isPago());
    }
    @Test
void naoDeveCriarPagamentoComValorNegativo() {
}
}
