-- drop table usuario cascade;
-- drop table post cascade;
-- drop schema banco_animal;
 
CREATE SCHEMA banco_animal;

USE banco_animal;


CREATE TABLE usuario
(
	cpf varchar(255) NOT NULL,
	nome varchar(255) NOT NULL,
	endereco varchar(255),
	cidade varchar(255),
	cep varchar(255),
	telefone varchar(255),
	email varchar(255),
	username varchar(255) NOT NULL ,
	senha varchar(255) NOT NULL,
    PRIMARY KEY(cpf)    
    
);

insert into usuario (cpf, nome, endereco, cidade, cep, telefone, email, username, senha)
values ('21212121212', 'Fulano de Tal', 'Rua dos Bobos número 0', 'Lugar Nenhum', '99.999-999',
'(99)99999-9999','fulanodetal@email.com', 'fulanodetal', 'fulanice');
	
select * from usuario;   

-- tabela post
    
CREATE TABLE post(

 id_post int not null auto_increment,
 titulo varchar(255) not null,
 username varchar(255) not null,
 cpf_usuario varchar(255) ,
 imagem varchar(255) ,
 mensagem varchar(255),
 data_post varchar(255),
 
 tipo_animal varchar(255),
 raca_animal varchar(255),
 porte_animal varchar(255),
 pelagem_animal varchar(255),
 sexo_animal varchar(255),
 situacao_animal varchar(255),

 primary key(id_post)
 -- foreign key(cpf_usuario) REFERENCES usuario(cpf)
 
 );
 
INSERT INTO post (titulo, username, cpf_usuario, imagem, mensagem, data_post, tipo_animal, raca_animal, porte_animal, pelagem_animal, sexo_animal, situacao_animal)
VALUES ('perdi meu gato','fulanodetal','21212121212','teste_imagem','foi perdido na rua tal de tal lugar ás tal horas',
 '28 de maio','felino','nao sei','pequeno','pelagem média','macho','perdido');
 
INSERT INTO post (titulo, username, cpf_usuario, imagem, mensagem, data_post, tipo_animal, raca_animal, porte_animal, pelagem_animal, sexo_animal, situacao_animal)
VALUES ('perdi meu gato','fulano','03481224117','teste_imagem','foi perdido na rua tal de tal lugar ás tal horas',
 '28 de maio','felino','nao sei','pequeno','pelagem média','macho','perdido');
 
 select * from post; 
 
 select post
 from post
 where usuario.cpf = post.cpf_usuario;
 

 
 