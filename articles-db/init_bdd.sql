create table article (
    id int not null auto_increment,
    libelle varchar(100) unique not null,
    prix decimal(6, 2) not null,
    primary key (id)
);

insert into article (libelle, prix) values ('Les soupçons des brumes', 5.42);
insert into article (libelle, prix) values ('La joie de la liberté', 8);
insert into article (libelle, prix) values ('Le coq déchaîné', 10.9);