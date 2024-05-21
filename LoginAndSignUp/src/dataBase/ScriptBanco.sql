
<<<<<<< HEAD
CREATE DATABASE IF NOT EXISTS login;
USE login;
CREATE TABLE IF NOT EXISTS user
=======
CREATE DATABASE IF NOT EXISTS aluno;
USE aluno;
CREATE TABLE IF NOT EXISTS registro
>>>>>>> 88bfa0f1ec6b0d6265728edcac9225d5056b2177
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(127),
    email VARCHAR(127),
    password VARCHAR(127)
);

SHOW TABLES;
<<<<<<< HEAD
DESC user;
SELECT * FROM user;
=======
DESC registro;
SELECT * FROM registro;
>>>>>>> 88bfa0f1ec6b0d6265728edcac9225d5056b2177
