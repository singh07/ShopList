# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  price                     float,
  constraint pk_product primary key (id))
;

create table shop (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  address_line1             varchar(255),
  address_line2             varchar(255),
  address_line3             varchar(255),
  city                      varchar(255),
  town                      varchar(255),
  phone_number              varchar(255),
  owner_email               varchar(255),
  constraint pk_shop primary key (id))
;

create table user (
  email                     varchar(255) not null,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  constraint pk_user primary key (email))
;


create table product_shop (
  product_id                     bigint not null,
  shop_id                        bigint not null,
  constraint pk_product_shop primary key (product_id, shop_id))
;
alter table shop add constraint fk_shop_owner_1 foreign key (owner_email) references user (email) on delete restrict on update restrict;
create index ix_shop_owner_1 on shop (owner_email);



alter table product_shop add constraint fk_product_shop_product_01 foreign key (product_id) references product (id) on delete restrict on update restrict;

alter table product_shop add constraint fk_product_shop_shop_02 foreign key (shop_id) references shop (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table product;

drop table product_shop;

drop table shop;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

