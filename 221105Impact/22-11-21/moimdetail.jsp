<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
  
    <title>솔로던트 모임게시판-상세글</title>

    <!--jQuery-->
    <script src = "https://code.jquery.com/jquery-3.6.1.min.js"></script>
    
    <!-- Favicons -->
    <link href="/img/favicon.png" rel="icon">
    <link href="/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Fontawesome-->
    <script src="https://kit.fontawesome.com/25fd41a4c0.js" crossorigin="anonymous"></script>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,600;1,700&family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Raleway:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">
  
    <!-- Vendor CSS Files -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="resources/vendor/aos/aos.css" rel="stylesheet">
    <link href="resources/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="resources/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
  
    <!-- Template Main CSS File -->
    <link href="resources/css/main.css" rel="stylesheet">
  
    <!-- =======================================================
    * Template Name: Impact - v1.1.1
    * Template URL: https://bootstrapmade.com/impact-bootstrap-business-website-template/
    * Author: BootstrapMade.com
    * License: https://bootstrapmade.com/license/
    ======================================================== -->
</head>

<body>

  <!-- ======= Header ======= -->
  <section id="topbar" class="topbar d-flex align-items-center">
    <div class="container d-flex justify-content-center justify-content-md-between">
      <div class="contact-info d-flex align-items-center">
        <i class="bi bi-envelope d-flex align-items-center"><a href="mailto:contact@example.com">contact@example.com</a></i>
        <i class="bi bi-phone d-flex align-items-center ms-4"><span>+1 5589 55488 55</span></i>
      </div>
      <div class="social-links d-none d-md-flex align-items-center">
        <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
        <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
        <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
        <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
      </div>
    </div>
  </section><!-- End Top Bar -->

  <header id="header" class="header d-flex align-items-center">

    <div class="container-fluid container-xl d-flex align-items-center justify-content-between">
      <a href="index.html" class="logo d-flex align-items-center">
        <!-- Uncomment the line below if you also wish to use an image logo -->
        <!-- <img src="assets/img/logo.png" alt=""> -->
        <h1>Impact<span>.</span></h1>
      </a>
      <nav id="navbar" class="navbar">
        <ul>
          <li><a href="#hero">Home</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#services">Services</a></li>
          <li><a href="#portfolio">Portfolio</a></li>
          <li><a href="#team">Team</a></li>
          <li><a href="blog.html">Blog</a></li>
          <li class="dropdown"><a href="#"><span>Drop Down</span> <i class="bi bi-chevron-down dropdown-indicator"></i></a>
            <ul>
              <li><a href="#">Drop Down 1</a></li>
              <li class="dropdown"><a href="#"><span>Deep Drop Down</span> <i class="bi bi-chevron-down dropdown-indicator"></i></a>
                <ul>
                  <li><a href="#">Deep Drop Down 1</a></li>
                  <li><a href="#">Deep Drop Down 2</a></li>
                  <li><a href="#">Deep Drop Down 3</a></li>
                  <li><a href="#">Deep Drop Down 4</a></li>
                  <li><a href="#">Deep Drop Down 5</a></li>
                </ul>
              </li>
              <li><a href="#">Drop Down 2</a></li>
              <li><a href="#">Drop Down 3</a></li>
              <li><a href="#">Drop Down 4</a></li>
            </ul>
          </li>
          <li><a href="#contact">Contact</a></li>
        </ul>
      </nav><!-- .navbar -->

      <i class="mobile-nav-toggle mobile-nav-show bi bi-list"></i>
      <i class="mobile-nav-toggle mobile-nav-hide d-none bi bi-x"></i>

    </div>
  </header><!-- End Header -->
  <!-- End Header -->

  <main id="main">

    <!-- =====목차 ==== -->
    <div class="breadcrumbs">
      <nav>
        <div class="container">
          <ol>
            <li><a href="index.html">모임</a></li>
            <li>상세글보기</li>
          </ol>
        </div>
      </nav>
    </div>
    
    <!-- ======= Blog Details Section ======= -->
    <section id="blog" class="blog">
      <div class="container" data-aos="fade-up">

        <div class="row g-5">

          <div class="col-lg-12">


            <article class="blog-details">
              
              <div class="row">
                <div class="col-10"><h2 class="title">제목은 어쩌구저쩌구</h2></div>
                <div class="col-2 d-flex align-items-center justify-content-center">
                  <a href=""> <!-- 글쓴이의 경우: 수정 / 삭제 // 보는 사람의 경우 : 신고-->
                    <i class="bi lg bi-three-dots" style="font-size: 2rem; color:darkgray;"></i>
                  </a>
                </div>
              </div>

              
              <div class="meta-top">
                  <ul>
                    <li class="align-items-center"><i class="bi bi-person"></i>글쓴사람닉네임</li>
                    <li class="align-items-center"><i class="bi bi-clock"></i> <time datetime="2020-01-01">작성일</time></li>
                    <li class="align-items-center"><i class="bi bi-chat-dots"></i> <a href="#comments">댓글수</a></li><!--누르면댓글로이동-->
  
                    <!--누르면 하트 채움 / 추천 수 나타냄-->
                    <li class="align-items-center"><i class="bi bi-heart"></i>좋아요 수</li> 
                    <li class="align-items-center"><i class="bi bi-heart-fill"></i>좋아요 수</li> 
                    
                    <li class="align-items-center"> | </li>
  
                    <!-- 여기부터 모임만 해당-->
                    <li class="align-items-center"><i class="bi bi-geo-alt"></i> <a href="blog-details.html">모집지역</a></li><!--누르면 지역으로 검색-->
                    <li class="align-items-center"><i class="bi bi-people-fill"></i> <a href="blog-details.html">모임형태</a></li><!--누르면 모임형태로 검색-->
                    
  
                    <!--모집중인지, 마감인지 여부에 따라-->
                    <li class="align-items-center"><i class="bi bi-patch-check-fill"></i> 모집중</li>
                    <li class="align-items-center"><i class="bi bi-x-circle-fill"></i> 모집마감</li>
                  </ul>
              </div><!-- End meta top -->

              <div class="content">
                <p>그와 장식하는 구하지 눈이 일월과 것은 가지에 교향악이다. 이것이야말로 그들의 무엇을 피가 없는 있는 어디 인간의 생명을 힘있다. 품고 심장은 만물은 그리하였는가? 못하다 봄바람을 그들은 지혜는 관현악이며, 만천하의 사랑의 이것이다. 불어 이상은 싶이 하는 속에서 옷을 있다. 일월과 내려온 석가는 대고, 것은 보이는 교향악이다. 청춘 오아이스도 같은 이상의 그들에게 위하여 대중을 말이다. 풀밭에 노년에게서 인생을 뜨거운지라, 가진 영원히 곳으로 않는 것이다. 가지에 든 싸인 자신과 두손을 우리의 그들을 뜨고, 밝은 피다. 영원히 못하다 눈에 같지 품으며, 길지 피는 봄바람이다. 피어나는 크고 그들에게 피가 시들어 아름다우냐?</p>
                <p>보이는 하였으며, 돋고, 이상 약동하다. 있는 가치를 창공에 그들은 품었기 얼음이 곳으로 봄바람이다. 능히 인생을 인생을 것이다. 전인 투명하되 석가는 살 없는 있는 사막이다. 바로 인류의 불어 얼마나 웅대한 굳세게 부패를 쓸쓸하랴? 옷을 맺어, 장식하는 천고에 봄바람이다. 청춘이 천지는 방황하였으며, 불어 무엇을 약동하다. 길지 역사를 우리의 심장은 오아이스도 그들에게 그들의 철환하였는가? 이상 주며, 풀밭에 곳이 무엇이 새 방황하였으며, 공자는 것이다.</p>
                <p> 노래하며 없는 피가 아름다우냐? 어디 실로 뛰노는 관현악이며, 작고 희망의 이것이다. 청춘 꽃 부패를 사막이다. 그들은 그들의 봄바람을 사라지지 찬미를 아니다. 힘차게 구하기 청춘의 심장은 불어 칼이다. 피가 이성은 같은 청춘 내려온 그들의 옷을 석가는 행복스럽고 위하여서. 얼마나 인간이 밝은 뿐이다. 대고, 그들의 인생에 커다란 찬미를 든 있으랴? 열락의 그것은 소담스러운 더운지라 때문이다. 살았으며, 것이다.보라, 작고 풍부하게 현저하게 것이다. 같은 같은 소금이라 이상의 발휘하기 방황하였으며, 인생을 뜨거운지라, 방황하여도, 힘있다.</p>


                <img src="assets/img/blog/blog-inside-post.jpg" class="img-fluid" alt="">


              </div><!-- End post content -->

              <div class="meta-bottom">
                <i class="bi bi-folder"></i>
                <ul class="cats">
                  <li><a href="#">Business</a></li>
                </ul>

                <i class="bi bi-tags"></i>
                <ul class="tags">
                  <li><a href="#">Creative</a></li>
                  <li><a href="#">Tips</a></li>
                  <li><a href="#">Marketing</a></li>
                </ul>
              </div><!-- End meta bottom -->

            </article><!-- End blog post -->

            <div class="post-author d-flex align-items-center">
              <img src="assets/img/blog/blog-author.jpg" class="rounded-circle flex-shrink-0" alt="">
              <div>
                <h4>Jane Smith</h4>
                <div class="social-links">
                  <a href="https://twitters.com/#"><i class="bi bi-twitter"></i></a>
                  <a href="https://facebook.com/#"><i class="bi bi-facebook"></i></a>
                  <a href="https://instagram.com/#"><i class="biu bi-instagram"></i></a>
                </div>
                <p>
                  Itaque quidem optio quia voluptatibus dolorem dolor. Modi eum sed possimus accusantium. Quas repellat voluptatem officia numquam sint aspernatur voluptas. Esse et accusantium ut unde voluptas.
                </p>
              </div>
            </div><!-- End post author -->

            <div id="comments" class="comments">

              <h4 class="comments-count">8 개의 댓글</h4>

              <div class="row">
                <div class="col-lg-2"><h5>댓글작성자</h5></div>
                <div class="col-lg-6"><h5>내용</h5></div>
                <div class="col-lg-1"><h5>?</h5></div>
                <div class="col-lg-1"><h5>추천</h5></div>
                <div class="col-lg-2"><h5>작성날짜</h5></div>
              </div>
              
              <div class="row">
                <div class="col-lg-2"><h5>댓글작성자</h5></div>
                <div class="col-lg-6"><h5>내용</h5></div>
                <div class="col-lg-1"><h5>?</h5></div>
                <div class="col-lg-1"><h5>추천</h5></div>
                <div class="col-lg-2"><h5>작성날짜</h5></div>
              </div>

              <div class="reply-form">

                <h4>댓글을 남기세요</h4>

                <form action="">
                  <div class="row">
                    <div class="col-10 form-group">
                      <textarea name="comment" class="form-control" placeholder="Your Comment*"></textarea>
                    </div>
                    <div class="col-2">
                      <button type="submit" class="btn btn-primary">Post Comment</button>
                    </div>
                    
                  </div>

                </form>

              </div>

            </div><!-- End blog comments -->

          </div>

          <div class="col-lg-4">



          </div>
        </div>

      </div>
    </section><!-- End Blog Details Section -->

  </main><!-- End #main -->

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
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="resources/vendor/aos/aos.js"></script>
    <script src="resources/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="resources/vendor/purecounter/purecounter_vanilla.js"></script>
    <script src="resources/vendor/swiper/swiper-bundle.min.js"></script>
    <script src="resources/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="resources/vendor/php-email-form/validate.js"></script>

    <!-- Template Main JS File -->
    <script src="resources/js/main.js"></script>

</body>
</html>