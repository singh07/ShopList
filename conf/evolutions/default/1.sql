# --- !Ups

create table member (
  email                     varchar(255) PRIMARY KEY,
  password                  varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255)
  )
;

create table product (
  id                        bigserial PRIMARY KEY,
  name                      varchar(255),
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
  email                     varchar(255) REFERENCES member
  )
;


create table product_shop (
  product_id                     bigint REFERENCES products ON DELETE RESTRICT,
  shop_id                        bigint REFERENCES shop ON DELETE CASCADE,
  PRIMARY KEY (product_id, shop_id)
  )
;






