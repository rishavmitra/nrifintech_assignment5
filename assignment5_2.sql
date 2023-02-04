create table Professor(id int, name varchar(100), age int, empId int primary key);


insert into professor values(002,"Ms.Bose",36,1001);
insert into professor values(003,"Mr.Farooq",43,1002);
insert into professor values(004,"Mr.Saha",55,1003);
insert into professor values(005,"Ms.Chandrima",62,1004);
insert into professor values(006,"Ms.Choudhary",40,1005);

create table Subject(id int, name varchar(100),profId int, foreign key(profId) references Professor(empId), courseId int, foreign key(courseId) references course(id));

select * from Professor;
select * from Subject;
select * from course;

drop table Subject;

insert into Subject values(1,'Phy',1001,3001);
insert into Subject values(2,'Maths',1001,3001);
insert into Subject values(3,'Comp',1003,3001);
insert into Subject values(4,'Bio',1005,3005);
insert into Subject values(5,'SST',1004,3002);
insert into Subject values(6,'Civics',1004,3002);

