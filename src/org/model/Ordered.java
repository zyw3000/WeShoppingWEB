package org.model;

/**
 * Ordered entity. @author MyEclipse Persistence Tools
 */

public class Ordered implements java.io.Serializable {

	// Fields

	private Integer orderedId;
	private Orders orders;
	private Products products;
	private String orderedNum;

	// Constructors

	/** default constructor */
	public Ordered() {
	}

	/** minimal constructor */
	public Ordered(Integer orderedId) {
		this.orderedId = orderedId;
	}

	/** full constructor */
	public Ordered(Integer orderedId, Orders orders, Products products,
			String orderedNum) {
		this.orderedId = orderedId;
		this.orders = orders;
		this.products = products;
		this.orderedNum = orderedNum;
	}

	// Property accessors

	public Integer getOrderedId() {
		return this.orderedId;
	}

	public void setOrderedId(Integer orderedId) {
		this.orderedId = orderedId;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getOrderedNum() {
		return this.orderedNum;
	}

	public void setOrderedNum(String orderedNum) {
		this.orderedNum = orderedNum;
	}

}