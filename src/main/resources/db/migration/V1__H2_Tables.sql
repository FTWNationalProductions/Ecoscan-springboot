CREATE TABLE tb_user(
    id BIGINT NOT NULL auto_increment,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    created_at DATE NOT NULL,
    PRIMARY KEY(id)
);