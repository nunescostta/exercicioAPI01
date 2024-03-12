package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotiinformatica.entities.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {

}
