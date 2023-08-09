-- Copyright (c) 2023 the original author or authors. --

USE tempdb;

DROP TABLE if exists personnes ;

CREATE TABLE personnes (
	id     INT IDENTITY PRIMARY KEY ,
	prenom NVARCHAR(50) ,
	nom    NVARCHAR(50)
);
