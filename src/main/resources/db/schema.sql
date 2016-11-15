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
  status VARCHAR(20),
  primary key(ID),
  FOREIGN KEY (user_id) REFERENCES user(id)
);


create table job_resource(
  id INTEGER NOT NULL,
  job_id INTEGER,
  candidate_host VARCHAR (30),
  exclusive_execution VARCHAR (30),
  cpu_architecture VARCHAR (30),

  individual_cpu_speed INTEGER ,
  individual_cpu_time INTEGER ,
  individual_cpu_count INTEGER ,
  individual_cpu_bandwidth INTEGER ,
  individual_cpu_memory INTEGER ,
  individual_cpu_space INTEGER ,

  total_cpu_time INTEGER ,
  total_cpu_count INTEGER ,
  total_physical_memory INTEGER ,
  total_virtual_memory INTEGER ,
  total_disk_space INTEGER ,
  total_resource_count INTEGER ,

  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);

create table job_application(
  id INTEGER NOT NULL,
  job_id INTEGER,
  name VARCHAR (40),
  version VARCHAR (15),
  description VARCHAR (200),
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);

create table job_identification(
  id INTEGER NOT NULL,
  job_id INTEGER,
  name VARCHAR(20),
  description VARCHAR(200),
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);

create table job_data_staging(
  id INTEGER NOT NULL,
  job_id INTEGER,
  file_name VARCHAR(200),
  file_sys_name VARCHAR(200),
  creation_flag BOOL,
  delete_after_termination BOOL,
  source VARCHAR(200),
  target VARCHAR(200),
  FOREIGN KEY (job_id) REFERENCES job(id),
  primary key(ID)
);
