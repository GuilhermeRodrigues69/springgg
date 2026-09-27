package br.edu.unifio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}