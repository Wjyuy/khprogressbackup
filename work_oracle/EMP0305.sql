SELECT * FROM EMP;

SELECT EMPNO
     , ENAME
     , SAL
     , DEPTNO
     , JOB
     , RANK() OVER(PARTITION BY DEPTNO,JOB ORDER BY SAL DESC) "RANK"
  FROM EMP;

SELECT EMPNO
     , ENAME
     , SAL
     , DEPTNO
     , RANK() OVER(PARTITION BY DEPTNO ORDER BY SAL DESC) "RANK"
  FROM EMP;

SELECT EMPNO
     , ENAME
     , SAL
--     , RANK() OVER(ORDER BY SAL)"RAN_ASC"
     , RANK() OVER(ORDER BY SAL DESC)"SAL_DESC"
--     DENSE 는 동점자 있을때 그 다음이 건너뛰지않고 9 9 10 11 카운팅
     , DENSE_RANK() OVER(ORDER BY SAL DESC)"SAL DANSE"
--     ROW_NUMBER() : 실무제일많이씀 중복없이 순위를 매김
     , ROW_NUMBER() OVER(ORDER BY SAL DESC)"SAL ROW NUMBER"
  FROM EMP;

--10
SELECT ENAME
  FROM EMP
 ORDER BY ENAME;
 
--스미스의 순위
SELECT RANK('SMITH') WITHIN GROUP(ORDER BY ENAME) "R"
  FROM EMP;

--SELECT RANK('SMITH') WITHIN GROUP(ORDER BY HIREDATE) "오류"
--  FROM EMP;

SELECT ENAME
     , HIREDATE
--     LEAD : 뒤에 숫자 = 위치 , 뒤에 숫자 =  없을 때 출력 
     , LEAD(SAL,1,0) OVER(ORDER BY HIREDATE) "L"
     , LEAD(SAL,2,0) OVER(ORDER BY HIREDATE) "L"
     , LEAD(SAL,2) OVER(ORDER BY HIREDATE) "L"
     , LEAD(SAL) OVER(ORDER BY HIREDATE) "L" --,1 생략과 동일 
     , LEAD(SAL,1) OVER(ORDER BY HIREDATE) "L"
  FROM EMP;
  
SELECT ENAME
     , HIREDATE
--     LAG : 앞에 숫자 = 위치 , 뒤에 숫자 =  없을 때 출력 
     , LAG(SAL,1,0) OVER(ORDER BY HIREDATE) "L"
     , LAG(SAL,2,0) OVER(ORDER BY HIREDATE) "L"
     , LAG(SAL,2) OVER(ORDER BY HIREDATE) "L"
     , LAG(SAL) OVER(ORDER BY HIREDATE) "L" --,1 생략과 동일 
     , LAG(SAL,1) OVER(ORDER BY HIREDATE) "L"
  FROM EMP;