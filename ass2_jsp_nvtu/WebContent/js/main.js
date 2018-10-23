var currentIndex=0,
    items=$('.div-feedback > div'),
    itemAmt=items.lenhth;
function cycleItems(){
	var item=$('.div-feedback > div').eq(currentIndex);
	items.hide();
	item.css('display','inline-block');
}
var autoslide=setInterval(function(){
	currentIndex+=1;
	currentIndex=currentIndex%4;
	cycleItems();
},3000);
$(".div-feedback").click(function(){
	currentIndex+=1;
	currentIndex=currentIndex%4;
	cycleItems();
});
$('.top').click(function(){
  $("html, body").animate({ scrollTop: 0 }, "slow");
  return false;
});
$('.btn-login').click(function(){
   window.location.href='login.jsp';
});
function toast(x){
	alert(x);
}
