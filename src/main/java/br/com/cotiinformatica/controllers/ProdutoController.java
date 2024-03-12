package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.ProdutoPutDto;
import br.com.cotiinformatica.dtos.ProdutosPostDto;
import br.com.cotiinformatica.entities.Produto;
import br.com.cotiinformatica.repositories.IProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private IProdutoRepository iProdutoRepository;

	@PostMapping
	public ResponseEntity<String> post(@RequestBody ProdutosPostDto dto) {
		try {

			Produto produto = new Produto();

			produto.setNome(dto.getNome());
			produto.setDescricao(dto.getDescricao());
			produto.setQualidade(dto.getQuantidade());
			produto.setPreco(dto.getPreco());

			iProdutoRepository.save(produto);

			return ResponseEntity.status(201).body("PRODUTO CADASTRADO COM SUCESSO");

		} catch (Exception e) {
			return ResponseEntity.status(500).body(e.getMessage());
		}

	}

	@PutMapping
	public ResponseEntity<String> put(@RequestBody ProdutoPutDto dto) {
		try {

			Produto produto = iProdutoRepository.findById(dto.getId()).get();

			produto.setNome(dto.getNome());
			produto.setDescricao(dto.getDescricao());
			produto.setQualidade(dto.getQuantidade());
			produto.setPreco(dto.getPreco());

			iProdutoRepository.save(produto);

			return ResponseEntity.status(200).body("PRODUTO ATUALIZADO COM SUCESSO");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e.getMessage());
		}

	}

	@DeleteMapping
	public ResponseEntity<String> delet(@PathVariable("id") Integer id) {
		try {
			Produto produto = iProdutoRepository.findById(id).get();

			iProdutoRepository.delete(produto);

			return ResponseEntity.status(200).body("PRODUTO EXCLUIDO COM SUCESSO");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e.getMessage());
		}
	}

	@GetMapping
	public List<Produto> get() {
		return iProdutoRepository.findAll();
	}
}
