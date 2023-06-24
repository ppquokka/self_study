/*     23.06.16(금)
programmers MySQL CodingTest 연습
Lv.1   4번.어린 동물 찾기 (select)
*/
SELECT ANIMAL_ID, NAME               -- column 선택
FROM ANIMAL_INS                      -- table 선택
WHERE NOT INTAKE_CONDITION = 'AGED'
ORDER BY ANIMAL_ID                   -- 정렬 기준 선택
;



/*Lv.1   5번.이름이 없는 동물의 아이디 */
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME is NULL            -- = 가 아니라 is
ORDER BY ANIMAL_ID
;
-- ASC, ORDER BY는 기본으로: 오름차순  /  DESC: 내림차순



/*Lv.1  7번.여러 기준으로 정렬하기*/
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC, DATETIME DESC
;



/*Lv.1  .상위 n개 레코드*/
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME ASC 
LIMIT 1          
;
 -- SQL selet top. 맨 위 1개만 보고싶다!!



 /*Lv.1  이름이 있는 동물의 아이디*/
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID ASC 
;
 -- 이름이 있는 동물의 ID는 not null이어야 한다


 /*(23.06.24)
  Lv.1  최댓값 구하기(SUM, MAX, MIN)*/
SELECT DATETIME
FROM ANIMAL_INS
ORDER BY DATETIME DESC
LIMIT 1;

SELECT MAX(DATETIME) AS 시간
FROM ANIMAL_INS
;
 -- 한 문제에 풀이는 여러개. 그래도 짧은게 좋지!


 /*Lv.1  최솟값 구하기(SUM, MAX, MIN)*/
SELECT MIN(DATETIME) AS 시간
FROM ANIMAL_INS
;

SELECT DATETIME AS 시간
FROM ANIMAL_INS
ORDER BY DATETIME ASC
LIMIT 1
;
-- 내가 작성 할 수 있는 방법으로 다 해보기


/*Lv.1  동물 수 구하기(SUM, MAX, MIN)*/
SELECT COUNT(ANIMAL_ID)
FROM ANIMAL_INS
;


/*Lv.1  중복 제거하기(SUM, MAX, MIN)*/
SELECT COUNT(DISTINCT NAME) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
;
-- 중복 제거: DISTINCT
-- Inside the table, a column often contains many duplicate values;
--  and sometimes you only want to list the different (distinct) values.
-- SELECT DISTINCT column1, column2, ...
-- FROM table_name;


