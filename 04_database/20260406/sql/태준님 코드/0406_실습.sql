 
CREATE TABLE TBL_PRODUCT (
    PCODE   VARCHAR2(10) PRIMARY KEY,
    PNAME   VARCHAR2(50),
    PRICE   NUMBER
);
 
INSERT INTO TBL_PRODUCT VALUES ('AA01', '아메리카노', 3000);
INSERT INTO TBL_PRODUCT VALUES ('AA02', '에스프레소', 3500);
INSERT INTO TBL_PRODUCT VALUES ('AA03', '카페라떼', 4000);
INSERT INTO TBL_PRODUCT VALUES ('AA04', '카라멜마끼', 4500);
INSERT INTO TBL_PRODUCT VALUES ('AA05', '카푸치노', 5000);
INSERT INTO TBL_PRODUCT VALUES ('AA06', '초코퐁키', 6000);
INSERT INTO TBL_PRODUCT VALUES ('AA07', '녹차퐁키', 6500);
INSERT INTO TBL_PRODUCT VALUES ('AA08', '망고쥬스', 7000);
INSERT INTO TBL_PRODUCT VALUES ('AA09', '핫초코', 2500);
 
 
CREATE TABLE TBL_STORE (
    SCODE   VARCHAR2(10) PRIMARY KEY,
    SNAME   VARCHAR2(50)
);
 
INSERT INTO TBL_STORE VALUES ('S001', '강남점');
INSERT INTO TBL_STORE VALUES ('S002', '강서점');
INSERT INTO TBL_STORE VALUES ('S003', '강동점');
INSERT INTO TBL_STORE VALUES ('S004', '강북점');
INSERT INTO TBL_STORE VALUES ('S005', '동대문점');
INSERT INTO TBL_STORE VALUES ('S006', '인천점');
 
CREATE TABLE TBL_SALELIST_01 (
    SALENO    NUMBER PRIMARY KEY,
    PCODE     VARCHAR2(10) NOT NULL,
    SALEDATE  DATE,
    SCODE     VARCHAR2(10) NOT NULL,
    AMOUNT    NUMBER
);
 
INSERT INTO TBL_SALELIST_01 VALUES (100001, 'AA01', TO_DATE('20180902','YYYYMMDD'), 'S001', 50);
INSERT INTO TBL_SALELIST_01 VALUES (100002, 'AA03', TO_DATE('20180902','YYYYMMDD'), 'S002', 40);
INSERT INTO TBL_SALELIST_01 VALUES (100003, 'AA04', TO_DATE('20180902','YYYYMMDD'), 'S002', 20);
INSERT INTO TBL_SALELIST_01 VALUES (100004, 'AA04', TO_DATE('20180902','YYYYMMDD'), 'S001', 30);
INSERT INTO TBL_SALELIST_01 VALUES (100005, 'AA05', TO_DATE('20180902','YYYYMMDD'), 'S004', 40);
INSERT INTO TBL_SALELIST_01 VALUES (100006, 'AA03', TO_DATE('20180902','YYYYMMDD'), 'S004', 30);
INSERT INTO TBL_SALELIST_01 VALUES (100007, 'AA01', TO_DATE('20180902','YYYYMMDD'), 'S003', 40);
INSERT INTO TBL_SALELIST_01 VALUES (100008, 'AA04', TO_DATE('20180902','YYYYMMDD'), 'S004', 10);
INSERT INTO TBL_SALELIST_01 VALUES (100009, 'AA01', TO_DATE('20180902','YYYYMMDD'), 'S003', 20);
INSERT INTO TBL_SALELIST_01 VALUES (100010, 'AA05', TO_DATE('20180902','YYYYMMDD'), 'S003', 30);
INSERT INTO TBL_SALELIST_01 VALUES (100011, 'AA01', TO_DATE('20180902','YYYYMMDD'), 'S001', 40);
 
COMMIT;


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

 



-- 1)외부평가연습 디비 문제


select * from TBL_PRODUCT;

select * from TBL_STORE;

select * from TBL_SALELIST_01;


-- 판매현황
select s.saleno 비번호, p.pcode 상품코드, s.saledate 판매날짜,st.scode 매장코드,p.pname 상품명 , s.amount 판매수량, s.amount * p.price 총판매액
from TBL_SALELIST_01 s
join tbl_product p
on s.pcode = p.pcode
join tbl_store st
on s.scode = st.scode
order by 1
;

--매장별판매액
select st.scode 매장코드, st.sname 매장이름, sum(s.amount * p.price) 매장별_판매액
from TBL_SALELIST_01 s
join tbl_product p
on s.pcode = p.pcode
join tbl_store st
on s.scode = st.scode
group by st.scode , st.sname
order by 1
;


--상품별 판매액
select p.pcode 상품코드, p.pname 상품이름, sum(s.amount * p.price) 상품별_판매액
from TBL_SALELIST_01 s
join tbl_product p
on s.pcode = p.pcode
join tbl_store st
on s.scode = st.scode
group by p.pcode , p.pname
order by 1
;

-- 일단 cu 관리 테이블은 입력이 주라 오늘은 하나만 간단하게 하자

select * from goods_tbl_500;

select * from store_tbl_500;

select * from sale_tbl_500;


select g.goods_cd 상품코드 , g.goods_nm 상품이름, g.goods_price 판매단가 , g.cost 원가, g.in_date 입고일자
from sale_tbl_500 s
join store_tbl_500 st
on st.store_cd = s.store_cd
join goods_tbl_500 g
on g.goods_cd = s.goods_cd;



-- 


















