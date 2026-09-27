package br.edu.unifio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entity.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}