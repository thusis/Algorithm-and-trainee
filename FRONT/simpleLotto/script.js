// 보통 제일 먼저 선택

const numbersDiv = document.querySelector(".numbers")
const drawButton = document.querySelector("#draw")
const resetButton = document.querySelector("#reset")

const lottoNumbers = [] //배열 객체 생성
const colors = ["tomato", "aquamarine", "skyblue", "yellow", "lime"] //로또 번호 각 크기에 따라 색깔 변경

function paintNumber(number){
    const eachNumDiv = document.createElement("div")
    let colorIndex = Math.floor(number/10)
    eachNumDiv.classList.add('eachnum')
    eachNumDiv.style.backgroundColor = colors[colorIndex]
    eachNumDiv.textContent=number
    numbersDiv.appendChild(eachNumDiv)
}

drawButton.addEventListener("click", function(){
//추첨버튼 눌렀을 때 이벤트 발생
    while(lottoNumbers.length<6){
        let ran = Math.floor(Math.random()*45)+1
        if(lottoNumbers.indexOf(ran)=== -1){
            //주어진 번호가 배열(ran)에 존재하지 않을 때 indexOf() 메소드는 -1을 반환한다. 즉 랜덤 숫자가 존재하지 않을 때
            lottoNumbers.push(ran)
            paintNumber(ran)

        }
    }
})

resetButton.addEventListener("click", function(){
    lottoNumbers.splice(0,6) //배열의 0번째 인덱스부터 6번째 인덱스까지 모두 지우겠다.
    numbersDiv.innerHTML = ""
})

