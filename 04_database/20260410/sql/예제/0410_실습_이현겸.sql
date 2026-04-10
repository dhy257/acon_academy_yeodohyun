-- 회원 테이블
create table ticket_member(
    id varchar2(10) primary key,
    name varchar2(20),
    phone varchar2(13) CHECK ( phone  LIKE  '010%')  unique,
    birth date,
    addr varchar2(50),
    pw varchar2(20)
);

insert into ticket_member(id, name, phone, birth, addr, pw) values('acorn1234', '김건희', '01011112222', '2002-05-04', '시흥시 오이도', 'asdf1234');
insert into ticket_member(id, name, phone, birth, addr, pw) values('charlie', '이현겸', '01037374848', '2003-01-15', '경기도 광주', 'psps5657');
insert into ticket_member(id, name, phone, birth, addr) values('ex01', '홍길동', '01045459999', '2000-07-08', '인천광역시 서구');
insert into ticket_member values('ex02', '박점순', '01012345678', '1986-11-12', '경기도 부천시', '1234');

update ticket_member set pw = '홍길동' where id = 'ex01';
select * from ticket_member;
commit;

-- 콘서트 테이블
create table ticket_concert(
    concert_code number(10) primary key,
    concert_name varchar(30),
    concert_date date
);

insert into ticket_concert(concert_code, concert_name, concert_date) values(1454356, '포스트말론 내한공연', '2026-10-02');
insert into ticket_concert values(556733, '인천펜타포트페스티벌', '2026-08-03');
insert into ticket_concert values(924385, '서울재즈페스티벌', '2026-10-02');
insert into ticket_concert values(763321, '기비온 내한공연', '2026-10-23');
update ticket_concert set concert_date = '2026-06-12' where concert_code = 924385;
select * from ticket_concert;

-- 좌석 테이블
create table ticket_sits(
    sits_code varchar(10) primary key,
    sits_isbooked number(1),
    stage_code varchar2(10) references ticket_stage(stage_code)
);
insert into ticket_sits values('w1', 1, '0001');
insert into ticket_sits values('w2', 0, '0001');
insert into ticket_sits values('w3', 0, '0001');
insert into ticket_sits values('w4', 0, '0001');
insert into ticket_sits values('w5', 0, '0001');
insert into ticket_sits values('s1', 0, '0002');
insert into ticket_sits values('s2', 0, '0002');
insert into ticket_sits values('s3', 0, '0002');
insert into ticket_sits values('s4', 0, '0002');
insert into ticket_sits values('s5', 0, '0002');
insert into ticket_sits values('e1', 0, '0003');
insert into ticket_sits values('e2', 0, '0003');
insert into ticket_sits values('e3', 0, '0003');
insert into ticket_sits values('e4', 0, '0003');
insert into ticket_sits values('e5', 0, '0003');
select * from ticket_sits;

-- 예매 테이블
create table ticket_book(
    bookcode varchar2(10) primary key,
    m_id varchar2(10) references ticket_member(id),
    concert_code number(10) references ticket_concert(concert_code),
    sits_code varchar(10) references ticket_sits(sits_code)
);
drop table ticket_book;
insert into ticket_book(bookcode, m_id, concert_code, sits_code) values('b01', 'acorn1234', 1454356, 'w1');
delete from ticket_book where bookcode = 'b01';
insert into ticket_book values('b02', 'charlie', 763321, 'e3');
insert into ticket_book values('b03', 'ex01', 763321, 'e4');
insert into ticket_book values('b04', 'ex02', 924385, 'e4');
select * from ticket_book;

-- 공연장 테이블
create table ticket_stage(
    stage_code varchar2(10) primary key,
    stage_name varchar2(50)
);

insert into ticket_stage values('0001', '고양종합운동장');
insert into ticket_stage values('0002', '인천펜타포트공연장');
insert into ticket_stage values('0003', '명화라이브홀');
select * from ticket_stage;

-- 공연장 예약 테이블
create table ticket_stage_book(
    bookcode varchar2(10) primary key,
    stage_code varchar2(10) references ticket_stage,
    concert_code number(10) references ticket_concert(concert_code),
    bookday date
);
insert into ticket_stage_book values('01', '0001', 1454356, '2026-10-02');
insert into ticket_stage_book values('02', '0002', 556733, '2026-08-03');
insert into ticket_stage_book values('03', '0003', 924385, '2026-06-12');
insert into ticket_stage_book values('04', '0003', 763321, '2026-10-23');
select * from ticket_stage_book;





-- 테이블 조인해서 예매 정보보기
select b.bookcode, m.id, m.name, c.concert_name, c.concert_date, b.sits_code
from ticket_book b 
join ticket_member m
on b.m_id = m.id
join ticket_concert c
on b.concert_code = c.concert_code
order by 1;

-- 공연 예약해보기
desc ticket_book;
select * from ticket_book;
insert into ticket_book values('b05', 'charlie', 556733, 's3');

-- 공연당 예매 수 확인하기
select c.concert_name 콘서트명, count(c.concert_code) 예매티켓수
from ticket_book b
join ticket_concert c
on b.concert_code = c.concert_code
group by c.concert_name;