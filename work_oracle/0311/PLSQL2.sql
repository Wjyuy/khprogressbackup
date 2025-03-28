--PL/SQL--
--사원 연봉 구하는 함수(SELECT 쿼리로 RETURN. 아까는 조정하니까 UPDATE)
CREATE OR REPLACE FUNCTION GET_ANNUAL_SAL
    (V_EMPNO NUMBER) RETURN NUMBER IS V_SAL NUMBER;
BEGIN
    SELECT (SAL+NVL(COMM,0)) * 12 INTO V_SAL
        FROM EMP
        WHERE EMPNO= V_EMPNO;
        RETURN V_SAL;
END;