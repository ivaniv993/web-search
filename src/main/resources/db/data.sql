insert into user (id, first_name, last_name, birth_date, email) values (1, 'Vasa',  'Pupkin', '1993-10-08', 'vasa.pupkin@online.ua');
insert into user (id, first_name, last_name, birth_date, email) values (2, 'John', 'Dou',  '1987-10-08', 'joun.dou@online.com');


insert into job (id, user_id, status, creation_date) values (2, 1, 'CREATED', '2016-08-05 10:55:32' );

-- insert into job_resource        (id, job_id) values (1, 2 );
-- insert into job_application     (id, job_id) values (1, 2 );
-- insert into job_identification  (id, job_id) values (1, 2 );
-- insert into job_data_staging    (id, job_id) values (1, 2 );
