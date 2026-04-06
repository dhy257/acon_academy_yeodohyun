HY 라운드(LOUD) 오디션프로그램 


create table tbl_join_200(
  join_id varchar2(4)  not null primary key ,
  join_nm varchar2(20)  ,
  birth  char(8),
  gender char(1),
  specialty varchar2(1),
  charm varchar2(30)
);

insert into tbl_join_200 values( 'A001' , '케이쥬',  '20050102' , 'M', 'D', '깜찍댄스');
insert into tbl_join_200 values( 'A002' , '고키',  '20090102' , 'M', 'D', '동전마술');
insert into tbl_join_200 values( 'A003' , '나윤서',  '20070102' , 'M', 'D', '창작댄스');
insert into tbl_join_200 values( 'A004' , '장현수',  '20030103' , 'M', 'R', '보컬');
insert into tbl_join_200 values( 'A005' , '윤민',  '20020205' , 'M', 'V', '자작곡');



멘토테이블 

create table tbl_mentor_200(
    mentor_id varchar2(4) not null primary key ,
    mentor_nm varchar2(20)
);

insert into tbl_mentor_200 values( 'J001', '박진영');
insert into tbl_mentor_200 values( 'J002', '박재상');
insert into tbl_mentor_200 values( 'J003', '보아');



create table tbl_score_200(
  score_no  number(6) not null ,
  artistid varchar2(4) not null,
  mentorid varchar2(4) not null,
  score number(3),
  primary key( score_no, artistid, mentorid)
);

insert into tbl_score_200 values( 110001, 'A001', 'J001' , 80);
insert into tbl_score_200 values( 110002, 'A001', 'J002' , 90);
insert into tbl_score_200 values( 110003, 'A001', 'J003' , 70);
insert into tbl_score_200 values( 110004, 'A002', 'J001' , 60);
insert into tbl_score_200 values( 110005, 'A002', 'J002' , 50);
insert into tbl_score_200 values( 110006, 'A002', 'J003' , 70);
insert into tbl_score_200 values( 110007, 'A003', 'J001' , 80);
insert into tbl_score_200 values( 110008, 'A003', 'J002' , 60);
insert into tbl_score_200 values( 110009, 'A003', 'J003' , 70);
insert into tbl_score_200 values( 110010, 'A004', 'J001' , 80);
insert into tbl_score_200 values( 110011, 'A004', 'J002' , 78);
insert into tbl_score_200 values( 110012, 'A004', 'J003' , 89);
insert into tbl_score_200 values( 110013, 'A005', 'J001' , 62);
insert into tbl_score_200 values( 110014, 'A005', 'J002' , 91);
insert into tbl_score_200 values( 110015, 'A005', 'J003' , 67);



select * from tbl_join_200;
select * from tbl_mentor_200;
select * from tbl_score_200;

-- 참가자 조회
-- 참가자ID, 참가자이름, 생년월일, 성별, 실력무대, 매력무대 조회
select * from tbl_join_200;
select 
    join_id 참가자ID,
    join_nm 참가자이름,
    birth 생년월일,
--    gender 성별,
    decode(gender, 'M','남성') 성별,
--    specialty 실력무대,
    decode(specialty, 'D','댄스','R','랩','V','보컬') 실력무대,
    charm 매력무대
from tbl_join_200;


-- 참가자 점수조회
-- 계좌번호, 참가자ID, 참가자이름, 생년월일, 점수, 등급, 멘토이름 조회
-- 등급 90이상은 A, 80이상은 B, 70이상은 C, 나머지 D
select * from tbl_join_200;
select * from tbl_score_200;

select *
from tbl_score_200 s
join tbl_join_200 j
on s.artistid = j.join_id;

select *
from tbl_score_200 s
join tbl_join_200 j
on s.artistid = j.join_id
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select 
    s.score 점수,
    case 
        when s.score >= 90 then 'A'
        when s.score >= 80 then 'B'
        when s.score >= 70 then 'C'
        else 'D'
    end 등급,
    m.mentor_nm 멘토이름
from tbl_score_200 s
join tbl_join_200 j
on s.artistid = j.join_id
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

select 
    s.score_no 계좌번호,
    j.join_id 참가자ID,
    j.join_nm 참가자이름,
    j.birth 생년월일,
    s.score 점수,
    case 
        when s.score >= 90 then 'A'
        when s.score >= 80 then 'B'
        when s.score >= 70 then 'C'
        else 'D'
    end 등급,
    m.mentor_nm 멘토이름
from tbl_score_200 s
join tbl_join_200 j
on s.artistid = j.join_id
join tbl_mentor_200 m
on s.mentorid = m.mentor_id;

-- 참가자 등수조회
-- 참가자ID, 참가자이름, 종합점수, 평균점수, 순위
--select 
--    j.join_id 참가자ID,
--    j.join_nm 참가자이름,
--    sum(s.score) 종합점수,
--    round(avg(s.score), 2) 평균점수,
--    rank() over (order by sum(s.score) desc) 순위
--from tbl_join_200 j
--join tbl_score_200 s
--on j.join_id = s.artistid
--group by j.join_id, j.join_nm;






