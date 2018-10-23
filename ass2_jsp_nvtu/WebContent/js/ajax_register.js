function sendAjax(){
	var email="";
	var password="";
	email=$('#email').val();
	if(validateEmail(email)){
	password=$('#pass').val();
	$.ajax({
        url: "user",
        type: 'POST',
        data: {email:email,password:password},
        success: function (data) {
          if(data==1){
        	  alert("Bạn đã đăng kí thằng công");
        	  window.location.assign('login.jsp');
          }
        },/*
        error:function(data,status,er) {
        	alert("Đăng kí thất bại");
        }
        */
    });
	}else{
		alert("sai định dạng email");
	}
}
function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}