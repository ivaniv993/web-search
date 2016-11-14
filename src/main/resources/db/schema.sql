create table user(
  id INTEGER NOT NULL,
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  birth_date date,
  primary key(ID)
);

create table job(
  id INTEGER NOT NULL,
  user_id INTEGER REFERENCES user(id)),
  creation_date TIMESTAMP,
  primary key(ID)
);

create table job_resource(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (id) REFERENCES user(id)),
  primary key(ID)
);

create table job_description(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (id) REFERENCES user(id)),
  primary key(ID)
);

create table job_identification(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (id) REFERENCES user(id)),
  primary key(ID)
);

create table job_data_staging(
  id INTEGER NOT NULL,
  job_id INTEGER,
  FOREIGN KEY (id) REFERENCES user(id)),
  primary key(ID)
);
