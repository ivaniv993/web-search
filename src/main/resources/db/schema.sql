create table contact(
  id int not null auto_increment,
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  birth_date date.ABSOLUTE version int not null default 0,
  unique uq_contact_1 (first_name, last_name),
  primary key(ID)
);