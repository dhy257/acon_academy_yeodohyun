-- 코트예약----------------------------------------------------------------------
-- 예약번호, 고객번호, 예약일자, 코트번호 넣고 등록함
insert into tbl_resv_202301 (resv_no, cust_no, resv_date, court_no)
values (
    '&예약번호',
    '&고객번호',
    '&예약일자',
    '&코트번호'
);
select * from tbl_resv_202301;

-- 코트예약조회 - 고객번호로 조회--------------------------------------------------
select 
    r.resv_no 예약번호,
    c.cust_name 이름,
    r.resv_date "코트 사용 일자",
    r.court_no 코트번호
from tbl_resv_202301 r
left join tbl_cust_202301 c
on c.cust_no = r.cust_no
where r.cust_no = '&검색고객번호';

select 
    r.resv_no 예약번호,
    c.cust_name 이름,
    substr(r.resv_date,1,4) || '년' || -- 앞에 4글자 년도 + 년
    substr(r.resv_date,5,2) || '월' || -- 중간 2글자 월 + 월
    substr(r.resv_date,7,2) || '일' "코트 사용 일자", -- 마지막 2글자 일수 + 일
    r.court_no 코트번호
from tbl_resv_202301 r
join tbl_cust_202301 c
on c.cust_no = r.cust_no
where r.cust_no = '&검색고객번호';

-- 고객별 사용일수 조회-----------------------------------------------------------
-- 고객번호, 이름, 사용일수 조회
select *
from tbl_cust_202301 c
join tbl_resv_202301 r
on c.cust_no = r.cust_no;

select
    c.cust_no 고객번호,
    c.cust_name 이름,
    count(distinct r.resv_date) 사용일수
from tbl_cust_202301 c
join tbl_resv_202301 r
on c.cust_no = r.cust_no
group by c.cust_no, c.cust_name
order by c.cust_no;
