-- 테이블 생성///////////////////////////////////////////////////////////////////
-- 유저 | 유저아이디, 유저이름, 이메일
create table users (
    user_id number primary key,
    user_name varchar2(50) not null,
    email varchar2(100)
);
select * from users;

-- 캐릭터 | 캐릭터아이디, 유저아이디, 캐릭터이름, 캐릭터레벨
create table characters (
    character_id number primary key,
    user_id number,
    name varchar2(50),
    char_level number,

    constraint fk_char_user
    foreign key (user_id)
    references users(user_id)
);
select * from characters;

-- 아이템 | 아이템아이디, 아이템이름, 가격
create table items (
    item_id number primary key,
    item_name varchar2(100) not null,
    price number not null
);
select * from items;

-- 인벤 | 인벤아이디, 캐릭터아이디, 아이템아이디, 양
create table inventories (
    inventory_id number primary key,
    character_id number,
    item_id number,
    quantity number,

    constraint fk_inv_char
    foreign key (character_id)
    references characters(character_id),

    constraint fk_inv_item
    foreign key (item_id)
    references items(item_id)
);
select * from inventories;

-- 상점 | 상점아이디, 상점이름
create table shops (
    shop_id number primary key,
    shop_name varchar2(100) not null
);
select * from shops;

-- 주문 | 주문아이디, 유저아이디, 주문날짜
create table orders (
    order_id number primary key,
    user_id number,
    order_date date default sysdate,

    constraint fk_order_user
    foreign key (user_id)
    references users(user_id)
);
select * from orders;

-- 주문아이템 | 주문아이디, 아이템아이디, 양
create table order_items (
    order_id number,
    item_id number,
    quantity number default 1,

    constraint pk_order_items
    primary key (order_id, item_id),

    constraint fk_oi_order
    foreign key (order_id)
    references orders(order_id),

    constraint fk_oi_item
    foreign key (item_id)
    references items(item_id)
);
select * from order_items;

-- 테이블 수정////////////////////////////////////////////////////////////////////
-- 캐릭터에 경험치 추가
alter table characters
add exp number default 0;
select * from characters;

-- 아이템에 카테고리추가
alter table ITEMS
add category varchar2(50);
select * from items;
-- 데이터 삽입///////////////////////////////////////////////////////////////////
-- users
insert into users (user_id, user_name, email)
values (1, 'PLAYER_A', 'a@test.com');

insert into users (user_id, user_name, email)
values (2, 'PLAYER_B', 'b@test.com');

-- characters
insert into characters (character_id, user_id, name, char_level)
values (1, 1, 'WARRIOR', 10);

insert into characters (character_id, user_id, name, char_level)
values (2, 1, 'MAGE', 8);

insert into characters (character_id, user_id, name, char_level)
values (3, 2, 'ARCHER', 12);
-- items
insert into items (item_id, item_name, price)
values (1, 'SWORD', 1000);

insert into items (item_id, item_name, price)
values (2, 'BOW', 800);

insert into items (item_id, item_name, price)
values (3, 'STAFF', 1200);

-- inventories
insert into inventories (inventory_id, character_id, item_id, quantity)
values (1, 1, 1, 1);

insert into inventories (inventory_id, character_id, item_id, quantity)
values (2, 2, 3, 2);

insert into inventories (inventory_id, character_id, item_id, quantity)
values (3, 3, 2, 1);

-- shops
insert into shops (shop_id, shop_name)
values (1, 'MAIN SHOP');

-- orders
insert into orders (order_id, user_id, order_date)
values (1, 1, sysdate);

insert into orders (order_id, user_id, order_date)
values (2, 2, sysdate);

-- order_items
insert into order_items (order_id, item_id, quantity)
values (1, 1, 1);

insert into order_items (order_id, item_id, quantity)
values (1, 3, 2);

insert into order_items (order_id, item_id, quantity)
values (2, 2, 1);



-- 데이터 수정///////////////////////////////////////////////////////////////////
update characters
set char_level = 20
where character_id = 1;

update items
set price = 1200
where item_id = 1;
-- 데이터 삭제///////////////////////////////////////////////////////////////////
delete from order_items
where order_id = 1 and item_id = 1;

delete from inventories
where character_id = 2;

delete from characters
where character_id = 2;

-- 데이터 조회///////////////////////////////////////////////////////////////////
-- 유저, 캐릭
select u.user_name, c.name, c.char_level
from users u
join characters c on u.user_id = c.user_id;

-- 캐릭, 인벤
select c.name, i.item_name, inv.quantity
from characters c
join inventories inv on c.character_id = inv.character_id
join items i on inv.item_id = i.item_id;

-- 주문, 아이템
select o.order_id, i.item_name, oi.quantity
from orders o
join order_items oi on o.order_id = oi.order_id
join items i on oi.item_id = i.item_id;

-- 테이블 삭제///////////////////////////////////////////////////////////////////
drop table order_items;
drop table orders;
drop table inventories;
drop table characters;
drop table items;
drop table shops;
drop table users;
