package org.model;

import java.sql.Timestamp;

/**
 * DayCount entity. @author MyEclipse Persistence Tools
 */

public class DayCount implements java.io.Serializable {

	// Fields

	private Integer dayCountId;
	private Products products;
	private Store store;
	private Timestamp dayCountDate;
	private String dayCountSale;
	private String dayCountHits;
	private String dayCountMoney;

	// Constructors

	/** default constructor */
	public DayCount() {
	}

	/** full constructor */
	public DayCount(Products products, Store store, Timestamp dayCountDate,
			String dayCountSale, String dayCountHits, String dayCountMoney) {
		this.products = products;
		this.store = store;
		this.dayCountDate = dayCountDate;
		this.dayCountSale = dayCountSale;
		this.dayCountHits = dayCountHits;
		this.dayCountMoney = dayCountMoney;
	}

	// Property accessors

	public Integer getDayCountId() {
		return this.dayCountId;
	}

	public void setDayCountId(Integer dayCountId) {
		this.dayCountId = dayCountId;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Timestamp getDayCountDate() {
		return this.dayCountDate;
	}

	public void setDayCountDate(Timestamp dayCountDate) {
		this.dayCountDate = dayCountDate;
	}

	public String getDayCountSale() {
		return this.dayCountSale;
	}

	public void setDayCountSale(String dayCountSale) {
		this.dayCountSale = dayCountSale;
	}

	public String getDayCountHits() {
		return this.dayCountHits;
	}

	public void setDayCountHits(String dayCountHits) {
		this.dayCountHits = dayCountHits;
	}

	public String getDayCountMoney() {
		return this.dayCountMoney;
	}

	public void setDayCountMoney(String dayCountMoney) {
		this.dayCountMoney = dayCountMoney;
	}

}