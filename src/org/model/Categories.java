package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Categories entity. @author MyEclipse Persistence Tools
 */

public class Categories implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String categoryName;
	private Set productses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Categories() {
	}

	/** full constructor */
	public Categories(String categoryName, Set productses) {
		this.categoryName = categoryName;
		this.productses = productses;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

}