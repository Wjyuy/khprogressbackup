SELECT * FROM PROFESSOR;
SELECT * FROM DEPARTMENT;

SELECT * FROM STUDENT;
SELECT * FROM DEPARTMENT;

SELECT DEPTNO1, MAX(HEIGHT) HEI,MAX(WEIGHT)WEI
       FROM STUDENT 
      GROUP BY DEPTNO1;
     
SELECT D.DNAME
     , S.HEI
     , S.WEI 
  FROM (SELECT DEPTNO1
             , MAX(HEIGHT)HEI
             , MAX(WEIGHT)WEI
          FROM STUDENT 
         GROUP BY DEPTNO1) S
      , DEPARTMENT D
 WHERE S.DEPTNO1=D.DEPTNO;

SELECT P.PROFNO
     , P.NAME
     , D.DNAME
  FROM PROFESSOR  P
     , DEPARTMENT D
 WHERE P.DEPTNO=D.DEPTNO;

CREATE OR REPLACE VIEW V_PROF_DEPT
AS
SELECT P.PROFNO
     , P.NAME
     , D.DNAME
  FROM PROFESSOR  P
     , DEPARTMENT D
 WHERE P.DEPTNO=D.DEPTNO;

SELECT * FROM V_PROF_DEPT;


SELECT DECODE(DEPTNO,NDEPTNO,NULL,DEPTNO) DEPTNO
     , PROFNO
     , NAME
    FROM(SELECT LAG(DEPTNO) OVER( ORDER BY DEPTNO ) NDEPTNO
               , DEPTNO
               , PROFNO
               , NAME
          FROM PROFESSOR 
        );
        
SELECT LAG(DEPTNO) OVER( ORDER BY DEPTNO ) NDEPTNO
      , DEPTNO
      , PROFNO
      , NAME
  FROM PROFESSOR ;

SELECT E1.DEPTNO
     , E2.PROFNO
     , E2.NAME
  FROM (SELECT decode(row_number() over(partition by DEPTNO order by PROFNO),1,deptno) DEPTNO
             , PROFNO
          FROM PROFESSOR
          GROUP BY DEPTNO,PROFNO
          ORDER BY DEPTNO) E1,PROFESSOR E2
         WHERE E1.DEPTNO=E2.DEPTNO;
  
SELECT decode(row_number() over(partition by DEPTNO order by PROFNO),1,deptno) DEPTNO
     , PROFNO
  FROM PROFESSOR
  GROUP BY DEPTNO,PROFNO
  ORDER BY DEPTNO;
  
SELECT E.DEPTNO, D.DNAME, E.SAL
FROM(SELECT DEPTNO
          , MAX(SAL) "SAL"
       FROM EMP 
      GROUP BY DEPTNO
     ) E, DEPT D
     WHERE E.DEPTNO=D.DEPTNO;

CREATE OR REPLACE VIEW V_EMP3 AS
    SELECT E.DEPTNO
         , D.DNAME
         , MAX(E.SAL) OVER(PARTITION BY E.SAL)
      FROM EMP  E
         , DEPT D
         GROUP BY E.DEPTNO,D.DNAME,E.SAL
         WHERE E.DEPTNO=D.DEPTNO;

SELECT * FROM EMP;
SELECT * FROM DEPT;

--INLINE VIEW(인라인 뷰)
--쿼리 결과를 테이블 형태로 받음 
SELECT E.DEPTNO, D.DNAME, E.SAL
FROM(SELECT DEPTNO
          , MAX(SAL) "SAL"
       FROM EMP 
      GROUP BY DEPTNO
     ) E, DEPT D
     WHERE E.DEPTNO=D.DEPTNO;

--SELECT E.DEPTNO
--     , D.DNAME
--     , MAX(E.SAL) "SAL"
--  FROM EMP  E
--     , DEPT D
-- WHERE E.DEPTNO=D.DEPTNO
-- GROUP BY E.DEPTNO
--        , D.DNAME
--        , E.SAL;