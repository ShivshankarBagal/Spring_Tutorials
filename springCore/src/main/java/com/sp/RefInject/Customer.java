package com.sp.RefInject;

public class Customer {
	
	private int customerId;
	
	private String customerName;
	private Order order;
	
	
	
	public int getcustomerId() {
		return customerId;
	}
	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Customer(int customerId, String customerName, Order order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.order = order;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", order=" + order + "]";
	}
	
	
	

}
