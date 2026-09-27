package br.edu.unifio.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entity.Categoria;

@SpringBootTest
public class CategoriaRepositoryTest {

    @Autowired
    private CategoriaRepository repository;

    @Test
    void buscarPorId() {
        Categoria categoria = repository.findById(1).orElse(null);

        assertFalse(categoria == null);
        assertEquals("Eletrônicos", categoria.getNome());
        assertEquals("Produtos eletrônicos em geral", categoria.getDescricao());
    }

    @Test
    void listarCategorias() {
        List<Categoria> categorias = repository.findAll();

        assertEquals(5, categorias.size());
        assertEquals("Eletrônicos", categorias.get(0).getNome());
    }
}