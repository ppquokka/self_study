<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap CSS JS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/login.css">
    <title>My Pet Login</title>
</head>

<body>
    <!-- header -->
    <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
    <!-- /header -->
    <!-- body -->
    <form class="form-signin" method="post" action="/login">
    <div class="container my-5">
        <% String fail = request.getParameter("fail"); %>
        <div class="mx-5">
            <label for="ID" class="form-label">아이디</label>
            <input type="text" class="form-control" name="username" placeholder="아이디를 입력하세요">
            <div class="loginform"></div>
            <label for="PW" class="form-label">비밀번호</label>
            <input type="password" class="form-control" name="password" placeholder="비밀번호를 입력하세요">
            <div class="loginform"></div>
            <div class="form-check">
                <label class="form-check-label" for="accpet">로그인 상태 유지</label>
                <input type="checkbox" class="form-check-input" id="accpet">
            </div>
            <% if ("true".equals(fail)) { %>            
                <div class="error"> 아이디(로그인 전용 아이디) 또는 비밀번호를 잘못 입력했습니다.
                    입력하신 내용을 다시 확인해주세요 </div>
                <% } %>
        </div>
        <br>
        <div class="d-grid gap-2 m-5">
            <button id="login" class="loginButton btn btn-primary" type="submit">로그인</button>
        </div>
        <hr>
        <div style="text-align: center;">
            <ul class="list-unstyled m-25" style="display: inline-block;">
                <li style="display: inline-block;">
                    <div style="text-align: center; margin-top: 10px; margin-bottom: 10px;">
                        <ul class="list-unstyled m-0" style="display: inline-block;">
                            <li style="display: inline-block;">
                                <a href="" class="text-decoration-none ps-3">아이디 찾기</a>
                            </li>
                            <li style="display: inline-block;">
                                <a href="" class="text-decoration-none ps-3">비밀번호 찾기</a>
                            </li>
                            <li style="display: inline-block;">
                                <a href="/main/register" class="text-decoration-none ps-3">회원가입</a>
                            </li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</form>
    <!-- /body -->
</body>

<!-- footer -->
<%@ include file="/WEB-INF/views/baekgu/footer.jsp" %>
<!-- /footer -->

</html>