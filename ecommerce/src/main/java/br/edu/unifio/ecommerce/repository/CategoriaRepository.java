package br.edu.unifio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}