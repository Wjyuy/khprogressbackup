SELECT * FROM PROFESSOR;

SELECT POSITION
     , ROUND(AVG(PAY),2) "AVG"
  FROM PROFESSOR
 GROUP BY POSITION
 HAVING AVG(PAY) >= 300;

SELECT SUM(PAY) AS SUM
     , ROUND(AVG(PAY)) AS A 
     , MAX(PAY) AS X
     , MIN(PAY) AS N
     , ROUND(STDDEV(PAY),2) AS S
     , ROUND(VARIANCE(PAY),2) AS V
  FROM PROFESSOR;

SELECT NAME
     , PAY
     , CASE     WHEN PAY BETWEEN 1 AND 300 THEN 'GRADE1'
                WHEN PAY BETWEEN 301 AND 400 THEN 'GRADE2'
                WHEN PAY BETWEEN 401 AND 500 THEN 'GRADE3'
                WHEN PAY>500 THEN 'GRADE4'
       END "GRADE"
  FROM PROFESSOR
 ORDER BY PAY DESC;

SELECT NAME
     , HPAGE
     , DECODE((INSTR(HPAGE,'.')-INSTR(HPAGE,'/')),5
     , (REPLACE(HPAGE, SUBSTR(HPAGE,8,3),'STUDY'))
     , (REPLACE(HPAGE, SUBSTR(HPAGE,8,4),'STUDY'))
     ) "STUDY_HPAGE"
  FROM PROFESSOR
 WHERE HPAGE IS NOT NULL;

SELECT NAME
     , HPAGE
     , REPLACE(HPAGE,
        SUBSTR(HPAGE,
          INSTR(HPAGE,'/',1,2)+1
        , INSTR(HPAGE,'.')-INSTR(HPAGE,'/',1,2)-1)
     , 'study') "STUDY_HPAGE"
  FROM PROFESSOR
  WHERE HPAGE IS NOT NULL;

SELECT NAME
     , PAY
     , BONUS
  FROM PROFESSOR
 WHERE(PAY>=300 AND BONUS IS NULL) OR PAY>=500;

SELECT PROFNO
     , NAME
     , PAY
     , BONUS "보너스"
     , (PAY*12)+BONUS "총연봉"
     , DEPTNO
  FROM PROFESSOR
  WHERE BONUS IS NOT NULL
  ORDER BY DEPTNO DESC,총연봉;

SELECT NAME
     , ID
     , POSITION
  FROM PROFESSOR
  WHERE ID LIKE '%er';

SELECT NAME
     , PAY
     , HIREDATE
  FROM PROFESSOR
 WHERE PAY>=300 AND PAY<=500;

SELECT *
  FROM PROFESSOR;
SELECT PROFNO
     , NAME
     , SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1) "EMAIL_ID"
  FROM PROFESSOR
  WHERE EMAIL IS NOT NULL;

SELECT PROFNO
     , NAME
     , HPAGE
     , INSTR(HPAGE,'.',1,2) AS HTTP
  FROM PROFESSOR
  WHERE HPAGE IS NOT NULL;

SELECT UPPER(NAME) NAME 
     , LOWER(ID) ID
     , INITCAP(POSITION) POSITION
     , LENGTH(EMAIL) EMAIL_SIZE
  FROM PROFESSOR;

SELECT NAME
     , HPAGE
     , REPLACE(HPAGE,SUBSTR(HPAGE,INSTR(HPAGE,'.',-1)+1,2),'OK') "OK"
  FROM PROFESSOR
  WHERE HPAGE IS NOT NULL;
  
SELECT NAME
     , ID
     , HPAGE
  FROM PROFESSOR
 WHERE HPAGE IS NOT NULL AND DEPTNO=102;

SELECT NAME
     , PAY
     , BONUS
  FROM PROFESSOR
 WHERE BONUS>80
 ORDER BY PAY DESC;
 
SELECT NAME
     , PAY
     , BONUS
FROM PROFESSOR
WHERE ( PAY >= 300 AND BONUS IS NOT NULL ) OR ( PAY >= 450 );


SELECT NAME
     , PAY
     , BONUS
FROM PROFESSOR
WHERE PAY >= 300 AND BONUS IS NOT NULL;

SELECT profno   교수번호
     , NAME     이름
     , PAY      급여
     , PAY * 12 연봉
     , DEPTNO   학과번호
FROM PROFESSOR
ORDER BY DEPTNO DESC
       , PAY * 12;

SELECT profno
     , NAME
     , PAY
     , BONUS
FROM PROFESSOR
ORDER BY PAY DESC;

SELECT NAME
     , TO_CHAR(HIREDATE,'YYYY-MM-DD') HIREDATE
     , PAY
     , BONUS
     , TO_CHAR((PAY*12)+BONUS,'$999,999') "TOTAL"
     , TO_CHAR(((PAY*12)+BONUS)*0.9,'$999,999') "10%DOWN"
     , TO_CHAR((((PAY*12)+BONUS)*0.9)*1200,'999,999,999') "WON"
  FROM PROFESSOR
  WHERE BONUS IS NOT NULL;

SELECT NAME
     , HIREDATE
  FROM PROFESSOR
  WHERE TO_CHAR(HIREDATE,'MM')IN('03','08','10');
SELECT NAME
     , PAY
     , DEPTNO
FROM PROFESSOR
WHERE BONUS IS NULL;

SELECT NAME
     , PAY
     , PAY*12 Y_PAY
  FROM PROFESSOR;

SELECT NAME
       ||'교수의 이메일은 '
       ||EMAIL
       ||'이고, 홈페이지는 '
       ||HPAGE
       ||'이다.'
  FROM PROFESSOR;

SELECT PROFNO   교수번호
     , NAME     교수명
     , POSITION 위치
     , HPAGE    홈페이지
  FROM PROFESSOR;

SELECT DISTINCT DEPTNO
  FROM PROFESSOR;

SELECT NAME
     , ID
     , EMAIL
  FROM PROFESSOR;
  
SELECT *
FROM professor;

SELECT deptno
FROM PROFESSOR
WHERE profno IS NOT NULL AND DEPTNO2 IS NULL;