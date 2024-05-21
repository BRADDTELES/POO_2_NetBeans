/*
CONECTAR NO TERMINAL BASH, usar esses comandos abaixo:
mysql -h cluster-db-azure.mysql.database.azure.com -u danillo -p ''
 * CONEXÃO usando o Banco de Dados Azure na nuvem
 * String URL: jdbc:mysql://cluster-db-azure.mysql.database.azure.com:3306/login
 * User: danillo
*/
CREATE DATABASE IF NOT EXISTS login;
USE login;
CREATE TABLE IF NOT EXISTS user
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(127),
    email VARCHAR(127),
    password VARCHAR(127)
);

SHOW TABLES;
DESC user;
SELECT * FROM user;