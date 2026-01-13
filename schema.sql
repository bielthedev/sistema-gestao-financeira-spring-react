
CREATE DATABASE sistema_financeiro;
USE sistema_financeiro;

CREATE TABLE despesa (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  descricao VARCHAR(100),
  valor DECIMAL(10,2)
);
