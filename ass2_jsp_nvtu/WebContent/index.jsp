<%@page import="javafx.scene.control.Alert"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
         <div class="header">
           <div class="image">
           <img src="img/logo-lisaho.png" alt="Can't load image" >
           <img src="img/logo-southbank.png" alt="Can't load image">
            </div>
           <div class="text"><strong>HOT LINE: 0963.9999.30-0909.343.048</strong></div>
           <div class="btn-login"><img src="img/btn-dang-nhap.png" alt=""></div>
          </div>
          <div class="content">
              <div class="div-form">
                     <input type="text" id="name" name="name" placeholder="Họ và tên...">
                     <select id="place" name="place"></select>
                     <br>
                      <div class="username">
                         <input class="tx_username" type="text" id ="email" name="email" placeholder="Email" >
                         <button  type="button" class="btn_check" onclick="check1();">Check</button>
                     </div>
                     <br>
                     <input type="text" id="pass" name="password" placeholder="Mật khẩu..." >
                     <br>
                    <button id="register" type="button" value="Đăng kí" onclick="sendAjax();">Đăng Kí</button>
            </div>
            <div class="title2">
                <img src="img/Landing-page_03.gif" alt="">
            </div>
            <div class="div-steps">
                <div class="step">
                        <div class="logo-step"><center><img src="img/step-1.png" alt=""></center></div>
                        <p class="step-title"> BƯỚC 1: ĐĂNG KÍ</p>
                        <p> Đăng kí thông tin của bạn</p>
                </div>
                <div class="step">
                        <div class="logo-step"><center><img src="img/step-2.png" alt=""></center></div>
                        <p class="step-title">Được tư vấn từ bộ phận tuyển sinh </p>
                        <p>Chuyên gia tư vấn của chúng tôi sẽ giúp bạn chọn nghành phù hợp</p>
                </div>
                <div class="step">
                       <div class="logo-step"> <center><img src="img/step-3.png" alt=""></center></div>
                        <p class="step-title">Hoàn Thành Hồ Sơ</p>
                        <p>Chuyên gia sẽ giúp bạn hoàn thành hồ sơ</p>
                </div>
                <div class="step">
                       <div class="logo-step"> <center><img src="img/step-4.png" alt=""></center></div>
                        <p class="step-title">Trải Nghiệm Học Tập Quốc Tế</p>
                        <p>Bắt đầu làm việc tại nước ngoài hàng đầu thế giới</p>
                </div>
            </div>
            <div class="btn-resgister">
                <img src="img/btn-green.png" alt="">
            </div>
            <div class="div-advance">
                 <div class="div-title3"> <img src="img/Landing-page_07.gif" alt=""></div>
                 <div class="div-advances">
                     <div class="advance">
                        <div class="logo-advance">
                            <img src="img/benefit-1.jpg" alt="">
                        </div>
                        <p>Không cần thi đầu vào</p>
                     </div>
                     <div class="advance">
                     <div class="logo-advance">
                          <img src="img/benefit-2.jpg" alt="">
                          </div>
                          <p>Không cần chứng minh tài chính</p>
                     </div>
                     <div class="advance">
                       <div class="logo-advance">
                           <img src="img/benefit-3.jpg" alt="">
                       </div>
                       <p>Gía cả sinh hoạt cạnh tranh</p>
                     </div>
                     <div class="advance">
                        <div class="logo-advance">
                            <img src="img/benefit-4.jpg" alt="">
                        </div>
                        <p>
                            Đội ngũ giáo viên là các chuyên gia trong lĩnh vực chuyên môn giàu kinh nghiệm
                            trong việc giảng dạy quốc tế
                        </p>
                     </div>
                     <div class="advance">
                        <div class="logo-advance">
                            <img src="img/benefit-5.jpg" alt="">
                        </div>
                        <p>
                            250 chương trình chuyển tiếp với các trường đại học của úc sẽ là cầu nối tốt tới con
                            đường học đỉnh cao của sinh viên
                        </p>
                     </div>
                     <div class="advance">
                          <div class="logo-advance">
                              <img src="img/benefit-6.jpg" alt="">
                          </div>
                          <p>
                              Sau khi tốt nghiệp học viên được ở lại úc làm việc 2 năm
                          </p>
                     </div>
                 </div>
            </div>
            <div class="div-benefit">
                <div class="landcapse11">
                    <img src="img/Landing-page_11.png" alt="">
                </div>
                <div class="div-benefits">
                    <div class="benefit">
                        <div class="logo-benefit">
                            <img src="img/benefit-2-1.png" alt="">
                        </div>
                        <p class="title-benefit"> VỀ CHÚNG TÔI</p>
                        <p>Công ty tư vấn du học Lisaho do ông KevinChu làm chủ
                            Có nhiều năm kinh nghiệm trong đào tạo tại UC là người đại diện của tổ chức
                        </p>
                    </div>
                    <div class="benefit"> 
                       <div class="logo-benefit">
                            <img src="img/benefit-2-2.png" alt="">
                       </div>
                       <p class="title-benefit"> GIÁ TRỊ "3C"</p>
                       <p>Học sinh nhận được sự tư vấn hoàn thiện
                           Củng cố nền tảng
                           Chọn trường phù hợp 
                           Cơ hội ngề nghiệp</p>
                    </div>
                   <div  class="benefit">
                      <div class="logo-benefit">
                        <img src="img/benefit-2-3.png" alt="">
                      </div>
                      <p class="title-benefit">MIỄN PHÍ TƯ VẤN 100%</p>
                      <p>Tất cả các chuyên gia tư vấn luôn theo sát bạn,giúp bạn có lựa chọn đứng và đạt được mục tiêu du học</p>
                   </div>
                   <div class="benefit">
                      <div class="logo-benefit">
                          <img src="img/benefit-2-4.png" alt="">
                      </div>
                     <p class="title-benefit">QUÀ TẶNG GIÁ TRỊ</p>
                     <div>
                         <p><strong>1.</strong>Voucher $200 khóa học tạo đột biến của trường Dale Carmegie</p>
                         <p><strong>2.</strong> Hỗ trợ $200 vé máy bay</p>
                         <p><strong>3.</strong> Hỗ trợ $200 phí học IELTS</p>
                     </div>
                 </div>
            </div>
        </div>
        <div class="div-recruited">
            <div class="recruited-title">
                <img src="img/Landing-page_15.png" alt="">
            </div>
                <div class="recruited-content">
                    <div class="recruit-content-left">
                        <img src="img/object-left.png" alt="">
                    </div>
                    <div class="recruit-content-right">
                         <img src="img/object-right.png" alt="">
                    </div>
                </div>
            </div>
                <div class="div-linked">
                    <div class="div-title4">
                        <img src="img/Landing-page_07.gif" alt="">
                    </div>
                    <div class="div-linkeds">
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-1.jpg" alt="">
                            </div>
                            <p>Không cần thi đầu vào</p>
                        </div>
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-2.jpg" alt="">
                            </div>
                            <p>Không cần chứng minh tài chính</p>
                        </div>
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-3.jpg" alt="">
                            </div>
                            <p>Gía cả sinh hoạt cạnh tranh</p>
                        </div>
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-4.jpg" alt="">
                            </div>
                            <p>
                                Đội ngũ giáo viên là các chuyên gia trong lĩnh vực chuyên môn giàu kinh nghiệm trong việc giảng dạy quốc tế
                            </p>
                        </div>
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-5.jpg" alt="">
                            </div>
                            <p>
                                250 chương trình chuyển tiếp với các trường đại học của úc sẽ là cầu nối tốt tới con đường học đỉnh cao của sinh viên
                            </p>
                        </div>
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-6.jpg" alt="">
                            </div>
                            <p>
                                Sau khi tốt nghiệp học viên được ở lại úc làm việc 2 năm
                            </p>
                        </div>
                        <div class="linked">
                            <div class="logo-linked">
                                <img src="img/University-7.jpg" alt="">
                            </div>
                            <p>
                                Sau khi tốt nghiệp học viên được ở lại úc làm việc 2 năm
                            </p>
                        </div>
                    </div>
                </div>
                <div class="div-feedback">
                    <div><img src="img/Slide1.png" alt=""></div>
                    <div><img src="img/Slide2.png" alt=""></div>
                    <div><img src="img/Slide3.png" alt=""></div>
                    <div><img src="img/Slide4.png" alt=""></div>
                </div>
                <img class="top" src="img/go-to-top.png" alt="">
        </div>
    </div>
    <script src="js/main.js"></script>
    <script src="js/ajax_register.js"></script>
    <script src="js/ajax_checkusername.js"> </script>
</body>
</html>
