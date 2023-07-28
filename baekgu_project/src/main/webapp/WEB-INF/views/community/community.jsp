<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.HashMap, java.util.ArrayList, com.example.baekgu_project.utils.Paginations" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/community.css">
    <script src="/js/community.js"></script>
    <title>My Pet Community</title>
</head>

<body style="height: 800px;">
    <!-- header -->
    <%@ include file="/WEB-INF/views/baekgu/header.jsp" %>
    <!-- /header -->
    <% HashMap params=(HashMap)request.getAttribute("params"); String searchStr=(String)params.getOrDefault("search", ""
        ); HashMap result=(HashMap)request.getAttribute("result"); %>
    <!-- body -->
    <div class="community main">
        <div class="container" style="display: inline-block; margin: 20px;">
            <div class="community board">
                <h3 class="tit">커뮤니티 게시판</h3>
                <p>반려동물 자랑, 병원, 사료 문의 등 자유로운 공간입니다 😄</p>
<!-- 검색창 및 검색 버튼 -->
<form action="" method="">
                <div class="input-group mb-3" style="width: 800px;">
                    <div>
                    <select class="form-select rounded-pill" name="search">
                        <option value="TITLE" <%=(searchStr.equals("TITLE")) ? "selected" : "" %>>제목</option>
                        <option value="ID" <%=(searchStr.equals("ID")) ? "selected" : "" %>>글 작성자</option>
                    </select>
                    </div>
                    <input type="text" name="words" class="form-control rounded-pill" value='<%= params.getOrDefault("words", "") %>' id="keydownEnter" style="margin-left: 10px; margin-right: 10px;">
                    <button class="rounded-pill" type="submit" formaction="/community/communityList" formmethod="get" style="margin-left: 10px; margin-right: 10px;">
                        <img src="/images/search.png" alt="search image" width="23" height="23" style="background-color: transparent;">
                    </button>
                </div>
                <hr>
<!-- 게시글 테이블 보더 -->
                <div>
                    <table class="table" style="width: 800px;">
                        <thead style="text-align: center;">
                            <tr>
                                <th class="noBrd">
                                    <div class="dropdown_nav-item">
                                    <button class="rounded-pill dropdown-toggle" data-bs-toggle="dropdown">분류</button>
                                    <ul class="dropdown-menu">
                                        <li class="dropdown-item" data-category="all">전체</li>
                                        <li class="dropdown-item" data-category="자랑">자랑</li>
                                        <li class="dropdown-item" data-category="병원">병원</li>
                                        <li class="dropdown-item" data-category="사료/간식">사료/간식</li>
                                        <li class="dropdown-item" data-category="기타">기타</li>
                                    </ul>
                                    </div>
                                </th>
                                <th class="noBrd">제목</th>
                                <th class="noBrd">작성자</th>
                                <th class="noBrd">작성일</th>
                            </tr>
                        </thead>
<!-- 게시글 테이블 -->
                        <tbody id="communityTableBody">
                            <% ArrayList resultList=(ArrayList)result.get("resultList");
                            int j = 1;
                            for(int i=0; i < resultList.size(); i=i+1){
                                HashMap record=(HashMap)resultList.get(i); %>
                                <input type="hidden" value="" id="">
                                <tr class="category-row" data-category="<%= record.get("WRITINGGROUP_NAME") %>">
                                    <td>
                                        <%= record.get("WRITINGGROUP_NAME") %>
                                    </td>
                                    <td>
                                        <a class="community_title" href=""><%= record.get("TITLE") %></a>
                                    </td>
                                    <td>
                                        <script>document.write(maskingName('<%= record.get("ID") %>'));</script>
                                    </td>
                                    <td>
                                        <%= record.get("DATE_FORMAT(DATEOFPREPARATION, '%Y-%m-%d')") %>
                                    </td>
                                </tr>
                                <% } %>
                        </tbody>
                    </table>
                    <%
                    Paginations paginations = (Paginations)result.get("paginations"); 
                    %>
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <li style="width: 160px;"></li>
                            <li class="page-item"><button class="page-link" formaction="/community/communityList/<%= paginations.getFirstPage() %>">First</button></li>
                            <li class="page-item"><button class="page-link" formaction="/community/communityList/<%= paginations.getPreviousPage() %>">Previous</button></li>
                            <%
                            for(int i=paginations.getBlockStart();i <= paginations.getBlockEnd(); i=i+1)
                            {
                            %>
                            <li class="page-item">
                                <button class="page-link" formaction="/community/communityList/<%= i %>"><%= i %></button>
                            </li>
                            <%
                            }
                            %>
                            <li class="page-item"><button class="page-link" formaction="/community/communityList/<%= paginations.getNextPage() %>">Next</button></li>
                            <li class="page-item"><button class="page-link" formaction="/community/communityList/<%= paginations.getLastPage() %>">Last</button></li>
                            <li style="margin-left: auto;">
                                <a href="/commuWrite/insertAndView" class="page-link text-decoration-none" style="background-color: #0d6efd; color: white">글 작성</a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</form>
    <!-- /body -->
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.js"></script>
<script>applyDropdownMenu();</script>
<!-- footer -->
<%@ include file="/WEB-INF/views/baekgu/footer.jsp" %>
<!-- /footer -->

</html>