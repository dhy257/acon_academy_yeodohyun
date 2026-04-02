-- 단일행 함수
-- 교재 68p


-- 단일행 함수
-- 여러건의 데이터를 한 번에 하나씩 처리하는 함수
-- 각 행에 대해서 함수가 실행됨

-- 자주 쓰는 단일행 함수 익히기

-- 1. 전체 확인
select *
from acorntbl;

-- 2. 관심있는 컬럼만 조회
select ID, PW, NAME
FROM acorntbl;

-- 3. 단일행 함수 적용
-- ID를 대문자로 나오게 하고 싶음 => upeer
select upper(ID), PW, NAME
FROM acorntbl;

-- 문자함수
-- 숫자함수
-- 날짜함수
-- NVL함수
-- CASE WHEN (조건문 처리)

-- 문자함수
-- 데이터베이스에서 문자 : 문자와 문자열 구분X
-- ' '로 감싸야 함
-- 문자열을 작성할 때 '를 문자로 사용하고 싶으면 '' 한 번 더 작성

-- 함수에서 인덱스사용할 때 1부터 시작함(0아님)
-- 문자열 추출 SUBSTR(시작인덱스, 추출개수)
SELECT * FROM acorntbl;
SELECT ID FROM acorntbl;
SELECT SUBSTR(ID,1,2) as ID FROM acorntbl;

SELECT ID, 'hi~~'' ~ ^^ ' FROM acorntbl;

-- 소문자변경
-- 대문자변경

SELECT * FROM acorntbl;
SELECT LOWER(ID) FROM acorntbl;
SELECT UPPER(ID) FROM acorntbl;

-- INSTR 함수
-- 문자열 내에서 특정문자의 위치를 반환
SELECT * FROM STUDENT;
SELECT TEL FROM STUDENT;
SELECT INSTR(TEL,')') FROM STUDENT;

-- REPLACE 함수
SELECT * FROM STUDENT;
SELECT TEL FROM STUDENT;
SELECT REPLACE(TEL, ')' , '*') FROM STUDENT;

-- 숫자함수
-- ROUND() : 반올림
-- TRUNC() : 버림
SELECT * FROM EMP;
SELECT ENAME, SAL
FROM EMP;

SELECT 10/3 FROM DUAL;
SELECT ROUND(10/3,1) FROM DUAL;
SELECT TRUNC(10/3,0) FROM DUAL;

SELECT 23333 FROM DUAL;
SELECT TRUNC(23333,-1) FROM DUAL;

-- 날짜함수
-- 현재날짜 가져오기
SELECT SYSDATE FROM DUAL;

-- NVL, NVL2
-- NULL 처리 할 수 있는 함수

SELECT * FROM member_tbl_11;
SELECT M_NAME, M_POINT FROM member_tbl_11;
--
SELECT M_NAME, M_POINT+100 FROM member_tbl_11;
-- NVL함수 사용하기(NULL인 상황 처리)
SELECT
    -- NULL인거 0으로 처리
    M_NAME, NVL(M_POINT,0)+100 
FROM member_tbl_11;

-- NVL2(컬럼명, NULL아닌경우, NULL인경우)
-- NULL 아니면 +1000
-- NULL 이면 110
SELECT M_NAME, NVL2(M_POINT,M_POINT+1000,100)
FROM member_tbl_11;

-- CASE WHEN
-- 에이콘테이블에서 포인트가 3000이상이면 A, 2000이상이면 B, 나머지 C 초기화
SELECT *
FROM acorntbl;

SELECT NAME, POINT
FROM acorntbl;

SELECT NAME, POINT,
    CASE WHEN POINT >=3000 THEN 'A'
        WHEN POINT >=2000 THEN 'B'
        ELSE 'C'
    END AS RESULT
FROM acorntbl;



