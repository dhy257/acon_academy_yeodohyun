create table goods_tbl_500(
goods_cd varchar2(6) not null primary key, 
goods_nm varchar2(30), 
goods_price number(8), 
cost number(8), in_date date
); 


insert into goods_tbl_500 values('110001','육계장사발면',1050,750,'20190302');
insert into goods_tbl_500 values('110002','단팥빵',1300,800,'20190302'); 
insert into goods_tbl_500 values('110003','사브로',2000,1700,'20190302');
insert into goods_tbl_500 values('110004','칠성사이다',900,750,'20190302'); 
insert into goods_tbl_500 values('110005','콜라',750,300,'20190302'); 
insert into goods_tbl_500 values('110006','아몬드초콜릿',1500,1300,'20190302'); 
insert into goods_tbl_500 values('110007','초코몽',850,600,'20190302');


 create table store_tbl_500(
 store_cd varchar2(5) not null primary key,
 store_nm varchar2(20), 
 store_fg varchar2(1)
);

 insert into store_tbl_500 values('A001','노원점','0');
 insert into store_tbl_500 values('A002','마포점','0'); 
insert into store_tbl_500 values('A003','석계점','0'); 
insert into store_tbl_500 values('B001','하계점','1');
 insert into store_tbl_500 values('C001','상계점','1'); 
insert into store_tbl_500 values('D001','중계점','0');
 insert into store_tbl_500 values('D002','태릉입구점','1'); 
insert into store_tbl_500 values('E001','화랑대점','0');


 create table sale_tbl_500(
 sale_no varchar2(4) not null primary key, 
 sale_ymd date not null,
 sale_fg varchar2(1) not null, 
 store_cd varchar2(5)  ,         
 goods_cd varchar2(6) ,
 sale_cnt number(3),
 pay_type varchar2(2),
 constraint  fk1 foreign key (store_cd)  references store_tbl_500(store_cd),
 constraint  fk2  foreign key (goods_cd) references goods_tbl_500(goods_cd)
); 

insert into sale_tbl_500 values('0001','20190325','1','A001','110001',2,'02'); 
insert into sale_tbl_500 values('0002','20190325','1','B001','110003',2,'02');
 insert into sale_tbl_500 values('0003','20190325','1','D001','110003',1,'01'); 
insert into sale_tbl_500 values('0004','20190325','1','A001','110006',5,'02'); 
insert into sale_tbl_500 values('0005','20190325','1','C001','110003',2,'02'); 
insert into sale_tbl_500 values('0006','20190325','2','C001','110003',2,'02');
 insert into sale_tbl_500 values('0007','20190325','1','A002','110005',4,'02');
 insert into sale_tbl_500 values('0008','20190325','1','A003','110004',4,'02');
 insert into sale_tbl_500 values('0009','20190325','1','B001','110001',2,'01');
 insert into sale_tbl_500 values('0010','20190325','1','A002','110006',1,'02');


select * from goods_tbl_500;
select * from store_tbl_500;
select * from sale_tbl_500;
-- 상품목록
-- 상품코드, 상품명, 판매단가, (상품원가), 입고일자 조회
select *
from goods_tbl_500 g
join sale_tbl_500 s
on g.goods_cd = s.goods_cd;

select *
from goods_tbl_500 g
join sale_tbl_500 s
on g.goods_cd = s.goods_cd
join store_tbl_500 store
on store.store_cd = s.store_cd;

select
    g.goods_cd 상품코드,
    g.goods_nm 상품명,
    g.goods_price 판매단가,
    g.cost "(상품)원가",
    s.sale_ymd 입고일자
from goods_tbl_500 g
join sale_tbl_500 s
on g.goods_cd = s.goods_cd
join store_tbl_500 store
on store.store_cd = s.store_cd;

select
    distinct g.goods_cd 상품코드,
    g.goods_nm 상품명,
    g.goods_price 판매단가,
    g.cost "(상품)원가",
--    '20' || 
--    substr(s.sale_ymd,1,2) || '-' ||
--    substr(s.sale_ymd,4,2) || '-' ||
--    substr(s.sale_ymd,7,2) 입고일자
    to_char(s.sale_ymd, 'yyyy-mm-dd') 입고일자
from goods_tbl_500 g
join sale_tbl_500 s
on g.goods_cd = s.goods_cd
join store_tbl_500 store
on store.store_cd = s.store_cd
order by 상품코드;

-- 점포별 매출현황
-- 점포명, 현금매출, 카드매출, 총매출
select * from goods_tbl_500;
select * from store_tbl_500;
select * from sale_tbl_500;

select *
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd;

select *
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    o.sale_cnt,
    g.goods_price,
    o.pay_type
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    o.sale_cnt *g.goods_price
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    sum(o.sale_cnt *g.goods_price)
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd
group by s.store_nm;

select 
    s.store_nm 점포명,
    sum(o.sale_cnt *g.goods_price)
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd
group by s.store_nm;

select 
    s.store_nm 점포명,
    o.sale_cnt,
    g.goods_price,
    o.pay_type
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    decode(o.pay_type,'01',(o.sale_cnt *g.goods_price)),
    o.sale_cnt,
    g.goods_price,
    o.pay_type
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    decode(o.pay_type,'01',(o.sale_cnt *g.goods_price),0) 현금,
    decode(o.pay_type,'02',(o.sale_cnt *g.goods_price),0) 카드,
    o.sale_cnt,
    g.goods_price,
    o.pay_type
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    decode(o.pay_type,'01',(o.sale_cnt *g.goods_price),0) 현금,
    decode(o.pay_type,'02',(o.sale_cnt *g.goods_price),0) 카드,
    o.sale_cnt,
    g.goods_price,
    o.pay_type
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    decode(o.pay_type,'01',(o.sale_cnt *g.goods_price),0) 현금,
    decode(o.pay_type,'02',(o.sale_cnt *g.goods_price),0) 카드,
    o.sale_cnt*g.goods_price
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;


select 
    s.store_nm 점포명,
    decode(o.pay_type,'01',(o.sale_cnt *g.goods_price),0) 현금,
    decode(o.pay_type,'02',(o.sale_cnt *g.goods_price),0) 카드,
    o.sale_cnt*g.goods_price total
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd;

select 
    s.store_nm 점포명,
    sum(decode(o.pay_type,'01',(o.sale_cnt *g.goods_price),0)) 현금,
    sum(decode(o.pay_type,'02',(o.sale_cnt *g.goods_price),0)) 카드,
    sum(o.sale_cnt*g.goods_price) total
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd
group by s.store_nm;






-- 판매현황
-- 판매구분, 판매번호, 판매일자, 상품명, 판맴수량, 판매금액, 수취구분(카드) 조회
select *
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd;

select
    s.sale_fg,
    s.sale_no,
    s.sale_ymd,
    g.goods_nm,
    s.sale_cnt,
    g.goods_price,
    s.pay_type
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd;

select
    s.sale_fg,
    s.sale_no,
    s.sale_ymd,
    g.goods_nm,
    s.sale_cnt,
    (g.goods_price * s.sale_cnt) 판매금액,
    s.pay_type
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd;

select
    s.sale_fg,
    s.sale_no,
    to_char(s.sale_ymd, 'yyyy-mm-dd') sale_ymd,
    g.goods_nm,
    s.sale_cnt,
    (g.goods_price * s.sale_cnt) 판매금액,
    s.pay_type
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd;

-- 판매취소
select
    case 
        when s.sale_fg = '1' then '판매'
        when s.sale_fg = '2' then '취소'
    end sale_fg,
    s.sale_no,
    to_char(s.sale_ymd, 'yyyy-mm-dd') sale_ymd,
    g.goods_nm,
    s.sale_cnt,
    (g.goods_price * s.sale_cnt) 판매금액,
    case 
        when s.pay_type = '01' then '현금'
        when s.pay_type = '02' then '카드'
    end pay_type
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd;

select
    case 
        when s.sale_fg = '1' then '판매'
        when s.sale_fg = '2' then '취소'
        else '기타'
    end 판매구분,
    s.sale_no 판매번호,
    to_char(s.sale_ymd, 'yyyy-mm-dd') 판매일자,
    g.goods_nm 상품명,
    s.sale_cnt 판매수량,
    (g.goods_price * s.sale_cnt) 판매금액,
    case 
        when s.pay_type = '01' then '현금'
        when s.pay_type = '02' then '카드'
        else '기타'
    end 수취구분
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd
order by s.sale_no;





