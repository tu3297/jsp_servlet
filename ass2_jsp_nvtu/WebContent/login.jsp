<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/main.css">
	   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<c:choose>
   <c:when test="${sessionScope.user!= null}">
      <c:redirect url="Order"/>
    </c:when>
</c:choose>
<body>
	  <div class="wrapper">
         <div class="header">
           <div class="image">
           <img src="img/logo-lisaho.png" alt="Can't load image" >
           <img src="img/logo-southbank.png" alt="Can't load image">
            </div>
           <div class="text"><strong>HOT LINE: 0963.9999.30-0909.343.048</strong></div>
          </div>
          <div class="content">
              <div class="div-form">
                     <input type="text" id="email1" name="email" placeholder="Email">
                     <input type="password" id="pass1" name="password" placeholder="Password">
                     <button id="loginbtn" type="button" value="Đăng Nhập" onclick="sendAjaxLogin();">Đăng nhập</button>
            
            </div>
        </div>
    </div>
     <script src="js/ajax_login.js"></script>
</body>
</html>