SELECT NO
     , IP
     , REGEXP_REPLACE(IP,'\.','/',1,3) "REPLACE1"
  FROM T_REG2;
  
SELECT NO
     , IP
     , REGEXP_REPLACE(IP,'\.','') "DOT REMOVE"
  FROM T_REG2;

SELECT TEXT
--     aa검색 3가지 방법
     , regexp_count(text,'aa') A
     , regexp_count(text,'a{2}') A
     , regexp_count(text,'(a)(a)') A
  FROM T_REG;

SELECT TEXT
--     점은 모든 문자
     , regexp_count(text,'.') DOT
--     LENGTH 랑 똑같다
     , length(text) DOT     
--     점의 갯수
     , regexp_count(text,'\.') DOT
  FROM T_REG;
  
  
SELECT TEXT
--     소문자 a 갯수
     , regexp_count(text,'a') c
     , regexp_count(text,'bc') c
     , regexp_count(text,'12') c
     , regexp_count(text,'c') c
--     5번째 위치에서부터 c의 갯수
     , regexp_count(text,'c',5) c
     , regexp_count(text,'c',1) c
--     대소문자 포함 (대소문자 구분 x)
     , regexp_count(text,'c',1,'i') c
  FROM T_REG;
  

SELECT TEXT
--숫자를 별표로
--     , REGEXP_REPLACE(TEXT,'[0-9]','*') r
     , REGEXP_REPLACE(TEXT,'[[:digit:]]','*') r
--대문자는 오류
--     , REGEXP_REPLACE(TEXT,'[[:DIGIT:]]','*') r
  FROM T_REG;

SELECT *
  FROM T_REG
-- WHERE REGEXP_LIKE(TEXT,'[a-z]$');
-- WHERE REGEXP_LIKE(TEXT,'[A-Z]$');
--숫자로 끝나는 행
-- WHERE REGEXP_LIKE(TEXT,'[0-9]$');
-- WHERE REGEXP_LIKE(TEXT,'^[^a-z]');
-- WHERE REGEXP_LIKE(TEXT,'^[^A-Z]');
--숫자로 시작하지 않는 행
-- WHERE REGEXP_LIKE(TEXT,'^[^0-9]');
--숫자와 소문자로 시작하지 않는 행
-- WHERE REGEXP_LIKE(TEXT,'^[^0-9a-z]');
--소문자로만 된 행 제외
-- WHERE REGEXP_LIKE(TEXT,'[^a-z]');
--소문자가 들어있는 행 제외
-- WHERE NOT REGEXP_LIKE(TEXT,'[a-z]');
--소문자 대문자 들어있는 행 제외
-- WHERE NOT REGEXP_LIKE(TEXT,'[a-zA-Z]');
--숫자 들어있는 행 제외
 WHERE NOT REGEXP_LIKE(TEXT,'[0-9]');
 



--*.정규식 (정규 표현식,Regular Expression) ->자바스크립트에서도 존재
--오라클 10G부터 지원(11G)

----대표함수
--REGEXP_LIKE
--REGEXP_REPLACE
--REGEXP_COUNT

SELECT *
  FROM T_REG
-- 알파벳 소문자  
-- WHERE REGEXP_LIKE(TEXT,'[a-z]');
-- 알파벳 대문자
-- WHERE REGEXP_LIKE(TEXT,'[A-Z]');
-- 알파벳 소문자, 대문자
-- WHERE REGEXP_LIKE(TEXT,'[a-zA-Z]');
-- 알파벳 소문자로 시작하고 뒤에 공백 
-- WHERE REGEXP_LIKE(TEXT,'[a-z] ');
-- 알파벳 소문자로 시작하고 뒤에 숫자
-- WHERE REGEXP_LIKE(TEXT,'[a-z][0-9]');
-- 알파벳 소문자로 시작하고 뒤에 공백 , 숫자
-- WHERE REGEXP_LIKE(TEXT,'[a-z] [0-9]');
-- 알파벳 소문자로 시작하고 뒤에 공백2개 , 숫자
-- WHERE REGEXP_LIKE(TEXT,'[a-z]  [0-9]');
-- 알파벳 소문자로 시작하고 뒤에 공백3개 , 숫자(없음)
-- WHERE REGEXP_LIKE(TEXT,'[a-z]   [0-9]');
-- 공백 있는 애들 
-- WHERE REGEXP_LIKE(TEXT,'[[:space:]]');
-- 대소문자 구분( 대문자 불가 )
-- WHERE REGEXP_LIKE(TEXT,'[[:SPACE:]]');
-- WHERE REGEXP_LIKE(TEXT,'[a-z]{1}');
-- WHERE REGEXP_LIKE(TEXT,'[a-z]{2}');
-- WHERE REGEXP_LIKE(TEXT,'[a-z]{3}');
-- 소문자가 연속으로 4자 이상
-- WHERE REGEXP_LIKE(TEXT,'[a-z]{4}');
-- 숫자가 연속으로 4자 이상
-- WHERE REGEXP_LIKE(TEXT,'[0-9]{4}');
-- WHERE REGEXP_LIKE(TEXT,'[0-9]{3}');
-- WHERE REGEXP_LIKE(TEXT,'[a-z][0-9]{1}');
-- 소문자 뒤에 숫자 2개 이상
-- WHERE REGEXP_LIKE(TEXT,'[a-z][0-9]{2}');
-- 첫 시작이 대문자나 소문자 
-- WHERE REGEXP_LIKE(TEXT,'^[A-Za-z]');
-- 첫 시작이 대문자나 숫자 
 WHERE REGEXP_LIKE(TEXT,'^[0-9A-Z]');


 