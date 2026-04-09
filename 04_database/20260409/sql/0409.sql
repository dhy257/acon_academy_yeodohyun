-- 6일차 join 다양한 조인 교재220p

-- 정규화(테이블 쪼개기)
-- 테이블 합치기(열 합치기)

-- => join
-- inner join (insert) 기본값, 생략가능
-- equal join (equi) = 조인 조건이 같은 것 끼리
-- non equi (조인 조건이 범위에 만족하는 것을 기준으로 조인하기)

-- inner join
-- 복습
SELECT * FROM tbl_test_customer;
SELECT * FROM tbl_test_goods;
SELECT * FROM tbl_test_order;

-- 고객테이블에 정보 넣기
-- 상품테이블 상품 넣기
select * from acorntbl;

--insert into acorntbl ( ID, PW, NAME, POINT ) values ('','','',);

desc tbl_test_customer;
insert into tbl_test_customer ( ID, NAME, ADDRESS, TEL ) values ('H007','test','test','000-1111-2222');

desc tbl_test_goods;
insert into tbl_test_goods ( PCODE, PNAME, PRICE ) values ('P005','크래커',500);
commit;
select * from tbl_test_goods;
select * from tbl_test_order;


-- 주문현황 조회하기 inner join, equi join
select *
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

-- 주문하지 않은 고객은 조회하지 않는다
-- 주문하지 않은 고객도 조회하고 싶다면? >> outer join 사용

-- outer join(일치하지 않은 값도 조인의 대상됨)
-- left, right, full

-- 왼쪽 일치하는거 보여줘
select *
from tbl_test_order o
left outer join tbl_test_customer c
on o.id = c.id;
-- 오른쪽 일치하는거 보여줘
select *
from tbl_test_order o
right outer join tbl_test_customer c
on o.id = c.id;
-- 양쪽 다 일치하지 않는 것도 보여줘
select *
from tbl_test_order o
full outer join tbl_test_customer c
on o.id = c.id;

select
    c.name,
    o.sale_cnt
from tbl_test_order o
right outer join tbl_test_customer c
on o.id = c.id;

-- 고객별 주문수량
select
    c.name,
    nvl(sum(o.sale_cnt),0)
from tbl_test_order o
right outer join tbl_test_customer c
on o.id = c.id
group by c.name;

-- inner join ( 양쪽 다 일치하는 것만 )
-- left outer join ( 양쪽 일치 + 왼쪽 테이블에 남아있는 것만 )
-- right outer join ( 양쪽 일치 + 오른쪽 테이블에 남아있는 것만 )
-- full outer join ( 양쪽 일치 + 양쪽 테이블 모두 남아있는 내용 조회 )

-- 조인조건(on)
-- EQUI
-- NON EQUI


-- SELF 조인 ( 자기자신과 조인 )

-- CROSS 조인 ( 조인조건 없음(on절 없음) )

-- 교재 236p
-- NON-EQUI JOIN

select * from customer;
select * from gift;

select *
from customer c
join gift g
on c.point >= g.g_start
and c.point <= g.g_end;

select
    c.gname 고객명,
    c.point 보유포인트,
    g.gname 교환가능상품
from customer c
join gift g
on
    c.point >= g.g_start
and
    c.point <= g.g_end;

-- 교재239p 사용예2
select * from student;
select * from score;
select * from hakjum;

select
    s.name "STU_NAME",
    sc.total SCORE,
    h.grade CRE
from score sc
join student s
on sc.studno = s.studno
join hakjum h
on h.min_point <= sc.total
and
h.max_point >= sc.total
order by 2;


-- 상품별 판매수량, 판매금액 합계 구하기
select *
from tbl_test_order o
join tbl_test_goods g
on o.pcode = g.pcode;

select
    g.pname,
    o.sale_cnt,
    g.price
from tbl_test_order o
join tbl_test_goods g
on o.pcode = g.pcode;

select
    g.pname,
    nvl(sum(o.sale_cnt),0) 주문수량,
    to_char(nvl(sum(o.sale_cnt*g.price),0),'999,999')||'원' 총가격
from tbl_test_order o
right outer join tbl_test_goods g
on o.pcode = g.pcode
group by g.pname
order by 1;

-- OUTER JOIN 연습
-- 교재 241,243
-- 사용예1
select * from student;
select * from professor;










-- 사용예2

