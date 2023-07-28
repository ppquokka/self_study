// JavaScript 코드
document.addEventListener("DOMContentLoaded", function() {
    // header에서 로그인과 회원가입 링크 설정
    const loginLink = document.querySelector(".loginText[href='../login/login.html']");
    const registerLink = document.querySelector(".loginText[href='../login/register.html']");

    // 로그인 링크 클릭 시 이벤트 설정
    loginLink.addEventListener("click", function(event) {
        event.preventDefault(); // 링크 클릭 시 기본 동작 방지
        // 로그인 페이지로 이동
        window.location.href = "../login/login.html";
    });

    // 회원가입 링크 클릭 시 이벤트 설정
    registerLink.addEventListener("click", function(event) {
        event.preventDefault(); // 링크 클릭 시 기본 동작 방지
        // 회원가입 페이지로 이동
        window.location.href = "../login/register.html";
    });

    // 커뮤니티 글 작성 폼 요소들 선택
    const categorySelect = document.querySelector("select[name='browsers']");
    const titleInput = document.querySelector(".input-title-field");
    const contentTextarea = document.querySelector(".textarea-field");
    const registerButton = document.querySelector(".register-button");
    const cancelButton = document.querySelector(".cancel-button");

    // 등록 버튼 클릭 시 이벤트 설정
    registerButton.addEventListener("click", function(event) {
        event.preventDefault(); // 버튼 클릭 시 기본 동작 방지
        // 사용자가 입력한 데이터 가져오기
        const category = categorySelect.value;
        const title = titleInput.value;
        const content = contentTextarea.value;

        // 데이터를 서버로 전송하거나 다른 동작 수행
        // ...

        // 커뮤니티 목록 페이지로 이동
        window.location.href = "./community.html";
    });

    // 취소 버튼 클릭 시 이벤트 설정
    cancelButton.addEventListener("click", function(event) {
        event.preventDefault(); // 버튼 클릭 시 기본 동작 방지
        // 커뮤니티 목록 페이지로 이동
        window.location.href = "./community.html";
    });
});
