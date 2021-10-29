CREATE DATABASE deployment;
USE deployment;

CREATE TABLE rol
(
	id_rol int primary key not null AUTO_INCREMENT,
	nombre varchar (255)
);

CREATE TABLE usuario
(
	id_usuario int primary key not null AUTO_INCREMENT,
    id_rol int,
	nombre varchar (255),
    activo char (255)
);

ALTER TABLE usuario
ADD FOREIGN KEY (id_rol) REFERENCES rol(id_rol);

INSERT INTO rol (nombre) VALUES ('ADMINISTRADOR'), ('AUDITOR'),('AUXILIAR');