-- 
--CREATE TABLE tbl_vote_0104 (
--    v_jumin   VARCHAR2(13) PRIMARY KEY,
--    v_name    VARCHAR2(20),
--    v_area    VARCHAR2(10),
--    v_time    VARCHAR2(6),
--    v_confirm VARCHAR2(1),
--    v_num     NUMBER(4)
--);
-- 
--INSERT INTO tbl_vote_0104 VALUES ('800120866419', '김유진', '신당', '0902', 'Y', 1001);
--INSERT INTO tbl_vote_0104 VALUES ('810510106542', '이유표', '신당', '0910', 'Y', 1001);
--INSERT INTO tbl_vote_0104 VALUES ('820201190123', '김투표', '신당', '1101', 'Y', 1001);
--INSERT INTO tbl_vote_0104 VALUES ('830120289011', '정투표', '신당', '1210', 'Y', 1002);
--INSERT INTO tbl_vote_0104 VALUES ('841201907621', '최투표', '신당', '1109', 'Y', 1002);
--INSERT INTO tbl_vote_0104 VALUES ('850109120876', '강투표', '신당', '1201', 'Y', 1003);
--INSERT INTO tbl_vote_0104 VALUES ('860120209321', '안투표', '신당', '1301', 'Y', 1003);
--INSERT INTO tbl_vote_0104 VALUES ('821201208761', '오투표', '신당', '0810', 'Y', 1004);
--INSERT INTO tbl_vote_0104 VALUES ('830102397652', '문투표', '신당', '0729', 'Y', 1005);
--INSERT INTO tbl_vote_0104 VALUES ('880912102839', '송투표', '신당', '0702', 'Y', 1005);
--INSERT INTO tbl_vote_0104 VALUES ('870102129081', '유투표', '신당', '0809', 'Y', 1004);
-- 
--CREATE TABLE tbl_member_010 (
--    m_no    VARCHAR2(10) PRIMARY KEY,
--    m_name  VARCHAR2(20),
--    m_jumin VARCHAR2(13),
--    m_city  VARCHAR2(6),
--    m_degree VARCHAR2(2),
--    p_no    NUMBER(2)
--);
-- 
--INSERT INTO tbl_member_010 VALUES ('1001', '김후보', '651201208711', '노원', '04', 10);
--INSERT INTO tbl_member_010 VALUES ('1002', '이후보', '6001201908323', '중랑', '03', 11);
--INSERT INTO tbl_member_010 VALUES ('1003', '최후보', '7006021903232', '마포', '01', 12);
--INSERT INTO tbl_member_010 VALUES ('1004', '박후보', '7109123239329', '서초', '02', 10);
--INSERT INTO tbl_member_010 VALUES ('1005', '유후보', '6809121293039', '강서', '02', 11);
--INSERT INTO tbl_member_010 VALUES ('1006', '정후보', '6201201903933', '강남', '03', 12);
-- 
--
--
--CREATE TABLE tbl_party_010 (
--    p_no    VARCHAR2(2) PRIMARY KEY,
--    p_name    VARCHAR2(20),
--    p_tel     VARCHAR2(4),
--    v_time    VARCHAR2(4),
--    v_confirm VARCHAR2(4)    
--);
--
--INSERT INTO tbl_party_010  VALUES ('10', '모정당', '010', '1111' , '2222');
--INSERT INTO tbl_party_010   VALUES ('11', '신정당',  '010', '2222' , '3333');
--INSERT INTO tbl_party_010  VALUES ('12', '구정당',  '010', '3333' , '4444');
-- 
--commit;

select * from tbl_vote_0104;
select * from tbl_member_010;
select * from tbl_party_010;

select *
from tbl_vote_0104 v
join tbl_member_010 m
on v.v_num = m.m_no;

select *
from tbl_vote_0104 v
join tbl_member_010 m
on v.v_num = m.m_no
join tbl_party_010 p
on p.p_no = m.p_no;

select
    v.v_name,
    v.v_jumin,
    v.v_area,
    v.v_confirm
from tbl_vote_0104 v
join tbl_member_010 m
on v.v_num = m.m_no
join tbl_party_010 p
on p.p_no = m.p_no;

-- 투표자 조회 ------------------------------------------------------------------
-- 투표자이름, 투표자생년월일, 투표자나이, 투표자성별, 투표장, 유권자확인 조회
-- 생년월일 예시는 1980년01월20일 to_char사용할것
-- 성별 : 주민번호 7번째 1이면 남성, 2면 여성
-- 만나이: 현재년도 - 주민번호년도 ( 주민번호 월이 현재월보다 크면 -1 )
select *
from tbl_vote_0104;

select
    v.v_name 투표자이름,
    v.v_area 투표장,
    case 
        when substr(v.v_jumin,7,1) = '1' then '남성'
        when substr(v.v_jumin,7,1) = '2' then '여성'
        else '기타'
    end 투표자성별,
    decode(v.v_confirm,'Y','확인') 유권자확인
from tbl_vote_0104 v;

select
    v.v_name,
    to_char(
        to_date(
            -- 맨앞이 0이면 1900년대 아니면 2000년대
            case
                when substr(v.v_jumin,1,1) = '0'
                then '20' || substr(v.v_jumin,1,6)
                else '19' || substr(v.v_jumin,1,6)
            end,
            'YYYYMMDD'
        ),
        'YYYY"년"MM"월"DD"일"'
    )투표자생년월일,
        to_number(to_char(sysdate,'YYYY'))
        - (1900 + to_number(substr(v.v_jumin,1,2))) --80이면 1980으로
        - case
            -- 주민번호 월이 더크면 - 1
            when to_number(substr(v.v_jumin,3,2)) > to_number(to_char(sysdate,'MM'))
            then 1
            else 0
          end
     투표자나이
from tbl_vote_0104 v;

select
    v.v_name 투표자이름,
    to_char(
        to_date(
            -- 맨앞이 0이면 1900년대 아니면 2000년대
            case
                when substr(v.v_jumin,1,1) = '0'
                then '20' || substr(v.v_jumin,1,6)
                else '19' || substr(v.v_jumin,1,6)
            end,
            'YYYYMMDD'
        ),
        'YYYY"년"MM"월"DD"일"'
    )투표자생년월일,
        to_number(to_char(sysdate,'YYYY'))
        - (1900 + to_number(substr(v.v_jumin,1,2))) --80이면 1980으로
        - case
            -- 주민번호 월이 더크면 - 1
            when to_number(substr(v.v_jumin,3,2)) > to_number(to_char(sysdate,'MM'))
            then 1
            else 0
          end
     투표자나이,
     case 
        when substr(v.v_jumin,7,1) = '1' then '남성'
        when substr(v.v_jumin,7,1) = '2' then '여성'
        else '기타'
    end 투표자성별,
    v.v_area 투표장,
    decode(v.v_confirm,'Y','확인') 유권자확인
from tbl_vote_0104 v;



-- 후보자득표수
-- 후보자번호, 후보자이름, 후보자득표수 조회
-- 후보자득표수는 유권자확인 y인것만 카운팅
select
    m.m_no 후보자번호,
    m.m_name 후보자이름,
    count(*) 후보자득표수
from tbl_vote_0104 v
join tbl_member_010 m
on v.v_num = m.m_no
where v.v_confirm = 'Y'
group by m.m_no, m.m_name
order by m.m_no;

-- 후보자 조회
-- 후보자번호, 후보이름, 후보자주민번호, 후보자학위, 당번호, 당전화번호
-- 후보자주민번호 예시는 651210-2908711
-- n_city값이 01,02,03,04일때 고졸,학사,석사,박사
select
    *
from tbl_member_010 m
join tbl_party_010 p
on m.p_no = p.p_no;

select
    m.m_no 후보자번호,
    m.m_name 후보자이름,
    m.p_no 당번호,
    p.p_tel || '-' || p.v_time || '-' || p.v_confirm 당전화번호
from tbl_member_010 m
join tbl_party_010 p
on m.p_no = p.p_no;

select
    m.m_no 후보자번호,
    m.m_name 후보자이름,
    substr(m.m_jumin,1,6) || '-' || substr(m.m_jumin,7) 후보자주민번호,
    case m.m_degree
        when '01' then '고졸'
        when '02' then '학사'
        when '03' then '석사'
        when '04' then '박사'
    end 후보자학위,
    m.p_no 당번호,
    p.p_tel || '-' || p.v_time || '-' || p.v_confirm 당전화번호
from tbl_member_010 m
join tbl_party_010 p
on m.p_no = p.p_no;
