-- 교재 165p
-- ROLLUP() 함수
-- 선행조건 : GROUP BY 되어야한다


-- 고객별 판매금액 구하기
select  * from tbl_test_order;
select  * from tbl_test_goods;
select  * from tbl_test_customer;

select *
from tbl_test_order o
join tbl_test_customer c
on o.id=c.id
join tbl_test_goods g
on g.pcode = o.pcode;

select
    c.name,
    o.sale_cnt * g.price
from tbl_test_order o
join tbl_test_customer c
on o.id=c.id
join tbl_test_goods g
on g.pcode = o.pcode;

select
    c.name,
    sum(o.sale_cnt * g.price)
from tbl_test_order o
join tbl_test_customer c
on o.id=c.id
join tbl_test_goods g
on g.pcode = o.pcode
group by c.name;

-- rollup
-- 그룹바이된 결과에 중간집계 구하기
select
    c.name,
    sum(o.sale_cnt * g.price) total
from tbl_test_order o
join tbl_test_customer c
on o.id=c.id
join tbl_test_goods g
on g.pcode = o.pcode
group by rollup(c.name);

select
    nvl(c.name,'TOTAL') 이름,
    sum(o.sale_cnt * g.price) total
from tbl_test_order o
join tbl_test_customer c
on o.id=c.id
join tbl_test_goods g
on g.pcode = o.pcode
group by rollup(c.name);

-- 고객별 상품별 판매금액구하기 (group by+rollup)
SELECT  *
FROM tbl_test_order  O
JOIN  tbl_test_customer C
ON  O.ID  = C.ID
JOIN tbl_test_goods   G
ON O.PCODE  = G.PCODE;

SELECT
    c.name,
    g.pname,
    sum(o.sale_cnt*g.price)
FROM tbl_test_order  O
JOIN  tbl_test_customer C
ON  O.ID  = C.ID
JOIN tbl_test_goods   G
ON O.PCODE  = G.PCODE
group by c.name,g.pname;

SELECT
    nvl(c.name,'TOTAL'),
    nvl(g.pname,'SUBTOTAL'),
    sum(o.sale_cnt*g.price)
FROM tbl_test_order  O
JOIN  tbl_test_customer C
ON  O.ID  = C.ID
JOIN tbl_test_goods   G
ON O.PCODE  = G.PCODE
group by rollup(c.name,g.pname); -- 고객별 소계

SELECT
    nvl(c.name,'SUBTOTAL'),
    nvl(g.pname,'TOTAL'),
    sum(o.sale_cnt*g.price)
FROM tbl_test_order  O
JOIN  tbl_test_customer C
ON  O.ID  = C.ID
JOIN tbl_test_goods   G
ON O.PCODE  = G.PCODE
group by rollup(g.pname,c.name); -- 제품별 소계

-- 167p
-- 부서별, 직급별 평균, 인원수합 구하기
-- 부서별 합
-- 전체합

select * from emp;

select
    deptno,
    job,
    sal
from emp;

select
    deptno,
    job,
    sal
from emp
order by 1,2;

select
    deptno,
    job,
    avg(sal),
    count(*)
from emp
group by deptno, job
order by 1,2;

select
    deptno,
    job,
    round(avg(sal),1), -- 소수점 한자리까지
    count(*)
from emp
group by rollup(deptno, job)
order by 1,2;

select
    nvl(deptno,'TOTAL'), -- deptno가 number라서 TOTAL이 number가 아니라 문제
    job,
    round(avg(sal),1), -- 소수점 한자리까지
    count(*)
from emp
group by rollup(deptno, job)
order by 1,2;

select
    nvl(to_char(deptno),'TOTAL'), -- to_char를 이용해 바꿈
    job,
    round(avg(sal),1), -- 소수점 한자리까지
    count(*)
from emp
group by rollup(deptno, job)
order by 1,2;
select
    nvl(to_char(deptno),'TOTAL'), -- to_char를 이용해 바꿈
    job,
    round(avg(sal),1), -- 소수점 한자리까지
    count(*)
from emp
group by rollup(job, deptno) -- job별
order by 1,2;

-- 205p
-- sum() over() 사용예
select * from panmae;

select
    p_date,
    p_total
from panmae;

select
    p_date,
    p_total,
    sum(p_total) over() -- 전체합계
from panmae;

select
    p_date,
    p_total,
    sum(p_total) over(order by p_total) -- 처음부터 현재행까지의 합계
from panmae;

--over(
 --[partiton  by]
 --[order by]
 --[range, rows])

select
    p_date,
    p_total,
    sum(p_total) over()
from panmae;

select *
from panmae;

select
    p_date, p_total
from panmae;

select
    p_date,
    p_total,
    sum(p_total) over()
from panmae;

SELECT
    P_DATE, P_TOTAL ,
    SUM( P_TOTAL)
    OVER(
        ORDER BY P_TOTAL
    )
FROM  PANMAE;

-- rows 변경하기
SELECT
    P_DATE, P_TOTAL ,
    SUM( P_TOTAL)
    OVER(
        ORDER BY P_TOTAL
        range between unbounded preceding and current row
        -- 처음부터 현재까지
    )
FROM  PANMAE;

SELECT
    P_STORE, P_DATE, P_TOTAL ,
    SUM( P_TOTAL)
    OVER(
    -- partition
        PARTITION BY P_STORE
        ORDER BY P_TOTAL
        range between unbounded preceding and current row
        -- 처음부터 현재까지
    )
FROM  PANMAE;

-- SUM( 누적할 값이 컬럼명 ) OVER()
--[PARTITION BY  컬럼명]
--[ORDER BY  기준컬럼명 ]
--[ RANGE ( 기본값) || ROWS ] BETWEEN   UNBOUNDED PRECEDING  AND CURRENT ROW

-- EMP테이블
-- 직급별 SAL(급여) 누적액 구하기
-- RANGE, ROWS 변경하기

-- SAL 전체 누적
SELECT  JOB, SAL  , SUM(SAL) OVER()
FROM EMP;
-- SAL 첫행에서 현재까지 누적
SELECT  JOB, SAL  , SUM(SAL) OVER(  ORDER BY SAL )
FROM EMP;
  
 -- 전체누적이 아니라 부분 즉 파티션 나누기 (직급별 누적구하기
  SELECT  JOB, SAL  ,
  SUM(SAL)
  OVER(  
  PARTITION BY  JOB
  ORDER BY SAL 
  )
FROM EMP;
  
  --  필요하면   RANGE -> ROWS  변경 , 기본은    RANGE  ( 같은 기준은 하나로 처리함)    
  SELECT  JOB, SAL  ,
  SUM(SAL)
  OVER(  
  PARTITION BY  JOB
  ORDER BY SAL 
  ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW
  )
from emp;

-- 교재 문제풀이
-- 205p
-- 사용예1, 사용예2, 사용예3'

SELECT	deptno,
	ename,
	sal,
	SUM(sal) OVER(PARTITION BY deptno ORDER BY sal) "TOTAL"
FROM emp;

SELECT	deptno,
	ename,
	sal,
	SUM(sal) OVER(ORDER BY sal DESC) "TOTAL_SAL",
	ROUND((RATIO_TO_REPORT(SUM(sal)) OVER())*100, 2) "%"
FROM emp
GROUP BY deptno, ename, sal;

SELECT	deptno,
	ename,
	sal,
	SUM(sal) OVER(PARTITION BY deptno) "SUM_DEPT",
	ROUND((RATIO_TO_REPORT(SUM(sal)) OVER(PARTITION BY deptno))*100, 2) "%"
FROM emp
GROUP BY deptno, ename, sal;

-- rank 순위 구하기

-- decode 사용해서 열 집계 만들기
-- 교재 196p

-- rank() over( order by 컬럼명)
-- rank() over(partition by 컬렴명, order by 컬럼명)


-- rank
-- dense_rank
-- row_number

select * from acorntbl;

select name, point
from acorntbl;

select name, point, rank() over(order by point desc)
from acorntbl;

select name, point, dense_rank() over(order by point desc)
from acorntbl;

-- emp
select * from emp;

select job, ename, sal
from emp
order by 1;

-- 전체기준
select job, ename, sal, rank() over(order by sal desc)
from emp
order by 1;

-- job별
select job, ename, sal,
rank()
over(
partition by job
order by sal desc
)
from emp
order by 1;

--
select * from acorntbl;
select name, point
from acorntbl;

select
    name,
    point,
    rank() over( order by point desc) -- point기준
from acorntbl;

select
    name,
    point,
    dense_rank() over( order by point desc) -- point기준
from acorntbl;

select
    name,
    point,
    dense_rank() over( order by point desc), -- point기준
    row_number() over( order by point desc) -- 같은 1000점끼리 순위 매김
from acorntbl;

select
    name,
    point,
    rank() over( order by point desc, birthday desc) -- point기준 + 생일이 늦은 순
from acorntbl;

-- LAG() 함수, LEAD() 함수
-- 이전행, 다음행

-- 교재 194p

-- 사용법
-- LAG(컬럼명, 몇번째 이전행, 기본값) OVER()
-- LEAD(컬럼명, 몇번째 이후, 기본값) OVER()

select * from emp;
select
    ename, sal
from emp;

select
    ename, sal,
    lag(sal, 1,0 ) over(order by sal) "SAL 1개 이전 값"
from emp;

select
    ename, sal,
    lag(sal, 2,0 ) over(order by sal) "SAL 2개 이전 값"
from emp;

select
    ename, sal,
    lead(sal,1,0) over(order by sal) "SAL 1개 이후 값"
from emp;

-- 전체에 대해서 비율 구하기
-- 206p
select *
from acorntbl;

select
    name, point
from acorntbl;

select
    name, point,
    sum(point) over()
from acorntbl;

select
    name, point,
    sum(point) over(),
    round((point/sum(point) over())*100,2)
from acorntbl;

-- ratio_to_report
select
    name, point
from acorntbl;

select
    name, point,
    round(ratio_to_report(point) over()*100,2)
from acorntbl;

-- emp
select *
from emp;

select
    ename, sal
from emp;

select
    ename, sal,
    round(ratio_to_report(sal) over()*100,2) || '&',
    concat(round(ratio_to_report(sal) over()*100,2),'&')
from emp;


-- decode 열 집계 구하기
-- 교재 189p
-- 직급별 사원의 수 구하기
-- CLERK MANAGER PRESIDENT ANALYST SALESMAN
--

select *
from emp;

select
    job, deptno
from emp;

select
    count(job)
from emp;

-- clerk인 사람 수 구하기
select
    job,
    decode(job, 'CLERK',9)
from emp;

select
    count(decode(job, 'CLERK',9))
from emp;
-- manager 수 구하기
select
    count(decode(job, 'MANAGER','*'))
from emp;

-- 전체구하기
select
    count(job) total,
    count(decode(job, 'CLERK','*')) CLERK,
    count(decode(job, 'MANAGER','*')) MANAGER,
    count(decode(job, 'PRESIDENT','*')) PRESIDENT,
    count(decode(job, 'ANALYST','*')) ANALYST,
    count(decode(job, 'SALESMAN','*')) SALESMAN
from emp;

--
--SELECT	deptno,
--	SUM(DECODE(job, 'CLERK', sal, 0)) "CLERK",
--	SUM(DECODE(job, 'MANAGER', sal, 0)) "MANAGER",
--	SUM(DECODE(job, 'PRESIDENT', sal, 0)) "PRESIDENT",
--	SUM(DECODE(job, 'ANALYST', sal, 0)) "ANALYST",
--	SUM(DECODE(job, 'SALESMAN', sal, 0)) "SALESMAN",
--	SUM(NVL2(job, sal, 0)) "TOTAL"
--FROM emp GROUP BY ROLLUP(deptno);

-- 부서별 사원의 수 구하기(DECODE사용)
-- CLERK MANAGER PRESIDENT ANALYST SALESMAN
-- 교재 189p 3번문제
select deptno, job
from emp;

select
    deptno,
    decode(job,'CLERK',9)
from emp;

select
    deptno,
    decode(job,'CLERK',9) CLERK,
    decode(job,'MANAGER',9) MANAGER,
    decode(job,'PRESIDENT',9) PRESIDENT,
    decode(job,'ANALYST',9) ANALYST,
    decode(job,'SALESMAN',9) SALESMAN
from emp
order by 1;

select
    deptno,
    count(decode(job,'CLERK',9)) CLERK,
    count(decode(job,'MANAGER',9)) MANAGER,
    count(decode(job,'PRESIDENT',9)) PRESIDENT,
    count(decode(job,'ANALYST',9)) ANALYST,
    count(decode(job,'SALESMAN',9)) SALESMAN
from emp
group by deptno
order by 1;

-- PIVOT
-- SELECT *
-- FROM (
--    -- 1. 원본 데이터
--    SELECT 컬럼1, 컬럼2, 값컬럼
--    FROM 테이블
-- )
-- PIVOT (
--    -- 2. 집계 함수
--    집계함수(값컬럼)
--    
--    -- 3. 기준 컬럼 (열로 바뀔 대상)
--    FOR 기준컬럼
--    
--    -- 4. 실제 변환될 값들
--    IN ('값1', '값2', '값3')
-- );


-- 1.pivot에서 쓸거 먼저 가공
select *
from(
    select
        deptno,
        job,
        empno
    from emp
    );
    
-- 2.
select *
from(
    select
        deptno,
        job,
        empno
    from emp
)
pivot(
    count(empno)
    for job
    in (
        'CLERK' "CLERK",
        'MANAGER' "MANAGER",
        'PRESIDENT' "PRESIDENT",
        'ANALYST' "ANALYST",
        'SALESMAN' "SALESMAN"
    )
);


-- UNPIVOT
-- 교재 192p, 193p
create table TESTPIVOT
as
select *
from(
    select
        deptno,
        job,
        empno
    from emp
)
pivot(
    count(empno)
    for job
    in (
        'CLERK' "CLERK",
        'MANAGER' "MANAGER",
        'PRESIDENT' "PRESIDENT",
        'ANALYST' "ANALYST",
        'SALESMAN' "SALESMAN"
    )
);

select *
from testpivot;

--

select * from testpivot
unpivot(
    empno
    for job
    in (
        CLERK,
        MANAGER,
        PRESIDENT,
        ANALYST,
        SALESMAN
    )
);







