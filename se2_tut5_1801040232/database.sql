create database userdb;
use userdb;

create table user(
id int auto_increment primary key,
name nvarchar(30),
address nvarchar(50),
mobile nvarchar(10));

insert into user values(0, "van", "trieu khuc", "123456789");
insert into user values(0, "tu", "thanh tri", "123456789");

create table product(
proId nvarchar(20) primary key,
proName nvarchar(30)
);

insert into product values("bcdr", "ban chai danh rang");
insert into product values("kdr", "kem danh rang");
insert into product values("km", "khan mat");

create table orderline (
orderId int auto_increment primary key,
id int,
proId nvarchar(20),
quantity int,
FOREIGN KEY (id) REFERENCES user(id),
FOREIGN KEY (proId) REFERENCES product(proId)
);

insert into orderline values(0, 1, "km", 5);
insert into orderline values(0, 1, "kdr", 10);
insert into orderline values(0, 2, "bcdr", 20);
insert into orderline values(0, 2, "km", 20);



