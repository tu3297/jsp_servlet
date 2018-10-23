package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Order;
import Service.CarService;
import Service.CarServiceImpl;
import Service.OrderService;
import Service.OrderServiceImpl;

/**
 * Servlet implementation class OrderController
 */
@WebServlet("/Order")
public class OrderController extends HttpServlet {
	private OrderServiceImpl orderService;
	private Order order = null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// getAllOrder
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		orderService = new OrderService();
		List<Order> listOrder = new ArrayList<>();
		listOrder = orderService.getAllOrder();
		request.setAttribute("listOrder", listOrder);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected boolean insertOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		orderService = new OrderService();
		int orderId;
		int carId;
		int customerId;
		int amount;
		String orderIds = request.getParameter("orderId").trim();
		String carIds = request.getParameter("carId").trim();
		String customerIds = request.getParameter("customerId").trim();
		String amounts = request.getParameter("amount").trim();
		try {
			orderId = Integer.parseInt(orderIds);
			carId = Integer.parseInt(carIds);
			customerId = Integer.parseInt(customerIds);
			amount = Integer.parseInt(amounts);
		} catch (NumberFormatException e) {
			return false;
		}
		String salePrice = request.getParameter("salePrice");
		String orderDate = request.getParameter("orderDate");
		String deliveryDate = request.getParameter("deliveryDate");
		String deliveryAdress = request.getParameter("deliveryAdress");
		String orderStatus = request.getParameter("orderStatus");
		String note = request.getParameter("note");
		order = new Order(orderId, customerId, carId, amount, salePrice, orderDate, deliveryDate, deliveryAdress,
				orderStatus, note);
		return orderService.insertOrder(order);
	}
    protected boolean updateOrder(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	int orderId;
		int carId;
		int customerId;
		int amount;
		String orderIds = request.getParameter("orderId").trim();
		String carIds = request.getParameter("carId").trim();
		String customerIds = request.getParameter("customerId").trim();
		String amounts = request.getParameter("amount").trim();
		try {
			orderId = Integer.parseInt(orderIds);
			carId = Integer.parseInt(carIds);
			customerId = Integer.parseInt(customerIds);
			amount = Integer.parseInt(amounts);
		} catch (NumberFormatException e) {
			return false;
		}
		orderService = new OrderService();
		String salePrice = request.getParameter("salePrice");
		String orderDate = request.getParameter("orderDate");
		String deliveryDate = request.getParameter("deliveryDate");
		String deliveryAdress = request.getParameter("deliveryAdress");
		String orderStatus = request.getParameter("orderStatus");
		String note = request.getParameter("note");
		order = new Order(orderId, customerId, carId, amount, salePrice, orderDate, deliveryDate, deliveryAdress,
				orderStatus, note);
		return orderService.updateOrder(orderId, order);
    }
    protected boolean deleteOrder(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	int orderId;
    	orderService = new OrderService();
    	String orderIds = request.getParameter("orderIds");
    	try {
			orderId = Integer.parseInt(orderIds);
    	}catch (NumberFormatException e) {
			// TODO: handle exception
    		return false;
		}
    	return orderService.deleteOrder(orderId);
    	
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if ("insert".equals(request.getParameter("type"))) {
			response.getWriter().print(insertOrder(request, response));
		}
		else if("update".equals(request.getParameter("type"))){
			response.getWriter().print(updateOrder(request, response));
		}else{
			response.getWriter().print(deleteOrder(request, response));
		}
	}


}
