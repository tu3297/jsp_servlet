<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<table id="tableOrder" class="table table-condensed">
  <thead>
  <c:choose>
   <c:when test="${sessionScope.user==null}">
       <c:redirect url="login.jsp"/>
    </c:when>
   </c:choose>
    <tr>
      <th>OrderId</th>
      <th>CustomerId</th>
      <th>CarId</th>
      <th>Amount</th>
      <th>Sale Price</th>
      <th>OrderDate</th>
      <th>DeliveryDate</th>
      <th>DeliveryAdress</th>
      <th>Order Status</th>
      <th>Note</th>
      <th><button id="btnlogout" onclick="logOut();" style="width:80px;">Logout</button></th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="tempOrder" items="${listOrder}">
    <tr>
      <td class="orderId">${tempOrder.orderId}</td>
      <td class="customerId">${tempOrder.customerId}</td>
      <td class="carId">${tempOrder.carId}</td>
      <td class="amount">${tempOrder.amount}</td>
      <td class="salePrice">${tempOrder.salePrice}</td>
      <td class="orderDate">${tempOrder.orderDate}</td>
      <td class="deliveryDate">${tempOrder.deliveryDate}</td>
       <td class="deliveryAdress">${tempOrder.deliveryAdress}</td>
      <td class="orderStatus">${tempOrder.orderStatus}</td>
      <td class="note">${tempOrder.note}</td>
      <td>
        <button id ="update" type="button" onclick="updateOrder($(this));" 
        class="btn btn-primary" data-toggle="modal" data-target="#myModal">Update</button>
      </td>
      <td>
        <!--<h2>Modal Example</h2>-->
        <!-- Trigger the modal with a button -->
        <button type="button" class="btn btn-primary" onclick="deleteOrder($(this));" data-toggle="modal" data-target="#myModalTwo">Delete</button>
      </td>
    </tr>
    </c:forEach>
</table>
 <center>
 <button id="insert" value="Insert" type="button" onclick="changeButton($(this));" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Insert
 </button>
 </center>
<!-- Modal Update-->
<div class="modal fade" id="myModal" role="dialog">
  <div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Update Order</h4>
      </div>

     <div class="container">
    <div class="form-group">
      <label for="email">OrderId:</label>
      <input style="width:50%;" type="text" class="form-control" id="orderId">
    </div>
    <div class="form-group">
      <label for="pwd">CustomerId:</label>
      <input style="width:50%;" type="text" class="form-control" id="customerId">
    </div>
     <div class="form-group">
      <label for="pwd">CarId:</label>
      <input style="width:50%;" type="text" class="form-control" id="carId">
    </div>
     <div class="form-group">
      <label for="pwd">Amount:</label>
      <input style="width:50%;" type="text" class="form-control" id="amount">
    </div>
     <div class="form-group">
      <label for="pwd">SalePrice:</label>
      <input style="width:50%;" type="text" class="form-control" id="salePrice">
    </div>
     <div class="form-group">
      <label for="pwd">OrderDate:</label>
      <input style="width:50%;" type="text" class="form-control" id="orderDate">
    </div>
     <div class="form-group">
      <label for="pwd">DeliveryDate:</label>
      <input style="width:50%;" type="text" class="form-control" id="deliveryDate">
    </div>
    <div class="form-group">
      <label for="pwd">DeliveryAdress:</label>
      <input style="width:50%;" type="text" class="form-control" id="deliveryAdress">
    </div>
    <div class="form-group">
      <label for="pwd">OrderStatus:</label>
      <input style="width:50%;" type="text" class="form-control" id="orderStatus">
    </div>
    <div class="form-group">
      <label for="pwd">Note:</label>
      <input style="width:50%;" type="text" class="form-control" id="note">
    </div>
    <button  id="btnDone" style="visibility:hidden;" type="submit" class="btn btn-default" onclick="insertOrder();">Insert</button>
    <button id="btnDone1" type="submit" class="btn btn-default" onclick="updateOrders();">Update</button>

    </div>
      <div class="modal-footer">
        <button type="button" value="Update" class="btn btn-default" data-dismiss="modal" onclick="changeButton($(this));">Close</button>
      </div>
    </div>
  </div>
</div>

<!-- Modal Delete-->
<div class="modal fade" id="myModalTwo" role="dialog">
  <div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Modal Title 2</h4>
      </div>
      <div class="modal-body">
        <p>Delete rows</p>
      </div>
      <div class="modal-footer">
        <button id="btnDelete" type="button" class="btn btn-default" data-dismiss="modal">OK</button>
      </div>
    </div>
  </div>
</div>
<script src="js/order.js"></script>








