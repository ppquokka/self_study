<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
    <title>My Pet Statistics</title>
</head>

<body>
    <!-- header -->
    <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
    <!-- /header -->
    <!-- body -->
    <div class="container my-5">
        <table class="table table-bordered table-hover">
            <tr class="table-info">
                <th>이름</th>
                <th>성별</th>
                <th>나이</th>
                <th>종</th>
                <th>예방접종 유무</th>
            </tr>
            <tr>
                <td>뽀삐</td>
                <td>수컷</td>
                <td>8</td>
                <td>치와와</td>
                <td>O</td>
            </tr>
        </table>
    </div>
    <div class="container">
        <canvas id="myChart"></canvas>
    </div>
    <div class="container my-5">
        <table class="table table-bordered table-hover">
            <tr>
                <th rowspan="2" style="vertical-align: middle; text-align: center;" class="table-info">체중</th>
                <td>1월</td>
                <td>2월</td>
                <td>3월</td>
                <td>4월</td>
                <td>5월</td>
                <td>6월</td>
                <td>7월</td>
                <td>8월</td>
                <td>9월</td>
                <td>10월</td>
                <td>11월</td>
                <td>12월</td>
            </tr>
            <tr>
                <td>10kg</td>
                <td>20kg</td>
                <td>30kg</td>
                <td>40kg</td>
                <td>50kg</td>
                <td>60kg</td>
                <td>70kg</td>
                <td>80kg</td>
                <td>90kg</td>
                <td>100kg</td>
                <td>110kg</td>
                <td>120kg</td>
            </tr>
        </table>
    </div>
    <script>
        var ctx = document.getElementById('myChart').getContext('2d');
        var chart = new Chart(ctx, {
            // 챠트 종류를 선택
            type: 'line',
    
            // 챠트를 그릴 데이타
            data: {
                labels: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
                datasets: [{
                    label: '몸무게',
                    backgroundColor: 'transparent',
                    borderColor: 'red',
                    data: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120]
                }]
            },
            // 옵션
            options: {}
        });
    </script>
    <div class="container my-5">
        <table>
            <th></th>
        </table>
    </div>
    <!-- /body -->
</body>

<!-- footer -->
<%@ include file="/WEB-INF/views/baekgu/footer.jsp" %>
<!-- /footer -->

</html>