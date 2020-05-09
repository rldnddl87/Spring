drop table if exists account CASCADE;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table account (
  id bigint not null,
  password varchar(255),
  user_name varchar(255),
  primary key (id)
);