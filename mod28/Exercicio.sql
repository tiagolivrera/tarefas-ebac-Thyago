CREATE DATABASE vendas_online;

CREATE TABLE tb_produto (
	Id int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Nome varchar(255) NOT NULL,
	Cor varchar(50) NULL,
	Preco decimal(13, 2) NOT NULL,
	Tamanho varchar(5)  NULL,
	Genero char(1) NULL
);

CREATE TABLE tb_cliente (
	Id int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Nome varchar(255) NOT NULL,
	Endereco varchar(255) NOT NULL,
	Idade int NOT NULL
);

CREATE TABLE tb_venda (
	Id int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	IdProduto int NOT NULL,
	IdCliente int NOT NULL,
	DataVenda DATETIME2 NOT NULL
		CONSTRAINT DF_DataVenda DEFAULT GETDATE(),
	
	CONSTRAINT FK_Venda_Cliente FOREIGN KEY(IdCliente)
	REFERENCES tb_cliente(Id),
	
	CONSTRAINT FK_Venda_Produto FOREIGN KEY(IdProduto)
	REFERENCES tb_produto(Id)
);

-- Adicionando informações a tabela produto
-- Id's serão criados automaticamente pelo banco de dados
INSERT INTO tb_produto VALUES ('Caneta', 'Verde', '0.95', 'M', 'U')
INSERT INTO tb_produto VALUES ('Borracha', 'Azul', '0.50', 'P', 'U')
INSERT INTO tb_produto VALUES ('Bolsa', 'Rosa', '19.95', 'G', 'F')
INSERT INTO tb_produto VALUES ('Caderno', 'Preto', '22.00', 'M', 'M')
INSERT INTO tb_produto VALUES ('Apagador', 'Preto', '3.95', 'M', 'U')
INSERT INTO tb_produto VALUES ('Cartolina', 'Branco', '0.95', 'M', 'U')
INSERT INTO tb_produto VALUES ('Emborrachado', 'Verde', '2.95', 'M', 'U')
INSERT INTO tb_produto VALUES ('Bloco adesivo', 'Amarelo', '3.95', 'M', 'U')
INSERT INTO tb_produto VALUES ('Apontador', 'Azul', '1.95', 'M', 'U')
INSERT INTO tb_produto VALUES ('Lápis', 'Verde', '0.75', 'M', 'U')

-- Adicionando informações a tabela cliente
INSERT INTO tb_cliente VALUES ('Jose Saramago', 'Rua das Flores', 55)
INSERT INTO tb_cliente VALUES ('Machado de Assis', 'Rua das Quintas', 60)
INSERT INTO tb_cliente VALUES ('Carlos Drummond', 'Rua das Oliveiras', 65)

-- Criando vendas relacionando produto a cliente
INSERT INTO tb_venda VALUES (1, 1, GETDATE())
INSERT INTO tb_venda VALUES (2, 1, DEFAULT)
INSERT INTO tb_venda VALUES (3, 1, '20120618 10:34:09 AM')
INSERT INTO tb_venda VALUES (4, 2, GETDATE())
INSERT INTO tb_venda VALUES (5, 2, DEFAULT)
INSERT INTO tb_venda VALUES (6, 2, '20130618 10:34:09 AM')
INSERT INTO tb_venda VALUES (7, 3, GETDATE())
INSERT INTO tb_venda VALUES (8, 3, DEFAULT)
INSERT INTO tb_venda VALUES (9, 3, '20140618 10:34:09 AM')



