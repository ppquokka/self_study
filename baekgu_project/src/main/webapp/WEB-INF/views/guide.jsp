<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/guide.css">
    <title>My Pet Guide</title>
</head>

<body>
    <!-- header -->
    <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
    <!-- /header -->
    <!-- body -->
    <table class="guideImage m-5">
      <tr>
        <td><img src="/images/guide01.png" alt="" style="width: 640px; height: 360px;"></td>
        <td class="guideText">
          1. 우측 상단의 로그인 및 회원가입 기능을 통해<br>
          이미 회원이시라면 로그인을 신규 방문자이시면 회원가입을 하실 수 있습니다.<br>
          2. 메인화면 상단의 로고를 눌러 언제든지 홈으로 돌아가실 수 있습니다.<br>
          '마이페이지'는 로그인 후 이용 가능합니다.
        </td>
      </tr>
      <tr>
        <td><img src="/images/guide02.png" alt="" style="width: 640px; height: 360px;"></td>
        <td class="guideText">
          사이트 소개는 사이트 설립의 목적과,<br>
          이용할 수 있는 서비스를 확인하실 수 있습니다.
        </td>
      </tr>
      <tr>
        <td><img src="/images/guide03.png" alt="" style="width: 640px; height: 360px;"></td>
        <td class="guideText">
          3. 분류 및 검색을 통해 원하는 게시물을 찾을 수 있습니다.<br>
          4. 분류 및 검색을 완료한 게시물을 표시해주며,<br>
          게시글의 제목을 눌러 내용을 확인할 수 있습니다.
          작성자의 아이디는 앞자리 2글자를 제외하고는,<br>
          보안을 위해 보호되며 작성일자를 확인하실 수 있습니다.<br>
          5. 게시물 수가 많으면 다음 페이지로 넘어갈 수 있습니다.<br>
          우측 '글 작성'을 통해 게시글을 작성하실 수 있습니다.
        </td>
      </tr>
      <tr>
        <td><img src="/images/guide04.png" alt="" style="width: 640px; height: 360px;"></td>
        <td class="guideText">
          글 작성 페이지에서도 로고를 통하여 메인으로 돌아가실 수 있습니다.<br>
          분류를 통하여 게시물의 형태를 적용하실 수 있으며,<br>
          입력하신 제목은 커뮤니티 게시판에서 대표로 보여지게 됩니다.<br>
          하단에 등록 버튼을 누르면 게시판에 작성한 글이 등록되며,<br>
          취소 버튼을 누르면 다시 커뮤니티 페이지로 돌아가실 수 있습니다.
        </td>
      </tr>
    </table>
    <!-- /body -->
</body>

<!-- footer -->
<%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
<!-- /footer -->

</html>