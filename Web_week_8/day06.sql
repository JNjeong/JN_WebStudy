SELECT * FROM EMPLOYEES E;
SELECT * FROM DEPARTMENTS D;

/* INNER JOIN QUIZ 풀기 */
--QUIZ #1 : 30번 부서의 사원들의 이름, 직업, 부서명을 조회
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "이름", E.JOB_ID, J.JOB_TITLE , D.DEPARTMENT_NAME FROM EMPLOYEES E 
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
INNER JOIN JOBS J ON E.JOB_ID = J.JOB_ID ;

--QUIZ #2 : 커미션을 받는 사원의 이름, 직업, 부서번호, 부서명을 조회
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "이름", E.JOB_ID , J.JOB_TITLE, E.DEPARTMENT_ID , D.DEPARTMENT_NAME FROM EMPLOYEES E
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
INNER JOIN JOBS J ON E.JOB_ID = J.JOB_ID  WHERE E.COMMISSION_PCT IS NOT NULL;

--QUIZ #3 : 지역번호 2500에서 근무하는 사원의 이름, 직업, 부서번호, 부서명을 조회
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "이름", E.JOB_ID , J.JOB_TITLE , E.DEPARTMENT_ID , D.DEPARTMENT_NAME FROM EMPLOYEES E
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
INNER JOIN JOBS J ON E.JOB_ID = J.JOB_ID WHERE D.LOCATION_ID = 2500;

--QUIZ #4 : 이름에 A가 들어가는 사원들의 이름과 부서이름을 조회 
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "이름", D.DEPARTMENT_NAME FROM EMPLOYEES E
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
WHERE E.FIRST_NAME LIKE ('%A%');

--QUIZ #5 : 사원이름과 그 사원의 관리자 이름을 출력하라
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "관리자명" ,E.MANAGER_ID , E2.FIRST_NAME || ' ' ||E2.LAST_NAME AS "사원명" FROM EMPLOYEES E
INNER JOIN EMPLOYEES E2 ON E.EMPLOYEE_ID = E2.MANAGER_ID ;

--QUIZ #6 : 급여가 3000에서 5000사이인 사원의 이름과 소속부서명을 조회
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "이름", D.DEPARTMENT_NAME FROM EMPLOYEES E
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID WHERE E.SALARY BETWEEN 3000 AND 5000;

--QUIZ #7 : 급여가 3000이하인 사원의 이름과 급여, 근무지를 조회 
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "이름", E.SALARY , L.CITY, C.COUNTRY_NAME , R.REGION_NAME FROM EMPLOYEES E
INNER JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
INNER JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID 
INNER JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID 
INNER JOIN REGIONS R ON C.REGION_ID = R.REGION_ID 
WHERE E.SALARY <= 3000;



/* 서브쿼리 */
SELECT ROUND(AVG(E.SALARY)) avgsalary FROM EMPLOYEES E;
SELECT E.EMPLOYEE_ID , E.FIRST_NAME , E.LAST_NAME FROM EMPLOYEES E WHERE E.SALARY < 6461.83;

--에러 : WHERE절에서는 집계함수 사용이 불가능
SELECT E.EMPLOYEE_ID , E.FIRST_NAME , E.LAST_NAME FROM EMPLOYEES E WHERE E.SALARY < ROUND(AVG(E.SALARY));

--서브쿼리 활용시
SELECT E.EMPLOYEE_ID , E.FIRST_NAME , E.LAST_NAME FROM EMPLOYEES E WHERE E.SALARY < (SELECT ROUND(AVG(SALARY)) FROM EMPLOYEES);


--두개의 테이블 서브쿼리화 
SELECT * FROM LOCATIONS L WHERE COUNTRY_ID = 'US';
SELECT * FROM DEPARTMENTS D WHERE LOCATION_ID IN (1400, 1500, 1600, 1700);
SELECT * FROM DEPARTMENTS D WHERE LOCATION_ID IN (SELECT LOCATION_ID FROM LOCATIONS L WHERE L.COUNTRY_ID='US');

--QUIZ : EMPLOYEES 테이블에서 Kochhar(LAST_NAME)의 급여보다 많은 사원의 정보를 사원번호, 이름, 담당업무, 급여를 조회
SELECT E.FIRST_NAME , E.LAST_NAME , E.JOB_ID , E.SALARY FROM EMPLOYEES E 
WHERE E.SALARY > (SELECT SALARY FROM EMPLOYEES E2 WHERE LAST_NAME = 'Kochhar');

--QUIZ : 월급이 가장 작은 사원의 성, 이름 조회
SELECT E.FIRST_NAME , E.LAST_NAME FROM EMPLOYEES E WHERE E.SALARY = (SELECT MIN(SALARY) FROM EMPLOYEES);

--QUIZ : 월급이 가장 많은 사원의 성, 이름, JOB_TITLE 조회
SELECT E.FIRST_NAME , E.LAST_NAME , J.JOB_TITLE FROM EMPLOYEES E
INNER JOIN JOBS J ON E.JOB_ID = J.JOB_ID 
WHERE E.SALARY = (SELECT MAX(SALARY) FROM EMPLOYEES);

--QUIZ : 평균 급여보다 많이 받는 사원들의 성, 이름, JOB_TITLE 조회
SELECT E.FIRST_NAME , E.LAST_NAME , J.JOB_TITLE FROM EMPLOYEES E
INNER JOIN JOBS J ON E.JOB_ID = J.JOB_ID 
WHERE E.SALARY > (SELECT AVG(E2.SALARY) FROM EMPLOYEES E2);


