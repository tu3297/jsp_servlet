function sendAjaxLogin(){
	var email="";
	var password="";
	email=$('#email1').val();
	password=$('#pass1').val();
	$.ajax({
        url: "user",
        type: 'GET',
        data: {email:email,password:password},
        success: function (data) {
          if(data==1){
        	  alert("Bạn đã đăng nhập thành công");
        	  window.location.assign("/ass2_jsp_nvtu/Order");
          }
        }
    });
}
$('.register').click(function(){
	 window.location.href='index.jsp';
});