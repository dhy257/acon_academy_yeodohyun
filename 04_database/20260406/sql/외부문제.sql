 
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


select * from TBL_PRODUCT;
select * from TBL_STORE;
select * from TBL_SALELIST_01;

-- 판매현황
-- 비번호, 상품코드, 판매날짜, 매장코드, 상품명, 판매수량, 총판매량 조회
select *
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode;

select *
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

select
    s.saleno 비번호,
    p.pcode 상품코드,
    s.saledate 판매날짜,
    store.scode 매장코드,
    p.pname 상품명,
    s.amount 판매수량,
    p.price * s.amount 총판매량
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

select
    s.saleno 비번호,
    p.pcode 상품코드,
    '20' ||
    substr(s.saledate,1,2) || '-' ||
    substr(s.saledate,4,2) || '-' ||
    substr(s.saledate,7,2) 판매날짜,
    store.scode 매장코드,
    p.pname 상품명,
    s.amount 판매수량,
    p.price * s.amount 총판매량
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

-- 매장별 판매액
-- 매장코드, 매장명, 매장별 판매액 조회
select *
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

select
    store.scode 매장코드,
    store.sname 매장명,
    to_char(sum(p.price * s.amount),'999,999') "매장별 판매액"
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode
group by store.scode , store.sname
order by 1;


-- 상푸별 판매액
-- 상품코드, 상품명, 상품별 판매액
select *
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

select
    p.pcode 상품코드,
    p.pname 상품명,
    p.price * s.amount "상품별 판매액"
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

select
    p.pcode 상품코드,
    p.pname 상품명,
    to_char(sum(p.price * s.amount),'999,999') "상품별 판매액"
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode
group by p.pcode, p.pname
order by 1;


