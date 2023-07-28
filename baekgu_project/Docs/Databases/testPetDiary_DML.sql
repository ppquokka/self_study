-- GENDER 테이블 데이터
INSERT INTO GENDER (GENDER_ID, GENDER_NAME)
VALUES
  ('G-01', '남성'),
  ('G-02', '여성');
  
-- TELECOM 테이블 데이터
INSERT INTO TELECOM (TELECOM_ID, TELECOM_NAME)
VALUES
  ('T-01', 'SK 텔레콤'),
  ('T-02', 'KT'),
  ('T-03', 'LG U+'),
  ('T-04', 'SK 텔레콤 알뜰폰'),
  ('T-05', 'KT 알뜰폰'),
  ('T-06', 'LG U+ 알뜰폰');
  
-- PET_GENDER 테이블 데이터
INSERT INTO PET_GENDER (PETGEN_ID, PETGENDER_NAME)
VALUES
  ('PG-01', '수컷'),
  ('PG-02', '암컷');

-- SPECIES 테이블 데이터
INSERT INTO SPECIES (SPECIES_ID, SPECIES_NAME)
VALUES
  ('PS-01', '개(강아지)'),
  ('PS-02', '고양이'),
  ('PS-03', '햄스터'),
  ('PS-04', '슈가글라이더'),
  ('PS-05', '고슴도치'),
  ('PS-06', '앵무새'),
  ('PS-07', '기니피그'),
  ('PS-08', '카멜레온'),
  ('PS-09', '다람쥐'),
  ('PS-10', '도마뱀'),
  ('PS-11', '거북이'),
  ('PS-12', '미어캣'),
  ('PS-13', '오리'),
  ('PS-14', '친칠라'),
  ('PS-15', '라쿤'),
  ('PS-16', '토끼');

-- KEY_FIGURE 테이블 데이터
INSERT INTO KEY_FIGURE (KEYFIGURE_ID, KEYFIGURE_NAME)
VALUES
  ('FN-01', '몸무게(kg)'),
  ('FN-02', '식사량(g)'),
  ('FN-03', '음수량(ml)');

-- WRITING_GROUP 테이블 데이터 
INSERT INTO WRITING_GROUP (WRITINGGROUP_ID, WRITINGGROUP_NAME)
VALUES
  ('C-01', '자랑'),
  ('C-02', '병원'),
  ('C-03', '사료'),
  ('C-04', '기타');

-- MEMBER 테이블 데이터
INSERT INTO MEMBER (ID, PW, EMAIL, NAME, GENDER_ID, BIRTHDATE, TELECOM_ID, PHONENUM, REGANI_ID, MEMBER_ID)
VALUES
  ('ba1234', '123', 'user123@example.com', '홍길동', 'G-01', 19900101, 'T-01', 01012345678, 'pet123', 'mem001'),
  ('ap123', '456', 'user456@example.com', '김영희', 'G-02', 19800625, 'T-02', 01065109812, 'pet456', 'mem002'),
  ('or1234', '789', 'user789@example.com', '김철수', 'G-01', 19701207, 'T-03', 01045021452, 'pet789', 'mem003'),
  ('pi12345', '012', 'user012@example.com', '이동준', 'G-01', 20000428, 'T-04', 01045210145, 'pet012', 'mem004'),
  ('be1234', '345', 'user345@example.com', '박남길', 'G-01', 20230719, 'T-05', 01045041661, 'pet345', 'mem005'),
  ('on1234', '678', 'user678@example.com', '도예준', 'G-01', 19980123, 'T-06', 01070840797, 'pet678', 'mem006'),
  ('an12345', '901', 'user901@example.com', '서형준', 'G-01', 20200317, 'T-01', 01095415914, 'pet901', 'mem007'),
  ('sa123', '234', 'user234@example.com', '이수안', 'G-02', 19000101, 'T-02', 01099416544, 'pet234', 'mem008'),
  ('co1234', '567', 'user567@example.com', '김민지', 'G-02', 19960623, 'T-03', 01046409489, 'pet567', 'mem009'),
  ('ra1234', '890', 'user890@example.com', '서재희', 'G-02', 19851205, 'T-04', 01098765432, 'pet890', 'mem010');


-- community_list 테이블 데이터 
INSERT INTO COMMUNITY_LIST (WRITINGGROUP_ID, TITLE, MEMBER_ID, DATEOFPREPARATION, COMLIST_ID)
VALUES
  ('C-01', '꽃챌린지', 'mem001', '2023-05-10', 'L-001'),
  ('C-02', '신도림역 근처 괜찮은 고양이 병원 있을까요?', 'mem002', '2023-05-15', 'L-002'),
  ('C-02', '여의도역 근처에 고슴도치 진료하는 병원 있을까요?', 'mem003', '2023-06-02', 'L-003'),
  ('C-03', '강아지 사료 추천받아요', 'mem004', '2023-06-10', 'L-004'),
  ('C-01', '물속성 고양이', 'mem005', '2023-06-16', 'L-005'),
  ('C-04', '펫박람회 추천템!!', 'mem006', '2023-06-16', 'L-006'),
  ('C-03', '앵무새 간식은 뭐가 좋을까요?', 'mem007', '2023-06-20', 'L-007'),
  ('C-02', '홍제역 근처에 유기동물 케어해주는 병원이 있을까요?', 'mem008', '2023-06-24', 'L-008'),
  ('C-04', '제가 잘때 토끼가 자꾸 머리카락을 먹는데 어떻게해야...??', 'mem010', '2023-07-03', 'L-010');


-- pet_information 테이블 데이터 
INSERT INTO PET_INFORMATION (PETINF_ID, MEMBER_ID, SPECIES_ID, PETGEN_ID, PETINF_NAME)
VALUES
  ('PF-01', 'mem004', 'PS-01', 'PG-01', '뚱이'),
  ('PF-02', 'mem002', 'PS-02', 'PG-02', '콩이');



-- PET_DIARY_INFORMATION 테이블 데이터
INSERT INTO PET_DIARY_INFORMATION (PETINF_ID, KEYFIGURE_ID, KEYFIGUREINPUT, DIARYDATEOFPREPARATION, DIARYINF_ID)
VALUES
  ('PF-01', 'FN-01', '10', '1월', 'DF-001'),
  ('PF-01', 'FN-01', '20', '2월', 'DF-002'),
  ('PF-01', 'FN-01', '30', '3월', 'DF-003'),
  ('PF-01', 'FN-01', '40', '4월', 'DF-004'),
  ('PF-01', 'FN-01', '50', '5월', 'DF-005'),
  ('PF-01', 'FN-01', '60', '6월', 'DF-006'),
  ('PF-01', 'FN-01', '70', '7월', 'DF-007'),
  ('PF-01', 'FN-01', '80', '8월', 'DF-008'),
  ('PF-01', 'FN-01', '90', '9월', 'DF-009'),
  ('PF-01', 'FN-01', '100', '10월', 'DF-010'),
  ('PF-01', 'FN-01', '110', '11월', 'DF-011'),
  ('PF-01', 'FN-01', '120', '12월', 'DF-012'),
  ('PF-01', 'FN-02', '10', '1월', 'DF-013'),
  ('PF-01', 'FN-02', '20', '2월', 'DF-014'),
  ('PF-01', 'FN-02', '30', '3월', 'DF-015'),
  ('PF-01', 'FN-02', '40', '4월', 'DF-016'),
  ('PF-01', 'FN-02', '50', '5월', 'DF-017'),
  ('PF-01', 'FN-02', '60', '6월', 'DF-018'),
  ('PF-01', 'FN-02', '70', '7월', 'DF-019'),
  ('PF-01', 'FN-02', '80', '8월', 'DF-020'),
  ('PF-01', 'FN-02', '90', '9월', 'DF-021'),
  ('PF-01', 'FN-02', '100', '10월', 'DF-022'),
  ('PF-01', 'FN-02', '110', '11월', 'DF-023'),
  ('PF-01', 'FN-02', '120', '12월', 'DF-024'),
  ('PF-01', 'FN-03', '10', '1월', 'DF-025'),
  ('PF-01', 'FN-03', '20', '2월', 'DF-026'),
  ('PF-01', 'FN-03', '30', '3월', 'DF-027'),
  ('PF-01', 'FN-03', '40', '4월', 'DF-028'),
  ('PF-01', 'FN-03', '50', '5월', 'DF-029'),
  ('PF-01', 'FN-03', '60', '6월', 'DF-030'),
  ('PF-01', 'FN-03', '70', '7월', 'DF-031'),
  ('PF-01', 'FN-03', '80', '8월', 'DF-032'),
  ('PF-01', 'FN-03', '90', '9월', 'DF-033'),
  ('PF-01', 'FN-03', '100', '10월', 'DF-034'),
  ('PF-01', 'FN-03', '110', '11월', 'DF-035'),
  ('PF-01', 'FN-03', '120', '12월', 'DF-036');