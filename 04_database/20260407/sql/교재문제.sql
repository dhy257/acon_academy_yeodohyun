-- 210, 211, 212, 213

-- 210
-- 1.
-- emp 테이블을 사용하여 사원중에서 급여(sal)와 보너스(comm)를 합친 금액이 가장 많은 경우와
-- 가정 적은 경우, 평균 금액을 구하세요. 단, 보너스가 없을 경우는 보너스를 0으로 계산하고
-- 출력 금액은 모두 소수점 첫번째 자리까지만 나오게 하세요
select *
from emp;

select
    max(sal+nvl(comm,0)) MAX,
    min(sal+nvl(comm,0)) MIN,
    round(avg(sal+nvl(comm, 0)), 1) AVG
from emp;

-- 2.
-- student테이블의 birthday컬럼을 참조하여
-- total, jan, feb,mar,...dec까지 뜨게 월별로 생일자 수를 출력해라
select * from student;

select
    decode(to_char(birthday,'MM'),'01',1)
from student;

select
    decode(to_char(birthday,'MM'),'01',1) JAN,
    decode(to_char(birthday,'MM'),'02',1) FEB,
    decode(to_char(birthday,'MM'),'03',1) MAR,
    decode(to_char(birthday,'MM'),'04',1) APR,
    decode(to_char(birthday,'MM'),'05',1) MAY,
    decode(to_char(birthday,'MM'),'06',1) JUN,
    decode(to_char(birthday,'MM'),'07',1) JUL,
    decode(to_char(birthday,'MM'),'08',1) AUG,
    decode(to_char(birthday,'MM'),'09',1) SEP,
    decode(to_char(birthday,'MM'),'10',1) OCT,
    decode(to_char(birthday,'MM'),'11',1) NOV,
    decode(to_char(birthday,'MM'),'12',1) DEC
from student;

select
    count(*)||'EA' TOTAL,
    count(decode(to_char(birthday,'MM'),'01',1))||'EA' JAN,
    count(decode(to_char(birthday,'MM'),'02',1))||'EA' FEB,
    count(decode(to_char(birthday,'MM'),'03',1))||'EA' MAR,
    count(decode(to_char(birthday,'MM'),'04',1))||'EA' APR,
    count(decode(to_char(birthday,'MM'),'05',1))||'EA' MAY,
    count(decode(to_char(birthday,'MM'),'06',1))||'EA' JUN,
    count(decode(to_char(birthday,'MM'),'07',1))||'EA' JUL,
    count(decode(to_char(birthday,'MM'),'08',1))||'EA' AUG,
    count(decode(to_char(birthday,'MM'),'09',1))||'EA' SEP,
    count(decode(to_char(birthday,'MM'),'10',1))||'EA' OCT,
    count(decode(to_char(birthday,'MM'),'11',1))||'EA' NOV,
    count(decode(to_char(birthday,'MM'),'12',1))||'EA' DEC
from student;

-- 3.
-- Student테이블의 tel컬럼을 참고하여 지역별 인원수 출력
-- 단, 02-SEOUL, 031-GYEONGGI, 051-BUSAN,053-DAEGU, 055-GYEONGNAM으로 출력
select tel
from student;

select
    -- )까지 찾으면 ) 포함이니까 -1로 그전 숫자
    substr(tel,1,instr( tel,')' )-1)
from student;

select
    decode(substr(tel,1,instr( tel,')' )-1), '02',1)
from student;

select
    decode(substr(tel,1,instr( tel,')' )-1), '02',1) SEOUL,
    decode(substr(tel,1,instr( tel,')' )-1), '031',1) GUEONGGI,
    decode(substr(tel,1,instr( tel,')' )-1), '051',1) BUSAN,
    decode(substr(tel,1,instr( tel,')' )-1), '052',1) ULSAN,
    decode(substr(tel,1,instr( tel,')' )-1), '053',1) DAEGU,
    decode(substr(tel,1,instr( tel,')' )-1), '055',1) GYEONGNAM
from student;

select
    count(*) TOTAL,
    count(decode(substr(tel,1,instr( tel,')' )-1), '02',1)) SEOUL,
    count(decode(substr(tel,1,instr( tel,')' )-1), '031',1)) GUEONGGI,
    count(decode(substr(tel,1,instr( tel,')' )-1), '051',1)) BUSAN,
    count(decode(substr(tel,1,instr( tel,')' )-1), '052',1)) ULSAN,
    count(decode(substr(tel,1,instr( tel,')' )-1), '053',1)) DAEGU,
    count(decode(substr(tel,1,instr( tel,')' )-1), '055',1)) GYEONGNAM
from student;


-- 211
-- 4.
-- 먼저 emp테이블에 아래 두 건의 데이터를 입력한 후 작업.
-- Emp 테이블을 사용하여 부서별로 직급별로 급여 합계 출력
insert into emp (empno, deptno, ename, sal) values (1000, 10, 'Tiger', 3600);
insert into emp (empno, deptno, ename, sal) values (2000, 30, 'Cat', 3000);

select * from emp;

select deptno, job, sal
from emp;

select
    deptno, job,
    decode(job,'CLERK',9)
from emp;

select
    deptno,
    sum(decode(job,'CLERK',sal,0)) CLERK,
    sum(decode(job,'MANAGER',sal,0)) MANAGER,
    sum(decode(job,'PRESIDENT',sal,0)) PRESIDENT,
    sum(decode(job,'ANALYST',sal,0)) ANALYST,
    sum(decode(job,'SALESMAN',sal,0)) SALESMAN,
    sum(nvl2(job,sal,0)) TOTAL
from emp
group by rollup(deptno)
order by 1;


-- 212
-- 5.
-- emp테이블을 사용하여 직원들의 급여와 전체 급여의 누적 급여금액 출력
-- 급여 오름차순
select *
from emp;

select
    deptno, ename, sal,
    sum(sal)
    over(order by sal) TOTAL
from emp;


-- 6.
-- fruit테이블 출력
select * from fruit;

select
    price
from fruit;

select
    decode(name,'apple',price) APPLE
from fruit;

select
    decode(name,'apple',price) APPLE,
    decode(name,'grape',price) GRAPE,
    decode(name,'orange',price) ORANGE
from fruit;

select
    sum(decode(name,'apple',price)) APPLE,
    sum(decode(name,'grape',price)) GRAPE,
    sum(decode(name,'orange',price)) ORANGE
from fruit;


-- 7.
-- student테이블의 tel컬럼 사용, 지역별 인원수와 전체 대비 차지하는 비율 출력
-- 단, 02-SEOUL, 031-GYEONGGI, 051-BUSAN,053-DAEGU, 055-GYEONGNAM으로 출력
select tel from student;

select
    decode(substr(tel,1,instr( tel,')' )-1), '02',1) SEOUL,
    decode(substr(tel,1,instr( tel,')' )-1), '031',1) GUEONGGI,
    decode(substr(tel,1,instr( tel,')' )-1), '051',1) BUSAN,
    decode(substr(tel,1,instr( tel,')' )-1), '052',1) ULSAN,
    decode(substr(tel,1,instr( tel,')' )-1), '053',1) DAEGU,
    decode(substr(tel,1,instr( tel,')' )-1), '055',1) GYEONGNAM
from student;

select
    count(*)||'EA' TOTAL,
    count(decode(substr(tel,1,instr( tel,')' )-1), '02',1))||'EA' SEOUL,
    count(decode(substr(tel,1,instr( tel,')' )-1), '031',1))||'EA' GUEONGGI,
    count(decode(substr(tel,1,instr( tel,')' )-1), '051',1))||'EA' BUSAN,
    count(decode(substr(tel,1,instr( tel,')' )-1), '052',1))||'EA' ULSAN,
    count(decode(substr(tel,1,instr( tel,')' )-1), '053',1))||'EA' DAEGU,
    count(decode(substr(tel,1,instr( tel,')' )-1), '055',1))||'EA' GYEONGNAM
from student;
--ROUND((RATIO_TO_REPORT(SUM(sal)) OVER())*100, 2) "%"
select
    count(*) || 'EA ('||
    
    round(ratio_to_report(count(*)) over () * 100, 2) || '%)' TOTAL,
    
    count(decode(substr(tel,1,instr( tel,')' )-1), '02',1))||'EA ('||
    round(count(decode(substr(tel,1,instr(tel,')')-1), '02', 1)) / count(*) * 100, 2) || '%)' SEOUL,
    
    count(decode(substr(tel,1,instr( tel,')' )-1), '031',1))||'EA ('||
    round(count(decode(substr(tel,1,instr(tel,')')-1), '031', 1)) / count(*) * 100, 2) || '%)' GUEONGGI,
    
    count(decode(substr(tel,1,instr( tel,')' )-1), '051',1))||'EA ('||
    round(count(decode(substr(tel,1,instr(tel,')')-1), '051', 1)) / count(*) * 100, 2) || '%)' BUSAN,
    
    count(decode(substr(tel,1,instr( tel,')' )-1), '052',1))||'EA ('||
    round(count(decode(substr(tel,1,instr(tel,')')-1), '052', 1)) / count(*) * 100, 2) || '%)' ULSAN,
    
    count(decode(substr(tel,1,instr( tel,')' )-1), '053',1))||'EA ('||
    round(count(decode(substr(tel,1,instr(tel,')')-1), '053', 1)) / count(*) * 100, 2) || '%)' DAEGU,
    
    count(decode(substr(tel,1,instr( tel,')' )-1), '055',1))||'EA ('||
    round(count(decode(substr(tel,1,instr(tel,')')-1), '055', 1)) / count(*) * 100, 2) || '%)' GYEONGNAM
from student;

-- 213
-- 8.
-- emp테이블을 사용하여 급여 누적 합계 출력
-- 단, 부서 번호로 오름차순
select * from emp;

select deptno, ename, sal
from emp;

select
    deptno, ename, sal,
    sum(sal) over(partition by deptno order by sal) TOTAL
from emp;

-- 9.
-- emp테이블을 사용하여 각 사원의 급여액이 전체 직원 급여 총액에서 몇%의 비율을 차지하는지 출력
-- 단, 급여 비중이 높은 사람이 먼저 출력
select * from emp;

select
    deptno, ename, sal
from emp;

select
    deptno, ename, sal,
    sum(sal) over(order by sal desc) "TOTAL_SAL"
from emp;

select
    deptno, ename, sal,
    sum(sal) over(order by sal desc) "TOTAL_SAL",
    round( (ratio_to_report(sum(sal)) over())*100, 2 ) "%"
from emp
group by deptno, ename, sal;






















