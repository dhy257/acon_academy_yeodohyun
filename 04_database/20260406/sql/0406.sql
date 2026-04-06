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




