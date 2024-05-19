/*
CONECTAR NO TERMINAL BASH, usar esses comandos abaixo:
mysql -h cluster-db-azure.mysql.database.azure.com -u danillo -p ''
*/
CREATE DATABASE IF NOT EXISTS aluno;
USE aluno;
CREATE TABLE IF NOT EXISTS registro
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    matricula INT(10),
    curso VARCHAR(255),
    fone VARCHAR(255),
    email VARCHAR(255)
);

SHOW TABLES;
DESC registro;
SELECT * FROM registro;