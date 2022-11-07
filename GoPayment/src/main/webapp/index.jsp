<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!--jQuery-->
    <script type="text/javascript" src = "https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <!-- iamport.payment.js -->
    <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.8.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	

</head>
<body>

    <nav class="py-2 bg-light border-bottom">
        <div class="container d-flex flex-wrap">
            <ul class="nav me-auto">
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2 active" aria-current="page">Home</a></li>
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2">Features</a></li>
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2">Pricing</a></li>
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2">FAQs</a></li>
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2">About</a></li>
            </ul>
            <ul class="nav">
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2">Login</a></li>
            <li class="nav-item"><a href="#" class="nav-link link-dark px-2">Sign up</a></li>
            </ul>
        </div>
        </nav>

    <header class="py-3 mb-4 border-bottom">
        <div class="container d-flex flex-wrap justify-content-center">
            <a href="/" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
            <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
            <span class="fs-4">결제창</span>
            </a>
            <form class="col-12 col-lg-auto mb-3 mb-lg-0" role="search">
            <input type="search" class="form-control" placeholder="Search..." aria-label="Search">
            </form>
        </div>
    </header>

    <div class="container">
    	<input type="text" id="product">
        <button class="btn btn-info btn-lg" id="gopayBtn" onclick="requestPay();">결제하기</button>
    </div>
    

    <script>

        /**
         * 1. 헤드에 아임포트 제이쿼리와 아임포트라이브러리 추가
         * 2. 결제준비
         * 가맹점 식별코드
         **/
        IMP.init("imp65827617");

        /**
         * 2. 결제 요청하기
         * IMP.request_pay를 호출하기 전에 서버에서 데이터베이스에 주문 레코드를 생성하여 해당 레코드의 주문번호를 param.merchant_uid 에 지정하기를 권장
         **/

        function requestPay(){
        	//IMP.request_pay(param, callback) 결제창 호출
            IMP.request_pay({ //param
                pg: "html5_inicis",
                pay_method: "card",
                merchant_uid: "MERCHANT_"+new Date().getTime(), //해당레코드의 주문번호
                name: "결제테스트",
                amount: 1200,
                buyer_email: "user01@te.st",
                buyer_name: "김가람",
                buyer_tel: "010-1234-1234",
                buyer_addr: "서울특별시 강남구 신사동",
                buyer_postcode: "12345"
            }, function(rsp){ //callback
                if(rsp.success){
                    /**
                     * 3. 결제 정보 전달하기
                     **/
                    var msg = '결제가 완료되었습니다.';
                    alert(msg);
                    location.href='endpayment.do';
//                     jQuery.ajax({
//                         url:"endpayment.py",
//                         method:"POST",
//                         headers:{"Content-Type":"application/json"},
//                         data:{
//                         	productName: document.getElementById('product').value,
//                             imp_uid: rsp.imp_uid,
//                             merchant_uid: rsp.merchant_uid
//                         }
//                     }).done(function(data){
//                         //가맹점 서버 결제 API 성공시 로직
//                     })
//                     console.log("결제가 성공하였습니다.")
                } else {
                    alert("결제가 실패했습니다.")
                }});
        }

    </script>

</body>
</html>