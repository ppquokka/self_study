// 휴대폰 번호 입력 부분
function phoneNumber()
{
    const number = document.getElementById("number").value
    if(number.length === 13)
    {
      document.getElementById("sendMessage").focus();
      document.getElementById("sendMessage");
      document.getElementById("sendMessage").disabled = false;
    }

    else
    {
      document.getElementById("sendMessage").disabled = true;
    }
}

// 문자인증+타이머 부분
function initButton()
{
  document.getElementById("sendMessage").disabled = true;
  document.getElementById("completion").disabled = true;
  document.getElementById("certificationNumber").innerHTML = "000000";
  document.getElementById("timeLimit").innerHTML = "03:00";
  document.getElementById("sendMessage").setAttribute("style","background-color:none;")
  document.getElementById("completion").setAttribute("style","background-color:none;")
}

let processID = -1;

const getToken = () =>
{

  // 인증확인 버튼 활성화
  document.getElementById("completion");
  document.getElementById("completion").disabled = false;

  if (processID != -1) clearInterval(processID);
  const token = String(Math.floor(Math.random() * 1000000)).padStart(6, "0");
  document.getElementById("certificationNumber").innerText = token;
  let time = 180;
  processID = setInterval(function () {
    if (time < 0 || document.getElementById("sendMessage").disabled)
    {
      clearInterval(processID);
      initButton();
      return;
    }
    let mm = String(Math.floor(time / 60)).padStart(2, "0");
    let ss = String(time % 60).padStart(2, "0");
    let result = mm + ":" + ss;
    document.getElementById("timeLimit").innerText = result;
    time--;
  }, 60);
};

function checkCompletion()
{
  alert("문자 인증이 완료되었습니다.")
  initButton();
  document.getElementById("completion").innerHTML="인증완료"
  document.getElementById("check").disabled = false;
  document.getElementById("check").setAttribute("style","background-color: rgb(0, 123, 255);")
}

// 가입부분 체크

function signUpCheck()
{
    let id = document.getElementById("id").value
    let email = document.getElementById("email").value
    let password = document.getElementById("password").value
    let passwordCheck = document.getElementById("passwordCheck").value
    let name = document.getElementById("name").value
    let birth = document.getElementById("birth").value
    let check = true;

    // 아이디 확인
    if(id==="")
    {
        document.getElementById("idError").innerHTML="아이디가 올바르지 않습니다."
        check = false
    }

    else
    {
        document.getElementById("idError").innerHTML=""
    }

    // 비밀번호 확인
    if(password !== passwordCheck)
    {
        document.getElementById("passwordError").innerHTML=""
        document.getElementById("passwordCheckError").innerHTML="비밀번호가 동일하지 않습니다."
        check = false
    }

    else
    {
        document.getElementById("passwordError").innerHTML=""
        document.getElementById("passwordCheckError").innerHTML=""
    }

    // 비밀번호 재확인
    if(password==="")
    {
        document.getElementById("passwordError").innerHTML="비밀번호를 입력해주세요."
        check = false
    }
    if(passwordCheck==="")
    {
        document.getElementById("passwordCheckError").innerHTML="비밀번호를 다시 입력해주세요."
        check = false
    }
  
    // 이메일 확인
    if(email.includes('@'))
    {
      let emailId = email.split('@')[0]
      let emailServer = email.split('@')[1]
      if(emailId === "" || emailServer === "")
      {
        document.getElementById("emailError").innerHTML="이메일이 올바르지 않습니다."
        check = false
      }

      else
      {
        document.getElementById("emailError").innerHTML=""
      }
    }
    
    else
    {
      document.getElementById("emailError").innerHTML="이메일이 올바르지 않습니다."
      check = false
    }
  
    // 이름 확인
    if(name==="")
    {
      document.getElementById("nameError").innerHTML="이름이 올바르지 않습니다."
      check = false
    }
    
    else
    {
      document.getElementById("nameError").innerHTML=""
    }

    // 생년월일 확인
    if(birth==="")
    {
      document.getElementById("birthError").innerHTML="생년월일이 올바르지 않습니다."
      check = false
    }
    
    else
    {
      document.getElementById("birthError").innerHTML=""
    }
    
    if(check)
    {
        document.getElementById("idError").innerHTML=""
        document.getElementById("passwordError").innerHTML=""
        document.getElementById("emailError").innerHTML=""
        document.getElementById("passwordCheckError").innerHTML=""
        document.getElementById("nameError").innerHTML=""
        document.getElementById("birthError").innerHTML=""
      
    //비동기 처리이벤트
    setTimeout(function(){alert("가입이 완료되었습니다.")},0);
    }
}

function getSavedValue()
{
  var value = document.cookie.replace(/(?:(?:^|.*;\s*)savedValue\s*\=\s*([^;]*).*$)|^.*$/, "$1");
  return value !== "" ? parseInt(value) : 0;
}

var count = getSavedValue();

function member()
{
  let stringNumber = count.toString();
  let member_ID = "M-" + stringNumber;
  document.getElementById('human').value = member_ID;
  count++;
  document.cookie = "savedValue=" + count;
}