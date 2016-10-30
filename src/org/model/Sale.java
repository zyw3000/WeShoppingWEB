package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Sale entity. @author MyEclipse Persistence Tools
 */

public class Sale implements java.io.Serializable {

	// Fields

	private Integer saleId;
	private String saleWeek;
	private String saleMonth;
	private String saleYear;
	private Set productses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sale() {
	}

	/** full constructor */
	public Sale(String saleWeek, String saleMonth, String saleYear,
			Set productses) {
		this.saleWeek = saleWeek;
		this.saleMonth = saleMonth;
		this.saleYear = saleYear;
		this.productses = productses;
	}

	// Property accessors

	public Integer getSaleId() {
		return this.saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public String getSaleWeek() {
		return this.saleWeek;
	}

	public void setSaleWeek(String saleWeek) {
		this.saleWeek = saleWeek;
	}

	public String getSaleMonth() {
		return this.saleMonth;
	}

	public void setSaleMonth(String saleMonth) {
		this.saleMonth = saleMonth;
	}

	public String getSaleYear() {
		return this.saleYear;
	}

	public void setSaleYear(String saleYear) {
		this.saleYear = saleYear;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

}