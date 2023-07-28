<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page import="java.util.ArrayList" %>
        <%@ page import="java.util.HashMap" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>

                <link rel="stylesheet" href="/css/myNewPet.css">
                <link rel="stylesheet" href="/css/admin.css">
                <link rel="stylesheet" href="/css/myPage.css">
                <link rel="stylesheet" href="/css/main.css">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.css">

            </head>

            <body class="body">
                <div class="wrapper">

                    <%@ include file="../baekgu/header.jsp" %>
                        <% HashMap params=(HashMap)request.getAttribute("params"); %>
                            <!-- Main Content -->

                            <div class="search_bar container search_box">
                                <form action="" method="GET">
                                    <input class="" type="text" name="find_membername" id="find_membername"
                                        value='<%= params.getOrDefault("find_membername", "") %>'
                                        placeholder="검색할 회원 이름을 입력하세요">
                                    <button type="submit" class="searchbtn"> 검색하기
                                    </button>
                                </form>
                            </div>

                            <div class="member_list">
                                <h3 class="admin_subject container">

                                </h3>
                                <!-- 리스트 -->
                                <table class="member_table mt-5 table_row_apply">
                                    <tbody class="member_list_body">

                                        <tr class="table_headline">
                                            <td>
                                                이름
                                            </td>
                                            <td>
                                                ID
                                            </td>
                                            <td>
                                                TEL.
                                            </td>
                                            <td>
                                                EMAIL
                                            </td>
                                            <td>
                                                애완동물 현황
                                            </td>
                                            <td>
                                                회원탈퇴
                                            </td>
                                        </tr>



                                        <% HashMap result=(HashMap) request.getAttribute("result"); ArrayList
                                            resultList=(ArrayList) result.get("resultList"); ArrayList
                                            resultList2=(ArrayList) result.get("resultList2"); for (int i=0; i <
                                            resultList.size(); i++) { HashMap record=(HashMap) resultList.get(i); %>



                                            </tr>
                                            <tr>
                                                <td class="member_list_cell">
                                                    <%= record.get("NAME") %>
                                                </td>
                                                <td class="member_list_cell">
                                                    <%= record.get("ID") %>
                                                </td>
                                                <td class="member_list_cell">
                                                    <%= record.get("PHONENUM") %>
                                                </td>
                                                <td class="member_list_cell">
                                                    <%= record.get("EMAIL") %>
                                                </td>
                                                <!-- 애완동물 현황 모달창  -->
                                                <td class="member_list_cell">
                                                    <button data-bs-toggle="modal" href="#modalTarget-center"
                                                        onclick="callbackWithModal(`<%= record.get("MEMBER_ID") %>`, getSelectAllFromREST)"
                                                        class="btn btn1">
                                                        애완동물 현황
                                                    </button>

                                                    <script>

                                                        function selectAnimal(data) {
                                                        }
                                                        function callbackWithModal(param, callbackFunc) {

                                                            if (callbackFunc != null) {
                                                                callbackFunc(param);
                                                            }
                                                        }

                                                    </script>
                                                    <div class="modal" id="modalTarget-center">
                                                        <div class="modal-dialog modal-dialog-centered">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    애완동물 정보
                                                                </div>
                                                                <div class="modal-body">
                                                                    <table class="member_table">

                                                                        <thead>
                                                                            <tr>
                                                                                <td class="member_table_head1" value=""
                                                                                    id="">
                                                                                    이름
                                                                                </td>
                                                                                <td class="member_table_head1">
                                                                                    종
                                                                                </td>
                                                                                <td class="member_table_head1">
                                                                                    나이
                                                                                </td>
                                                                            </tr>
                                                                        </thead>


                                                                        <!-- fetch -->
                                                                        <tbody id="datashow">
                                                                            <!-- tablerow -->
                                                                        </tbody>

                                                                    </table>
                                                                </div>
                                                                <div class="modal-footer">
                                                                    <button data-bs-dismiss="modal" class="btn btn1">
                                                                        Close
                                                                    </button>

                                                                </div>



                                                            </div>
                                                        </div>
                                                    </div>
                                                </td>

                                                <!-- 탈퇴 버튼 -->
                                                <td class="member_list_cell">
                                                    <form action="">
                                                        <button type="submit" formaction="" class="btn btn-primary">회원 탈퇴</button>
                                                    </form>
                                                </td>
                                                
                                                <!-- 수정/탈퇴버튼 -->
                                                
                                                <!-- <a data-bs-toggle="modal" href="#modalTarget-second"
                                                    class="btn btn-primary">
                                                    수정/탈퇴
                                                </a>
                                                <div class="modal" id="modalTarget-second">
                                                    <div class="modal-dialog modal-dialog-centered modal-xl">
                                                        <div class="modal-content">
                                                            <div class="modal-header">회원 정보 수정</div>
                                                            <div class="modal-body">

                                                                <table class="member_table">
                                                                    <tr>
                                                                        
                                                                        <td class="member_table_head">
                                                                            나이
                                                                        </td>
                                                                        <td class="member_table_head">
                                                                            전화번호
                                                                        </td>
                                                                        <td class="member_table_head">
                                                                            이메일주소
                                                                        </td>
                                                                        <td class="member_table_head">
                                                                            탈퇴
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                       
                                                                        <td class="member_table_head">
                                                                            <input class="inputs" type="text" name=""
                                                                                id="" placeholder="25">
                                                                        </td>
                                                                        <td class="member_table_head">
                                                                            <input class="inputs" type="text" name=""
                                                                                id="" placeholder="010-1111-2222">
                                                                        </td>
                                                                        <td class="member_table_head">
                                                                            <input class="inputs" type="text" name=""
                                                                                id="" placeholder="kimjs@go.kr">
                                                                        </td>
                                                                        <td class="member_table_head">
                                                                            <form action="">
                                                                                <button class="deletebtn"
                                                                                    type="submit">탈퇴</button>
                                                                            </form>
                                                                        </td>
                                                                    </tr>

                                                                </table>

                                                            </div>
                                                            <div class="modal-footer">
                                                                <button data-bs-dismiss="modal" class="btn btn1">
                                                                    Close
                                                                </button>
                                                                <form action="">
                                                                    <button class="btn btn-warning">
                                                                        저장
                                                                    </button>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div> -->
                                                </td>
                                            </tr>
                                            <% } %>

                            </div>





                </div>
                </tbody>
                </table>

                <!-- page button -->

                <div class="container pagination mt-5 mb-5">
                    <button class="page_button2">&lt;&lt;</button>
                    <button class="page_button">&lt;</button>
                    <button class="page_button">1</button>
                    <button class="page_button">2</button>
                    <button class="page_button">3</button>
                    <button class="page_button">4</button>
                    <button class="page_button">5</button>
                    <button class="page_button">&gt;</button>
                    <button class="page_button2">&gt;&gt;</button>
                </div>

                <%@ include file="../baekgu/footer.jsp" %>

            </body>
            <script src="/js/admin.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

            </html>