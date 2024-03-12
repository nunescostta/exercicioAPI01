package br.com.cotiinformatica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

@Entity
@Table(name = "produto")

public class Produto {

	@Id
	// Anottation para especificar que a chave primaria seja gerada automaticamente
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	//dentro da @COLUMN especifico como está no banco de dados
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "descricao", length = 200, nullable = false)
	private String descricao;

	@Column(name = "quantidade", nullable = false )
	private Integer qualidade;

	@Column(name = "preco", nullable = false)
	private Double preco;
}
