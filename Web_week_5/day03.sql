/* 확인용 */
SELECT * FROM EMPLOYEES;

/* IS NULL */
SELECT * FROM EMPLOYEES WHERE MANAGER_ID IS NULL;


/* 논리연산자 */
SELECT * FROM EMPLOYEES WHERE SALARY > 4000 AND JOB_ID = 'IT_PROG';

/* QUICK QUIZ */
--EMPLOYEES에서 SALARY 3000이상 이고, JOB_ID가 'IT_PROG'이거나 FI_ACCOUNT 를 출력
SELECT * FROM EMPLOYEES WHERE SALARY >= 3000 AND JOB_ID = 'IT_PROG' OR JOB_ID = 'FI_ACCOUNT';

SELECT * FROM EMPLOYEES WHERE JOB_ID = 'IT_PROG'; --확인용
SELECT * FROM EMPLOYEES WHERE JOB_ID = 'FI_ACCOUNT'; --확인용

SELECT * FROM EMPLOYEES WHERE SALARY >= 7000 AND JOB_ID = 'IT_PROG' OR JOB_ID = 'FI_ACCOUNT';
SELECT * FROM EMPLOYEES WHERE SALARY >= 7000 AND JOB_ID = 'FI_ACCOUNT' OR JOB_ID = 'IT_PROG';
SELECT * FROM EMPLOYEES WHERE SALARY >= 7000 AND (JOB_ID = 'FI_ACCOUNT' OR JOB_ID = 'IT_PROG');



/* QUICK QUIZ */
--EMPLOYEES에서 JOB_ID가 'IT_PROG'/ 'FI_ACCOUNT'가 아닌 직원 출력
SELECT * FROM EMPLOYEES WHERE NOT (JOB_ID = 'IT_PROG' OR JOB_ID = 'FI_ACCOUNT');

--위와 동일한 기능
SELECT DISTINCT JOB_ID FROM EMPLOYEES WHERE NOT JOB_ID = 'IT_PROG' AND NOT JOB_ID = 'FI_ACCOUNT';

--NOT 과 AND/OR 논리 연산자 사용시 주의하자. 아래는 오류케이스
SELECT DISTINCT JOB_ID FROM EMPLOYEES WHERE NOT JOB_ID = 'IT_PROG' OR NOT JOB_ID = 'FI_ACCOUNT';



/* 문자열 함수 */
SELECT LAST_NAME, LOWER(LAST_NAME), UPPER(LAST_NAME), EMAIL, LOWER(EMAIL) FROM EMPLOYEES;

SELECT JOB_ID, SUBSTR(JOB_ID, 1, 2) FROM EMPLOYEES;


