-- 교재 400 페이지
-- 뷰, 서브쿼리

select * from acorntbl;

select name, point
from acorntbl;

select
    name, point,
    sum(point) over()
from acorntbl;

select
    name, point,
    -- range between이 기본값 >> 같은 point면 뭉친값으로 나옴
    sum(point) over(order by point) 
from acorntbl;

select
    name, point,
    sum(point)
    over(
    -- PARTITION BY
    order by point
    -- RANGE(기본값) | ROWS  BETWEEN  UNBOUNDED PRECEDING  AND  CURRENT ROW
    ROWS  BETWEEN  UNBOUNDED PRECEDING  AND  CURRENT ROW
    ) TOTAL
from acorntbl;

select * from emp;

select
    deptno, ename, sal
from emp;

select
    deptno, ename, sal,
    sum(sal)
    over(
    order by sal
    )
from emp;

select
    deptno, ename, sal,
    sum(sal)
    over(
    -- 부서별
    partition by deptno
    order by sal
    rows between unbounded preceding and current row
    )
    TOTAL
from emp;

--

CREATE TABLE t_emp(
    eid VARCHAR(13) NOT NULL PRIMARY KEY,
    ename VARCHAR(20),
    salary NUMBER(5),
    deptno NUMBER(5),
    comm NUMBER(5)
);
COMMIT;

INSERT INTO  t_emp VALUES ('e001' , '신동엽' , 280,10,100) ;
INSERT INTO  t_emp VALUES ('e002' , '유재석' , 250,20,50) ;
INSERT INTO  t_emp VALUES ('e003' , '전현무' , 190,30,0) ;
INSERT INTO  t_emp VALUES ('e004' , '양세영' , 300,20,0) ;
INSERT INTO  t_emp VALUES ('e005' , '양세찬' , 290,40,100) ;

CREATE TABLE t_dept(
    deptno NUMBER(5) NOT NULL PRIMARY KEY,
    dname VARCHAR(20)
);
COMMIT;

INSERT INTO  t_dept VALUES (10 , '영업팀') ;
INSERT INTO  t_dept VALUES (20 , '기획팀') ;
INSERT INTO  t_dept VALUES (30 , '관리팀') ;
INSERT INTO  t_dept VALUES (40 , '마케팅팀') ;
INSERT INTO  t_dept VALUES (50 , '재무팀') ;

--

select * from t_emp;
select * from t_dept;

-- 뷰의 목적
-- 보안과 사용자 편의성
-- 불필요한 정보를 제공하지 않는다
-- 복잡한 쿼리를 매번 작성 안함

-- 뷰
-- 단순, 복합, 인라인 뷰

-- 뷰 만들기
-- create view 뷰이름
-- as
create view T_VIEW
as
    select ENAME, DEPTNO
    from T_EMP;

select * from t_view;
drop view t_view;

-- 복합 뷰
-- 조인쿼리를 뷰로 만들기
select * from t_emp;
select * from t_dept;

-- 원하는 조인쿼리 완성
select
    e.ename,
    e.salary,
    d.dname
from t_emp e
join t_dept d
on e.deptno = d.deptno;

-- 뷰로 만들기
create view V_EMP_DEPT
as
select
    e.ename,
    e.salary,
    d.dname
from t_emp e
join t_dept d
on e.deptno = d.deptno;

select * from v_emp_dept;

-- 뷰 삭제하기
drop view v_emp_dept;

-- 상품별 판매수량 조회하기
--뷰사용해 보기 ( 에이콘 몰에서 조회하기  -상품별 판매수량 조회하기  )
--뷰 경험하기

select  * from tbl_test_customer;
select  * from tbl_test_goods;
select  * from tbl_test_order;

-- 상품별 판매수량 조회하기
select
*
from tbl_test_goods g
join tbl_test_order o
on g.pcode = o.pcode;

select
    g.pname,
    o.sale_cnt
from tbl_test_goods g
join tbl_test_order o
on g.pcode = o.pcode;

select
    g.pname 상품명,
    sum(o.sale_cnt) 판매수량
from tbl_test_goods g
join tbl_test_order o
on g.pcode = o.pcode
group by g.pname;

CREATE VIEW  V_ORDER
AS  
SELECT
    O.PCODE, G.PNAME,
    SUM( O.SALE_CNT) AS TOTAL
FROM TBL_TEST_ORDER O
JOIN TBL_TEST_GOODS G
ON O.PCODE = G.PCODE
GROUP BY O.PCODE, G.PNAME;

select * from v_order;

-- 뷰의 종류
-- 단순뷰
-- 복합뷰
-- 인라인 뷰(FROM 절 뒤에 옴, 임시로 만들어지는 뷰:서브쿼리의 종류)

-- 서브쿼리란? 쿼리안에 쿼리가 있는 형태
-- 바깥쿼리: 메인쿼리
-- 안에 있는 쿼리: 서브쿼리


-- 서브쿼리 오는 위치
-- FROM 절 뒤 (인라인 뷰)
-- WHERE 절 뒤
-- SELECT 절 뒤 (스칼라 서브쿼리)

-- 1) WHERE 절 뒤 서브쿼리
-- 서브쿼리의 결과에 따라
-- 단일행, 단일컬럼
-- 복수행, 단일컬럼

-- 신동엽 사원보다 급여가 많은 사람 이름 조회하시오.
select * from t_emp;

-- 1. 신동엽의 sal 조회
select
    salary
from t_emp
where ename = '신동엽';

select
    ename, salary
from t_emp
where ename = '신동엽';

select
    ename
from t_emp
where salary>280;

-- 서브쿼리 사용
-- 두 쿼리 합체

-- 연관 서브쿼리 : 서브쿼리에서 메인쿼리의 내용을 사용하는 것
-- 비연관 서브쿼리 : 서브쿼리 단독 사용

select
    ename
from t_emp
where salary>(
    select salary
    from t_emp
    where ename = '신동엽'
);

-- 에이콘 테이블
select * from acorntbl;

-- 가장 어린 사람 이름 조회
select max(birthday) from acorntbl;
select min(birthday) from acorntbl;

select
    name,
    birthday
from acorntbl;

select
    name, birthday
from acorntbl
where birthday = '05/01/25';

select
    name, birthday
from acorntbl
where birthday = (
    select max(birthday) from acorntbl
);

--단일행 서브쿼리
   --서브쿼리의 결과가 단일행 , 단일컬럼 ( 서브쿼리의 결과가  값 하나일 때)
   --단일행 서브쿼리 연산 = , >, < ,>= ,< =  연산자 사용가능하다


-- 문제)
-- acorntbl 테이블에서 포인트가 가장 높은 사람의 이름 조회
select
    name, point
from acorntbl
where point = (
    select max(point) from acorntbl
);

-- acorntbl 테이블에서 포인트의 평균보다 이상인 사람 이름 조회
select
    name, point
from acorntbl
where point > (
    select avg(point) from acorntbl
);


-- emp테이블에서 가장 높은 급여 받는 사람 이름 조회
select
    ename, sal
from emp
where sal = (
    select max(sal) from emp
);







