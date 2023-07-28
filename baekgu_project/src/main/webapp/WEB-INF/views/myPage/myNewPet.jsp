<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/css/main.css">
        <title>My Pet MyPage</title>
    </head>

    <body>
        <!-- header -->
        <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
            <!-- /header -->
            <!-- body -->
            <form id="petForm" action="/pets/add" method="post">
                <div class="container mt-5">
                    <div class="card">
                        <div class="card-body">
                            <div class="mb-3">
                                <label for="pet_name" class="form-label">애완동물의 이름</label>
                                <input type="text" class="form-control" id="pet_name" name="PETNAME" placeholder="이름을 입력하세요.">
                            </div>
                            <div class="mb-3">
                                <label for="gender" class="form-label">성별</label>
                                <select class="form-select" id="gender" name="PETGEN_ID">
                                    <option value="PG-01" >남자</option>
                                    <option value="PG-02" >여자</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="pet_weight" class="form-label" >나이 (숫자만 입력하세요.)</label>
                                <input type="text" name="PETAGE" class="form-control" id="pet_weight" placeholder="나이">
                            </div>
                            <div class="mb-3">
                                <label for="confirm-password" class="form-label">분류</label>
                                <div class="custom-select">
                                    <select class="form-select" name="SPECIES_ID" id="">
                                        <option value="" selected>선택하기</option>
                                        <option value="PS-01">개(강아지)</option>
                                        <option value="PS-02">고양이</option>
                                        <option value="PS-03">햄스터</option>
                                        <option value="PS-04">슈가글라이더</option>
                                        <option value="PS-05">고슴도치</option>
                                        <option value="PS-06">앵무새</option>
                                        <option value="PS-07">기니피그</option>
                                        <option value="PS-08">카멜레온</option>
                                        <option value="PS-09">다람쥐</option>
                                        <option value="PS-10">도마뱀</option>
                                        <option value="PS-11">거북이</option>
                                        <option value="PS-12">미어캣</option>
                                        <option value="PS-13">오리</option>
                                        <option value="PS-14">친칠라</option>
                                        <option value="PS-15">라쿤</option>
                                        <option value="PS-16">토끼</option>
                                    </select>
                                </div>
                            </div>
                            <div class="d-grid gap-2">
                                <button type="submit" class="btn btn-primary">등록하기</button>
                            </div>
                            
                            <div> <input type="text" name="PETINF_ID"></div>
                            <div> <input type="text" name="MEMBER_ID"></div>

                        </div>
                    </div>
                </div>
            
                <!-- /body -->
            </form>
        </body>


    <!-- footer -->
    <!-- /footer -->

    </html>