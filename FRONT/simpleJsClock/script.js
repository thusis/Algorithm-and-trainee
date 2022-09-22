let handleId = 0; // 시계 동작에 대한 아이디 저장
const h1 = document.getElementById("time")
const go = document.getElementById("go")
const stop = document.getElementById("stop")

function getTime(){
    const date = new Date() //자바스크립트 내장 객체를 가져와 date에 저장
    const hour = date.getHours();
    const minutes = date.getMinutes();
    const seconds = date.getSeconds(); //시, 분, 초에 대한 변수를 저장하고 
    const time = `${hour}:${minutes}:${seconds}` //template literal 을 이용해 시, 분, 초 문자열을 생성
    h1.textContent = time; //time을 h1 컨텐츠의 textContent에 대입
}

getTime()

go.onclick = function(){
    if(handleId == 0){
        handleId = setInterval(getTime, 1000)
        //setInterval은 첫번째 인자로 전달되는 인자를 두번째 인자만큼의 크기로 동작하겠다. 1000밀리
        //0이 아닌 정수를 내보낸다
        // ?? setInterval
    }
}

stop.onclick = function(){
    clearInterval(handleId)
    handleId = 0 ;
    // ?? clearInterval
}