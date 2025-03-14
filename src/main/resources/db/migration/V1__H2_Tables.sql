CREATE TABLE usuario(
    id BIGINT NOT NULL auto_increment,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

ALTER TABLE usuario ADD PRIMARY KEY(id);