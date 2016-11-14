insert into user (id, first_name, last_name, birth_date) values (1, 'Ivan', 'Ivaniv', '1993-10-08');
insert into user (id, first_name, last_name, birth_date) values (2, 'Roman', 'Lesiv', '1987-10-08');


insert into job (id, user_id, creation_date) values (1, 1, '2016-08-05 10:55:32' );

insert into job_resource        (id, job_id) values (1, 1 );
insert into job_description     (id, job_id) values (1, 1 );
insert into job_identification  (id, job_id) values (1, 1 );
insert into job_data_staging    (id, job_id) values (1, 1 );
