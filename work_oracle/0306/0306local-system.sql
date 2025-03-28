REVOKE CREATE TABLE FROM TEST;
REVOKE CREATE SESSION FROM TEST;

--동시에 권한 주기
GRANT CREATE SESSION,CREATE TABLE TO TEST;

GRANT CREATE TABLE TO TEST;

CREATE TABLE aaa
(no number(3)
,name VARCHAR2(10)
,birth DATE
);

GRANT CREATE SESSION TO TEST;

SELECT * FROM DBA_SYS_PRIVS WHERE GRANTEE='TEST';

create user test
IDENTIFIED by 1234
default tablespace storm
temporary tablespace temp
QUOTA unlimited on storm; 

alter tablespace storm add datafile 'C:\oraclexe\app\oracle\oradata\XE\app_data2.dbf'
size 50M;

alter database datafile 'C:\oraclexe\app\oracle\oradata\XE\app_data.dbf'
autoextend on next 100M maxsize unlimited;


CREATE TABLESPACE STORM
DATAFILE 'C:\oraclexe\app\oracle\oradata\XE\app_data.dbf'
size 100M autoextend on next 10M maxsize 500M
default storage
(
initial 10k
next 10k
MINEXTENTS 2
MAXEXTENTS 2
PCTINCREASE 50
);