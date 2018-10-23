function changeButton(param){
	if(param.val()=="Insert"){
	    $('#orderId').val("");
	    $('#carId').val("");
	    $('#customerId').val("");
	    $('#amount').val("");
	    $('#salePrice').val("");
	    $('#orderDate').val("");
	    $('#deliveryDate').val("");
	    $('#deliveryAdress').val("");
	    $('#orderStatus').val("");
	    $('#note').val("");
		document.getElementById('btnDone').style.visibility="visible";
		document.getElementById('btnDone1').style.visibility="hidden";
	}
	else{
	    $('#orderId').val("");
	    $('#carId').val("");
	    $('#customerId').val("");
	    $('#amount').val("");
	    $('#salePrice').val("");
	    $('#orderDate').val("");
	    $('#deliveryDate').val("");
	    $('#deliveryAdress').val("");
	    $('#orderStatus').val("");
	    $('#note').val("");
		document.getElementById('btnDone1').style.visibility="visible";
		document.getElementById('btnDone').style.visibility="hidden";
	}
}
function insertOrder(x){
	var orderId;
	var carId;
	var customerId;
    var amount;
    var salePrice;
    var orderDate;
    var deliveryDate;
    var deliveryAdress;
    var orderStatus;
    var note;
    var type="insert";
    var tableOrder=$('#tableOrder');
    orderId=$('#orderId').val();
    carId=$('#carId').val();
    customerId=$('#customerId').val();
    amount=$('#amount').val();
    salePrice=$('#salePrice').val();
    orderDate=$('#orderDate').val();
    deliveryDate=$('#deliveryDate').val();
    deliveryAdress=$('#deliveryAdress').val();
    orderStatus=$('#orderStatus').val();
    note=$('#note').val();
    $.ajax({
        url: "Order",
        type: 'POST',
        data: {
        	orderId:orderId,
        	carId:carId,
        	customerId:customerId,
        	amount:amount,
        	salePrice:salePrice,
        	orderDate:orderDate,
        	deliveryDate:deliveryDate,
        	deliveryAdress:deliveryAdress,
        	orderStatus:orderStatus,
        	note:note,
        	type:type
        },
        success: function (data) {
        	if(data=="true"){
        		alert("Insert Suceess");
        		tableOrder.append('<tr><td>'+orderId+'</td><td>'+carId+'</td><td>'+customerId+'</td><td>'+
        				               amount+'</td><td>'+salePrice+'</td><td>'+orderDate+'</td><td>'+
        				               deliveryDate+'</td><td>'+deliveryAdress+'</td><td>'+orderStatus+'</td><td>'
        				               +'</td><td>'+note+'</td></tr>');
        	}
        }
    });   
}
function updateOrder(x){
	var orderId;
	var carId;
	var customerId;
    var amount;
    var salePrice;
    var orderDate;
    var deliveryDate;
    var deliveryAdress;
    var orderStatus;
    var note;
    var type="update";
    var rows=x.closest("tr");
    var tableOrder=$('#tableOrder');
    $('#orderId').val(rows.find(".orderId").text());
    $('#carId').val(rows.find(".carId").text());
    $('#customerId').val(rows.find(".customerId").text());
    $('#amount').val(rows.find(".amount").text());
    $('#salePrice').val(rows.find(".salePrice").text());
    $('#orderDate').val(rows.find(".orderDate").text());
    $('#deliveryDate').val(rows.find(".deliveryDate").text());
    $('#deliveryAdress').val(rows.find(".deliveryAdress").text());
    $('#orderStatus').val(rows.find(".orderStatus").text());
    $('#note').val(rows.find(".note").text());
}
function updateOrders(){
	var orderId;
	var carId;
	var customerId;
    var amount;
    var salePrice;
    var orderDate;
    var deliveryDate;
    var deliveryAdress;
    var orderStatus;
    var note;
    var tableOrder=$('#tableOrder');
    var type="update";
    orderId=$('#orderId').val();
    carId=$('#carId').val();
    customerId=$('#customerId').val();
    amount=$('#amount').val();
    salePrice=$('#salePrice').val();
    orderDate=$('#orderDate').val();
    deliveryDate=$('#deliveryDate').val();
    deliveryAdress=$('#deliveryAdress').val();
    orderStatus=$('#orderStatus').val();
    note=$('#note').val();
    
    $.ajax({
        url: "Order",
        type: 'POST',
        data: {
        	orderId:orderId,
        	carId:carId,
        	customerId:customerId,
        	amount:amount,
        	salePrice:salePrice,
        	orderDate:orderDate,
        	deliveryDate:deliveryDate,
        	deliveryAdress:deliveryAdress,
        	orderStatus:orderStatus,
        	note:note,
        	type:type
        },
        success: function (data) {
        	if(data=="true"){
        		alert("Update Suceess");
        		tableOrder.find('tr').each(function (i) {
        	        var $tds = $(this).find('td');
        	            var temp = $tds.eq(0).text();
        	            if(temp==orderId){
        	            	$tds.eq(3).html(amount);
        	            	$tds.eq(4).html(salePrice);
        	            	$tds.eq(5).html(orderDate);
        	            	$tds.eq(6).html(deliveryDate);
        	            	$tds.eq(7).html(deliveryAdress);
        	            	$tds.eq(8).html(orderStatus);
        	            	$tds.eq(9).html(note);
        	            	return;
        	            }
        	        // do something with productId, product, Quantity
        	    });
        	}	
        }
    });   
}
function deleteOrder(params){
	 var rows=params.closest("tr");
	 var orderId=rows.find(".orderId").text();
	 var tableOrder=$('#tableOrder');
	 var type="delete";
	 $.ajax({
	        url: "Order",
	        type: 'Post',
	        data: {
	        	orderIds:orderId,
	        	type:type
	        },
	        success: function (data) {
	        	if(data=="true"){
	        		alert("delete Success");
	        		tableOrder.find('tr').each(function (i) {
	        	        var $tds = $(this).find('td');
	        	            var temp = $tds.eq(0).text();
	        	            if(temp==orderId){
	        	            	$(this).remove();
	        	            	return;
	        	            }
	        	       });	
	             }
	        }
	    });   
}