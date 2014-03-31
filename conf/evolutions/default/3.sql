# --- !Downs

alter table if exists member cascade;

alter table if exists product cascade;

alter table if exists product_shop cascade;

alter table if exists shop cascade;

alter sequence if exists member_seq;

alter sequence if exists product_seq;

alter sequence if exists shop_seq;
