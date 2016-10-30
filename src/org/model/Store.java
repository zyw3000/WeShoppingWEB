package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Store entity. @author MyEclipse Persistence Tools
 */

public class Store implements java.io.Serializable {

	// Fields

	private Integer storeId;
	private Users users;
	private String storePrincipal;
	private String storeArea;
	private String storeFloor;
	private String storeNum;
	private Short storeState;
	private String storeLove;
	private String storeName;
	private Short storeJudge;
	private Short storeResult;
	private String storeTele;
	private Set productses = new HashSet(0);
	private Set orderses = new HashSet(0);
	private Set dayCounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** full constructor */
	public Store(Users users, String storePrincipal, String storeArea,
			String storeFloor, String storeNum, Short storeState,
			String storeLove, String storeName, Short storeJudge,
			Short storeResult, String storeTele, Set productses, Set orderses,
			Set dayCounts) {
		this.users = users;
		this.storePrincipal = storePrincipal;
		this.storeArea = storeArea;
		this.storeFloor = storeFloor;
		this.storeNum = storeNum;
		this.storeState = storeState;
		this.storeLove = storeLove;
		this.storeName = storeName;
		this.storeJudge = storeJudge;
		this.storeResult = storeResult;
		this.storeTele = storeTele;
		this.productses = productses;
		this.orderses = orderses;
		this.dayCounts = dayCounts;
	}

	// Property accessors

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getStorePrincipal() {
		return this.storePrincipal;
	}

	public void setStorePrincipal(String storePrincipal) {
		this.storePrincipal = storePrincipal;
	}

	public String getStoreArea() {
		return this.storeArea;
	}

	public void setStoreArea(String storeArea) {
		this.storeArea = storeArea;
	}

	public String getStoreFloor() {
		return this.storeFloor;
	}

	public void setStoreFloor(String storeFloor) {
		this.storeFloor = storeFloor;
	}

	public String getStoreNum() {
		return this.storeNum;
	}

	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}

	public Short getStoreState() {
		return this.storeState;
	}

	public void setStoreState(Short storeState) {
		this.storeState = storeState;
	}

	public String getStoreLove() {
		return this.storeLove;
	}

	public void setStoreLove(String storeLove) {
		this.storeLove = storeLove;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Short getStoreJudge() {
		return this.storeJudge;
	}

	public void setStoreJudge(Short storeJudge) {
		this.storeJudge = storeJudge;
	}

	public Short getStoreResult() {
		return this.storeResult;
	}

	public void setStoreResult(Short storeResult) {
		this.storeResult = storeResult;
	}

	public String getStoreTele() {
		return this.storeTele;
	}

	public void setStoreTele(String storeTele) {
		this.storeTele = storeTele;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getDayCounts() {
		return this.dayCounts;
	}

	public void setDayCounts(Set dayCounts) {
		this.dayCounts = dayCounts;
	}

}