package br.com.cotiinformatica.dtos;

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

public class ProdutoPutDto {

	private Integer id;
	private String nome;
	private String descricao;
	private Integer quantidade;
	private Double preco;
}
