
CREATE TABLE STUD_SCORE(
  STUDENT_ID        VARCHAR2(13) NOT NULL PRIMARY KEY ,
  MATH_SCORE      NUMBER(5) ,
  ENG_SCORE        NUMBER(5)   ,
  PHIL_SCORE       NUMBER(5)   ,
  MUSIC_SCORE    NUMBER(5) 
);
COMMIT;


INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE,   ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('0123511' , 89,78,78,90);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE,   ENG_SCORE,  MUSIC_SCORE)   VALUES ('0255475' , 88,90,90);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE  , MUSIC_SCORE)   VALUES ('9921100' , 87,98);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('9732453' , 69,98,78,78);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE )   VALUES ('0578981' , 59,90,89);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('0768789' , 94,80,87,99);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE , MUSIC_SCORE)   VALUES ('9824579' , 90,90,78,87);
INSERT INTO  STUD_SCORE ( STUDENT_ID , MATH_SCORE, ENG_SCORE, PHIL_SCORE )   VALUES ('0565789' , 58,64,72);



commit;
 
 

CREATE TABLE STAFF_SAL(
  ID         VARCHAR2(13) NOT NULL PRIMARY KEY ,
  JOB       VARCHAR2(13) ,
  CURRENT_SAL      NUMBER(10)   ,
  ENG_SCORE        NUMBER(5)    
);
COMMIT;


INSERT INTO  STAFF_SAL    VALUES ('2148', 'OFFICER' , 40000, 90);
INSERT INTO  STAFF_SAL    VALUES ('5780', 'CLERK' , 32000, 98);
INSERT INTO  STAFF_SAL    VALUES ('6870', 'MANAGER' , 100000, 81);
INSERT INTO  STAFF_SAL    VALUES ('4565', 'CLERK' , 30000, 79);
INSERT INTO  STAFF_SAL    VALUES ('9687', 'CLERK' , 33000, 66);
INSERT INTO  STAFF_SAL    VALUES ('7337', 'MANAGER' , 100000, 95);
INSERT INTO  STAFF_SAL    VALUES ('1321', 'OFFICER' , 43000, 80);
INSERT INTO  STAFF_SAL    VALUES ('9896', 'CLERK' , 30000, 50);
 





CREATE TABLE PRC(
CUST_ID      VARCHAR2(13) NOT NULL PRIMARY KEY ,
SET2            VARCHAR2(13) ,
CARD_FLAG     NUMBER(1)   ,
LOAN_FLAG     NUMBER(1)   ,
INSURANCE_FLAG     NUMBER(1)   ,
CTB_FLAG     NUMBER(1)   ,
FUND_FLAG    NUMBER(1)   ,
ANNL_REV   NUMBER(10)      
);
COMMIT;

INSERT INTO  PRC    VALUES ('546515' , 'SILVER' , 1,1,1,1,1,1000);
INSERT INTO  PRC    VALUES ('46780' , 'GOLD' , 0,0,1,1,0,20000);
INSERT INTO  PRC    VALUES ('237848' , 'GOLD' , 1,1,0,1,1,30000);
INSERT INTO  PRC    VALUES ('56432' , 'DIAMOND' , 1,0,1,1,1,10000);
INSERT INTO  PRC    VALUES ('89647' , 'SILVER' , 0,0,1,1,0,3000);
INSERT INTO  PRC    VALUES ('52333' , 'SILVER' , 1,1,0,1,0,2500 );
INSERT INTO  PRC    VALUES ('89669' , 'GOLD' , 1,0,1,1,0,60000);
INSERT INTO  PRC    VALUES ('21004' , 'SILVER' , 0,0,1,1,0,1000);
INSERT INTO  PRC    VALUES ('17890' , 'DIAMOND' , 1,1,0,1,0,300000);
 





CREATE TABLE   PROD_SALES(
CUST_NM         VARCHAR2(13)  ,
PRD_ID             VARCHAR2(5) ,
SALES_AMT       NUMBER(10)      
);
COMMIT;

INSERT INTO   PROD_SALES   VALUES ('LEE', 546 , 3000);
INSERT INTO   PROD_SALES   VALUES ('KIM', 326 , 4780);
INSERT INTO   PROD_SALES   VALUES ('KANG', 564 , 87900);
INSERT INTO   PROD_SALES   VALUES ('KWON', 556 , 45478);
INSERT INTO   PROD_SALES   VALUES ('KIM', 254 , 3000);
INSERT INTO   PROD_SALES   VALUES ('YOO', 567 , 78900);
INSERT INTO   PROD_SALES   VALUES ('PARK', 877 , 89787);
INSERT INTO   PROD_SALES   VALUES ('LEE', 890 , 10000);
INSERT INTO   PROD_SALES   VALUES ('KIM', 787 , 2341);
INSERT INTO   PROD_SALES   VALUES ('PARK', 566 , 50000);
COMMIT;


CREATE TABLE empSample (
    empno    NUMBER(4) CONSTRAINT pk_emp PRIMARY KEY, -- 사원번호
    ename    VARCHAR2(10),                           -- 이름
    job      VARCHAR2(9),                            -- 직급
    mgr      NUMBER(4),                              -- 상급자 사번
    hiredate DATE,                                   -- 입사일
    sal      NUMBER(7,2),                            -- 급여
    comm     NUMBER(7,2),                            -- 커미션
    deptno   NUMBER(2)                               -- 부서번호
);



INSERT INTO empSample VALUES (7369, '김건희',  'CLERK',     7902, TO_DATE('1980-12-17','YYYY-MM-DD'),  800, NULL, 20);
INSERT INTO empSample VALUES (7499, '김태준',  'SALESMAN',  7698, TO_DATE('1981-02-20','YYYY-MM-DD'), 1600,  300, 30);
INSERT INTO empSample VALUES (7521, '고지연',   'SALESMAN',  7698, TO_DATE('1981-02-22','YYYY-MM-DD'), 1250,  500, 30);
INSERT INTO empSample VALUES (7566, '황스일',  'MANAGER',   7839, TO_DATE('1981-04-02','YYYY-MM-DD'), 2975, NULL, 20);
INSERT INTO empSample VALUES (7654, '이현겸', 'SALESMAN',  7698, TO_DATE('1981-09-28','YYYY-MM-DD'), 1250, 1400, 30);
INSERT INTO empSample VALUES (7698, '이용찬',  'MANAGER',   7839, TO_DATE('1981-05-01','YYYY-MM-DD'), 2850, NULL, 30);
INSERT INTO empSample VALUES (7782, '여도현',  'MANAGER',   7839, TO_DATE('1981-06-09','YYYY-MM-DD'), 2450, NULL, 10);
INSERT INTO empSample VALUES (7788, '김민정',  'ANALYST',   7566, TO_DATE('1987-04-19','YYYY-MM-DD'), 3000, NULL, 20);
INSERT INTO empSample VALUES (7839, '박세인',   'PRESIDENT', NULL, TO_DATE('1981-11-17','YYYY-MM-DD'), 5000, NULL, 10);
INSERT INTO empSample VALUES (7844, '조아진', 'SALESMAN',  7698, TO_DATE('1981-09-08','YYYY-MM-DD'), 1500,    0, 30);
INSERT INTO empSample VALUES (7876, '정철진',  'CLERK',     7788, TO_DATE('1987-05-23','YYYY-MM-DD'), 1100, NULL, 20);
INSERT INTO empSample VALUES (7900, '나해수',  'CLERK',     7698, TO_DATE('1981-12-03','YYYY-MM-DD'),  950, NULL, 30);
INSERT INTO empSample VALUES (7902, '손영석',   'ANALYST',   7566, TO_DATE('1981-12-03','YYYY-MM-DD'), 3000, NULL, 20);
INSERT INTO empSample VALUES (7934, '송주창', 'CLERK',     7782, TO_DATE('1982-01-23','YYYY-MM-DD'), 1300, NULL, 10);
INSERT INTO empSample VALUES (7930, '이정하', 'CLERK',     7782, TO_DATE('1982-01-23','YYYY-MM-DD'), 1300, NULL, 10);
INSERT INTO empSample VALUES (7931, '엄진희', 'CLERK',     7782, TO_DATE('1982-01-23','YYYY-MM-DD'), 1300, NULL, 10);
INSERT INTO empSample VALUES (7932, '장윤성', 'CLERK',     7782, TO_DATE('1982-01-23','YYYY-MM-DD'), 1300, NULL, 10);

commit;


--전체조회하기
select * from empSample;

--전체 급여합계
select sum(sal) "급여합계" from empSample;

--전체 급여 평균 구하기
select avg(sal) "급여평균" from empSample;

--전체 사원수 구하기
SELECT COUNT(*) AS "전체사원수" FROM empSample;

--부서별 직원 수 구하기
SELECT deptno, COUNT(*) AS "부서별직원수"
FROM empSample
GROUP BY deptno;

--직급별 평균 급여구하기
SELECT job, AVG(sal) AS "직급별평균급여"
FROM empSample
GROUP BY job;

--부서별 최대급여 구하기  -커미션이 있는 직원만 대상으로 ( 커미션 NULL이 아닌 직원대상)
SELECT deptno, MAX(sal) AS "부서별최대급여"
FROM empSample
WHERE comm IS NOT NULL
GROUP BY deptno;

--부서별 직급변 직원 수 구하기
SELECT deptno, job, COUNT(*) AS "직원수"
FROM empSample
GROUP BY deptno, job --부서로 먼저 묶고 그 안에서 직급으로 묶기
ORDER BY deptno, job;




--문제1) STUD_SCORE 테이블을 사용하여  NULL값을 포함한 행의 개수를 세보자
select COUNT(*) from stud_score;

--문제2)  STUD_SCORE 테이블을 사용하여 NULL값을 제외한 제외한 음악 점수 보유자를 세보자
select count(MUSIC_SCORE) from stud_score;

--문제3) STUD_SCORE 테이블을 사용하여 수학 점수의 총 합계를 구해보자
select sum(MATH_SCORE) from stud_score;

--문제4) STUD_SCORE 테이블을사용하여 음악 점수의 평균을 구해보자
select avg(MUSIC_SCORE) from stud_score;

--문제5) STUD_SCORE 테이블을 사용하여 수학점수 최댓값 및 최솟값을 구해보자
select max(MATH_SCORE) "최대값", min(MATH_SCORE) "최소값" from stud_score;

--문제 6) CLERK는 7% , OFFICER는 5% , MANAGER는 3%로 연봉을 인상하기로 했다. 
--STAFF_SAL테이블을 사용하여 각 직원별 인상 연봉을  예상해보자 ( CASE WEHN  사용해보기 )
--(현재연봉을 기준으로 직위별 예상연봉을 구해보자)
SELECT ID, 
       JOB, 
       CURRENT_SAL AS 현재연봉,
       CASE 
            WHEN JOB = 'CLERK'   THEN CURRENT_SAL * 1.07
            WHEN JOB = 'OFFICER' THEN CURRENT_SAL * 1.05
            WHEN JOB = 'MANAGER' THEN CURRENT_SAL * 1.03
            ELSE CURRENT_SAL
       END AS 예상연봉
FROM STAFF_SAL
order by id asc; -- 정렬 추가

--문제 1) PRC 테이블을 사용하여 고객등급별 인당 평균 연 수익을 계산해 보자( GROUP BY 사용)
SELECT SET2 AS 고객등급, 
       AVG(ANNL_REV) AS 평균_연수익
FROM PRC
GROUP BY SET2;

--문제 2) PRC  테이블을 사용하여 고객등급별 고객 수를 확인해보자
--(GROUP BY)
SELECT SET2 AS 고객등급, 
       COUNT(*) AS 고객수
FROM PRC
GROUP BY SET2;

SELECT SET2 AS 고객등급
FROM PRC;

--문제 3) 구매횟수가 두 번 이상인 고객에게 마케팅을 하려고 한다. 마케팅 대상자의  고객이름을 조회하시오
SELECT CUST_NM
FROM PROD_SALES
GROUP BY CUST_NM
HAVING COUNT(*) >= 2;

SELECT CUST_NM
FROM PROD_SALES;

SELECT CUST_NM, count(CUST_NM)
FROM PROD_SALES
group by CUST_NM;

SELECT CUST_NM, count(CUST_NM)
FROM PROD_SALES
group by CUST_NM
HAVING COUNT(*) >= 8;


--문제 4) 구매금액의 합이 7만원 이상인 고객에게 마케팅을 하려고 한다. 마케팅 대상자는 누구일까?
SELECT CUST_NM
FROM PROD_SALES
GROUP BY CUST_NM
HAVING SUM(SALES_AMT) >= 70000;

SELECT CUST_NM, sum(sales_amt)
FROM PROD_SALES
GROUP BY CUST_NM
HAVING SUM(SALES_AMT) >= 300000;












 
 
