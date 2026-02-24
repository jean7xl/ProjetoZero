CREATE TABLE tb_nivel (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    dificuldade VARCHAR(255),
    descricao VARCHAR(255)
);

CREATE TABLE tb_cadastro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    img_url VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    idade INT,
    nivel_id BIGINT,
    FOREIGN KEY (nivel_id) REFERENCES tb_nivel(id)
);