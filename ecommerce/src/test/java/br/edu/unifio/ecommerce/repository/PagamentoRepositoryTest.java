package br.edu.unifio.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entity.Pagamento;

@SpringBootTest
public class PagamentoRepositoryTest {

    @Autowired
    private PagamentoRepository repository;

    @Test
    void buscarPorId() {
        Pagamento pagamento = repository.findById(1).orElse(null);

        assertFalse(pagamento == null);
        assertEquals("PAGO", pagamento.getStatus());
        assertEquals(150.00, pagamento.getValor().doubleValue());
    }

    @Test
    void listarPagamentos() {
        List<Pagamento> pagamentos = repository.findAll();

        assertEquals(5, pagamentos.size());
    }
}