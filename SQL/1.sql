create table formations(for_code integer primary key auto_increment,
for_nom varchar(50) not null,
for_annee year(4) not null check(for_annee>2000),
unique(for_nom,for_annee)) engine = 'innodb';

select * from formations;

insert into formations(for_code,for_nom,for_annee)
values (default,'intro prog',2021);

insert into formations
values (default,'intro prog',2022);

insert into formations(for_nom,for_annee)
values ('java',2021);

update formations set for_nom='Web Dev',for_annee=2022
where for_code = 1;

delete from formations where for_code=4;

create table stagiaires(sta_code integer primary key auto_increment,
sta_nom varchar(30) not null check(trim(sta_nom) <>''),
sta_prenom varchar(30) not null check(trim(sta_prenom) <>''),
sta_ddn date,
sta_taille decimal(3,2),
sta_fk_formations integer null,
index(sta_fk_formations),
foreign key (sta_fk_formations) references formations (for_code)) engine 'innodb';

insert into stagiaires 
values (default,'Wamberchies','Norman','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Pierre','Pierre','1998-03-06','1.24',1);

insert into stagiaires 
values (default,'Mathias','Mathias','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Jeremy','Jeremy','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Sylvain','Sylvain','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Timé','Timé','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Maxime','Maxime','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Ramy','Ramy','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'David','David','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Antoine','Antoine','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Ryan','Ryan','1999-03-06','1.24',1);

insert into stagiaires 
values (default,'Damien','Damien','1999-03-06','1.24',1);

select * from stagiaires;

select sta_nom,sta_prenom,for_nom from stagiaires
join formations on sta_fk_formations = for_code
where sta_taille>1.40;



