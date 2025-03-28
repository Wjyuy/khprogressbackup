SELECT REGEXP_REPLACE('aaa bbb','( ){2,}','*') star
--     공백 2개 이상이 별표로
     , REGEXP_REPLACE('aaa  bbb','( ){2,}','*') star
     , REGEXP_REPLACE('aaa   bbb','( ){2,}','*') star
  FROM DUAL;
  
SELECT REGEXP_REPLACE('aaa bb  c   d','( ){1}','') b
--     원 데이터랑 동일 
     , REGEXP_REPLACE('aaa bb  c   d','( ){1}',' ') b
--     공백 2개를 1개로
     , REGEXP_REPLACE('aaa bb  c   d','( ){2}',' ') b
--     공백 3개를 1개로
     , REGEXP_REPLACE('aaa bb  c   d','( ){3}',' ') b
--     공백 2개 이상을 제거
     , REGEXP_REPLACE('aaa bb  c   d','( ){2,}','') b
     , REGEXP_REPLACE('aaa bb  c   d','( ){3,}','') b
     , REGEXP_REPLACE('aaa bb  c   d','( ){1,}','') b
  FROM DUAL;  

SELECT REGEXP_REPLACE('aaa bb  c   d','( ){1}','') b
  FROM DUAL;


--CASE 변형
--DECODE 비슷한 CASE
--DECODE 는 오라클에서 있고, 성능을 위해서 CASE 이용
SELECT CASE
  WHEN '2'='1' THEN 'A' 
--                 WHEN '3'='1' THEN 'B' 
  WHEN '1'='1' THEN 'B'
  ELSE 'ETC'
       END "TEST"
  FROM DUAL;

SELECT CASE '4'
  WHEN '1' THEN 'A' --1이 1이면 A
  WHEN '2' THEN 'B' --2이면 B
  WHEN '3' THEN 'C' --3이면 C
--                 ELSE 'ETC' --ELSE : 생략 가능 (생략 시 NULL)
       END "TEST" --END 뒤에 칼럼명
  FROM DUAL;

SELECT CASE '2'
  WHEN '1' THEN 'A' --1이 1이면 A
  WHEN '2' THEN 'B' --2이면 B
  WHEN '3' THEN 'C' --3이면 C
  ELSE 'ETC' --그외 ETC
       END "TEST" --END 뒤에 칼럼명
  FROM DUAL;

SELECT 1
  FROM DUAL;

SELECT 'A-B-C-D'
     , 'A-B-C-D'
     , instr('A-B-C-D','-',1,3) -- 1번째 자리에서 3칸뒤위치 처음나오는'-' = 6
     , instr('A-B-C-D','-',3,1) -- 3번째 자리에서 처음으로나오는 '-'=4
     , instr('A-B-C-D','-',3)
     , instr('A-B-C-D','-')
     , instr('A-B-C-D','-',1,1)
     , instr('A-B-C-D','-',-1,3) --맨뒤에서(D)에서 시작해서 3번째나오는'-' =2
     , instr('A-B-C-D','-',-3,1) --C에서시작해서 제일먼저나오는 -
     , instr('A-B-C-D','-',-6,1) --'-'에서시작해서 제일먼저나오는 -(자기) =1
     , instr('A-B-C-D','-',-6,2) --없으면 0 
  FROM dual;


SELECT '서진수'
     , SUBSTR('서진수',1,2)
     , SUBSTRB('서진수',1,3)
  FROM DUAL;
  
  
SELECT '서진수'
     , LENGTH('서진수')
     , LENGTHB('서진수')
  FROM DUAL;

--DUAL : TEMP TABLE (임시 테이블)
SELECT SYSDATE
  FROM DUAL; --오늘 날짜
SELECT ABS(-352)
  FROM DUAL;
SELECT 1

--DUAL DECODE 사용

SELECT DECODE('A','B',1) D
--A가B면 1 아니면 2
, DECODE('A','B',1,2) D
--A가A면 1 아니면 2
, DECODE('A','A',1,2) D
-----------
--A가B면 1 아니면 C / A와 C가 맞으면 2 아니면 3
, DECODE('A','B',1,'C',2,3) D
--A가B면 1 아니면 C / A와 A가 맞으면 2 아니면 3
, DECODE('A','B',1,'A',2,3) D
--A가A면 1 아니면 C / A와 C가 맞으면 2 아니면 3
, DECODE('A','A',1,'C',2,3) D
-----------
--A가 B면 디코든데 디코드 값 말고 아닌거 없어서 널
, DECODE('A','B', DECODE('C','D',1) ) D
--A가 A면 디코든데 디코드가 틀려서 널
, DECODE('A','A', DECODE('C','D',1) ) D
--A가 A면 디코든데 디코드가 맞아서 1
, DECODE('A','A', DECODE('C','C',1) ) D
--------
, DECODE('A','A', DECODE('C','D','1','2') ) D
--A가 A면 디코든데 디코드가 C가 D면 1 아니면 2
, DECODE('A','B', DECODE('C','D',1) ,3) D
--A가 B면 디코드 아니면 3
--, DECODE('A','A', DECODE('C','C',1) ) D


   FROM  DUAL;
   