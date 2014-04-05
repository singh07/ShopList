# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table member (
  email                     varchar(255) not null,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  constraint pk_member primary key (email))
;

create table product (
  id                        bigint not null,
  name                      varchar(255),
  price                     float,
  constraint pk_product primary key (id))
;

create table shop (
  id                        bigint not null,
  name                      varchar(255),
  address_line1             varchar(255),
  address_line2             varchar(255),
  address_line3             varchar(255),
  city                      varchar(255),
  town                      varchar(255),
  phone_number              varchar(255),
  email_email               varchar(255),
  constraint pk_shop primary key (id))
;


create table product_shop (
  product_id                     bigint not null,
  shop_id                        bigint not null,
  constraint pk_product_shop primary key (product_id, shop_id))
;
create sequence member_seq;

create sequence product_seq;

create sequence shop_seq;

alter table shop add constraint fk_shop_email_1 foreign key (email_email) references member (email);
create index ix_shop_email_1 on shop (email_email);



alter table product_shop add constraint fk_product_shop_product_01 foreign key (product_id) references product (id);

alter table product_shop add constraint fk_product_shop_shop_02 foreign key (shop_id) references shop (id);

# --- !Downs

drop table if exists member cascade;

drop table if exists product cascade;

drop table if exists product_shop cascade;

drop table if exists shop cascade;

drop sequence if exists member_seq;

drop sequence if exists product_seq;

drop sequence if exists shop_seq;

