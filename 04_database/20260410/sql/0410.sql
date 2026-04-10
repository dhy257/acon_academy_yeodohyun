-- 릴레이션 : 튜플의 집합(표, 테이블구조)
-- 튜플 : 행(맨위 구분 줄, ex) 학번, 이름..)
-- 속성 : 열(ex)한 학생에 대한 정보, 위에 속성에 대한 값 쭉 잇음)
-- 도메인 : 각 값이 들어갈 범위
-- 인스턴스 : 찐 값


-- 테이블 생성하기
-- 회원테이블 생성하기

-- 자료형
-- 문자 : CHAR(자리수) - 고정길이, VARCHAR2(자리수) - 가변길이
-- 숫자: NUMBER(자리수), NUMBER(전체자리수, 소수자리수
-- 날짜 :DATE, TIMESTAMP

CREATE TABLE member_acorn(
    id varchar2(50) primary key, -- 아이디
    pwd varchar2(50), -- 비번
    name varchar2(50), -- 이름
    gender char(6), -- 성별
    age number(3), -- 나이
    birthday date, -- 생일
    phone char(13) -- 전화번호
);

desc member_acorn;
select * from member_acorn;

-- 테이블 생성시 주키설정 필수
-- char: 고정길이형 문자이기 때문에 남은 공간은 공백으로 채워짐, 문자비교시 주의
-- 'HELLO' 'HELLO '는 다르다
-- 오라클의 경우 한글 3바이트 사용 >> 한글10자리면 30으로 해야함
-- varchar2 : 가변길이형 문자, 실제입력된 문자만큼 공간이 마련됨

--테이블생성  
  CREATE TABLE MEMBER_TEST(
     ID  VARCHAR2(7) PRIMARY KEY ,
     PW  CHAR(4)  DEFAULT '0000' ,
     NAME VARCHAR2(10) ,
     TEL  VARCHAR2(10)    
  );
  
-- 홍길동
-- 여도현
insert into member_test (id,name,tel) values ( 'HONG','홍길동','0101231123' );
insert into member_test (id,pw,name,tel) values ( 'YDH', '1234' ,'여도현','0101234567' );
commit;
select * from member_test;



-- 테이블 변경(수정하기) ALTER

-- 컬럼 추가
alter table member_test add (address varchar2(50));

select * from member_test;

-- 컬럼 이름 변경
alter table member_test rename column name to username;

-- tel 컬럼 문자자료형 길이 변경
alter table member_test modify tel varchar(15);
desc member_test;

-- 컬럼 삭제
-- address 삭제하기
alter table member_test drop column address;

-- 테이블 삭제하기
drop table member_test;

* 참고사항
-- 테이블  drop시  참조하고 있는 테이블이 있는 경우 삭제가 안될 수 있다.
-- 테이블 drop시 강제 삭제 시킬 수 있다.
--drop table aaa_tbl  cascade constraints ;
--
--복합키를 주키로 설정하는 구문
--CREATE TABLE testTbl  (
--    column1 NUMBER,
--    column2 VARCHAR2(100),
--    column3 DATE,
--    CONSTRAINT  pk_test   PRIMARY KEY (column1, column2)
--);

-- 테이블 삭제하기
-- drop table 테이블명; >> 완전삭제
-- truncate table 테이블명; >> 

-- 교재285p
-- 1.
create table new_emp(
    no number(5),
    nane varchar(20),
    hiredate date,
    bonus number(6,2)
);
select * from new_emp;

-- 2.
create table new_emp2
as
select
    no, nane, hiredate
from new_emp;
select * from new_emp2;

-- 3.
create table new_emp3
as
select *
from new_emp2
where 1 = 0;

-- 4.
alter table new_emp2 add(birthday date default sysdate);
select * from new_emp2;

-- 5.
alter table new_emp2 rename column birthday to birth;
select * from new_emp2;

-- 6.
alter table new_emp2 modify no number(7);
desc new_emp2;

-- 7.
alter table new_emp2 drop column birth;
select * from new_emp2;

-- 8.
truncate table new_emp2;
select * from new_emp2;

-- 9.
drop table new_emp2;












