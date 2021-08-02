
create schema if not exists netflix2;
use netflix2;

drop table if exists films;
drop table if exists casts;
drop table if exists categories;
drop table if exists persons;
drop table if exists roles;

create table if not exists categories
(
    id bigint(20) not null auto_increment,
    name varchar(60) not null,
    create_date datetime NOT NULL,
    update_date datetime NOT NULL,
    primary key (id),
    unique index unique_name (name asc)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

create table if not exists persons
(
    id bigint(20) not null auto_increment ,
    name varchar(128) not null ,
    surname varchar(128) not null,
    birthday_year year(4) default null,
    create_date datetime NOT NULL,
    update_date datetime NOT NULL,
    primary key (id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table if not exists roles
(
    id bigint(20) not null auto_increment ,
    name varchar(128) not null ,
    create_date datetime NOT NULL,
    update_date datetime NOT NULL,
    primary key (id),
    constraint unique_role_name unique (name)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table if not exists films
(
  id bigint(20) not null auto_increment ,
  name varchar(256) not null ,
  year  year(4) not null ,
  country varchar(64) not null,
  language varchar(64) not null,
  duration int not null ,
  short_desc varchar(256) default null ,
  long_desc varchar(1024) default null ,
  category_id   bigint(20) default null,
  create_date datetime NOT NULL,
  update_date datetime NOT NULL,
  primary key (id),
  constraint fk_films_category_id foreign key (category_id) references categories (id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

create table if not exists casts
(
  id bigint(20) not null auto_increment ,
  person_id bigint(20) not null ,
  role_id bigint(20) not null ,
  film_id bigint(20) not null ,
  create_date datetime NOT NULL,
  update_date datetime NOT NULL,
  primary key (id),
  constraint fk_casts_person_id foreign key (person_id) references persons (id),
  constraint fk_casts_role_id foreign key (role_id) references roles (id),
  constraint fk_casts_film_id foreign key (film_id) references films(id),
  constraint unique_person_role_film unique (person_id, role_id, film_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


