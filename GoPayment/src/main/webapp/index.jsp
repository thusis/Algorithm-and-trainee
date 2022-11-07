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
            <span class="fs-4">����â</span>
            </a>
            <form class="col-12 col-lg-auto mb-3 mb-lg-0" role="search">
            <input type="search" class="form-control" placeholder="Search..." aria-label="Search">
            </form>
        </div>
    </header>

    <div class="container">
    	<input type="text" id="product">
        <button class="btn btn-info btn-lg" id="gopayBtn" onclick="requestPay();">�����ϱ�</button>
    </div>
    

    <script>

        /**
         * 1. ��忡 ������Ʈ ���������� ������Ʈ���̺귯�� �߰�
         * 2. �����غ�
         * ������ �ĺ��ڵ�
         **/
        IMP.init("imp65827617");

        /**
         * 2. ���� ��û�ϱ�
         * IMP.request_pay�� ȣ���ϱ� ���� �������� �����ͺ��̽��� �ֹ� ���ڵ带 �����Ͽ� �ش� ���ڵ��� �ֹ���ȣ�� param.merchant_uid �� �����ϱ⸦ ����
         **/

        function requestPay(){
        	//IMP.request_pay(param, callback) ����â ȣ��
            IMP.request_pay({ //param
                pg: "html5_inicis",
                pay_method: "card",
                merchant_uid: "MERCHANT_"+new Date().getTime(), //�ش緹�ڵ��� �ֹ���ȣ
                name: "�����׽�Ʈ",
                amount: 1200,
                buyer_email: "user01@te.st",
                buyer_name: "�谡��",
                buyer_tel: "010-1234-1234",
                buyer_addr: "����Ư���� ������ �Ż絿",
                buyer_postcode: "12345"
            }, function(rsp){ //callback
                if(rsp.success){
                    /**
                     * 3. ���� ���� �����ϱ�
                     **/
                    var msg = '������ �Ϸ�Ǿ����ϴ�.';
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
//                         //������ ���� ���� API ������ ����
//                     })
//                     console.log("������ �����Ͽ����ϴ�.")
                } else {
                    alert("������ �����߽��ϴ�.")
                }});
        }

    </script>

</body>
</html>