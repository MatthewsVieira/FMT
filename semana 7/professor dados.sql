INSERT INTO professor (nome, especialidade)
VALUES ('Abner', 'Java');

INSERT INTO professor (nome, especialidade)
VALUES ('Marilia', 'Banco de Dados');

INSERT INTO professor (nome, especialidade)
VALUES ('Lucas', 'Java Script');

INSERT INTO professor (nome, especialidade)
VALUES ('Guilherme Almeida', 'IA');

INSERT INTO professor (nome, especialidade)
VALUES ('Giovanna', 'HMTL & CSS');

UPDATE professor 
  	SET id_curso = 1
	WHERE nome = 'Lucas'
	
UPDATE professor 
  	SET id_curso = 1
	WHERE nome = 'Giovanna';
	
UPDATE professor 
  	SET id_curso = 2
	WHERE especialidade = 'Java' OR especialidade = 'Banco de Dados' OR especialidade = 'IA';