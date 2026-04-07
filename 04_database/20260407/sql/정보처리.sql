-- 판매현황----------------------------------------------------------------------
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
    -- 이 방법도 가능
--    '20' ||
--    substr(s.saledate,1,2) || '-' ||
--    substr(s.saledate,4,2) || '-' ||
--    substr(s.saledate,7,2) 판매날짜,
    to_char(s.saledate, 'yyyy-mm-dd') 판매날짜,
    store.scode 매장코드,
    p.pname 상품명,
    s.amount 판매수량,
    p.price * s.amount 총판매량
from tbl_product p
join tbl_salelist_01 s
on p.pcode = s.pcode
join tbl_store store
on s.scode = store.scode;

-- 매장별 판매액------------------------------------------------------------------
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


-- 상푸별 판매액------------------------------------------------------------------
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