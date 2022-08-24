drop table if exists staff;
drop table if exists tickets;

--Create tables for entities
create table if not exists staff (employeeId serial primary key, username varchar(50) unique, password varchar(50),first_name varchar(50),
last_name varchar(50),position varchar(50) default 'employee');
create table if not exists tickets(ticketid serial primary key, amount numeric, description varchar(100));

--sample sql code
insert into staff values ( default, 'dmain26', 'good2604', 'Darrick', 'Emert', default);
insert into tickets values( default, 37.54, 'Bought ink for the printer');
insert into staff values (default, '')
