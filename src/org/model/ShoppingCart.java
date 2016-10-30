package org.model;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCart implements java.io.Serializable {

	// Fields

	private Integer shoppingCartId;
	private Users users;
	private Products products;
	private String shoppingCartNum;

	// Constructors

	/** default constructor */
	public ShoppingCart() {
	}

	/** minimal constructor */
	public ShoppingCart(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	/** full constructor */
	public ShoppingCart(Integer shoppingCartId, Users users, Products products,
			String shoppingCartNum) {
		this.shoppingCartId = shoppingCartId;
		this.users = users;
		this.products = products;
		this.shoppingCartNum = shoppingCartNum;
	}

	// Property accessors

	public Integer getShoppingCartId() {
		return this.shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getShoppingCartNum() {
		return this.shoppingCartNum;
	}

	public void setShoppingCartNum(String shoppingCartNum) {
		this.shoppingCartNum = shoppingCartNum;
	}

}