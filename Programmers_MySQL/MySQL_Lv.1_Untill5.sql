/*Lv.1 : 강원도에 위치한 생산공장 목록 출력하기 */
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID ASC 
;
-- SELECT column1, column2... 
-- FROM table_name
-- WHERE columnN LIKE pattern;   
-- pattern: 'ㄱ%', '%ㄱ', '%ㅈㅌ%', '_ㄷ%', 'ㄱ_%', 'ㄱ__%', 'ㄱ%ㅂ'
-- ㄱ으로 시작, ㄱ으로 끝남, 중간에 ㅈㅌ이 있으면, 두번째가 ㄷ으로 시작
-- 세번째가 ㄱ으로 시작