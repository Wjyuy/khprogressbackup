alter table new_emp2
DROP COLUMN BIRTH;

alter table new_emp2
MODIFY(EMPNO NUMBER(7));

desc new_emp2;

ALTER table new_emp2
rename COLUMN BIRTHDAY to BIRTH;

SELECT * FROM new_emp2;

CREATE TABLE new_emp3
AS
SELECT * FROM new_emp2
where 1=2;

SELECT * FROM new_emp3;

ALTER TABLE new_emp2
ADD(BIRTHDAY DATE DEFAULT SYSDATE);

CREATE TABLE new_emp2
AS
SELECT EMPNO,ENAME,HIREDATE FROM EMP;

SELECT * FROM new_emp2;

CREATE TABLE new_emp
(NO NUMBER(5)
,NAME VARCHAR2(20)
,HIREDATE DATE
,BONUS NUMBER(6,2)
);
--INSERT INTO new_emp(NO) VALUES('NUMBER(5)');

SELECT * FROM DEPT7;
ALTER TABLE DEPT7
DROP COLUMN location;

ALTER TABLE DEPT7
MODIFY(loc VARCHAR2(20));

DESC DEPT7;

SELECT * FROM DEPT7;

rename DEPT6 TO DEPT7;

ALTER TABLE DEPT6
RENAME COLUMN location2 TO loc;

ALTER TABLE DEPT6
ADD(location2 VARCHAR2(10) default 'seoul');

ALTER TABLE DEPT6
ADD(location VARCHAR2(10));

SELECT * FROM DEPT6;
SELECT * FROM DEPT7;
--데이터 골라서 복사 
CREATE TABLE DEPT6
AS
SELECT DCODE,DNAME FROM DEPT2
WHERE DCODE IN(1000,1001,1002);

SELECT * FROM DEPT5;
--테이블 구조만 복사(데이터 제외)
CREATE TABLE DEPT5
AS
SELECT * FROM DEPT2
WHERE 1=2; --거짓을 넣어서 데이터는 안 들어간다 

SELECT * FROM DEPT4;
--컬럼 골라서 복사
CREATE TABLE DEPT4
AS
SELECT DCODE,DNAME FROM DEPT2;
--IF > 1천3백만건 백업 용량 부담 ?

--컬럼 통째로 복사
--13건
CREATE TABLE DEPT3
AS
SELECT * FROM DEPT2;

SELECT * FROM DEPT2;
SELECT * FROM DEPT3;

--모델링 : 체계가 없는 회사는 모델링 1개로 퉁(모델링 X-> 개판)
--체계가 있는 회사는 모델링 2개(논리,물리)
--논리: 한글 작명 (가독성 좋다)
--물리: 영문 작명 (호환성 좋다)

SELECT * FROM 한글테이블;
CREATE TABLE 한글테이블(
컬럼1 NUMBER
,컬럼2 VARCHAR2(10)
,컬럼3 DATE 
);

INSERT INTO TT_02(NO) VALUES(1);
INSERT INTO TT_02(NAME) VALUES('홍길동');

COMMIT;
ROLLBACK;
SELECT * FROM TT_02;
SELECT * FROM NEW_TABLE;

CREATE TABLE TT_02(
NO NUMBER (3,1) DEFAULT 0 -- 소수점 1자리, 전체 3자리 (정수2자리)
,NAME VARCHAR2(10) DEFAULT 'NO NAME'--10자 이하(3바이트 한글 3자 들어감)
,HIREDATE DATE DEFAULT SYSDATE
);

INSERT INTO NEW_TABLE(NO) VALUES(1);
CREATE TABLE NEW_TABLE(
NO NUMBER (3) -- 0~999까지 (0~3까지 아님)
,NAME VARCHAR2(10) --10자 이하(3바이트 한글 3자 들어감)
,BIRTH DATE
);

SELECT * FROM TT_02;
SELECT * FROM NEW_TABLE;