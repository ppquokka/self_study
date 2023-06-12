/*     23.06.12(월)
programmers MySQL CodingTest 연습
Lv.1   1번.모든 레코드 조회하기
*/
SELECT ANIMAL_INS.*     -- column 선택
FROM ANIMAL_INS         -- table 선택
ORDER BY ANIMAL_ID;     -- 정렬 기준 선택


/*
Lv.1   2번.역순 정렬하기 
*/
SELECT NAME, DATETIME      -- 뽑을 COLUMN 선택 
FROM ANIMAL_INS            -- table 선택 
ORDER BY ANIMAL_ID DESC;   -- 정렬 기준 선택 DESC: 역순으로 정렬할 때 붙인다


/*
Lv.1   3번.아픈 동물 찾기
*/
SELECT ANIMAL_ID, NAME            -- 최종적으로 볼 COLUMN 이름 선택 
FROM ANIMAL_INS                   -- 사용할 TABLE 선택 
WHERE INTAKE_CONDITION = 'SICK'   -- MAINTABLE을 선택했기에(전체 값 가지고 있음) 
                                     -- 해당 TABLE에서 뽑는 기준을 가진 CCOLUMN의 기준 넣기 
ORDER BY ANIMAL_ID;               -- 다 뽑은 후, ANIMAL_ID순으로 정렬해달라고 했기에 넣고 끝!
                                     -- 역순을 원할 시 맨 뒤에 'DESC' 넣을 것 