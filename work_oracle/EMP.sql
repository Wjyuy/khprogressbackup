SELECT * FROM EMP;

SELECT *
  FROM TAB;

SELECT ENAME
     , SAL
     , COMM
     , TO_CHAR(SAL*12,'$999,999') "Y_SAL"
     , TO_CHAR(SAL*12+COMM,'$999,999') "TOTAL"
     , TO_CHAR((SAL*12+COMM)*1.05,'$999,999') "5%UP"
     , TO_CHAR((SAL*12+COMM)*0.95,'$999,999') "5%DOWN"
  FROM EMP
  WHERE COMM IS NOT NULL;

SELECT ENAME
     , JOB
     , REPLACE(JOB,SUBSTR(JOB,3,1),'?') "JOB?"
  FROM EMP
 WHERE DEPTNO=20;

SELECT DEPTNO
     , ROUND(AVG(NVL(SAL,0)),2) "AVG"
  FROM EMP 
 GROUP BY DEPTNO
HAVING AVG(NVL(SAL,0))>=2000;


--부서별 평균 급여
SELECT DEPTNO NO
     , AVG(NVL(SAL,0)) "AVG_SAL"
--      부서 3개에 대한 그룹 평균
  FROM EMP
--  GROUP BY 는 ALIAS가 안됨 
 GROUP BY DEPTNO
-- GROUP BY NO 
-- ORDER BY DEPTNO;
 ORDER BY NO;
 
--부서별 직업별 평균급여
SELECT DEPTNO NO
     , JOB
     , AVG(NVL(SAL,0)) "AVG_SAL"
  FROM EMP
 GROUP BY DEPTNO,JOB
 ORDER BY DEPTNO;
 
-- 12건에서 9건이 되었음

SELECT DEPTNO
     , JOB
     , SAL
  FROM EMP
  ORDER BY DEPTNO,JOB;

SELECT DEPTNO
     , AVG(NVL(SAL, 0)) "AVG"
  FROM EMP
--  그룹함수가 아닌 DEPTNO를 기준으로 그룹함수 AVG 출력
-- DEPTNO 기준으로 AVG 구함(?맞나?)
 GROUP BY DEPTNO;


SELECT COUNT(*)
  FROM EMP;

SELECT COUNT(COMM)
  FROM EMP;
  
SELECT COUNT(COMM)
     , MAX(SAL)
     , MIN(SAL)
     , MAX(HIREDATE)
     , MIN(HIREDATE)
     , STDDEV(SAL) "표준편차"
     , VARIANCE(SAL) "분산"
  FROM EMP;
  
SELECT COUNT(COMM)
     , SUM(COMM)
--     550
     , AVG(COMM)
--     183.3(NULL 자체도 건수로 치기 때문에 실무에서 많이 사용)
     , AVG(NVL(COMM,0))
  FROM EMP;

SELECT * FROM EMP;

SELECT EMPNO
     , ENAME
     , SAL
     , CASE WHEN SAL BETWEEN '1' AND '1000' THEN 'Level 1'
            WHEN SAL BETWEEN '1001' AND '2000' THEN 'Level 2'
            WHEN SAL BETWEEN '2001' AND '3000' THEN 'Level 3'
            WHEN SAL BETWEEN '3001' AND '4000' THEN 'Level 4'
            WHEN SAL >4000 THEN 'Level 5'
            END "LEVEL"
  FROM EMP
 ORDER BY SAL DESC;
 
SELECT ENAME
     , JOB
     , SUBSTR(JOB,3,2)
     , SUBSTR(JOB,6,2)
     , SUBSTR(JOB,4)  --4번째에서 끝까지 
     , SUBSTR(JOB,-3,2)  --뒤에서부터 3자리 2개
     , SUBSTR(JOB,-5,3)  --뒤에서부터 5번째 3개
  FROM EMP;

SELECT ENAME
     , JOB
     , CONCAT(ENAME,JOB)
 FROM EMP;

SELECT EMPNO
     , DEPTNO
     , INITCAP(ENAME)
     , LOWER(ENAME)
     , UPPER(ENAME)
     , LENGTH(ENAME)
     , LENGTHB(ENAME)
  FROM EMP;

SELECT ENAME
     , JOB
     , SAL
     , SAL * 12
  FROM EMP;

SELECT ENAME
       || ' 직업은'
       || JOB
       || '이고, 부서번호는 '
       || DEPTNO
       || '이다.'
  FROM EMP;

SELECT EMPNO  AS "사번"
     , ENAME  AS "사원명"
     , JOB    AS "직업"
     , DEPTNO AS "부서번호"
  FROM EMP;

SELECT DISTINCT DEPTNO
  FROM EMP;

SELECT EMPNO
     , ENAME
     , JOB
  FROM EMP;


SELECT ENAME
     , SAL
     , NVL(COMM,0) "COMM"
     , TO_CHAR((SAL*12)+NVL(COMM,0),'999,999') "TOTAL"
  FROM EMP
  WHERE DEPTNO=30;

SELECT ENAME
     , SAL
     , COMM
  FROM EMP
 WHERE(SAL>=1000 AND COMM>0)OR SAL>=3000;

SELECT ENAME
     , DEPTNO
     , SAL
     , SAL*12
  FROM EMP
 ORDER BY DEPTNO DESC
        , SAL*12;

SELECT ENAME
     , JOB
     , DEPTNO
  FROM EMP
 WHERE COMM IS NULL;

SELECT ENAME
     , JOB
     , EMPNO
  FROM EMP
 WHERE ENAME LIKE 'JA%';

SELECT ENAME
     , JOB
     , SAL
  FROM EMP
 WHERE SAL>=2000 AND SAL<=3000;

SELECT ENAME
     , DEPTNO
     , SAL
  FROM EMP
 WHERE DEPTNO=20 AND SAL>=1000;

SELECT ENAME
     , JOB
     , SAL
  FROM EMP
 WHERE SAL>2000
 ORDER BY SAL DESC;
 
SELECT *
  FROM EMP;

DESC EMP;