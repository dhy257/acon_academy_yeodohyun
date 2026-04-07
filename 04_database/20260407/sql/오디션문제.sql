select * from tbl_join_200;
select * from tbl_mentor_200;
select * from tbl_score_200;

-- 1. 참가자 조회
-- 참가자ID, 참가자이름, 생년월일, 성별, 실력무대, 매력무대
select
    join_id 참가자ID,
    join_nm 참가자이름,
    to_char(to_date(birth,'YYYYMMDD'),'YYYY"년"MM"월"DD"일"') 생년월일,
    decode(gender,'M','남성') 성별,
    decode(specialty,'D','댄스','R','랩','V','보컬') 실력무대,
    charm 매력무대
from tbl_join_200;

-- 2. 참가자 점수조회
-- 계좌번호, 참가자ID, 참가자이름, 생년월일, 점수, 등급, 멘토이름
select 
    s.score_no 계좌번호,
    j.join_id 참가자ID,
    j.join_nm 참가자이름,
    to_char(to_date(j.birth,'YYYYMMDD'),'YYYY"년"MM"월"DD"일"') 생년월일,
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

-- 3.참가자 등수 조회
-- 참가자ID, 참가자이름, 종합점수, 평균점수, 순위
select 
    j.join_id 참가자ID,
    j.join_nm 참가자이름,
    sum(s.score) 종합점수,
    round(avg(s.score), 2) 평균점수,
    rank() over (order by sum(s.score) desc) 순위
from tbl_join_200 j
join tbl_score_200 s
on j.join_id = s.artistid
group by j.join_id, j.join_nm;
