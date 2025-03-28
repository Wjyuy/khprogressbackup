----------문제풀이------------------------
SELECT * FROM STUDENT;
SELECT * FROM DEPARTMENT;
SELECT * FROM PROFESSOR;
SELECT * FROM EMP2;
SELECT * FROM DEPT2;

--------11장 6-혼자---------------------------------------
SELECT * FROM EMP2;

SELECT NAME
,POSITION
,TO_CHAR(PAY, '$999,999,999') "SALARY"
FROM EMP2
WHERE PAY > (SELECT MIN(PAY)
                        FROM EMP2
                         WHERE POSITION= 'Section head')
ORDER BY 3 DESC;


SELECT MIN(PAY)
FROM EMP2
 WHERE POSITION= 'Section head';
 --49000000

--------11장 5----------------------------------------

SELECT * FROM EMP2;
SELECT * FROM DEPT2;

SELECT EMPNO
,NAME
,DEPTNO
FROM EMP2 
WHERE  DEPTNO IN (SELECT DCODE
                                FROM DEPT2
                                WHERE AREA = 'Pohang Main Office');
                                -- = 사용이 아니라 IN 사용 !!!!!!!!!!!
                                
SELECT DCODE
                                FROM DEPT2
                                WHERE AREA = 'Pohang Main Office';                                


-----------11장 4-------------------------------
SELECT NAME
,WEIGHT
FROM STUDENT 
WHERE WEIGHT > (SELECT AVG(WEIGHT)
                                    FROM STUDENT
                                    WHERE DEPTNO1= 201);
                                    
SELECT AVG(WEIGHT)
                                    FROM STUDENT
                                    WHERE DEPTNO1= 201;
                                    --67KG

-----------11장 3-------------------------------
SELECT P.NAME "PROF_NAME"
,TO_CHAR (P.HIREDATE, 'YYYY-MM-DD') "HIREDATE"
,D.DNAME "DEPT_NAME"
FROM PROFESSOR P, DEPARTMENT D
WHERE P.DEPTNO = D.DEPTNO
AND P.HIREDATE > (SELECT HIREDATE
                                    FROM PROFESSOR
                                    WHERE NAME = 'Meg Ryan');

-----------11장 2-강사님-------------------------------
SELECT S.NAME "STUD_NAME"
           , D.DNAME "DEPT_NAME"
FROM STUDENT S, DEPARTMENT D
WHERE S.DEPTNO1 = D.DEPTNO
AND S.DEPTNO1 = (SELECT DEPTNO1 
                            FROM STUDENT
                            WHERE NAME = 'Anthony Hopkins');
                            
                            
SELECT DEPTNO1 
                            FROM STUDENT
                            WHERE NAME = 'Anthony Hopkins';
                            --103번

-----------11장 2--------------------------------
SELECT S.NAME STUD_NAME
            , (SELECT DNAME
                FROM DEPARTMENT D
                WHERE S.DEPTNO1 = D.DEPTNO ) "DNAME"
FROM STUDENT S
WHERE S.NAME ='Anthony Hopkins';

