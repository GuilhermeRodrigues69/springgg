package br.edu.unifio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}