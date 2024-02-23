CREATE TABLE professor (
	id BIGSERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	especialidade VARCHAR(100) NOT NULL
);

ALTER TABLE professor 
ADD id_curso BIGINT REFERENCES curso(id);