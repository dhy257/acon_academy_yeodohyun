-- 세부적인 집계
-- group by

-- group by 복습하기

-- emp테이블로 부터  직급별 급여합 구하기

-- 문제4 풀기

-- 전체조회
SELECT * FROM member_tbl_11;

-- 고객등급별 포인트의 합계 구하기

-- 전체 포인트합 구하기
select m_point
from member_tbl_11;

select sum(m_point)
from member_tbl_11;

-- 그룹바이 전 단계 만들기 ( 눈으로 집계 가능한 수준까지 )
select m_grade,m_point
from member_tbl_11
where m_point is not null
order by 1;

select m_grade,sum(m_point)
from member_tbl_11
where m_point is not null
group by m_grade
order by 1;

-- 세부적인 집계
-- 포인트의 합계가 5000이상인 것만 조회하기 ( 그룹바이 선행하고 조건 주기 )
-- having 실행 이후 select이기 때문에 select절의 as에 사용된 별칭을 having에서 사용 불가
-- order by에서는 마지막이라 사용가능
select m_grade,sum(m_point) total
from member_tbl_11
where m_point is not null
group by m_grade
having sum(m_point)>=5000
order by total;

-- EMP
select * from emp;
-- 전체 sal의 합계
select sum(sal)
from emp;
-- 직급별 sal의 합계
select job, sum(sal)
from emp
group by job;
-- 직급별 sal의 합계 3000이상만
select job, sum(sal)
from emp  group by job
having sum(sal)>=3000;
-- 직급별 sal의 합계 3000이상만, 숫자 1000단위
select job, to_char(sum(sal),'999,999') as total
from emp
group by job
having sum(sal)>=3000
order by total desc;


--교재 59
--집합연산자  (행합치기)
--UNION, UNION ALL, INTERSECT, MINUS 
--두 테이블을 대상으로 행합치기 (컬럼의 수,  컬럼타입이 같아야 한다)
--UNION, UNION ALL
SELECT  STUDNO, NAME
FROM  STUDENT
where deptno1 = 101
union -- 중복은 하나만
select studno, name
from student
where deptno1 = 201;

SELECT  STUDNO, NAME
FROM  STUDENT
where deptno1 = 101
union all -- 중복상관없이 합침
select studno, name
from student
where deptno1 = 201;

-- 63p intersect
select studno, name
from student
where deptno1 = 101
intersect -- 교집합 보여주기
select studno, name
from student
where deptno2 = 201;

-- minus 연산자 ( 큰거(내용이 많은거) - 작은거 (내용이 적은거) )
select empno, ename, sal
from emp
minus
select empno, ename, sal
from emp
where sal>2500;

--
create table tbl_test_customer(
    id varchar2(20) not null primary key ,
    name varchar2(20) ,
    address varchar2(20),
    tel varchar2(20)
);

create table tbl_test_goods(
  pcode varchar2(20) not null primary key,
  pname varchar(20) ,
  price number(4)
);

create table tbl_test_order(
  ocode varchar2(20) not null primary key,
  odate date,
  id varchar2(20),
 pcode varchar2(20),
 sale_cnt number(6)
);



insert into tbl_test_customer values( 'H001' ,'송주창', '라스베가스', '010-3030-2222');
insert into tbl_test_customer values( 'H002' ,'여도현', 'L.A', '010-2424-2222');
insert into tbl_test_customer values( 'H003' ,'김재민', '워싱턴D.C', '010-1010-2121');
insert into tbl_test_customer values( 'H004' ,'이정하', '뉴욕', '010-3333-2222');
insert into tbl_test_customer values( 'H005' ,'장해든', '텍사스', '010-9090-2222');
insert into tbl_test_customer values( 'H006' ,'김민경', '서울', '010-7878-1234');


 


insert into tbl_test_goods values('P001' ,'쫀드기', 1000);
insert into tbl_test_goods values('P002' ,'눈깔사탕', 100);
insert into tbl_test_goods values('P003' ,'아폴로', 200);
insert into tbl_test_goods values('P004' ,'뻥튀기', 2000);



insert into tbl_test_order values('J001' , '20210110' , 'H001', 'P001', 2);
insert into tbl_test_order values('J002' , '20210110' , 'H002', 'P002', 5);
insert into tbl_test_order values('J003' , '20210110' , 'H003', 'P003', 2);
insert into tbl_test_order values('J004' , '20210110' , 'H004', 'P004', 1);
insert into tbl_test_order values('J005' , '20210110' , 'H005', 'P002', 3);
insert into tbl_test_order values('J006' , '20210110' , 'H001', 'P002', 3);
insert into tbl_test_order values('J007' , '20210110' , 'H002', 'P001', 1);
insert into tbl_test_order values('J008' , '20210110' , 'H001', 'P002', 4);
 
commit;

// sql  조인 표준 

SELECT  name, address, tel, odate, pname, sale_cnt, price, sale_cnt * price
FROM   tbl_test_order o
JOIN     tbl_test_customer c
ON       o.id = c.id
JOIN     tbl_test_goods g
ON       o.pcode = g.pcode ;




SELECT   *
FROM   tbl_test_order o
JOIN     tbl_test_customer c
ON       o.id = c.id;
 


SELECT   *
FROM   tbl_test_order o
JOIN     tbl_test_customer c
ON       o.id = c.id
JOIN     tbl_test_goods g
ON       o.pcode = g.pcode ;

--
select * from tbl_test_customer; -- 고객테이블
select * from tbl_test_goods; -- 상품테이블
select * from tbl_test_order; -- 주문테이블

-- 주문정보조회하기
select * from tbl_test_order;

-- 주문정보조회하기( 주문일자, 주문자이름, 구매수량 )
select *
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

select o.odate, c.name, o.sale_cnt
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

-- join => default가 inner join
-- inner join (주문안한 6번 고객은 안나옴)
select o.odate, c.name, o.sale_cnt
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

-- 고객테이블에 자기정보 insert
--insert into tbl_test_customer values( 'YDH','여도현','한국','010-1234-5678');

-- 주문일자, 상품명, 상품단가, 주문수량, 주문금액 조회

select * from tbl_test_customer; -- 고객테이블
select * from tbl_test_goods; -- 상품테이블
select * from tbl_test_order; -- 주문테이블

select *
from tbl_test_goods g
join tbl_test_order o
on g.pcode = o.pcode;

select
    o.odate, -- 주문일자
    g.pname, -- 상품명
    g.price, -- 상품단가
    o.sale_cnt,-- 주문수량
    o.sale_cnt*g.price -- 주문금액
from tbl_test_goods g
join tbl_test_order o
on g.pcode = o.pcode;

-- 주문일자, 고객명, 고객전화번호, 상품이름, 상품단가, 주문수량, 상품금액 조회
-- 주문테이블 from
-- 고객테이블 join
--           on
-- 상품테이블 join
--           on

-- 1. 각각 테이블 조회
-- 2. 중심테이블 찾기( 주문조회 )
-- 3. join on
-- 4. join on
select 
    o.odate,          -- 주문일자
    c.name,           -- 고객명
    c.tel,            -- 고객전화번호
    g.pname,          -- 상품이름
    g.price,          -- 상품단가
    o.sale_cnt,       -- 주문수량
    to_char(o.sale_cnt * g.price,'999,999') amount  -- 상품금액
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
join tbl_test_goods g
on o.pcode = g.pcode;


-- 고객별 주문 수량합계 조회
select * from tbl_test_customer;
select * from tbl_test_order;

-- group by 전 단계 까지 만들어서 눈으로 집계 하는 수준까지
select c.name, o.sale_cnt
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

select c.name, sum(o.sale_cnt)
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
group by c.name;

select c.name, sum(o.sale_cnt)
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
group by c.name
having sum(o.sale_cnt)>=5;

-- 고객별 판매금액 조회
select *
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

select *
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
join tbl_test_goods g
on g.pcode = o.pcode;

-- group by 전단계
select c.name, o.sale_cnt * g.price
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
join tbl_test_goods g
on g.pcode = o.pcode;

select c.name, to_char(sum(o.sale_cnt * g.price),'999,999') AMOUNT
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
join tbl_test_goods g
on g.pcode = o.pcode
group by  c.name;

select c.name, to_char(sum(o.sale_cnt * g.price),'999,999') AMOUNT
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
join tbl_test_goods g
on g.pcode = o.pcode
group by  c.name;

-- 고객별 주문 수량합계 조회


