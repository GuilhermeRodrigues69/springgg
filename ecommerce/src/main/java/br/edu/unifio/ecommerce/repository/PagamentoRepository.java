package br.edu.unifio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entity.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}