package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Hits entity. @author MyEclipse Persistence Tools
 */

public class Hits implements java.io.Serializable {

	// Fields

	private Integer hitsId;
	private String hitsWeek;
	private String hitsMonth;
	private String hitsYear;
	private Set productses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Hits() {
	}

	/** full constructor */
	public Hits(String hitsWeek, String hitsMonth, String hitsYear,
			Set productses) {
		this.hitsWeek = hitsWeek;
		this.hitsMonth = hitsMonth;
		this.hitsYear = hitsYear;
		this.productses = productses;
	}

	// Property accessors

	public Integer getHitsId() {
		return this.hitsId;
	}

	public void setHitsId(Integer hitsId) {
		this.hitsId = hitsId;
	}

	public String getHitsWeek() {
		return this.hitsWeek;
	}

	public void setHitsWeek(String hitsWeek) {
		this.hitsWeek = hitsWeek;
	}

	public String getHitsMonth() {
		return this.hitsMonth;
	}

	public void setHitsMonth(String hitsMonth) {
		this.hitsMonth = hitsMonth;
	}

	public String getHitsYear() {
		return this.hitsYear;
	}

	public void setHitsYear(String hitsYear) {
		this.hitsYear = hitsYear;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

}