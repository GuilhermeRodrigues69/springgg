package br.edu.unifio.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entity.Pedido;

@SpringBootTest
public class PedidoRepositoryTest {

    @Autowired
    private PedidoRepository repository;

    @Test
    void buscarPorId() {
        Pedido pedido = repository.findById(1).orElse(null);

        assertFalse(pedido == null);
        assertEquals("PENDENTE", pedido.getStatus());
        assertEquals(150.00, pedido.getValorTotal().doubleValue());
    }

    @Test
    void listarPedidos() {
        List<Pedido> pedidos = repository.findAll();

        assertEquals(5, pedidos.size());
    }
}