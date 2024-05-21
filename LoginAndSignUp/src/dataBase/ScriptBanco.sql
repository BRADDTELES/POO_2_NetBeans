/*
mysql -h cluster-db-azure.mysql.database.azure.com -u danillo -p ''
Enter Password:
*/
CREATE DATABASE java_user_database;
USE java_user_database;
CREATE TABLE user
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(127),
    email VARCHAR(127),
    password VARCHAR(127)
);

SELECT * FROM user;
