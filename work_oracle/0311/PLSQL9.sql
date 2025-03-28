
create or replace PACKAGE BODY emp_mgmt AS
    --사원 급여 조정 프로시져
    PROCEDURE ADJUST_SAL
        (V_FLAG VARCHAR2, V_EMPNO NUMBER, V_PCT NUMBER) AS
    BEGIN
        IF V_FLAG = 'INCREASE' THEN 
            UPDATE EMP SET SAL=SAL+(SAL*(V_PCT/100))
                WHERE EMPNO = V_EMPNO;
        ELSE
            UPDATE EMP SET SAL=SAL-(SAL*(V_PCT/100))
                WHERE EMPNO = V_EMPNO;
        END IF;
    END;
    
    --사원 연봉 구하는 함수(SELECT 쿼리로 RETURN. 아까는 조정하니까 UPDATE)
    FUNCTION GET_ANNUAL_SAL
        (V_EMPNO NUMBER) RETURN NUMBER IS V_SAL NUMBER;
    BEGIN
        SELECT (SAL+NVL(COMM,0)) * 12 INTO V_SAL
            FROM EMP
            WHERE EMPNO= V_EMPNO;
            RETURN V_SAL;
    END;
    
    --사원 퇴직급여 구하는 함수
    FUNCTION GET_RETIRE_MONEY
        (V_EMPNO NUMBER) RETURN NUMBER IS V_SAL NUMBER;
    BEGIN
        SELECT ROUND((SAL+NVL(COMM,0)) * ROUND(MONTHS_BETWEEN(SYSDATE,HIREDATE),0)/12,0) INTO V_SAL
            FROM EMP
            WHERE EMPNO= V_EMPNO;
            RETURN V_SAL;
    END;
    
        --사원 정보 삭제 프로시져
    PROCEDURE REMOVE_EMP
        (V_EMPNO NUMBER) AS
    BEGIN
        DELETE FROM EMP
         WHERE EMPNO = V_EMPNO;
    END;

        --사원 입사일자 구하는 함수 ( EX.2025-03-11 ) VARCHAR2 필요하다
    FUNCTION GET_HIREDATE
        (V_EMPNO NUMBER,V_FMT VARCHAR2) RETURN VARCHAR2 IS V_HIREDATE VARCHAR2(20);
    BEGIN
        SELECT TO_CHAR(HIREDATE,V_FMT)
          INTO V_HIREDATE
          FROM EMP
         WHERE EMPNO= V_EMPNO;
        RETURN V_HIREDATE;
    END;
    
END;