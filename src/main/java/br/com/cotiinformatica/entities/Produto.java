package br.com.cotiinformatica.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private Integer qualidade;
	private Double preco;
}
