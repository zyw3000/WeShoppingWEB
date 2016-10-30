package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private Integer enterpriseId;
	private String enterpriseName;
	private String enterpriseAptitude;
	private String enterpriseIntroduction;
	private String enterprisePic;
	private Integer enterpriseUserId;
	private Set productses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** full constructor */
	public Enterprise(String enterpriseName, String enterpriseAptitude,
			String enterpriseIntroduction, String enterprisePic,
			Integer enterpriseUserId, Set productses) {
		this.enterpriseName = enterpriseName;
		this.enterpriseAptitude = enterpriseAptitude;
		this.enterpriseIntroduction = enterpriseIntroduction;
		this.enterprisePic = enterprisePic;
		this.enterpriseUserId = enterpriseUserId;
		this.productses = productses;
	}

	// Property accessors

	public Integer getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseAptitude() {
		return this.enterpriseAptitude;
	}

	public void setEnterpriseAptitude(String enterpriseAptitude) {
		this.enterpriseAptitude = enterpriseAptitude;
	}

	public String getEnterpriseIntroduction() {
		return this.enterpriseIntroduction;
	}

	public void setEnterpriseIntroduction(String enterpriseIntroduction) {
		this.enterpriseIntroduction = enterpriseIntroduction;
	}

	public String getEnterprisePic() {
		return this.enterprisePic;
	}

	public void setEnterprisePic(String enterprisePic) {
		this.enterprisePic = enterprisePic;
	}

	public Integer getEnterpriseUserId() {
		return this.enterpriseUserId;
	}

	public void setEnterpriseUserId(Integer enterpriseUserId) {
		this.enterpriseUserId = enterpriseUserId;
	}

	public Set getProductses() {
		return this.productses;
	}

	public void setProductses(Set productses) {
		this.productses = productses;
	}

}