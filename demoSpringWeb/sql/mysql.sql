-- Copyright (c) 2023 the original author or authors. --

ALTER DATABASE test CHARACTER SET utf8mb4
	COLLATE utf8mb4_unicode_ci;

USE test;

DROP TABLE if exists personnes ;

CREATE TABLE if not exists personnes (
	id     INT AUTO_INCREMENT PRIMARY KEY ,
	prenom VARCHAR(50) ,
	nom    VARCHAR(50)
);
