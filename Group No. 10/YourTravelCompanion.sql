create database travelmanagement;
show databases;
  USE travelmanagement;
  create table Login(
  id int(100) auto_increment primary key,firstname varchar(50)not null ,lastname varchar(50)not null,username varchar(50)not null,
  email varchar(50)not null,contact int(50)not null,password varchar(50)not null,security varchar(50)not null,answer varchar(50) not null); 
  select * from Login;
  select * from Login order by id Desc limit 1;
  desc Login;
  drop table Login;
create table customer(
count int(100) auto_increment primary key,username varchar(50)not null,ID char(50)not null,number int(50)not null,name char(50)not null,gender char(50)not null,
country varchar(50)not null,address varchar(50)not null,phone int(50)not null,email varchar(50)not null
);
select * from customer order by count Desc limit 1;
select * from customer;
Delete from Login where id=4;
drop table customer;
CREATE TABLE booking (
   id INT PRIMARY KEY AUTO_INCREMENT,
    customername VARCHAR(100)NOT NULL,
    contactnumber VARCHAR(20)NOT NULL,
    destination VARCHAR(100)NOT NULL,
    T_O varchar(100)not null,
     people INT NOT NULL,
     packagename varchar(60)not null,
         totalprice varchar(50)NOT NULL,
    traveldate DATE NOT NULL

);
desc booking;
drop table booking;
SELECT * FROM booking;
select * from booking order by id Desc limit 1;
Delete from booking where id =4






