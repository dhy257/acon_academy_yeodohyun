create table member_tbl_11(
m_id varchar2(5) not null primary key ,
m_pw varchar2(5) ,
m_name varchar2(10) ,
m_tel varchar2(13) ,
m_birthday date ,
m_point number(6) ,
m_grade varchar2(2) 
);
commit;
insert into member_tbl_11 values ('m100' , '1234' , '성기훈', '010-1111-2222' , '2004-01-01' , 100, '01');
insert into member_tbl_11 values ('m101' , '4444' , '김상우', '010-2222-3333' , '2004-01-01' , 1500, '01');
insert into member_tbl_11 values ('m102' , '5555' , '김일남', '010-3333-4444' , '2004-12-10' , 2000, '02');
insert into member_tbl_11 values ('m103' , '6666' , '이준호', '010-4444-5555' , '2004-04-10' , 1900, '02');
insert into member_tbl_11 values ('m104' , '7777' , '김새벽', '010-5555-6666' , '2004-09-12' , 3000, '03');
insert into member_tbl_11 values ('m105' , '8888' , '최덕수', '010-6666-7777' , '2004-08-10' , 4800, '03');
insert into member_tbl_11 values ('m106' , '9999' , '이알리', '010-7777-8888' , '2004-07-10' , 2900, '01');
insert into member_tbl_11 values ('m107' , '0101' , '김미녀', '010-8888-9999' , '2004-06-09' , 1200, '01');
insert into member_tbl_11 values ('m108' , '0404' , '이정재', '010-9999-8888' , '2004-05-19' , 3000, '03');
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m109' , '0448' , '박해수', '010-7878-1111' , '2004-11-27' );
insert into member_tbl_11 ( m_id, m_pw, m_name , m_tel , m_birthday) 
values ('m110' , '4848' , '위하준', '010-8888-9090' , '2004-11-09');
commit;

select * from member_tbl_11;


create table  acorntbl  (
    id  varchar2(10) primary key,
    pw  varchar2(10) ,
    name varchar2(10),
    point number(6) , 
    birthday date    
);
-- 데이터베이스 문자열은 ''
-- 데이터조작시 추가(INSERT), 변경(UPDATE), 삭제(DELETE)시 COMMIT필수

insert into acorntbl values('ydh', '1234', '여도현' ,100 , '2000-01-24');

insert into acorntbl(id, pw, name, point, birthday)  values('minjeong', '0604', '김민정' ,33333 , '2002-06-04');
insert into acorntbl(id, pw, name, point, birthday)  values('nice', '0624', '나해수' ,1000 , '2003-06-24');
insert into acorntbl(id, pw, name, point, birthday)  values('leejeongha', 'jh1234', '이정하' ,200 , '2000-02-17'); 
insert into acorntbl(id, pw, name, point, birthday)  values('sein', '1234', '박세인' ,1000 , '2005-01-25'); 
insert into acorntbl(id, pw, name, point, birthday)  values('charlie', '1029', '이현겸' ,6700 , '2003-01-15');
insert into acorntbl(id,pw,name,point,birthday) values('victoai','1234','김태준',1000,'2004-03-30');
insert into acorntbl(id, pw, name, point, birthday)  values('yong', '4768', '이용찬' ,100 , '2002-05-04');
insert into acorntbl(id, pw, name, point, birthday) values('wnckd', '123456', '송주창', 4324, '2001-11-21');
insert into acorntbl(id, pw, name, point, birthday) values('jaemin','0320','김재민',9000,'2002-03-20');
insert into acorntbl(id, pw, name, point, birthday)  values('sone919', '1234', '황스일' ,100 , '2002-09-19');
insert into acorntbl(id, pw, name, point, birthday) values('jcj', '1234', '정철진' ,1000 , '2002-01-25');
insert into acorntbl(id, pw, name, point, birthday)  values('rjsgml350', '1224', '김건희' ,10000 , '2002-10-10');
insert into acorntbl(id, pw, name, point, birthday)  values('jyon', '1234', '고지연' ,100 , '1983-04-09');
insert into acorntbl(id, pw, name, point, birthday)  values('HIHI', '0401', '장해든' ,1004 , '2004-04-01');
insert into acorntbl(id, pw, name, point, birthday) values('jang', '1224', '장윤성' ,1000 , '2002-02-08');
insert into acorntbl(id, pw, name, point, birthday) values('dkwls', '0830', '조아진', 1000, '2000-08-30');
insert into acorntbl(id,pw,name,point,birthday) values('ejh', '1234','엄진희',1000,'2001-10-28');
insert into acorntbl values('sys', '1009', '손영석' ,100 , '2003-01-09');
insert into acorntbl(id, pw, name, point, birthday) values('min', '0113', '김민경', 1000, '2003-01-13');
COMMIT;



-- 데이터 조회하기 컬럼지정
select id,name from acorntbl;

-- 데이터 조회하기 모든컬럼
select * from acorntbl;

-- 테이블의 명세 확인하기 (컬럼정보) - 테이블 구조확인하기
desc acorntbl;

-- 연결연산자 사용||
select id || ' ' || pw || ' ' || name from acorntbl;

-- 조회하기 - 정렬하기
SELECT * 
FROM acorntbl 
order by point desc; -- 오름차순

SELECT *
FROM acorntbl
ORDER BY 3 desc; -- 정렬시 순번사용 가능

-- 조건절 추가하기 (WHERE)
SELECT *
FROM acorntbl
WHERE point >=2000;

-- = 같은거 != 같지않은거

SELECT *
FROM acorntbl
WHERE NAME = '장해든';

SELECT *
FROM acorntbl
WHERE NAME != '장해든';

-- between a and b : a b 사이 값 (a,b 값 포함)
SELECT  *
FROM acorntbl
where point BETWEEN 5000 and 10000;

-- a and b
-- 고객등급이 01이고 포인트가 1500이상인 회원 조회
select *
FROM member_tbl_11
WHERE m_grade = '01' AND m_point >=1500;

-- a or b
-- 고객등급이 01 이거나 포인트가 1500이상인 회원 조회
SELECT *
FROM member_tbl_11
WHERE m_grade = '01' or m_point >=1500;

-- IN(A, B, C)
select *
FROM member_tbl_11
WHERE m_grade in ('01','02');

-- NOT IN(A, B, C)
select *
FROM member_tbl_11
WHERE m_grade not in ('01','02');

-- IS NULL
-- IS NOT NULL
select * FROM member_tbl_11;

-- NULL의 의미 : 미정
-- NULL+100 = NULL , NULL은 미정이라 더할 수 없음
-- NULL 처리 ( NULL과 같으니, 같지않으니는 =, != 연산자 사용불가 )
-- IS NULL, IS NOT NULL 사용

-- point가 null 인 사람 조회하기
select *
FROM member_tbl_11
WHERE m_point is null;

-- point가 null 아닌 사람 조회하기
select *
FROM member_tbl_11
WHERE m_point is not null;

-- NULL + 100 => NULL 확인하기
select m_id, m_name, m_point, m_point + 100
from member_tbl_11;

-- desc member_tbl_11;

-- 조회시 컬럼 별칭 사용하기
-- 컬럼명 뒤에 AS 사용 (생략가능)
-- 별칭 사용시 공백 또는 소문자로 작성할 떄는 쌍따옴표 사용

select M_ID as ID,
M_PW pw, 
M_name "pw a"
from member_tbl_11;

-- distinct 키워드 사용
-- 중복 제거하고 조회
select *
FROM member_tbl_11;

select m_grade FROM member_tbl_11;
select DISTINCT m_grade FROM member_tbl_11;

-- 생일이 2004/4/10 이후인 사람 조회
-- 날짜 데이터는 ''사용, >,<,>= 그대로 사용
select *
FROM member_tbl_11
WHERE M_BIRTHDAY > '2004-04-10';

-- 데이터조회하기 select
-- select 컬럼명
-- FROM 테이블명
-- WHERE 조건
-- ORDER BY 컬럼명 또는 순서 (오름차순 desc)

-- like 연산자 사용하기
-- 이씨 조회하기
-- % : 0이상 자리수(자리수 길이제한x)
-- _ : 한 자리

select *
FROM acorntbl
WHERE NAME LIKE '이%';

select *
FROM acorntbl
WHERE NAME LIKE '이__';











