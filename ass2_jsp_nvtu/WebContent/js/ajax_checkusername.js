function check1(){
	var username="";
	username= $('#email').val();
	$.ajax({
        url: "check",
        type: 'Post',
        data: {username:username},
        success: function (data) {
          if(data>=1){
        	  alert("Trùng username,vui lòng chọn lại");
          }
        }
    });
}