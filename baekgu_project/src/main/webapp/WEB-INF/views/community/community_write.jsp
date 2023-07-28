<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page import="java.util.HashMap, java.util.ArrayList" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <!-- Bootstrap CSS -->
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
            <link rel="stylesheet" href="/css/main.css">
            <link rel="stylesheet" href="/css/community_write.css">
            <script src="/js/communityWrite.js"></script>
            <title>My Pet Community Write</title>
        </head>

        <body>
            <!-- header -->
            <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
                <!-- /header -->
                <!-- 분류, 제목, 내용 작성 및 작성/취소 버튼 -->
                <form action="" method="">
                    <div class="content-section">
                        <div class="container">
                            <div class="navbar-nav me-auto">
                                <div class="dropdown nav-item">
                                    <div class="row">
                                        <form id="communityForm" action="/commuWrite/insert" method="get">
                                            <div class="navbar-nav me-auto">
                                                <div class="dropdown nav-item">
                                                    <label class="content-title" for="">분류</label>
                                                    <select class="form-select" name="WRITINGGROUP_ID">
                                                        <option value="-------------">-------------</option>
                                                        <option value="C-01">자랑</option>
                                                        <option value="C-02">병원</option>
                                                        <option value="C-03">사료/간식</option>
                                                        <option value="C-04">기타</option>
                                                    </select>
                                                </div>

                                                <h3 class="content-title">제목</h3>
                                                <div class="input-title-box">
                                                    <input class="input-title-field" type="text" name="TITLE"
                                                        placeholder="제목을 입력하세요">
                                                </div>

                                                <h3 class="content-title">내용</h3>
                                                <div class="textarea-box">
                                                    <textarea rows="30" class="textarea-field" name="CONTENT"
                                                        placeholder="내용을 입력하세요"></textarea>
                                                </div>

                                                <div class="footer-buttons">
                                                    <button type="submit" class="register-button"
                                                        formaction="/commuWrite/insertAndView" formmethod="get"
                                                        onclick="registerCommunity()">등록</button>
                                                    <button type="submit" class="cancel-button"
                                                        onclick="cancelCommunity()">취소</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- footer -->
                    <%@ include file="/WEB-INF/views/baekgu/footer.jsp" %>
                    <!-- /footer -->

                        <script>
                            function registerCommunity() {
                                // 등록 버튼 클릭 시 서버로 폼 데이터를 전송합니다.
                                document.getElementById('communityForm').action = '/commuWrite/insert';
                                document.getElementById('communityForm').submit();
                            }

                            function cancelCommunity() {
                                // 취소 버튼 클릭 시 메인 커뮤니티 페이지로 이동합니다.
                                window.location.href = '/main/community';
                            }
                        </script>
                </form>
                <!-- /body -->
        </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>
        <script>applyDropdownMenu();</script>

        </html>