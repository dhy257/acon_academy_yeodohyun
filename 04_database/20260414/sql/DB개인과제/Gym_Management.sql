

///////////////////////////


-- 트레이너
CREATE TABLE Trainer(
    trainer_id VARCHAR2(10) PRIMARY KEY,
    name VARCHAR2(10),
    Date_of_employment DATE,
    Personal_History DATE DEFAULT SYSDATE
);

-- 회원
CREATE TABLE Gym_Member(
    member_id VARCHAR2(10) PRIMARY KEY,
    trainer_id VARCHAR2(10),
    name VARCHAR2(10),
    age DATE,
    Registration_date DATE DEFAULT SYSDATE,
    FOREIGN KEY(trainer_id) REFERENCES Trainer(trainer_id)
);

-- 운동
CREATE TABLE Exercise(
    Exercise_id VARCHAR2(10) PRIMARY KEY, 
    Exercise_name VARCHAR2(50),
    Target VARCHAR2(10),
    Difficulty_Level VARCHAR2(10),
    Equipment_needed VARCHAR2(50)
);

-- 운동기록
CREATE TABLE Workout_Log(
    Workout_id VARCHAR2(30) PRIMARY KEY,
    member_id VARCHAR2(10),     
    trainer_id VARCHAR2(10),
    Exercise_id VARCHAR2(10),
    Sets NUMBER(2),
    Reps NUMBER(2),
    Weight NUMBER(3),
    Exercise_date DATE DEFAULT SYSDATE,
    
    FOREIGN KEY(member_id) REFERENCES Gym_Member(member_id),
    FOREIGN KEY(trainer_id) REFERENCES Trainer(trainer_id),
    FOREIGN KEY(Exercise_id) REFERENCES Exercise(Exercise_id)
);

////

INSERT INTO Trainer VALUES ('T0001', 'Rex', DATE '2018-04-10', DEFAULT);
INSERT INTO Trainer VALUES ('T0002', 'Arnold', DATE '2002-03-15', DEFAULT);
INSERT INTO Trainer VALUES ('T0003', 'Titan', DATE '2020-11-21', DEFAULT);
COMMIT;

////

INSERT INTO GYM_MEMBER(member_id, name, age)
VALUES ('M0001', 'Jack', DATE '2001-11-21');

INSERT INTO GYM_MEMBER(member_id, name, age)
VALUES ('M0002', 'Ryan', DATE '1996-05-25');

INSERT INTO GYM_MEMBER(member_id, name, age)
VALUES ('M0003', 'Luna', DATE '1997-09-29');

INSERT INTO GYM_MEMBER(member_id, name, age)
VALUES ('M0004', 'Grace', DATE '2003-04-13');

COMMIT;

////

INSERT INTO EXERCISE VALUES ('C001', '벤치프레스', '가슴', '상', '벤치프레스 렉 or 스미스 머신');
INSERT INTO EXERCISE VALUES ('C002', '펙덱플라이', '가슴', '하', '플라이머신 or 케이블');

INSERT INTO EXERCISE VALUES ('B001', '랫풀다운', '등', '하', '랫풀다운 머신');
INSERT INTO EXERCISE VALUES ('B002', '바벨로우', '등', '상', '렉 or 스미스머신');

INSERT INTO EXERCISE VALUES ('S001', '숄더프레스', '어깨', '중', '숄더프레스 머신 or 덤벨');
INSERT INTO EXERCISE VALUES ('S002', '사이드레터럴레이즈', '어깨', '하', '덤벨 or 머신');

INSERT INTO EXERCISE VALUES ('A001', '바벨컬', '이두', '중', '바벨');
INSERT INTO EXERCISE VALUES ('A002', '케이블 푸쉬다운', '삼두', '하', '케이블');

INSERT INTO EXERCISE VALUES ('L001', '스쿼트', '하체', '상', '렉 or 스미스 머신');
INSERT INTO EXERCISE VALUES ('L002', '레그 익스텐션', '하체', '하', '익스텐션 머신');

COMMIT;

////

UPDATE GYM_MEMBER SET TRAINER_ID = 'T0001' WHERE MEMBER_ID = 'M0001';
UPDATE GYM_MEMBER SET TRAINER_ID = 'T0001' WHERE MEMBER_ID = 'M0002';
UPDATE GYM_MEMBER SET TRAINER_ID = 'T0002' WHERE MEMBER_ID = 'M0003';
UPDATE GYM_MEMBER SET TRAINER_ID = 'T0003' WHERE MEMBER_ID = 'M0004';

COMMIT;

////

INSERT INTO Workout_Log
VALUES ('Ex01', 'M0001', 'T0001', 'L001', 3, 12, 100, DEFAULT);

INSERT INTO Workout_Log
VALUES ('Ex02', 'M0001', 'T0001', 'L002', 4, 15, 280, DEFAULT);

INSERT INTO Workout_Log
VALUES ('Ex03', 'M0002', 'T0001', 'A001', 3, 12, 20, DEFAULT);

INSERT INTO Workout_Log
VALUES ('Ex04', 'M0002', 'T0001', 'A002', 3, 15, 40, DEFAULT);

COMMIT;

////

SELECT MEMBER_ID AS 회원ID, NAME AS 이름,
TRUNC(MONTHS_BETWEEN(SYSDATE, AGE) / 12) || '살' AS 나이,
TO_CHAR(Registration_Date, 'yyyy-mm-dd') AS 등록일자,
TRAINER_ID
FROM GYM_MEMBER;

SELECT W.Workout_id, W.Exercise_date AS 운동날짜,
M.name AS 회원이름, T.name AS 트레이너이름,
E.Exercise_name AS 운동이름,
W.Sets, W.Reps,
W.Weight || 'kg' AS 중량
FROM Workout_Log W
JOIN GYM_Member M ON W.member_id = M.member_id
JOIN Trainer T ON W.Trainer_id = T.Trainer_id
JOIN Exercise E ON W.Exercise_id = E.Exercise_id;

////

CREATE TABLE Equipment(
    equipment_id VARCHAR2(10) PRIMARY KEY,
    equipment_name VARCHAR2(50),
    usage_count NUMBER DEFAULT 0,
    cleaned_yn CHAR(1) DEFAULT 'N'
);


//// 

-- equipment_id 추가
ALTER TABLE Exercise ADD equipment_id VARCHAR2(10);

ALTER TABLE Exercise
ADD FOREIGN KEY (equipment_id)
REFERENCES Equipment(equipment_id);

////
-- 운동기구 추가
INSERT INTO Equipment VALUES ('E001', '벤치프레스 렉', 0, 'N');
INSERT INTO Equipment VALUES ('E002', '스미스 머신', 0, 'N');
INSERT INTO Equipment VALUES ('E003', '랫풀다운 머신', 0, 'N');
INSERT INTO Equipment VALUES ('E004', '덤벨', 0, 'N');
INSERT INTO Equipment VALUES ('E005', '케이블 머신', 0, 'N');
INSERT INTO Equipment VALUES ('E006', '익스텐션 머신', 0, 'N');

COMMIT;

////
-- 운동, 운동기구 연결
UPDATE Exercise 
SET equipment_id = 'E001',
    Equipment_needed = '벤치프레스 렉'
WHERE Exercise_id = 'C001';

UPDATE Exercise 
SET equipment_id = 'E005',
    Equipment_needed = '케이블 머신'
WHERE Exercise_id = 'C002';

UPDATE Exercise 
SET equipment_id = 'E003',
    Equipment_needed = '랫풀다운 머신'
WHERE Exercise_id = 'B001';

UPDATE Exercise 
SET equipment_id = 'E002',
    Equipment_needed = '스미스 머신'
WHERE Exercise_id = 'B002';

UPDATE Exercise 
SET equipment_id = 'E004',
    Equipment_needed = '덤벨'
WHERE Exercise_id = 'S001';

UPDATE Exercise 
SET equipment_id = 'E004',
    Equipment_needed = '덤벨'
WHERE Exercise_id = 'S002';

UPDATE Exercise 
SET equipment_id = 'E004',
    Equipment_needed = '바벨'
WHERE Exercise_id = 'A001';

UPDATE Exercise 
SET equipment_id = 'E005',
    Equipment_needed = '케이블 머신'
WHERE Exercise_id = 'A002';

UPDATE Exercise 
SET equipment_id = 'E002',
    Equipment_needed = '스미스 머신'
WHERE Exercise_id = 'L001';

UPDATE Exercise 
SET equipment_id = 'E006',
    Equipment_needed = '익스텐션 머신'
WHERE Exercise_id = 'L002';

COMMIT;

////
-- 기준값 50회
SELECT equipment_name,
       usage_count,
       cleaned_yn,
       CASE 
           WHEN usage_count >= 50 THEN '청소 필요'
           ELSE '사용 가능'
       END AS 상태
FROM Equipment;

////
-- 운동하면 사용횟수 늘어나게
-- log에서 운동기록 가져오고
-- exercise랑 동일한 운동찾고 equipment_id 가져옴
-- count로 횟수 세고( 없을 수도 잇으니 nvl ) 저장
UPDATE Equipment EQ
SET usage_count = NVL((
    SELECT COUNT(*)
    FROM Exercise E
    JOIN Workout_Log W
    ON E.Exercise_id = W.Exercise_id
    WHERE E.equipment_id = EQ.equipment_id
), 0);

////
SELECT E.Exercise_name AS 운동이름,
       E.Equipment_needed AS 설명장비,
       EQ.equipment_name AS 실제장비,
       EQ.usage_count,
       CASE 
           WHEN EQ.usage_count >= 50 THEN '청소 필요'
           ELSE '정상'
       END 상태
FROM Exercise E
JOIN Equipment EQ
ON E.equipment_id = EQ.equipment_id;

////

desc Equipment;
desc Exercise;
desc Workout_Log;


//////////////////

CREATE OR REPLACE TRIGGER trg_equipment_usage -- 트리거이름
AFTER INSERT ON Workout_Log -- log에 데이터가 추가되면 insert끝나고 실행
FOR EACH ROW -- insert당 한 번 실행
BEGIN
    UPDATE Equipment
    SET usage_count = usage_count + 1
    WHERE equipment_id = (
        SELECT equipment_id
        FROM Exercise
        WHERE Exercise_id = :NEW.Exercise_id -- 방금 추가된 최근 운동 아이디
    );
END;
/

-- 테스트용
INSERT INTO Workout_Log
VALUES ('Ex05', 'M0001', 'T0001', 'L001', 3, 12, 100, SYSDATE);
INSERT INTO Workout_Log VALUES ('Ex06', 'M0002', 'T0002', 'L001', 3, 10, 110, SYSDATE);
INSERT INTO Workout_Log VALUES ('Ex07', 'M0003', 'T0001', 'B002', 4, 8, 60, SYSDATE);

SELECT equipment_id, equipment_name, usage_count
FROM Equipment;