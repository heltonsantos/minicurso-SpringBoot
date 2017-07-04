
Insert into db_universidade.departamento (nome, codigo_departamento) values ('InformaçÁ„o e Sistemas', 'D001');
Insert into db_universidade.departamento (nome, codigo_departamento) values ('Tecnologia da InformaçÁ„oo', 'D002');

Insert into db_universidade.professor (nome, siape, categoria, salario, departamento_id) values ('Maria', '1234', 'Adjunto 1', 1500, 1);
Insert into db_universidade.professor (nome, siape, categoria, salario, departamento_id) values ('Pedro', '5678', 'Adjunto 2', 2000, 1);
Insert into db_universidade.professor (nome, siape, categoria, salario, departamento_id) values ('Jo„o', '1122', 'Adjunto 1', 1500, 2);
Insert into db_universidade.professor (nome, siape, categoria, salario, departamento_id) values ('Carlos', '5522', 'Adjunto 1', 1500, 2);

Insert into db_universidade.disciplina (nome, codigo_disciplina, carga_horaria) values ('Banco de Dados', 'IF976', '60h');
Insert into db_universidade.disciplina (nome, codigo_disciplina, carga_horaria) values ('ProgramaçÁ„o 1', 'IF992', '60h');
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
