
Insert into db_universidade.departamento (nome, codigo_departamento) values ('Informação e Sistemas', 'D001');
Insert into db_universidade.departamento (nome, codigo_departamento) values ('Tecnologia da Informação', 'D002');

Insert into db_universidade.professor (nome, cpf, categoria, salario, departamento_id) values ('Maria', '12345678944', 'Adjunto 1', 1500, 1);
Insert into db_universidade.professor (nome, cpf, categoria, salario, departamento_id) values ('Pedro', '98745632155', 'Adjunto 2', 2000, 1);
Insert into db_universidade.professor (nome, cpf, categoria, salario, departamento_id) values ('João', '11122233344', 'Adjunto 1', 1500, 2);
Insert into db_universidade.professor (nome, cpf, categoria, salario, departamento_id) values ('Carlos', '55566677788', 'Adjunto 1', 1500, 2);

Insert into db_universidade.disciplina (nome, codigo_disciplina, carga_horaria) values ('Banco de Dados', 'IF976', '60h');
Insert into db_universidade.disciplina (nome, codigo_disciplina, carga_horaria) values ('Programação 1', 'IF992', '60h');
Insert into db_universidade.disciplina (nome, codigo_disciplina, carga_horaria) values ('Fundamentos de SI', 'IF973', '75h');

Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (1, 3, '2013.1');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (1, 3, '2013.2');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (1, 2, '2013.1');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (1, 1, '2013.1');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (4, 1, '2013.2');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (2, 3, '2013.2');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (3, 3, '2013.2');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (2, 1, '2013.2');
Insert into db_universidade.ministra (professor_id, disciplina_id, periodo) values (4, 1, '2013.1');
