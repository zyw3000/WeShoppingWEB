package org.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Store store;
	private Users users;
	private Timestamp orderOtime;
	private Timestamp orderPtime;
	private String orderPayMethod;
	private String orderNum;
	private String orderAddress;
	private String orderTele;
	private String orderPrice;
	private String orderShipState;
	private Short orderShipped;
	private Short orderDelivered;
	private Short orderReview;
	private Short orderPaymentState;
	private String orderConsignee;
	private Set ordereds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(Store store, Users users, Timestamp orderOtime,
			Timestamp orderPtime, String orderPayMethod, String orderNum,
			String orderAddress, String orderTele, String orderPrice,
			String orderShipState, Short orderShipped, Short orderDelivered,
			Short orderReview, Short orderPaymentState, String orderConsignee,
			Set ordereds) {
		this.store = store;
		this.users = users;
		this.orderOtime = orderOtime;
		this.orderPtime = orderPtime;
		this.orderPayMethod = orderPayMethod;
		this.orderNum = orderNum;
		this.orderAddress = orderAddress;
		this.orderTele = orderTele;
		this.orderPrice = orderPrice;
		this.orderShipState = orderShipState;
		this.orderShipped = orderShipped;
		this.orderDelivered = orderDelivered;
		this.orderReview = orderReview;
		this.orderPaymentState = orderPaymentState;
		this.orderConsignee = orderConsignee;
		this.ordereds = ordereds;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Timestamp getOrderOtime() {
		return this.orderOtime;
	}

	public void setOrderOtime(Timestamp orderOtime) {
		this.orderOtime = orderOtime;
	}

	public Timestamp getOrderPtime() {
		return this.orderPtime;
	}

	public void setOrderPtime(Timestamp orderPtime) {
		this.orderPtime = orderPtime;
	}

	public String getOrderPayMethod() {
		return this.orderPayMethod;
	}

	public void setOrderPayMethod(String orderPayMethod) {
		this.orderPayMethod = orderPayMethod;
	}

	public String getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderAddress() {
		return this.orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getOrderTele() {
		return this.orderTele;
	}

	public void setOrderTele(String orderTele) {
		this.orderTele = orderTele;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderShipState() {
		return this.orderShipState;
	}

	public void setOrderShipState(String orderShipState) {
		this.orderShipState = orderShipState;
	}

	public Short getOrderShipped() {
		return this.orderShipped;
	}

	public void setOrderShipped(Short orderShipped) {
		this.orderShipped = orderShipped;
	}

	public Short getOrderDelivered() {
		return this.orderDelivered;
	}

	public void setOrderDelivered(Short orderDelivered) {
		this.orderDelivered = orderDelivered;
	}

	public Short getOrderReview() {
		return this.orderReview;
	}

	public void setOrderReview(Short orderReview) {
		this.orderReview = orderReview;
	}

	public Short getOrderPaymentState() {
		return this.orderPaymentState;
	}

	public void setOrderPaymentState(Short orderPaymentState) {
		this.orderPaymentState = orderPaymentState;
	}

	public String getOrderConsignee() {
		return this.orderConsignee;
	}

	public void setOrderConsignee(String orderConsignee) {
		this.orderConsignee = orderConsignee;
	}

	public Set getOrdereds() {
		return this.ordereds;
	}

	public void setOrdereds(Set ordereds) {
		this.ordereds = ordereds;
	}

}