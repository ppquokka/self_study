<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/css/main.css">
        <link rel="stylesheet" href="/css/myAccount.css">
        <script src="/js/myAccount.js"></script>
        <title>My Pet myAccount</title>
    </head>

    <body>
        <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
            <div class="m-5 d-flex justify-content-center">
                <nav class="navbar">
                    <div class="navbar-nav">
                        <ul class="accountLine">
                            <li class="dropdown-item accountBox">내 프로필</li>
                            <li class="dropdown-item" style="display: flex; justify-content: space-between;">이름 <div
                                    style="margin-left: auto; width:350px">${userDetailsBean.memberName}</div><button
                                    onclick="editName()"
                                    style="text-decoration: none; border: none; background:none; color:#aa0abf">수정</button>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li class="dropdown-item" style="display: flex; justify-content: space-between;">아이디
                                <div style="margin-left: auto; width:350px">${userDetailsBean.username}</div><button
                                    onclick="openModal()"
                                    style="text-decoration: none; border: none; background:none; color:#aa0abf">수정</button>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li class="dropdown-item" style="display: flex; justify-content: space-between;">이메일
                                <div style="margin-left: auto; width:350px">${userDetailsBean.memberEmail}</div><button
                                    onclick="openModal()"
                                    style="text-decoration: none; border: none; background:none; color:#aa0abf">수정</button>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li class="dropdown-item" style="display: flex; justify-content: space-between;">생년월일
                                <div style="margin-left: auto; width:350px">${userDetailsBean.memberBirth}</div><button
                                    onclick="openModal()"
                                    style="text-decoration: none; border: none; background:none; color:#aa0abf">수정</button>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li class="dropdown-item" style="display: flex; justify-content: space-between;">전화번호
                                <div style="margin-left: auto; width:350px">${userDetailsBean.memberPhone}</div><button
                                    onclick="openModal()"
                                    style="text-decoration: none; border: none; background:none; color:#aa0abf">수정</button>
                            </li>
                            <li class="dropdown-item accountEndBox"></li>
                        </ul>
                    </div>
                </nav>
            </div>
            <form class="form-signin" action="/myAccount" method="put">
                <div id="editName"
                    style="display: none; position: fixed; top: 0; left: 0; width: 100%; height: 100%; background-color: rgba(0,0,0,0.7);">
                    <div style="position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);">
                        <div class="modalBox">이름 변경</div>
                        <div style="background:#fff; font-weight: bold; font-size:large; line-height:50px">
                            기존 이름: ${userDetailsBean.memberName}
                            <input type="text" name="NAME" class="form-control" id="name" value maxlength="10"
                                placeholder="변경할 이름" value="${NAME}">
                        </div>
                        <div class="modalEndBox" style="justify-content: space-between;">
                            <button type="submit" class="rounded-pill" style="background-color: #91bbf9;" formaction="">변경</button>
                            <button type="button" class="rounded-pill" style="background-color: #91bbf9;"
                                onclick="closeEditName()">닫기</button>
                        </div>
                    </div>
                </div>
            </form>
    </body>
    <%@ include file="/WEB-INF/views/baekgu/footer.jsp" %>

    </html>