-- 교재 70페이지
-- 단일행 함수

-- 문자함수
-- INITCAP() 함수
-- 첫글자만 대문자로 변환 나머지는 소문자변환

SELECT * FROM EMP;

SELECT ENAME, INITCAP(ENAME) FROM EMP;

-- LOWER() 함수 : 소문자로 변경
-- UPPER() 함수 : 대문자로 변경

SELECT * FROM EMP;

SELECT ENAME FROM EMP;

SELECT ENAME , LOWER(ENAME), UPPER(ENAME)
FROM EMP;

-- LENGTH : 문자열의 길이를 구하는 함수
SELECT * FROM EMP;
SELECT ENAME, LENGTH(ENAME) as CNT
FROM EMP;

-- || 연결연산자
-- CONCAT() 함수

SELECT * FROM EMP;

SELECT ENAME, JOB
FROM EMP;

SELECT ENAME || ' ' || JOB
FROM EMP;

SELECT CONCAT(ENAME, JOB)
FROM EMP;

-- SUBSTR()
-- 문자열에서 필요한 부분만 추출하여 사용

SELECT SUBSTR('ABCD',2,1) FROM DUAL;
SELECT SUBSTR(ENAME,2,1) FROM EMP;
SELECT SUBSTR(ENAME,-1,1) FROM EMP; -- 오른쪽 한 개

-- INSTR() 함수
-- 문자열내에서 특정문자의 위치 반환

SELECT 'A-B-C-D' FROM DUAL;
SELECT INSTR('A-B-C-D','-') FROM DUAL; -- 첫번째 위치에서 첫번쨰 만나는 지정된 문자의 위치를 반환 / -는 2번째 등장
SELECT INSTR('A-B-C-D','-',1,3) FROM DUAL; -- 3번째 -는 총 6번째 위치에 있음

-- 사용 예1
SELECT
    NAME,
    TEL,
    INSTR(TEL,')')
FROM STUDENT
WHERE DEPTNO1 = 201;
-- 사용 예2
SELECT 
    NAME,
    TEL,
    INSTR(TEL, '3')
FROM STUDENT
WHERE DEPTNO1 = 101;
-- 퀴즈1
SELECT 
    NAME,
    TEL,
    SUBSTR(TEL, 1, INSTR(TEL, ')') - 1) AS "AREA CODE"
FROM STUDENT
WHERE DEPTNO1 = 201;
--- 풀이---
-- TEL에서  ')' 찾기  --INSTR
SELECT TEL FROM STUDENT;

SELECT TEL  , INSTR(TEL,  ')' )  FROM STUDENT;


SELECT TEL FROM STUDENT;
SELECT TEL  , INSTR(TEL,  ')' )  ,  INSTR(TEL,  ')' ) -1
FROM STUDENT;


--
SELECT  NAME, 
       TEL, 
       SUBSTR(TEL ,1,  INSTR(TEL,  ')' ) -1  )
FROM STUDENT;
-------

-- LPAD() 함수 / RPAD()는 오른쪽
-- LPAD(컬럼명, 자리수, 채울문자)
SELECT NAME, ID
FROM STUDENT;

SELECT NAME, ID, LPAD(ID, 20, '*')
FROM STUDENT;

SELECT NAME, ID, RPAD(ID, 20, '*')
FROM STUDENT;

-- 공백제거 또는 특정문자 제거
-- LTRIM
-- RTRIM
-- TRIM

-- 공백 조심
-- A공백
-- A

-- "A " "A" - 가져온데이터가 같은 모습이지만 다르다고 나오면 공백 의심 => 공백 제거

SELECT 'A ' FROM DUAL;
SELECT RTRIM ('A ') FROM DUAL;

SELECT '    A', LTRIM('    A') FROM DUAL;

SELECT ENAME FROM EMP;
-- 오른쪽에서 마지막에 있는 R제거하기
SELECT ENAME, RTRIM(ENAME, 'R')
FROM EMP;

-- REPLACE() 함수
-- REPLACE( 문자열, '문자1','문자2')
SELECT ENAME
FROM EMP;
-- S를 A로
SELECT ENAME, REPLACE(ENAME,'S','A')
FROM EMP;

-- 이름의 첫글자만 별로 바꾸기
SELECT ENAME, REPLACE (ENAME,'S','*')
FROM EMP;
SELECT ENAME, REPLACE (ENAME,'A','*')
FROM EMP;
SELECT ENAME, REPLACE (ENAME,'J','*')
FROM EMP;

-- 찾는문자가 고정될 수 없다
-- => 찾는 문자 구하기
-- 이름에서 첫글자 가져오기
SELECT ENAME, SUBSTR(ENAME,1,1)
FROM EMP;
-- 이후 SUBSTR(ENAME,1,1) 첫글자를 REPLACE 대상으로 주기
SELECT ENAME, REPLACE(ENAME, SUBSTR(ENAME,1,1), '*')
FROM EMP;

-- 문제 풀어보기
-- 사용 예
SELECT NAME, ID, LPAD(ID,10,'*')
FROM STUDENT
WHERE DEPTNO1 = 201;

-- 퀴즈1
SELECT 
    ENAME,
    REPLACE(ENAME, SUBSTR(ENAME, 2, 2), '--') REPLACE
FROM EMP
WHERE DEPTNO = 20;
-- 퀴즈2
--SELECT
--    NAME,
--    JUMIN,
--    REPLACE(
--FROM STUDENT
--WHERE DEPTNO1 = 101;
SELECT 
    NAME,
    REPLACE(JUMIN, SUBSTR(JUMIN, 7), '-///////') REPLACE
FROM STUDENT
WHERE DEPTNO1 = 101;
-- 퀴즈3
SELECT 
    NAME,
    TEL,
    REPLACE(TEL, SUBSTR(TEL, INSTR(TEL, ')') + 1, 3), '***') REPLACE
FROM STUDENT
WHERE DEPTNO1 = 102;
-- 퀴즈4
SELECT 
    NAME,
    TEL,
    REPLACE(TEL, SUBSTR(TEL, INSTR(TEL, '-') + 1), '****') REPLACE
FROM STUDENT
WHERE DEPTNO1 = 101;

-- 다른사람 문제풀이 -----------
SELECT * FROM EMP;

SELECT ENAME, REPLACE(ENAME, 'MI' , '--') 
FROM EMP;

SELECT ENAME,  SUBSTR(ENAME,2,2)
FROM EMP;


SELECT ENAME, REPLACE(ENAME, SUBSTR(ENAME, 2, 2) , '--') 
FROM EMP;

--퀴즈2

-- 84P 퀴즈 2
SELECT NAME, JUMIN, REPLACE(JUMIN, SUBSTR(JUMIN,8,7) , '-/-/-/-') "REPLACE"
FROM STUDENT
WHERE DEPTNO1 = 101;


--퀴즈3
SELECT * FROM STUDENT;
SELECT NAME, TEL,REPLACE(TEL,SUBSTR(TEL,5,3),'***') FROM STUDENT
WHERE DEPTNO1 = 101;


--퀴즈4

SELECT * FROM STUDENT;

SELECT NAME, TEL
FROM STUDENT
WHERE DEPTNO1 = 101;


SELECT NAME, TEL , REPLACE( TEL,  '2158' , '****')
FROM STUDENT;

SELECT NAME, TEL, REPLACE(TEL, SUBSTR(TEL, 9, 4), '****') REPLACE
FROM STUDENT
WHERE DEPTNO1 = 101;


SELECT  INSTR( TEL,  '-')  +1 FROM STUDENT;

SELECT NAME, TEL, REPLACE(TEL, SUBSTR(TEL, INSTR(TEL,'-')+1 , 4), '****') REPLACE
FROM STUDENT
WHERE DEPTNO1 = 101;
------

--숫자관련함수
--ROUND(컬럼, 출력을 원하는 자리수)
 
--출력을 원하는 자리수 :  -2 -1  0  1  2

SELECT ROUND( 1234.5678, 0) FROM DUAL;
SELECT ROUND( 1234.5678, -1) FROM DUAL;

--TRUNC :버림

SELECT TRUNC( 1234.5678, 0) FROM DUAL;
SELECT TRUNC( 1234.5678, -1) FROM DUAL;


--MOD :나머지
SELECT MOD(11,3) FROM  DUAL;

--CEIL  : 주어진 숫자에서 가까운 큰 정수   3.56  ->  4
--FLOOR : 주어진 숫자에서 가까운 작은 정수   3.56  ->  3
--                                      -3.46   ->  큰,  -3     작은거 -4


SELECT FLOOR( 3.56) FROM DUAL;   -- 3
SELECT CEIL( 3.56) FROM DUAL;   -- 4

SELECT FLOOR( -3.56) FROM DUAL;       -- -4
SELECT CEIL( -3.56) FROM DUAL;        -- -3


--날짜관련 함수  (89페이지)

--현재날짜구하기
SELECT SYSDATE FROM DUAL;

-- 날짜  - 날짜   = 수  (일 수)
-- 날짜 +3 ->  이후 날짜
-- 날짜 -3 =>  이전 날짜

--MONTHS_BETWEEN (큰날짜, 작은날짜)
SELECT  MONTHS_BETWEEN( SYSDATE , '2026-01-22') FROM DUAL ;


--LAST_DAY() 함수
--정해진 날짜가 포함된 달의 마지막 날 구하기
SELECT  SYSDATE  FROM  DUAL;
SELECT  LAST_DAY(SYSDATE)  FROM  DUAL;

--NEXT_DAY()
SELECT SYSDATE  , NEXT_DAY( SYSDATE, '월') FROM DUAL;

--날짜 , 년 ,월, 일 가져오기 

SELECT  SYSDATE FROM DUAL;

SELECT  
    SYSDATE,
    EXTRACT( YEAR FROM SYSDATE) ,
     EXTRACT( MONTH FROM SYSDATE) ,
      EXTRACT( DAY FROM SYSDATE)     
FROM DUAL;


--형변환
--문자 :   VARCHAR2  , CHAR
--숫자  :  NUMBER 
--날짜  : DATE
--1)형변환  - 표시형식 
-- 숫자  ->  문자  (천단위, 통화단위)
-- 날짜  ->  문자  (원하는 표시형식으로 지정하고 싶을 때)

--2) 숫자연산을 위해서
-- 문자  ->  숫자

--3) 날짜데이터로 다루기 위해서 
-- 문자  ->  날짜 

--형변환함수
--명시적형변환 , 묵시적형변환(자동형변환)
SELECT  2+'2' FROM DUAL;  --  2+ '2' -> 문자  2가 자동으로 숫자로 변환되었음  (자동형변환)
--
SELECT 2 + TO_NUMBER('2') FROM DUAL;

--TO_CHAR()  : 숫자, 날짜를 문자로 형변환 하는 것
SELECT  SYSDATE  FROM DUAL;
SELECT  TO_CHAR(SYSDATE ,  'YYYY-MM-DD' )  FROM DUAL;
SELECT  TO_CHAR(SYSDATE , 'YYYY/MM/DD')  FROM DUAL;
SELECT  TO_CHAR(SYSDATE , 'YYYY')  FROM DUAL;
SELECT  TO_CHAR(SYSDATE , 'MM')  FROM DUAL;
SELECT  TO_CHAR(SYSDATE , 'DD')  FROM DUAL;
SELECT  TO_CHAR(SYSDATE , 'DAY')  FROM DUAL;
SELECT  TO_CHAR(SYSDATE , 'DY')  FROM DUAL;

-- 시분초

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD : HH24:MI:SS') FROM DUAL;

-- 숫자를 문자로

SELECT * FROM ACORNTBL;

SELECT NAME, TO_CHAR(POINT, '999,999') FROM ACORNTBL; -- 의미 없는 0은 표시 xx
SELECT NAME, TO_CHAR(POINT, 'L999,999') FROM ACORNTBL;
SELECT NAME, TO_CHAR(POINT, '$999,999') FROM ACORNTBL;
SELECT NAME, TO_CHAR(POINT, '$099,999') FROM ACORNTBL;

-- 형변환 주의사항
-- 문자 > 문자변환 불가
-- 숫자 > 숫자변환 불가

-- TO_NUMBER()
-- TO_CHAR()
-- TO_DATE() : 날짜 형식을 갖춘 문자 > 날짜데이터로 바꾸기
SELECT TO_DATE('2000-01-01') FROM DUAL;

-- select 절 나오는 별칭은
-- 쿼리실행 순서에서 별칭을 만든 다음 순서부터 사용가능
-- 작성순서 select > from > where
-- 실행순서 from > where > select
-- 따라서 아래 쿼리 실행안됨
-- >> select에서 만든 별칭 mm을 where에서 사용불가하기 때문
--select empno,ename,hibernate,to_char(hibernate,'MM') as mm
--from emp
--where mm in in ( '01','02','03')
-- 106P 형변환 퀴즈 2 
SELECT EMPNO, ENAME, HIREDATE
FROM EMP
WHERE TO_CHAR(HIREDATE, 'MM') IN ('01','02','03');

-- 107p
-- 사용예1
SELECT
    EMPNO,
    ENAME,
    SAL,
    COMM,
    TO_CHAR((SAL*12)+COMM,'999,999') "SALARY"
FROM EMP
WHERE ENAME='ALLEN';
    
-- 사용예2
SELECT
    NAME,PAY, BONUS,
    TO_CHAR((PAY*12)+BONUS,'999,999') "TOTAL"
FROM PROFESSOR
WHERE DEPTNO = 201;
-- 퀴즈1
SELECT 
    empno,
    ename,
    hiredate,
    (sal*12 + comm),
    (sal*12 + comm)*1.15
FROM emp
WHERE comm IS NOT NULL;

SELECT 
    empno,
    ename,
    TO_CHAR(hiredate, 'YYYY-MM-DD') AS hiredate,
    TO_CHAR((sal*12 + comm), 'L999,999') AS SAL,
    TO_CHAR((sal*12 + comm)*1.15, 'L999,999') AS "15% UP"
FROM emp
WHERE comm IS NOT NULL;

-- NVL(), NVL2()
-- 교재 111 ( 중간에 있는 그림에 있는 SQL작성 )
SELECT
    ENAME,COMM,
    NVL(COMM,0),
    NVL(COMM,100)
FROM EMP
WHERE DEPTNO = 30;
-- 교재 112 ( NVL퀴즈)
SELECT * FROM PROFESSOR;
SELECT
    PROFNO,
    NAME,
    PAY,
    NVL(BONUS, 0) BONUS,
    (pay * 12)+NVL(BONUS,0) TOTAL
FROM PROFESSOR
WHERE deptno = 201;
-- 교재 113 ( NVL2퀴즈)
SELECT EMPNO,
       ENAME,
       COMM,
       CASE 
           WHEN comm IS NOT NULL THEN 'Exist'
           ELSE 'NULL'
       END NVL2
FROM emp
WHERE deptno = 30;

SELECT EMPNO,
       ENAME,
       COMM,
       NVL2(comm, 'Exist', 'NULL') NVL2
FROM EMP
WHERE DEPTNO = 30;
-- DECODE() 함수 113p
-- IF문 ( 조건이 같은것만 사용 가능 )

-- MEMBER_TBL_11
SELECT * FROM MEMBER_TBL_11;
-- 01 : VVIP 02: VIP 03:GOLD
SELECT
M_NAME,M_GRADE,
DECODE(M_GRADE, '01','VVIP' , '02','VIP', '03','GOLD','해당사항없음')
FROM MEMBER_TBL_11;

SELECT * FROM PROFESSOR;
SELECT DEPTNO,NAME,DECODE(DEPTNO,101,DECODE(NAME,'Audie Murphy','BEST','GOOD'))
FROM PROFESSOR;

-- CASE WHEN
-- 교재 121 ( 중간에 있는 그림에 있는 SQL작성 )
SELECT
    NAME, TEL,
    CASE(SUBSTR(TEL,1,INSTR(TEL,')')-1))
        WHEN '02' THEN 'SEOUL'
        WHEN '031' THEN 'GYEONGGI'
        WHEN '051' THEN 'BUSAN'
        WHEN '052' THEN 'ULSAN'
        WHEN '055' THEN 'GYEONGNAM'
        ELSE 'ETC'
    END "LOC"
FROM STUDENT
WHERE DEPTNO1 = 201;
-- 교재 123 ( CASE 퀴즈 )
SELECT
    EMPNO, ENAME,SAL,
    CASE
        WHEN SAL BETWEEN 1 AND 1000 THEN 1
        WHEN SAL BETWEEN 1001 AND 2000 THEN 2
        WHEN SAL BETWEEN 2001 AND 3000 THEN 3
        WHEN SAL BETWEEN 3001 AND 4000 THEN 4
        ELSE 5
    END "LEVEL"
FROM
    EMP
ORDER BY SAL DESC;



-- 1.전체확인
select * from emp;
select empno, ename, sal
from emp;
-- 2.관심있는 컬럼조회
select empno, ename, sal,
    case when sal>=4001 then 'level5'
    end "LEVEL"
from emp;
-- 3.이후완성
select empno, ename, sal,
case when sal >= 4001 then 'LEVEL 5'
     when sal >= 3001 then 'LEVEL 4'
     when sal >= 2001 then 'LEVEL 3'
     when sal >= 1001 then 'LEVEL 2'
     else 'LEVEL 1'
end "LEVEL"
from emp
order by sal desc;





-- 복수행 함수 156p
-- 전체합계, 전체평균, 전체개수 : 집계함수는 NULL을 제외하고 집계함
-- SUM(), AVG(), MAX(), MIN()

SELECT *
FROM EMP;

SELECT SAL
FROM EMP;

SELECT SUM(SAL), AVG(SAL),COUNT(SAL),COUNT(COMM),COUNT(*),MAX(SAL),MIN(SAL)
FROM EMP;

-- 집계함수는 NULL 제외
-- COUNT(컬럼명) : NULL제외하고 센다

SELECT COUNT(SAL) FROM EMP; -- 12
SELECT COUNT(COMM) FROM EMP; -- 4

-- COUNT(*) : NULL 따지지 않고 전체 레코드 수

-- 그룹별 집계 구하기

-- 1. 그룹별 집계내기의 전단계 만들기
-- 2. 데이터를 보면서 눈으로 집계 내보기
-- 3. 그룹별 집계

-- 고객 등급별 포인트 합 구하기
select * from member_tbl_11;

-- 전체 포인트 합 구하기
select sum(m_point) from member_tbl_11;
-- 전단계 만들기
select m_grade, m_point from member_tbl_11;
-- 
select m_grade, sum(m_point) -- 3.실행순서
from member_tbl_11  -- 1. 실행순서
group by m_grade;   -- 2. 실행순서

-- 등급별 포인트 합 구하기
-- 등급별 포인트 합이 5000이상인 것만 조회되도록 하시오
-- 그룹바이 된 결과 내에서 필터를 할 땐 HAVING 사용
select m_grade, sum(m_point) total
from member_tbl_11
group by m_grade
having sum(m_point)>=5000; -- 반드시 group by 상황에서만 사용가능함

select m_grade, sum(m_point) total
from member_tbl_11
group by m_grade
having sum(m_point)>=5000
order by total desc;

-- 등급별 합계 구하기
select m_grade, m_point
from member_tbl_11
where m_grade is not null;
-- 등급별 합계에서 5000이상인것만 조회하기
select m_grade,sum(m_point)
from member_tbl_11
where m_grade is not null
group by m_grade;

select m_grade,sum(m_point)
from member_tbl_11
where m_grade is not null
group by m_grade
having sum(m_point) >=5000;
-- 표시
select m_grade,to_char(sum(m_point) , '999,999') total
from member_tbl_11
where m_grade is not null
group by m_grade
having sum(m_point) >=5000;


-- 부서별, 직급별, 사원별 집계하기 ( 데이터베이스SQL PDF 참조 )








