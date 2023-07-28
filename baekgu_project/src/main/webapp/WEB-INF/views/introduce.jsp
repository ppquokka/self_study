<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/introduce.css">
    <title>My Pet Introduce</title>
</head>

<body>
  <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
  <table class="introduceImage m-5">
    <tr>
      <td><img src="/images/고양이1.jpg" alt="" style="width: 640px; height: 360px;"></td>
      <td class="introduceText">
        반려동물을 객관적인 방법으로 관찰/기록하고<br>
        주기적으로 추출된 결과를 통계하여<br>
        반려동물의 성장발달을 편리하게 확인할 수 있는 서비스입니다.
      </td>
    </tr>
    <tr>
      <td><img src="/images/고슴도치.png" alt="" style="width: 640px; height: 360px;"></td>
      <td class="introduceText">
        우리 반려동물은 우리 가족의 소중한 일원이며,<br>
        그들의 건강과 행복을 지켜주기 위해 적절한 관리와 관찰이 필요합니다.<br>
        이 서비스를 통해 우리는 객관적인 방법으로<br>
        반려동물의 상태를 관찰하고 기록할 수 있습니다.
      </td>
    </tr>
    <tr>
      <td><img src="/images/솜뭉탱밤.jpg" alt="" style="width: 640px; height: 360px;"></td>
      <td class="introduceText">
        반려동물의 성장과 건강을 보다 쉽게 관리할 수 있으며,<br>
        함께하는 소중한 시간을 더욱 의미있게 만들 수 있습니다.<br>
        우리의 사랑하는 반려동물이<br>
        항상 행복하고 건강하게 성장할 수 있도록 활용해 보세요.
      </td>
    </tr>
  </table>
</body>
  <%@ include file="/WEB-INF/views/baekgu/footer.jsp" %>
</html>