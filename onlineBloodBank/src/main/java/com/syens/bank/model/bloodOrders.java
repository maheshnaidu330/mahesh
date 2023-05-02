package com.syens.bank.model;

import java.util.Date;

public class bloodOrders {
private int  orderId;
private String userName;
private String bloodBankName;
private String bloodType;
private int quantity;private int userId;private int bloodBankId;
private Date orderDate;
private String status;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getBloodBankName() {
	return bloodBankName;
}
public void setBloodBankName(String bloodBankName) {
	this.bloodBankName = bloodBankName;
}
public String getBloodType() {
	return bloodType;
}
public void setBloodType(String bloodType) {
	this.bloodType = bloodType;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getBloodBankId() {
	return bloodBankId;
}
public void setBloodBankId(int bloodBankId) {
	this.bloodBankId = bloodBankId;
}
@Override
public String toString() {
	return "bloodOrders [orderId=" + orderId + ", userName=" + userName + ", bloodBankName=" + bloodBankName
			+ ", bloodType=" + bloodType + ", quantity=" + quantity + ", userId=" + userId + ", bloodBankId="
			+ bloodBankId + ", orderDate=" + orderDate + ", status=" + status + "]";
}


}
