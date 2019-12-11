create database tienda_reyes;
use tienda_reyes;

create table usuario(
id_usuario int not null primary key auto_increment,
nombre_usuario varchar(150) not null,
contraseña varchar(150) not null
);
insert into usuario values (0,"Cesar","123");

create table compania(
id_compania int not null primary key auto_increment,
nombre_compania varchar(150) not null,
direccion varchar(150) not null,
sede varchar(150) not null
);

create table cd(
id_cd int not null primary key auto_increment,
asignacion int not null,
nombre_cd varchar(150) not null,
precio double not null,
id_compania int not null,
foreign key fk_cd_compania(id_compania) references compania(id_compania)
);

create table coleccion(
id_coleccion int not null primary key auto_increment,
nombre_coleccion varchar(150) not null,
promotor varchar(150) not null,
precio double not null,
id_compania int not null,
foreign key fk_coleccion_compania(id_compania) references compania(id_compania)
);

create table pista(
id_pista int not null primary key auto_increment,
numero int not null,
titulo varchar(150) not null,
duracion varchar(50),
id_cd int not null,
foreign key fk_pista_cd(id_cd) references cd(id_cd)
);

create table solista(
id_solista int not null primary key auto_increment,
nombre_solista varchar(150) not null,
pais varchar(150) not null,
genero varchar(150) not null
);

create table grupo(
id_grupo int not null primary key auto_increment,
nombre_grupo varchar(150) not null,
integrantes int not null,
nombre_integrantes varchar(200) not null
);

create table genero(
id_genero int not null primary key auto_increment,
nombre_genero varchar(150) not null,
id_compania int not null,
foreign key fk_genero_compania(id_compania) references compania(id_compania)
);

-- BD Transaccionales

create table cd_coleccion(
id_cd_coleccion int not null primary key auto_increment,
id_cd int not null,
id_coleccion int not null,
foreign key fk_cd_coleccion(id_coleccion) references coleccion(id_coleccion),
foreign key fk_coleccion_cd(id_cd) references cd(id_cd)
);

create table solista_grupo(
id_artistas int not null primary key auto_increment,
id_grupo int not null,
id_solista int not null,
id_compania int not null,
foreign key fk_solista_grupo(id_grupo) references grupo(id_grupo),
foreign key fk_grupo_solista(id_solista) references solista(id_solista),
foreign key fk_sloista_grupo_compania(id_compania) references compania(id_compania)
);

create table solista_genero(
id_solista_genero int not null primary key auto_increment,
id_genero int not null,
id_solista int not null,
foreign key fk_solista_genero(id_genero) references genero(id_genero),
foreign key fk_genero_solista(id_solista) references solista(id_solista)
);

create table grupo_genero(
id_grupo_genero int not null primary key auto_increment,
id_genero int not null,
id_grupo int not null,
foreign key fk_grupo_genero(id_genero) references genero(id_genero),
foreign key fk_genero_grupo(id_grupo) references grupo(id_grupo)
);