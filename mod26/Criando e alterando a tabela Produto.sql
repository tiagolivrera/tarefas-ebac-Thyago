-- Criando a tabela produto
CREATE TABLE tb_produto (
	Id int,
	Nome varchar(255),
	Cor varchar(50),
	Preco decimal(13, 2),
	Tamanho varchar(5),
	Genero char(1)
);

-- Alterando a tabela produto
ALTER TABLE tb_produto
ADD DataCadastro DATETIME2

-- Adicionando informações a tabela produto
INSERT INTO tb_produto VALUES (1, 'Caneta', 'Verde', '0.95', 'M', 'U', GETDATE())
INSERT INTO tb_produto VALUES (2, 'Borracha', 'Azul', '0.50', 'P', 'U', GETDATE())
INSERT INTO tb_produto VALUES (3, 'Bolsa', 'Rosa', '19.95', 'G', 'F', GETDATE())
INSERT INTO tb_produto VALUES (4, 'Caderno', 'Preto', '22.00', 'M', 'M', GETDATE())
INSERT INTO tb_produto VALUES (5, 'Apagador', 'Preto', '3.95', 'M', 'U', GETDATE())
INSERT INTO tb_produto VALUES (6, 'Cartolina', 'Branco', '0.95', 'M', 'U', GETDATE())
INSERT INTO tb_produto VALUES (7, 'Emborrachado', 'Verde', '2.95', 'M', 'U', GETDATE())
INSERT INTO tb_produto VALUES (8, 'Bloco adesivo', 'Amarelo', '3.95', 'M', 'U', GETDATE())
INSERT INTO tb_produto VALUES (9, 'Apontador', 'Azul', '1.95', 'M', 'U', GETDATE())
INSERT INTO tb_produto VALUES (10, 'Lápis', 'Verde', '0.75', 'M', 'U', GETDATE())

-- Alterando informações de uma linha
UPDATE tb_produto
SET Nome = 'Folha EVA',
    Cor = 'Branco'
WHERE Id = 7;

-- Excluindo uma linha
DELETE tb_produto
WHERE Id = 10;

-- Deletando a tabela
DROP TABLE tb_produto;


