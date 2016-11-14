create table user(
  id INTEGER NOT NULL,
  first_name varchar(20),
  last_name varchar(20),
  birth_date date,
  email VARCHAR (50) not null,
  primary key(ID)
);

create table job(
  id INTEGER NOT NULL,
  user_id INTEGER,
  creation_date timestamp ,
  primary key(ID),
  FOREIGN KEY (user_id) REFERENCES user(id)
);


create table job_resource(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);

create table job_description(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);

create table job_identification(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);

create table job_data_staging(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);
