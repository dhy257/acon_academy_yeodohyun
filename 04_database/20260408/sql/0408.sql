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
-- 단일행 서브쿼리
-- 복수행 서브쿼리

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



-- 교재 429p
-- 연습문제 1
select * from student;
select * from department;

select *
from student s
join department d
on s.deptno1 = d.deptno;

select
    s.name "STUD_NAME",
    d.dname "DEPT_NAME"
from student s
join department d
on s.deptno1 = d.deptno
where s.deptno1 = (
    select deptno1
    from student
    where name LIKE 'Anthony Hopkins'
)
order by 1;

--select name "stud_name", dname "dept_name"
--from student s, department d
--where s.deptno1 = d.deptno
--and s.deptno1 = (select deptno1
--		 from student
--		 where name like 'Anthony Hopkins');

-- 연습문제 2

select * from professor;
select * from department;

select *
from professor p
join department d
on p.deptno = d.deptno;

select
    p.profno,
    p.hiredate,
    d.dname
from professor p
join department d
on p.deptno = d.deptno;

select
    p.name,
    to_char(p.hiredate,'YYYY-MM-DD'),
    d.dname
from professor p
join department d
on p.deptno = d.deptno
where hiredate > (
    select
        min(hiredate)
    from professor
    where name like 'Meg Ryan'
);

--select name "prof_name",
--       to_char(hiredate, 'YYYY-MM-DD') "hiredate",
--       dname "dept_name"
--from professor p, department d
--where p.deptno = d.deptno
--and hiredate > (select hiredate
--		from professor
--		where name like 'Meg Ryan');

-- FROM절 뒤에 나오는 서브쿼리 (인라인 뷰: 임시뷰로 만들어짐)
-- 사용예시
-- 에이콘몰
select *  from tbl_test_order;
select *  from tbl_test_customer;
select *  from tbl_test_goods;

-- 고객별 판매수량 합계 조회하기

--송주창 9
--여도현 6
--김재민 2
--이정하 5
--장해든 3

select *
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

select
    c.name,
    o.sale_cnt
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id;

select
    c.name,
    sum(o.sale_cnt) total
from tbl_test_order o
join tbl_test_customer c
on o.id = c.id
group by c.name
order by 2 desc;

-- from절 뒤에 서브쿼리

-- 1) 고객코드별 판매수량 합 구하기(주문테이블)
-- 2) 위의 쿼리내용과 고객테이블을 조인하여 쿼리완성

select
    id, sale_cnt
from tbl_test_order;

--1)
select
    id,
    sum(sale_cnt) total
from tbl_test_order
group by id;
--2)
select
    c.name,
    a.total
from (
    select
        id,
        sum(sale_cnt) total
    from tbl_test_order
    group by id
) a
join tbl_test_customer c
on a.id = c.id;

--문제  상품별 판매수량의 합계  인라인 서브쿼리로 구해보기
-- 1)상품코드별 판매수량 합
select *  from tbl_test_order;
select *  from tbl_test_customer;
select *  from tbl_test_goods;

select *
from tbl_test_order;

select
    pcode,
    sum(sale_cnt)
from tbl_test_order
group by pcode;

-- 2) 위의 내용을 서브쿼리 (인라인 서브쿼리)로 만들고 상품테이블 조인하여 상품명 나오게 하기
select *
from (
    select
        pcode,
        sum(sale_cnt)
    from tbl_test_order
    group by pcode
);

select
    a.pcode,
    g.pname,
    a.total
from (
    select
        pcode,
        sum(sale_cnt) total
    from tbl_test_order
    group by pcode
) a
join tbl_test_goods g
on a.pcode = g.pcode;



--교재 문제 풀이 
--420페이지  
--1 나해수
select * from professor;
select * from department;

select
    *
from professor p
join department d
on p.deptno = d.deptno;

select
    p.profno 교수번호,
    p.name 교수이름,
    d.dname "소속 학과이름"
from professor p
join department d
on p.deptno = d.deptno;

create view v_prof_dept2
as
select
    p.profno 교수번호,
    p.name 교수이름,
    d.dname "소속 학과이름"
from professor p
join department d
on p.deptno = d.deptno;

select * from v_prof_dept2;
drop view v_prof_dept2;

--2 박세인
select * from student;
select * from department;

select
    deptno1,
    height,
    weight
from student
order by 1;

select
    deptno1,
    max(height) "MAX_HEIGHT",
    max(weight)"MAX_WEIGHT"
from student s
group by deptno1
order by 1;

select
    d.dname,
    a.MAX_HEIGHT,
    a.MAX_WEIGHT
from (
    select
        deptno1,
        max(height) "MAX_HEIGHT",
        max(weight)"MAX_WEIGHT"
    from student s
    group by deptno1
    order by 1
) a
join department d
on a.deptno1 = d.deptno;


--3 조아진
select * from student;
select * from department;

-- 1)학과명별 가장 키 큰 정보조회
select
    d.dname,
    s.height
from student s
join department d
on s.deptno1 = d.deptno
order by 1;

select
    s.deptno1,
    d.dname,
    max(s.height)
from student s
join department d
on s.deptno1 = d.deptno
group by dname, s.deptno1
order by 1;

select
    deptno1,
    name,
    height
from student
order by 1;

select
    a.dname,
    a.maxheight,
    s.name,
    s.height
from( 
    select
        s.deptno1,
        d.dname,
        max( s.height ) maxheight
    from student  s
    join  department  d
    on s.deptno1  = d.deptno
    group by s.deptno1 , d.dname
) a
join student s
on a.deptno1 = s.deptno1
and
a.maxheight = s.height;

--4 김재민
select * from student;

select
    grade,
    name,
    height
from student
order by 1;

select
    grade,
    avg(height)
from student
group by grade;

select
    *
from(
    select
        grade,
        avg(height) avgheight
    from student
    group by grade
) a
join student s
on a.grade = s.grade;

select
    a.grade,
    s.name,
    s.height,
    a.avgheight
from(
    select
        grade,
        avg(height) avgheight
    from student
    group by grade
) a
join student s
on a.grade = s.grade
where a.avgheight < s.height
order by 1;


-- 다중행 서브쿼리 430p
-- WHERE 절 뒤에 나오는 서브쿼리
-- 다중행 사용가능 연산자: IN, >ANY, <ANY, >ALL, <ALL, EXIST

select *
from emp2;

select *
from dept2;

select
    empno,
    name,
    deptno
from emp2;

select 
    dcode
from dept2
where area='Pohang Main Office';

select
    empno,
    name,
    deptno
from emp2
where deptno in(
    select 
        dcode
    from dept2
where area='Pohang Main Office'
);

-- any(다중행 결과 하나라도 만족)
select
    ename,
    sal
from emp
where sal> any(
    select sal
    from emp
    where deptno = 20
);

-- all(다중행 결과 모두 마족)
select
    ename,
    sal
from emp
where sal> all(
    select sal
    from emp
    where deptno = 20
);

-- exist 페이지432
select *
from t_emp;

select *
from t_emp
where exists(
    select
        deptno
    from t_dept
    where deptno= 70
);


select *
from t_emp
where exists(
    select
        deptno
    from t_dept
    where deptno= 10
);

--

-- 연관/비연관 서브쿼리

-- 연관서브쿼리
-- 연관서브쿼리 실행 순서
   --1.메인쿼리의 값이 서브쿼리에 전달 
   --2.서브쿼리 실행
   --3.메인쿼리에서 사용함
   --4.조건에 맞으면 결과에 나옴
-- 자신의 부서의 평균보다 높은 사람 조회
select *
from emp;

select *
from emp e
where e.sal>(
    select
        avg(e2.sal)
    from emp e2
--    where e2.deptno = 10
    where e2.deptno = e.deptno
);

-- 스칼라 서브쿼리(select절)
-- 단일행, 단일컬럼

select *
from emp;

-- 부서이름 가져오기
select
    e.ename,
    e.deptno
from emp e;

select
    e.ename,
    e.deptno,
    (
    select
        d.dname 
    from dept d
    where d.deptno = e.deptno
    )부서이름
from emp e;


-- SQL: 사용자와 DBMS가 소통하는 언어
-- DDL: CREATE, DROP, ALTER
-- DML: READ(SELECT), INSERT, UPDATE, DELETE
-- DCL: GRANT, REVOKE

-- 데이터 조회하기
-- 데이터 삽입하기
-- 데이터 변경하기
-- 데이터 삭제하기

-- ACONRTBL
desc acorntbl;

insert into acorntbl( ID,PW,NAME,POINT ) values('KING','9999','변우석',9999);
insert into acorntbl( ID,PW,NAME,POINT ) values('SHJ','2323','아이유',22222);
commit;

select * from acorntbl;

update acorntbl
set name = '성희주'
where id = 'SHJ';
commit;

select * from acorntbl;

delete
from acorntbl
where id = 'SHJ';
commit;

delete
from acorntbl
where id = 'KING';
commit;

select * from acorntbl;

