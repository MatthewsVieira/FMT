CREATE TABLE curso (
	id BIGSERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	descricao VARCHAR(300),
	carga_horaria INTEGER NOT NULL
);