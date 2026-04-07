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














