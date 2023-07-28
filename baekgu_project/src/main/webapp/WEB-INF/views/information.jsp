<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
    <style>
        헤더 우측 정렬 header {
            text-align: right;
            background-color: #fff;
        }

        /* 메인에 배경색 적용 */
        main {
            background-color: #b3d9eb;
        }

        /* 푸터 흰색 배경화면, 글씨 가운데 정렬 */
        footer {
            background-color: #fff;
            text-align: center;
        }

        /* 수정 사항 추가 */
        .community {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            height: 100%;
        }

        .Community_main {
            justify-content: center;
            margin: 10px;
        }

        .dropdown_nav-item {}

        .input-group {
            border-radius: 20px;
        }

        .list-unstyled>.list-unstyled {
            border-top: 10px solid #fff;
            border-bottom: 10px solid #fff;
        }

        .pagination {
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 30px 20px 20px 20px;
        }

        .direction {
            margin: 0 5px;
        }

        .direction.first::before,
        .direction.last::after {
            content: "";
        }

        .write_button{
           display: flex;
           justify-content: center;
           margin: 30px 20px 20px 10px;
        }
    </style>

    <title>Community</title>

</head>

<body>
    <header style="margin: 20px; text-align: right;">
        <!-- My Page -->
        <form class="my-page-link">
            <a href="../pet_diary/my_pet_manage.html"
                style="color: rgb(7, 7, 7); text-decoration: none; font-size: 1.1rem;">Pet Diary</a>
            <a style="color: rgb(7, 7, 7);">|</a>
            <a href="../mainpage.html" style="color: rgb(7, 7, 7); text-decoration: none; font-size: 1.1rem;">LogOut</a>
        </form>
    </header>
    <main>
        <div style="text-align: center;">
            <ul class="list-unstyled m-25" style="display: inline-block; margin: 20px;">
                <li style="display: inline-block; float: left;">
                    <a href="../mainpage.html">
                        <img src="./images/logoimage.png" alt="logo image" width="100" height="100">
                        <hr>
                    </a>
                    <div style="text-align: center; margin-top: 10px; margin-bottom: 10px;">
                        <ul class="list-unstyled m-0" style="display: inline-block;">
                            <li style="display: inline-block;">
                                <a href="../static/pet_diary/pet_introduce.html" class="text-white text-decoration-none ps-3" style="font-size: 1.3rem;">사이트 소개</a>
                              </li>
                              <li style="display: inline-block;">
                                <a href="" class="text-white text-decoration-none ps-3" style="font-size: 1.3rem;">다이어리 사용 안내</a>
                              </li>
                              <li style="display: inline-block;">
                                <a href="./community/community.html" class="text-white text-decoration-none ps-3"
                                  style="font-size: 1.3rem;">커뮤니티</a>
                              </li>
                              <li style="display: inline-block;">
                                <a href="./pet_diary/my_pet_manage.html" class="text-white text-decoration-none ps-3"
                                  style="font-size: 1.3rem;">펫 다이어리</a>
                              </li>
                            </li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>

        <div class="community main">
            <div class="container" style="display: inline-block; margin: 20px;">
                <div class="community board">
                    <h3 class="tit">내 프로필(기본정보)</h3>
                    <div class="input-group mb-3">

<body>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <form>
                    <div class="mb-3">
                        <label for="name" class="form-label">이름 (*개명 시에만 가능)</label>
                        <input type="text" class="form-control" id="name" placeholder="이름">
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">휴대폰번호</label>
                        <input type="email" class="form-control" id="number" placeholder="휴대폰번호">
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">ID (*변경불가)</label>
                        <input type="email" class="form-control" id="id" placeholder="ID">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">비밀번호</label>
                        <input type="password" class="form-control" id="password" placeholder="비밀번호">
                    </div>
                    <div class="mb-3">
                        <label for="confirm-password" class="form-label">이메일</label>
                        <input type="password" class="form-control" id="email" placeholder="이메일">
                    </div>
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-primary">정보 수정</button>
                    </div>
                </div>
            </div>

                <footer class="p-5 d-flex justify-content-between align-items-center">
                    <div class="row">
                        <div class="">
                            <div class="">
                                <ul class="list-unstyled d-flex">
                                    <li>
                                        <a href="" class="text-black text-decoration-none ps-2">이용약관</a>
                                    </li>
                                    <li>
                                        <a href="" class="text-black text-decoration-none ps-2">개인정보처리방침</a>
                                    </li>
                                    <li>
                                        <a href="" class="text-black text-decoration-none ps-2">고객센터</a>
                                    </li>
                                    <li>
                                        <a href="" class="text-black text-decoration-none ps-2">공지사항</a>
                                    </li>
                                </ul>
                            </div>
                            <div style="text-align: left;">
                                <ul class="list-unstyled m-0">
                                    <li class="pt-1">
                                        대표번호: 080-123-4567 (업무시간: 09:00-18:00 월~금) 주말 및 공휴일 휴무
                                    </li>
                                    <li class="pt-1">
                                        <span class="pe-3">대표자: THE GLORY</span>
                                        <span>주소: 서울시 구로구</span>
                                    </li>
                                    <li class="pt-1">
                                        <span>법인명: (주)THE GLORY</span>
                                        <span>사업자 등록정보: 123-45-6789</span>
                                    </li>
                                    <li class="pt-1">
                                        <span>호스팅: (주)THE GLORY</span>
                                        <span>E-MAIL: THE GLORY@THE GLORY.com</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
            
                    <div class="row">
                        <img src="./images/logoimage.png" alt="logo" height="120rem" />
                    </div>
                </footer>
                <!-- Bootstrap Bundle with Popper.js -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"></script>
            </body>
            
            </html>