SELECT  '900' FROM DUAL;
SELECT  LPAD('900',4,0)  FROM DUAL;
SELECT  SUBSTR(LPAD('900',4,0)  ,1,2) || ':' || SUBSTR(LPAD('900',4,0)  ,3,2)
FROM DUAL;


SELECT  LPAD('900',4,0)  FROM DUAL;
SELECT  TO_DATE( LPAD('900',4,0)  , 'HH24MI' )  FROM DUAL;
SELECT  TO_CHAR (TO_DATE( LPAD('900',4,0)  , 'HH24MI' )  ,'HH24:MI' )  FROM DUAL;

-- 참가자 조회
-- 과목코드, 과목명, 학점, 담당강사, 요일, 시작시간, 종료시간, 관리 조회
select 
    c.s_id 과목코드,
    c.s_name 과목명,
    c.s_grade 학점,
    l.t_name 담당강사,
    decode(trim(c.weekday),
    'M', '월',
    'TU', '화',
    'W', '수',
    'TH', '목',
    'F', '금'
    ) 요일,
    substr(lpad(c.start_h,4,'0'),1,2) || ':' || substr(lpad(c.start_h,4,'0'),3,2) 시작시간,
    substr(lpad(c.end_h,4,'0'),1,2) || ':' || substr(lpad(c.end_h,4,'0'),3,2) 종료시간,
    '수정/삭제' 관리
from tbl_course_300 c
join tbl_lecturer_300 l
on c.teacher_id = l.t_id;