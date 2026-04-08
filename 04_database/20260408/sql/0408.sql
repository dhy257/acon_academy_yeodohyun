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


