--개발자를 위한 HELP FUNCTION (도움말)
--ex> 프로시져 ,함수 이름을 검색하면 알려줌 
CREATE OR REPLACE FUNCTION help(v_module VARCHAR2)
    RETURN VARCHAR2 IS v_usage VARCHAR2(100);
BEGIN
    V_USAGE := v_module || '는(은) 등록되지 않은 모듈 입니다. ';
    IF upper(v_module) = 'ADJUST_SAL' THEN
        v_usage := '종류 : proc, 사용법 :EXEC ADJUST_SAL(INCREASE\DECREASE,사번,증감율)';
    ELSIF upper(v_module) = 'GET_ANNUAL_SAL' THEN
        v_usage := '종류 : func, 사용법 :GET_ANNUAL_SAL(사번)';
    ELSIF upper(v_module) = 'GET_RETIRE_MONEY' THEN
        v_usage := '종류 : func, 사용법 :GET_RETIRE_MONEY(사번)';
    ELSIF upper(v_module) = 'REMOVE_EMP' THEN
        v_usage := '종류 : proc, 사용법 :REMOVE_EMP(사번)';
    ELSIF upper(v_module) = 'GET_HIREDATE' THEN
        v_usage := '종류 : func, 사용법 :GET_HIREDATE(사번,형식)';
    end if;
    return v_usage;
END;