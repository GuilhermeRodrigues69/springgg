package br.edu.unifio.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entity.ItemPedido;

@SpringBootTest
public class ItemPedidoRepositoryTest {

    @Autowired
    private ItemPedidoRepository repository;

    @Test
    void buscarPorId() {
        ItemPedido item = repository.findById(1).orElse(null);

        assertFalse(item == null);
        assertEquals(2, item.getQuantidade());
        assertEquals(80.00, item.getValorUnitario().doubleValue());
    }

    @Test
    void listarItens() {
        List<ItemPedido> itens = repository.findAll();

        assertEquals(5, itens.size());
    }
}