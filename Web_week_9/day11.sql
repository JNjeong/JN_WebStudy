/* INDEX */
CREATE TABLE EMPLOYEES4 AS SELECT * FROM EMPLOYEES;

SELECT ROWID, EMPLOYEE_ID FROM EMPLOYEES4 WHERE EMPLOYEE_ID = 200;

--새로운 행 추가
INSERT INTO EMPLOYEES4 (EMPLOYEE_ID, FIRST_NAME, LAST_NAME) VALUES(100, 'Steven', 'King');

--유니크 인덱스 생성
CREATE UNIQUE INDEX IDX_EMPLOYEE3_ID ON EMPLOYEES4(EMPLOYEE_ID);

DELETE FROM EMPLOYEES4 e WHERE FIRST_NAME = 'Steven' AND EMAIL IS NULL;

--인덱스 생성
CREATE INDEX IDX_EMPLOYEE4_ID ON EMPLOYEES4(FIRST_NAME);