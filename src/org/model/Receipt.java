package org.model;

/**
 * Receipt entity. @author MyEclipse Persistence Tools
 */

public class Receipt implements java.io.Serializable {

	// Fields

	private Integer receiptId;
	private String receiptName;
	private String receiptTele;
	private String receiptAddress;
	private Integer receiptUserId;

	// Constructors

	/** default constructor */
	public Receipt() {
	}

	/** minimal constructor */
	public Receipt(Integer receiptId) {
		this.receiptId = receiptId;
	}

	/** full constructor */
	public Receipt(Integer receiptId, String receiptName, String receiptTele,
			String receiptAddress, Integer receiptUserId) {
		this.receiptId = receiptId;
		this.receiptName = receiptName;
		this.receiptTele = receiptTele;
		this.receiptAddress = receiptAddress;
		this.receiptUserId = receiptUserId;
	}

	// Property accessors

	public Integer getReceiptId() {
		return this.receiptId;
	}

	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public String getReceiptName() {
		return this.receiptName;
	}

	public void setReceiptName(String receiptName) {
		this.receiptName = receiptName;
	}

	public String getReceiptTele() {
		return this.receiptTele;
	}

	public void setReceiptTele(String receiptTele) {
		this.receiptTele = receiptTele;
	}

	public String getReceiptAddress() {
		return this.receiptAddress;
	}

	public void setReceiptAddress(String receiptAddress) {
		this.receiptAddress = receiptAddress;
	}

	public Integer getReceiptUserId() {
		return this.receiptUserId;
	}

	public void setReceiptUserId(Integer receiptUserId) {
		this.receiptUserId = receiptUserId;
	}

}