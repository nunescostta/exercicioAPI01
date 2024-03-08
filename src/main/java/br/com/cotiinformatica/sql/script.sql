create database exercicioAPI01;

use exercicioAPI01;

create table produto (

	id integer auto_increment primary key,
	nome varchar(100) not null,
	descricao varchar(200) not null,
	quantidade integer not null,
	preco integer not null
	
)


