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








