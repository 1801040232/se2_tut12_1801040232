package model;

public class Order {

	protected int orderId;
	protected int id;
	protected String proId;
	protected int quantity;
	public Order(int orderId, int id, String proId, int quantity) {
		super();
		this.orderId = orderId;
		this.id = id;
		this.proId = proId;
		this.quantity = quantity;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	
	
	
	
	
}
