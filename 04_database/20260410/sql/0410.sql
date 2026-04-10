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
    no number(5) primary key,
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


-- 키의 종류 
-- 슈퍼키 :  유일성 만족
-- 후보키 : 주키가 될 수 있는 후보  (유일성  +  최소성)
-- 주키 : 후보키중에 선택된 키
-- 대체키 : 후보키중에 나머지 키
-- 외래키 : 다른 테이블의 주키로써 관계성 설정을 위해서 가지고 있는 키


--학생테이블 
--학번  이름    학년  반 번호
--001   이순신   1   1  10
--002   홍길동   1   1  9
--003   이순신   2   3  4

-- 슈퍼키 (유일성)
-- 학번포함 다 됨

-- 후보키 (유일성 + 최소성)
-- 학번
-- 학년 + 반 + 번호

-- 기본키 : 학번
-- 대체키 : 학년 + 반 + 번호

-- 학번, 이름, 학년, 반, 번호 => 한 학생을 유일하게 식별가능한가? => 가능하다 => 유일성 만족 => 슈퍼키 가능 / 최소성 위배
-- 학번, 이름, 학년, 반 => 유일성 만족 => 슈퍼키 가능 / 최소성 위배
-- 학번, 이름, 학년 => 유일성 만족 => 슈퍼키 가능 / 최소성 위배
-- 학번, 이름 => 유일성 만족 / 최소성 위배
-- 이름 => 유일성 불만족 => 슈퍼키 불가능 / 최소성 위배
-- 학년, 반, 번호 => 유일성 만족 => 슈퍼키 가능 / 최소성 만족(학년,반,번호 가 고정되야 한 학생 픽스가능) => 후보키
-- 학번 : 이것만 있어도 됨 / 최소성 만족 => 후보키

-- 1) 유일성 : 키의 조합으로 유일하게 하나의 레코드를 식별할 수 있는지 여부
-- 2) 최소성 : 키의 조합이 최소한 존재해야지만 키로 사용하는것이 가능한가?
--          : 키의 일부로 유일하게 식별이 가능하다면 최소성 위배가 된다
--          : 최소성을 만족해야 후보키 가능하다


-- 제약조건 교재324p

-- 도메인제약조건
-- 하나의 컬럼이 가지는 제약조건
CREATE TABLE TEST_2021(
   ID VARCHAR2(7)  NOT NULL, 
   EMAIL VARCHAR2(50) NULL,
   PHONE CHAR(13) NOT NULL,
   PWD VARCHAR2(7) DEFAULT '1111'
);
select * from test_2021;

-- 데이터 추가하기
insert into test_2021 ( id,phone ) values ( 'test','0101231234' );
commit;

-- not null 테스트하기
-- 필수입력사항들은 not null
-- ORA-01400: NULL을 ("SCOTT"."TEST_2021"."PHONE") 안에 삽입할 수 없습니다
insert into test_2021 ( id ) values ( 'test2' );
commit;

--CHECK 제약 조건
-- '010-%-____' _4개임 >> 4개쓰라고
CREATE  TABLE TEST_2021_2(
   ID VARCHAR2(50)  , 
   PHONE VARCHAR2(20) CHECK ( PHONE  LIKE  '010-%-____') NOT NULL,
   EMAIL VARCHAR2(50)  NULL
);

insert into test_2021_2 (id,phone) values ('test2','010-3903-1028');
commit;
select * from test_2021_2;

-- ORA-02290: 체크 제약조건(SCOTT.SYS_C007556)이 위배되었습니다
insert into test_2021_2 (id,phone) values ('test3','01011112222');
insert into test_2021_2 (id,phone) values ('test4','010-3903-123');

CREATE  TABLE TEST_2021_22(
   ID VARCHAR2(50)  , 
   PHONE VARCHAR2(20) CHECK ( PHONE  LIKE  '010-%-____') NOT NULL,
   EMAIL VARCHAR2(50)  NULL,
   GRADE CHAR(2) CHECK( GRADE IN ('01','02','03'))
);

select * from test_2021_22;

INSERT INTO  TEST_2021_22  (ID, PHONE, GRADE)  VALUES('TEST3' ,  '010-3903-1234','01');
commit;

INSERT INTO  TEST_2021_22  (ID, PHONE, GRADE)  VALUES('TEST3' ,  '010-3903-1234','01');






