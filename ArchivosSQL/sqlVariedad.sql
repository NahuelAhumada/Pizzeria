create database pizzeriaTurnoM;
ALTER USER 'root'@'localhost' identified WITH mysql_native_password BY 'root';

select version();
use pizzeriaTurnoM;
show tables;
describe Variedad;
insert into Variedad(nombrePizza,precio)values("Muzzarela",50);
insert into Variedad(nombrePizza,precio)values("Jamon y Morrones",60);
insert into Variedad(nombrePizza,precio)values("Napolitana",70);

select * from Variedad;