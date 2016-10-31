package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer usersId;
	private String usersNum;
	private String usersPassword;
	private String usersName;
	private String usersBalance;
	private String usersType;
	private Short usersMessage;
	private Set stores = new HashSet(0);
	private Set shoppingCarts = new HashSet(0);
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String usersNum, String usersPassword, String usersName,
			String usersBalance, String usersType, Short usersMessage,
			Set stores, Set shoppingCarts, Set orderses) {
		this.usersNum = usersNum;
		this.usersPassword = usersPassword;
		this.usersName = usersName;
		this.usersBalance = usersBalance;
		this.usersType = usersType;
		this.usersMessage = usersMessage;
		this.stores = stores;
		this.shoppingCarts = shoppingCarts;
		this.orderses = orderses;
	}


	public Integer getUsersId() {
		return this.usersId;
	}

	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	public String getUsersNum() {
		return this.usersNum;
	}

	public void setUsersNum(String usersNum) {
		this.usersNum = usersNum;
	}

	public String getUsersPassword() {
		return this.usersPassword;
	}

	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}

	public String getUsersName() {
		return this.usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersBalance() {
		return this.usersBalance;
	}

	public void setUsersBalance(String usersBalance) {
		this.usersBalance = usersBalance;
	}

	public String getUsersType() {
		return this.usersType;
	}

	public void setUsersType(String usersType) {
		this.usersType = usersType;
	}

	public Short getUsersMessage() {
		return this.usersMessage;
	}

	public void setUsersMessage(Short usersMessage) {
		this.usersMessage = usersMessage;
	}

	public Set getStores() {
		return this.stores;
	}

	public void setStores(Set stores) {
		this.stores = stores;
	}

	public Set getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(Set shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}