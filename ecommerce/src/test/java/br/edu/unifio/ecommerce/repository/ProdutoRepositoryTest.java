package br.edu.unifio.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entity.Produto;

@SpringBootTest
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository repository;

    @Test
    void buscarPorId() {
        Produto produto = repository.findById(1).orElse(null);

        assertFalse(produto == null);
        assertEquals("Notebook", produto.getNome());
        assertEquals("Notebook para uso pessoal", produto.getDescricao());
    }

    @Test
    void listarProdutos() {
        List<Produto> produtos = repository.findAll();

        assertEquals(5, produtos.size());
    }
}