create database jdbc_db;

use jdbc_db;

create table register(
username varchar(200) not null,
pass varchar(200) not null);

select * from register;

create table master(
username varchar(200) not null,
email varchar(200),
gender VARCHAR(10) CHECK (gender IN ('Male', 'Female'))
);

insert into master(username,email,gender) values
("aayush","aayush@gmail.com","MALE"),
("amrit","amrit@gmail.com","MALE"),
("akash","akash@gmail.com","MALE"),
("Jayesh","jayesh@gmail.com","MALE"),
("Monu","monu@gmail.com","MALE");

delete from register;