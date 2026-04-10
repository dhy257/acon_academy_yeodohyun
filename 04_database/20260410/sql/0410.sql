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


-- 테이블 생성시 제약조건 두기 (327p)
--create table new_emp1 (
--   no number(4) 
--   constraint emp1_no_pk primary key,
--   name varchar2(20) 
--   constraint emp1_name_nn not null,
--   jumin varchar2(13)
--   constraint emp1_jumin_nn  not null 
--   constraint emp1_jumin_uk  unique,
--   loc_code number(1) 
--   constraint emp1_area_ck check( loc_code  <5 ) ,
--   deptno varchar2(6)
--   constraint emp1_deptno_fk references dept2(dcode)
--);
--select * from new_emp1;
-- 
--
--
--create table new_emp2(
--    no number(4) primary key,
--    name varchar2(20) not null ,
--    jumin varchar2(13) not null unique,
--    loc_code number(1) check( loc_code <5),
--    deptno varchar2(6) references dept2(dcode )
--);
--select * from new_emp2;

-- 2) 엔티티 제약조건 (테이블 조건) : 테이블 안에서 갖는 제약 조건
-- PRIMARY KEY ( NOT NULL, 중복을 허용하지 않음 )
-- UNIQUE ( 중복을 허용하지 않음 )
CREATE TABLE TEST_2021_3(

  ID  VARCHAR2(7)   NOT NULL  PRIMARY KEY,
  EMAIL VARCHAR2(50),
  PHONE CHAR(13)  UNIQUE ,
  PWD  VARCHAR2(10)
);
select * from TEST_2021_3;

insert into TEST_2021_3 ( id ) values ( 'test' );
commit;
select * from TEST_2021_3;

-- id는 primary key 이니 유일해야함
-- ORA-00001: 무결성 제약 조건(SCOTT.SYS_C007576)에 위배됩니다
insert into TEST_2021_3 ( id ) values ( 'test' );

-- 아이디 제외하고 추가하기
-- ORA-01400: NULL을 ("SCOTT"."TEST_2021_3"."ID") 안에 삽입할 수 없습니다
-- id는 반드시 입력해야함
insert into TEST_2021_3 ( email, phone, pwd ) values ( 'test@naver.com','01012341234','1234' );

INSERT INTO  TEST_2021_3( ID,EMAIL,PHONE, PWD) VALUES('TEST2', 'test@naver.com' , '010-1111-222' ,'111');
commit;

select * from test_2021_3;

-- ORA-00001: 무결성 제약 조건(SCOTT.SYS_C007577)에 위배됩니다
-- tel은 unique라 똑같은거 못넣음
INSERT INTO  TEST_2021_3( ID,EMAIL,PHONE, PWD) VALUES('TEST3', 'test@naver.com' , '010-1111-222' ,'222');
commit;


-- 3) 관계제약조건 ( 테이블간 제약조건)

-- Foreign

CREATE TABLE MEM_TBL(
   ID VARCHAR2(5)  NOT NULL PRIMARY KEY,
   NAME VARCHAR2(10) NOT NULL ,
   ADDR VARCHAR2(10)
 
 );

insert into mem_tbl values( 'a1' , '홍길동' , '서울') ;
insert into mem_tbl values( 'a2' , '홍길순', '부산');
commit;

select * from mem_tbl;

create table ord_tbl (
no varchar2(5) not null primary key ,
qty number(4) , 
cus_no varchar2(5) 
);
--
insert into ord_tbl values( 'j01' , 3, 'a1' );
insert into ord_tbl values( 'j02' , 1, 'a1' );
insert into ord_tbl values( 'j03' , 7, 'a2' );

COMMIT;

select * from ord_tbl;

-- 주문테이블에 a3 고객의 주문 추가해보기
-- 값이 들어간다 => 없는 고객이 주문을 함
-- 이걸막으려면 제약조건 추가해야함 => 외래키 제약조건
insert into ord_tbl values( 'j04' , 7, 'a3' );
commit;

-- 고객테이블
create table mem_tbl_2 (
    id varchar2(5) not null primary key ,
    name varchar2(10) not null ,
    addr varchar2(10)
);
insert into mem_tbl_2 values( 'a1' , '홍길동' , '서울') ;
insert into mem_tbl_2 values( 'a2' , '홍길순', '부산');
commit;


--주문테이블 생성하기
CREATE TABLE  ORD_TBL_2(
   NO VARCHAR2(5) PRIMARY KEY,
   QTY NUMBER(4) NOT NULL,
   CUS_NO VARCHAR2(5)   REFERENCES mem_tbl_2( ID) -- 관계성 제약조건 추가하기
);

insert into ord_tbl_2 values( 'j01' , 3, 'a1' );
insert into ord_tbl_2 values( 'j02' , 1, 'a1' );
insert into ord_tbl_2 values( 'j03' , 7, 'a2' );

COMMIT;
SELECT * FROM  ord_tbl_2;

-- ORA-02291: 무결성 제약조건(SCOTT.SYS_C007588)이 위배되었습니다- 부모 키가 없습니다
insert into ord_tbl_2 values( 'j04' , 7, 'a3' );

-- contraint 제약조건이름 제약조건 (교재337p)
create table new_emp1 (
   no number(4) 
   constraint emp1_no_pk primary key,
   name varchar2(20) 
   constraint emp1_name_nn not null,
   jumin varchar2(13)
   constraint emp1_jumin_nn not null 
   constraint emp1_jumin_uk unique,
   loc_code number(1) 
   constraint emp1_area_ck check( loc_code  <5 ) ,
   deptno varchar2(6)
   constraint emp1_deptno_fk references dept2(dcode)
);

SELECT * FROM new_emp1;


--

create table ctbl (
    id varchar2(10) primary key ,
    name varchar2(10)
);
create table otbl ( 
    code varchar2(10) primary key,
    iid  varchar2(10) references ctbl (id) on delete cascade
);


insert into ctbl values( 't1' ,  'kim');
insert into ctbl values( 't2'  , 'choi');
insert into otbl values( 'o1', 't1');
insert into otbl values( 'o2', 't1');
commit;

select * from ctbl;
select * from otbl;

delete  from ctbl where id  ='t1';   //  t1고객 삭제시   t1을 참조하는 주문정보가 모두 삭제가 됨
select * from  otbl; //  주문정보가 모두 삭제된것을 확인 할 수 있다.

--

create table ctb2 (
    id varchar2(10) primary key ,
    name varchar2(10)
);
create table otb2 ( 
    code varchar2(10) primary key,
    iid  varchar2(10) references ctb2 (id) on delete set null
);


insert into ctb2 values( 't1' ,  'kim');
insert into ctb2 values( 't2'  , 'choi');
insert into otb2 values( 'o1', 't1');
insert into otb2 values( 'o2', 't1');
commit;

select * from ctb2;
select * from otb2;

delete from ctb2 where id = 't1';
select * from otb2;






