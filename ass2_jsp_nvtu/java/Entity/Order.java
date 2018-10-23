package Entity;

public class Order {
	private int orderId;
	private int customerId;
	private int carId;
	private int amount;
	private String salePrice;
	private String orderDate;
	private String deliveryDate;
	private String deliveryAdress;
	private String orderStatus;
	private String note;

	public Order(int orderId, int customerId, int carId, int amount, String salePrice, String orderDate,
			String deliveryDate, String deliveryAdress, String orderStatus, String note) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.carId = carId;
		this.amount = amount;
		this.salePrice = salePrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryAdress = deliveryAdress;
		this.orderStatus = orderStatus;
		this.note = note;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryAdress() {
		return deliveryAdress;
	}

	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", carId=" + carId + ", amount=" + amount
				+ ", salePrice=" + salePrice + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", deliveryAdress=" + deliveryAdress + ", orderStatus=" + orderStatus + ", note=" + note + "]";
	}

}
