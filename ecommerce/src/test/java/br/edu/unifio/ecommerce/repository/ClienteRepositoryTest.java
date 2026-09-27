package br.edu.unifio.ecommerce.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entity.Cliente;

@SpringBootTest
public class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository repository;

    @Test
    void buscarPorId() {
        Cliente cliente = repository.findById(1).orElse(null);

        assertFalse(cliente == null);
        assertEquals("João Silva", cliente.getNome());
        assertEquals("joao@email.com", cliente.getEmail());
    }

    @Test
    void listarClientes() {
        List<Cliente> clientes = repository.findAll();

        assertEquals(5, clientes.size());
    }
}