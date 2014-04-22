# --- !Ups

create table member (
  email                     varchar(255) PRIMARY KEY,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  user_pic                  bytea
  )
;

create table product (
  id                        bigserial PRIMARY KEY,
  name                      varchar(255),
  category                  varchar(255),
  price                     real
  )
;

create table shop (
  id                        bigserial PRIMARY KEY,
  name                      varchar(255),
  address_line1             varchar(255),
  address_line2             varchar(255),
  address_line3             varchar(255),
  city                      varchar(255),
  town                      varchar(255),
  phone_number              varchar(255),
  category                  varchar(255),
  shop_pic                  bytea,
  owner                     varchar(255) REFERENCES member(email) ON DELETE RESTRICT ON UPDATE RESTRICT
  )
;


create table product_shop (
  product_id                     bigint REFERENCES product(id) ON DELETE RESTRICT ON UPDATE RESTRICT,
  shop_id                        bigint REFERENCES shop(id) ON DELETE RESTRICT ON UPDATE RESTRICT,
  PRIMARY KEY (product_id, shop_id)
  )
;

create index ix_shop_email on shop (owner);

# --- !Downs



drop table product;

drop table product_shop;

drop table shop;

drop table member;






