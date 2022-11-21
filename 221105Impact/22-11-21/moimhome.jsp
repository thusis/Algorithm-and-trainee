<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.servletContext.contextPath }" var="contextPath" scope="application"/>
<!DOCTYPE html>
<html lang="ko">

<head>

    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>솔로던트 모임게시판</title>

    <!--jQuery-->
    <script src = "https://code.jquery.com/jquery-3.6.1.min.js"></script>
    
    <!-- Favicons -->
    <link href="${contextPath}/resources/img/favicon.png" rel="icon">
    <link href="${contextPath}/resources/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Fontawesome-->
    <script src="https://kit.fontawesome.com/25fd41a4c0.js" crossorigin="anonymous"></script>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,600;1,700&family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Raleway:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">
  
    <!-- Vendor CSS Files -->
    <link href="${contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="${contextPath}/resources/vendor/aos/aos.css" rel="stylesheet">
    <link href="${contextPath}/resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
  
    <!-- Template Main CSS File -->
    <link href="${contextPath}/resources/css/main.css" rel="stylesheet">
  
    <!-- =======================================================
    * Template Name: Impact - v1.1.1
    * Template URL: https://bootstrapmade.com/impact-bootstrap-business-website-template/
    * Author: BootstrapMade.com
    * License: https://bootstrapmade.com/license/
    ======================================================== -->
</head>

<body>

<!-- ======= Header ======= --> 
<!-- ======= Start Top Bar ======= --> 
    <section id="topbar" class="topbar d-flex align-items-center">
        <div class="container d-flex justify-content-center justify-content-md-between">
            <div>
            </div>
            <div class="contact-info d-flex align-items-center">
                <i class="fa-regular fa-user"><a href="/login.me">로그인</a></i>&nbsp;&nbsp;
                <i class="fa-solid fa-user-plus"><a href="/enroll.me">회원가입</a></i>&nbsp;&nbsp;
                <i class="fa-solid fa-user"><a href="/mypage.me">마이페이지</a></i>
          </div>
        </div>
    </section><!-- End Top Bar -->

<!-- === Header =======-->
    <header id="header" class="header align-items-center"> <!--솔로던트, 메뉴-->

    <div class="container-fluid container-xl d-flex align-items-center justify-content-between">
      <a href="index.jsp" class="logo d-flex align-items-center">
        <h1>Solodunt<span>.</span></h1>
      </a>
      <nav id="navbar" class="navbar">
        <ul>
          <li><a href="/free.bo">자유게시판</a></li>
          <li><a href="/tip.bo">자취팁</a></li>
          <li><a href="/trade.bo">중고거래</a></li>
          <li><a href="/gathering.bo">모여라</a></li>
          <li class="dropdown"><a href="#"><span>내 정보</span> <i class="bi bi-chevron-down dropdown-indicator"></i></a>
            <ul>
              <li><a href="#">내 프로필</a></li>
              <li><a href="#">저장한 글</a></li>
              <li><a href="#">로그아웃</a></li>
            </ul>
          </li>
        </ul>
      </nav><!-- .navbar -->

      <i class="mobile-nav-toggle mobile-nav-show bi bi-list"></i>
      <i class="mobile-nav-toggle mobile-nav-hide d-none bi bi-x"></i>

    </div>
    </header><!-- End Header -->
  <!-- End Header -->

    <main id="main">

    <!-- ======= most viewed Section ======= -->
    <!--게시판테이블로 활용해도 괜찮을 UI-->
    <section id="faq" class="faq"> <!--id와 class는 mostviewd로-->
        <div class="container" data-aos="fade-up"> 
  
          <div class="row gy-5">
            <!--여기 아래로 수정하기-->
            <div class="col-lg-3">
                <h2><strong>솔로던트 트렌드✨</strong></h2>
                오늘 하루 가장 조회수가 높은 모집글입니다
                <br><br>
                <button type="button" class="btn btn-outline-primary btn-lg">지금 글쓰러 가기</button>
            </div>
            <div class="col-lg-1"></div>
            <div class="col-lg-8">
  
              <div class="accordion accordion-flush" id="faqlist" data-aos="fade-up" data-aos-delay="100">
              <!--id는 mostviewdlist로-->
  
                <div class="accordion-item">
                  <h3 class="accordion-header">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-1">
                        <!--target를 #mostviewed-content-1로 바꾸기-->
                      <span class="num">게시글번호1</span>
                      [지역/형태] 게시글제목 하단내용텍스트누르면게시글로이동
                    </button>
                  </h3>
                  <div id="faq-content-1" class="accordion-collapse collapse" data-bs-parent="#faqlist" >
                    <!--id를 mostviewed-content-1로 바꾸기-->
                    <!--data-bs-parent를 #mostviewedlist로 바꾸기-->
                   <div class="accordion-body">

                        <!--생략되어보일 수 있게 bn_txt_overflow라는 클래스 임의 생성함-->
                        <p class="bn_txt_overflow">
                            지혜는 끝에 거친 찾아다녀도, 피에 풍부하게 있는가? 설산에서 이상은 얼마나 바이며, 있는가? 뛰노는 주며, 위하여 돋고, 든 갑 듣는다. 풀이 그림자는 거선의 이것이다. 우는 눈이 얼음과 피어나기 석가는 그들은 것이다. 새 청춘이 얼마나 더운지라 생생하며, 속잎나고, 눈이 청춘은 이것이다. 이상의 청춘은 싸인 그들은 기관과 피가 투명하되 산야에 그들은 이것이다. 얼음이 낙원을 불러 인생을 같은 크고 철환하였는가? 거친 이상 몸이 피어나는 피는 봄바람이다. 실현에 새가 그들에게 안고, 귀는 같이 그것은 되는 군영과 것이다.

                            간에 구하지 사랑의 대한 청춘의 내려온 대고, 뿐이다. 인생에 피부가  용감하고 싹이 이것이다. 만천하의 보내는 얼음이 귀는 노년에게서 꾸며 위하여, 것이다. 우리 길을 않는 말이다. 이 생명을 군영과 되는 되려니와, 사라지지 꽃이 철환하였는가? 그들에게 현저하게 돋고, 끓는다. 황금시대를 맺어, 할지라도 얼음에 청춘의 무엇이 그들의 무한한 쓸쓸하랴? 이상, 인생에 하는 것이다. 목숨이 청춘의 어디 이상 과실이 못할 속잎나고, 청춘의 것이다.
                        </p>

                    </div>
                  </div>
                </div><!-- # Faq item-->

                <div class="accordion-item">
                  <h3 class="accordion-header">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-2">
                        <!--target를 #mostviewed-content-2로 바꾸기-->
                      <span class="num">게시글번호2</span>
                      [지역/형태] 게시글제목
                    </button>
                  </h3>
                  <div id="faq-content-2" class="accordion-collapse collapse" data-bs-parent="#faqlist" >
                    <!--id를 mostviewed-content-2로 바꾸기-->
                    <!--data-bs-parent를 #mostviewedlist로 바꾸기-->
                   <div class="accordion-body">

                        <!--생략되어보일 수 있게 bn_txt_overflow라는 클래스 임의 생성함-->
                        <p class="bn_txt_overflow">
                            지혜는 끝에 거친 찾아다녀도, 피에 풍부하게 있는가? 설산에서 이상은 얼마나 바이며, 있는가? 뛰노는 주며, 위하여 돋고, 든 갑 듣는다. 풀이 그림자는 거선의 이것이다. 우는 눈이 얼음과 피어나기 석가는 그들은 것이다. 새 청춘이 얼마나 더운지라 생생하며, 속잎나고, 눈이 청춘은 이것이다. 이상의 청춘은 싸인 그들은 기관과 피가 투명하되 산야에 그들은 이것이다. 얼음이 낙원을 불러 인생을 같은 크고 철환하였는가? 거친 이상 몸이 피어나는 피는 봄바람이다. 실현에 새가 그들에게 안고, 귀는 같이 그것은 되는 군영과 것이다.

                            간에 구하지 사랑의 대한 청춘의 내려온 대고, 뿐이다. 인생에 피부가  용감하고 싹이 이것이다. 만천하의 보내는 얼음이 귀는 노년에게서 꾸며 위하여, 것이다. 우리 길을 않는 말이다. 이 생명을 군영과 되는 되려니와, 사라지지 꽃이 철환하였는가? 그들에게 현저하게 돋고, 끓는다. 황금시대를 맺어, 할지라도 얼음에 청춘의 무엇이 그들의 무한한 쓸쓸하랴? 이상, 인생에 하는 것이다. 목숨이 청춘의 어디 이상 과실이 못할 속잎나고, 청춘의 것이다.
                        </p>

                    </div>
                  </div>
                </div><!-- # Faq item-->

                <div class="accordion-item">
                  <h3 class="accordion-header">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#faq-content-3">
                        <!--target를 #mostviewed-content-3로 바꾸기-->
                      <span class="num">게시글번호3</span>
                      [지역/형태] 게시글제목
                    </button>
                  </h3>
                  <div id="faq-content-3" class="accordion-collapse collapse" data-bs-parent="#faqlist" >
                    <!--id를 mostviewed-content-3로 바꾸기-->
                    <!--data-bs-parent를 #mostviewedlist로 바꾸기-->
                   <div class="accordion-body">

                        <!--생략되어보일 수 있게 bn_txt_overflow라는 클래스 임의 생성함-->
                        <p class="bn_txt_overflow">
                            지혜는 끝에 거친 찾아다녀도, 피에 풍부하게 있는가? 설산에서 이상은 얼마나 바이며, 있는가? 뛰노는 주며, 위하여 돋고, 든 갑 듣는다. 풀이 그림자는 거선의 이것이다. 우는 눈이 얼음과 피어나기 석가는 그들은 것이다. 새 청춘이 얼마나 더운지라 생생하며, 속잎나고, 눈이 청춘은 이것이다. 이상의 청춘은 싸인 그들은 기관과 피가 투명하되 산야에 그들은 이것이다. 얼음이 낙원을 불러 인생을 같은 크고 철환하였는가? 거친 이상 몸이 피어나는 피는 봄바람이다. 실현에 새가 그들에게 안고, 귀는 같이 그것은 되는 군영과 것이다.

                            간에 구하지 사랑의 대한 청춘의 내려온 대고, 뿐이다. 인생에 피부가  용감하고 싹이 이것이다. 만천하의 보내는 얼음이 귀는 노년에게서 꾸며 위하여, 것이다. 우리 길을 않는 말이다. 이 생명을 군영과 되는 되려니와, 사라지지 꽃이 철환하였는가? 그들에게 현저하게 돋고, 끓는다. 황금시대를 맺어, 할지라도 얼음에 청춘의 무엇이 그들의 무한한 쓸쓸하랴? 이상, 인생에 하는 것이다. 목숨이 청춘의 어디 이상 과실이 못할 속잎나고, 청춘의 것이다.
                        </p>

                    </div>
                  </div>
                </div><!-- # Faq item-->
  
  
              </div>
            </div>

          </div>
        </div>
      </section><!-- End Frequently Asked Questions Section -->


    <!--======= 분류 ===========-->

    
    <div class="container">
        <hr>
        <div class="form-check form-switch">
            <input class="form-check-input" type="checkbox" id="flexSwitchCheckChecked" checked>
            <label class="form-check-label" for="flexSwitchCheckChecked">모집중인 글만 보기</label>
        </div>

        <br>

        <div class="row align-items-center">
            <div class="col-lg-2 bn_txt_strong ">모임분류</div>
            <div class="col">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                    <label class="form-check-label" for="inlineCheckbox1">동아리</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">공모전</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">취미활동</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">자기개발</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">기타</label>
                </div>
            </div>
            <div class="col"></div>
        </div>
        <br>
        <div class="row align-items-center">
            <div class="col-lg-2 bn_txt_strong ">모임지역</div>
            <div class="col-lg-8">

            <!-- 지역구분 -->
            <select name="sido1" id="sido1"></select>
            <select name="gugun1" id="gugun1"></select>

            <script>
                $('document').ready(function() {
                    var area0 = ["시/도 선택","전체","서울특별시","인천광역시","대전광역시","광주광역시","대구광역시","울산광역시","부산광역시","경기도","강원도","충청북도","충청남도","전라북도","전라남도","경상북도","경상남도","제주도"];
                    var area1 = ["전체","강남구","강동구","강북구","강서구","관악구","광진구","구로구","금천구","노원구","도봉구","동대문구","동작구","마포구","서대문구","서초구","성동구","성북구","송파구","양천구","영등포구","용산구","은평구","종로구","중구","중랑구"];
                    var area2 = ["전체","계양구","남구","남동구","동구","부평구","서구","연수구","중구","강화군","옹진군"];
                    var area3 = ["전체","대덕구","동구","서구","유성구","중구"];
                    var area4 = ["전체","광산구","남구","동구",     "북구","서구"];
                    var area5 = ["전체","남구","달서구","동구","북구","서구","수성구","중구","달성군"];
                    var area6 = ["전체","남구","동구","북구","중구","울주군"];
                    var area7 = ["전체","강서구","금정구","남구","동구","동래구","부산진구","북구","사상구","사하구","서구","수영구","연제구","영도구","중구","해운대구","기장군"];
                    var area8 = ["전체","고양시","과천시","광명시","광주시","구리시","군포시","김포시","남양주시","동두천시","부천시","성남시","수원시","시흥시","안산시","안성시","안양시","양주시","오산시","용인시","의왕시","의정부시","이천시","파주시","평택시","포천시","하남시","화성시","가평군","양평군","여주군","연천군"];
                    var area9 = ["전체","강릉시","동해시","삼척시","속초시","원주시","춘천시","태백시","고성군","양구군","양양군","영월군","인제군","정선군","철원군","평창군","홍천군","화천군","횡성군"];
                    var area10 = ["전체","제천시","청주시","충주시","괴산군","단양군","보은군","영동군","옥천군","음성군","증평군","진천군","청원군"];
                    var area11 = ["전체","계룡시","공주시","논산시","보령시","서산시","아산시","천안시","금산군","당진군","부여군","서천군","연기군","예산군","청양군","태안군","홍성군"];
                    var area12 = ["전체","군산시","김제시","남원시","익산시","전주시","정읍시","고창군","무주군","부안군","순창군","완주군","임실군","장수군","진안군"];
                    var area13 = ["전체","광양시","나주시","목포시","순천시","여수시","강진군","고흥군","곡성군","구례군","담양군","무안군","보성군","신안군","영광군","영암군","완도군","장성군","장흥군","진도군","함평군","해남군","화순군"];
                    var area14 = ["전체","경산시","경주시","구미시","김천시","문경시","상주시","안동시","영주시","영천시","포항시","고령군","군위군","봉화군","성주군","영덕군","영양군","예천군","울릉군","울진군","의성군","청도군","청송군","칠곡군"];
                    var area15 = ["전체","거제시","김해시","마산시","밀양시","사천시","양산시","진주시","진해시","창원시","통영시","거창군","고성군","남해군","산청군","의령군","창녕군","하동군","함안군","함양군","합천군"];
                    var area16 = ["전체","서귀포시","제주시","남제주군","북제주군"];
            
                    // 시/도 선택 박스 초기화
                    $("select[name^=sido]").each(function() {
                    $selsido = $(this);
                    $.each(eval(area0), function() {
                            $selsido.append("<option value='"+this+"'>"+this+"</option>");
                        });
                        $selsido.next().append("<option value=''>구/군 선택</option>");
                    });
            
                    // 시/도 선택시 구/군 설정
                    $("select[name^=sido]").change(function() {
                        var area = "area"+$("option",$(this)).index($("option:selected",$(this))); // 선택지역의 구군 Array
                        var $gugun = $(this).next(); // 선택영역 군구 객체
                        $("option",$gugun).remove(); // 구군 초기화
            
                        if(area == "area0")
                        $gugun.append("<option value=''>구/군 선택</option>");
                            else {
                                $.each(eval(area), function() {
                                $gugun.append("<option value='"+this+"'>"+this+"</option>");
                            });
                            }
                        });
                });
            </script>
            </div>  
        </div>

        <br>

        <div class="row align-items-center">
            <div class="col-lg-2 bn_txt_strong">내용검색</div>
            <div class="col-lg-8"><input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm"></div>
            <div class="col-lg-2"><button type="button" class="btn btn-primary btn-lg">검색하기</button></div>
        </div>
        <hr>
    </div>


    <!-- =========게시글================-->
    <section id="blog" class="blog">
        <!--아이디와 클래스 moinpost로 수정-->
        <div class="container" data-aos="fade-up">
  
            <div class="row gy-4 posts-list">
  
                <div class="col-xl-4 col-md-6">
                <article>
    
                    <div class="post-img">
                    <img src="resources/img/blog/blog-1.jpg" alt="" class="img-fluid">
                    </div>

                    <div class="row justify-content-between">
                        <span class="col group_type">공모전 / 중구</span>
                        <span class="col text-end group_status date">모집중 2022-11-05</span>
                    </div>
                    <!--group_type 이랑 group_status, date 속성 추가-->
                    <br>
                    
                    <h2 class="title">
                    <a href="blog-details.html">우주 관련 아이디어 해커톤(Upcoming Life in Space SW Challenge) 같이 하실 분</a>
                    </h2>

                    <div class="row justify-content-between">
                        <span class="col">나천재</span>
                        <span class="col text-end">
                            <i class="view fa-solid fa-eye"></i>&nbsp;9&nbsp;
                            <i class="like fa-regular fa-heart"></i>&nbsp;&nbsp;&nbsp;
                            <i class="save fa-regular fa-bookmark"></i>&nbsp;1
                            <!--view, like 이랑 save 클래스 추가-->
                        </span>
                    </div>
                    
    
                </article>
                </div><!-- End post list item -->
                <div class="col-xl-4 col-md-6">
                <article>
    
                    <div class="post-img">
                    <img src="resources/img/blog/blog-1.jpg" alt="" class="img-fluid">
                    </div>

                    <div class="row justify-content-between">
                        <span class="col group_type">공모전 / 중구</span>
                        <span class="col text-end group_status date">모집중 2022-11-05</span>
                    </div>
                    <!--group_type 이랑 group_status, date 속성 추가-->
                    <br>
                    
                    <h2 class="title">
                    <a href="blog-details.html">우주 관련 아이디어 해커톤(Upcoming Life in Space SW Challenge) 같이 하실 분</a>
                    </h2>

                    <div class="row justify-content-between">
                        <span class="col">나천재</span>
                        <span class="col text-end">
                            <i class="view fa-solid fa-eye"></i>&nbsp;9&nbsp;
                            <i class="like fa-regular fa-heart"></i>&nbsp;&nbsp;&nbsp;
                            <i class="save fa-regular fa-bookmark"></i>&nbsp;1
                            <!--view, like 이랑 save 클래스 추가-->
                        </span>
                    </div>
                    
    
                </article>
                </div><!-- End post list item -->
                <div class="col-xl-4 col-md-6">
                <article>
    
                    <div class="post-img">
                    <img src="resources/img/blog/blog-1.jpg" alt="" class="img-fluid">
                    </div>

                    <div class="row justify-content-between">
                        <span class="col group_type">공모전 / 중구</span>
                        <span class="col text-end group_status date">모집중 2022-11-05</span>
                    </div>
                    <!--group_type 이랑 group_status, date 속성 추가-->
                    <br>
                    
                    <h2 class="title">
                    <a href="blog-details.html">우주 관련 아이디어 해커톤(Upcoming Life in Space SW Challenge) 같이 하실 분</a>
                    </h2>

                    <div class="row justify-content-between">
                        <span class="col">나천재</span>
                        <span class="col text-end">
                            <i class="view fa-solid fa-eye"></i>&nbsp;9&nbsp;
                            <i class="like fa-regular fa-heart"></i>&nbsp;2&nbsp;&nbsp;
                            <i class="save fa-regular fa-bookmark"></i>&nbsp;1
                            <!--view, like 이랑 save 클래스 추가-->
                        </span>
                    </div>
                    
    
                </article>
                </div><!-- End post list item -->
                <div class="col-xl-4 col-md-6">
                <article>
    
                    <div class="post-img">
                    <img src="resources/img/blog/blog-1.jpg" alt="" class="img-fluid">
                    </div>

                    <div class="row justify-content-between">
                        <span class="col group_type">공모전 / 중구</span>
                        <span class="col text-end group_status date">모집중 2022-11-05</span>
                    </div>
                    <!--group_type 이랑 group_status, date 속성 추가-->
                    <br>
                    
                    <h2 class="title">
                    <a href="blog-details.html">우주 관련 아이디어 해커톤(Upcoming Life in Space SW Challenge) 같이 하실 분</a>
                    </h2>

                    <div class="row justify-content-between">
                        <span class="col">나천재</span>
                        <span class="col text-end">
                            <i class="view fa-solid fa-eye"></i>&nbsp;9&nbsp;
                            <i class="like fa-regular fa-heart"></i>&nbsp;&nbsp;&nbsp;
                            <i class="save fa-regular fa-bookmark"></i>&nbsp;1
                            <!--view, like 이랑 save 클래스 추가-->
                        </span>
                    </div>
                    
    
                </article>
                </div><!-- End post list item -->
                <div class="col-xl-4 col-md-6">
                <article>
    
                    <div class="post-img">
                    <img src="resources/img/blog/blog-1.jpg" alt="" class="img-fluid">
                    </div>

                    <div class="row justify-content-between">
                        <span class="col group_type">공모전 / 중구</span>
                        <span class="col text-end group_status date">모집중 2022-11-05</span>
                    </div>
                    <!--group_type 이랑 group_status, date 속성 추가-->
                    <br>
                    
                    <h2 class="title">
                    <a href="blog-details.html">우주 관련 아이디어 해커톤(Upcoming Life in Space SW Challenge) 같이 하실 분</a>
                    </h2>

                    <div class="row justify-content-between">
                        <span class="col">나천재</span>
                        <span class="col text-end">
                            <i class="view fa-solid fa-eye"></i>&nbsp;9&nbsp;
                            <i class="like fa-regular fa-heart"></i>&nbsp;2&nbsp;&nbsp;
                            <i class="save fa-regular fa-bookmark"></i>&nbsp;1
                            <!--view, like 이랑 save 클래스 추가-->
                        </span>
                    </div>
                    
    
                </article>
                </div><!-- End post list item -->
                <div class="col-xl-4 col-md-6">
                <article>
    
                    <div class="post-img">
                    <img src="resources/img/blog/blog-1.jpg" alt="" class="img-fluid">
                    </div>

                    <div class="row justify-content-between">
                        <span class="col group_type">공모전 / 중구</span>
                        <span class="col text-end group_status date">모집중 2022-11-05</span>
                    </div>
                    <!--group_type 이랑 group_status, date 속성 추가-->
                    <br>
                    
                    <h2 class="title">
                    <a href="blog-details.html">우주 관련 아이디어 해커톤(Upcoming Life in Space SW Challenge) 같이 하실 분</a>
                    </h2>

                    <div class="row justify-content-between">
                        <span class="col">나천재</span>
                        <span class="col text-end">
                            <i class="view fa-solid fa-eye"></i>&nbsp;9&nbsp;
                            <i class="like fa-regular fa-heart"></i>&nbsp;2&nbsp;&nbsp;
                            <i class="save fa-regular fa-bookmark"></i>&nbsp;1
                            <!--view, like 이랑 save 클래스 추가-->
                        </span>
                    </div>
                    
    
                </article>
                </div><!-- End post list item -->
            </div><!-- End blog posts list -->
        </div>
    </section><!-- End Blog Section -->


  


    <!-- =======페이지네이션 두 가지 버전-->
    <div class="bn-pagination">
        <ul class="justify-content-center">
          <li><a href="#">1</a></li>
          <li class="active"><a href="#">2</a></li>
          <li><a href="#">3</a></li>
        </ul>
    </div>

    <br>
    <!--========페이지네이션 추후 수정=======-->

    <div class="container d-flex justify-content-center" >
            <nav aria-label="Page navigation example" >
                <ul class="pagination">
                  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                  <li class="page-item"><a class="page-link" href="#">1</a></li>
                  <li class="page-item"><a class="page-link" href="#">2</a></li>
                  <li class="page-item"><a class="page-link" href="#">3</a></li>
                  <li class="page-item"><a class="page-link" href="#">4</a></li>
                  <li class="page-item"><a class="page-link" href="#">5</a></li>
                  <li class="page-item"><a class="page-link" href="#">6</a></li>
                  <li class="page-item"><a class="page-link" href="#">7</a></li>
                  <li class="page-item"><a class="page-link" href="#">8</a></li>
                  <li class="page-item"><a class="page-link" href="#">9</a></li>
                  <li class="page-item"><a class="page-link" href="#">10</a></li>
                  <li class="page-item"><a class="page-link" href="#">Next</a></li>
                </ul>
            </nav>

    </div>

    </main>

    <!-- ======= Footer ======= -->
    <footer id="footer" class="footer">

    <div class="container">
        <div class="row gy-4">
        <div class="col-lg-5 col-md-12 footer-info">
            <a href="index.html" class="logo d-flex align-items-center">
            <span>Impact</span>
            </a>
            <p>Cras fermentum odio eu feugiat lide par naso tierra. Justo eget nada terra videa magna derita valies darta donna mare fermentum iaculis eu non diam phasellus.</p>
            <div class="social-links d-flex mt-4">
            <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
            <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
            <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
            <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
            </div>
        </div>

        <div class="col-lg-2 col-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About us</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Terms of service</a></li>
            <li><a href="#">Privacy policy</a></li>
            </ul>
        </div>

        <div class="col-lg-2 col-6 footer-links">
            <h4>Our Services</h4>
            <ul>
            <li><a href="#">Web Design</a></li>
            <li><a href="#">Web Development</a></li>
            <li><a href="#">Product Management</a></li>
            <li><a href="#">Marketing</a></li>
            <li><a href="#">Graphic Design</a></li>
            </ul>
        </div>

        <div class="col-lg-3 col-md-12 footer-contact text-center text-md-start">
            <h4>Contact Us</h4>
            <p>
            A108 Adam Street <br>
            New York, NY 535022<br>
            United States <br><br>
            <strong>Phone:</strong> +1 5589 55488 55<br>
            <strong>Email:</strong> info@example.com<br>
            </p>

        </div>

        </div>
    </div>

    <div class="container mt-4">
        <div class="copyright">
        &copy; Copyright <strong><span>Impact</span></strong>. All Rights Reserved
        </div>
        <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/impact-bootstrap-business-website-template/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
        </div>
    </div>

    </footer><!-- End Footer -->
    <!-- End Footer -->

    <a href="#" class="scroll-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

    <div id="preloader"></div>
  
    <!-- Vendor JS Files --> <!--이거 없으면 화면 안 나옴-->
    <script src="${contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="${contextPath}/resources/vendor/aos/aos.js"></script>
    <script src="${contextPath}/resources/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="${contextPath}/resources/vendor/purecounter/purecounter_vanilla.js"></script>
    <script src="${contextPath}/resources/vendor/swiper/swiper-bundle.min.js"></script>
    <script src="${contextPath}/resources/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="${contextPath}/resources/vendor/php-email-form/validate.js"></script>

    <!-- Template Main JS File -->
    <script src="${contextPath}/resources/js/main.js"></script>

</body>



</html>