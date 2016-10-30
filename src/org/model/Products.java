package org.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Products entity. @author MyEclipse Persistence Tools
 */

public class Products implements java.io.Serializable {

	// Fields

	private Integer productId;
	private Enterprise enterprise;
	private Sale sale;
	private Hits hits;
	private Categories categories;
	private Store store;
	private Timestamp productDate;
	private String productPic;
	private String productCost;
	private String productPrice;
	private String productBrand;
	private String productUnit;
	private String productSize;
	private String productQuality;
	private String productCraft;
	private Short productState;
	private String productSpecial;
	private String productColor;
	private String productPattern;
	private String productApplyTo;
	private String productSoledad;
	private String productComposition;
	private String productLarghezza;
	private String productLove;
	private String productEvaluate;
	private String productName;
	private String productQuantity;
	private Set shoppingCarts = new HashSet(0);
	private Set dayCounts = new HashSet(0);
	private Set ordereds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Products() {
	}

	/** full constructor */
	public Products(Enterprise enterprise, Sale sale, Hits hits,
			Categories categories, Store store, Timestamp productDate,
			String productPic, String productCost, String productPrice,
			String productBrand, String productUnit, String productSize,
			String productQuality, String productCraft, Short productState,
			String productSpecial, String productColor, String productPattern,
			String productApplyTo, String productSoledad,
			String productComposition, String productLarghezza,
			String productLove, String productEvaluate, String productName,
			String productQuantity, Set shoppingCarts, Set dayCounts,
			Set ordereds) {
		this.enterprise = enterprise;
		this.sale = sale;
		this.hits = hits;
		this.categories = categories;
		this.store = store;
		this.productDate = productDate;
		this.productPic = productPic;
		this.productCost = productCost;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productUnit = productUnit;
		this.productSize = productSize;
		this.productQuality = productQuality;
		this.productCraft = productCraft;
		this.productState = productState;
		this.productSpecial = productSpecial;
		this.productColor = productColor;
		this.productPattern = productPattern;
		this.productApplyTo = productApplyTo;
		this.productSoledad = productSoledad;
		this.productComposition = productComposition;
		this.productLarghezza = productLarghezza;
		this.productLove = productLove;
		this.productEvaluate = productEvaluate;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.shoppingCarts = shoppingCarts;
		this.dayCounts = dayCounts;
		this.ordereds = ordereds;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Sale getSale() {
		return this.sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Hits getHits() {
		return this.hits;
	}

	public void setHits(Hits hits) {
		this.hits = hits;
	}

	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Timestamp getProductDate() {
		return this.productDate;
	}

	public void setProductDate(Timestamp productDate) {
		this.productDate = productDate;
	}

	public String getProductPic() {
		return this.productPic;
	}

	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getProductCost() {
		return this.productCost;
	}

	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}

	public String getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductBrand() {
		return this.productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductUnit() {
		return this.productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getProductSize() {
		return this.productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductQuality() {
		return this.productQuality;
	}

	public void setProductQuality(String productQuality) {
		this.productQuality = productQuality;
	}

	public String getProductCraft() {
		return this.productCraft;
	}

	public void setProductCraft(String productCraft) {
		this.productCraft = productCraft;
	}

	public Short getProductState() {
		return this.productState;
	}

	public void setProductState(Short productState) {
		this.productState = productState;
	}

	public String getProductSpecial() {
		return this.productSpecial;
	}

	public void setProductSpecial(String productSpecial) {
		this.productSpecial = productSpecial;
	}

	public String getProductColor() {
		return this.productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductPattern() {
		return this.productPattern;
	}

	public void setProductPattern(String productPattern) {
		this.productPattern = productPattern;
	}

	public String getProductApplyTo() {
		return this.productApplyTo;
	}

	public void setProductApplyTo(String productApplyTo) {
		this.productApplyTo = productApplyTo;
	}

	public String getProductSoledad() {
		return this.productSoledad;
	}

	public void setProductSoledad(String productSoledad) {
		this.productSoledad = productSoledad;
	}

	public String getProductComposition() {
		return this.productComposition;
	}

	public void setProductComposition(String productComposition) {
		this.productComposition = productComposition;
	}

	public String getProductLarghezza() {
		return this.productLarghezza;
	}

	public void setProductLarghezza(String productLarghezza) {
		this.productLarghezza = productLarghezza;
	}

	public String getProductLove() {
		return this.productLove;
	}

	public void setProductLove(String productLove) {
		this.productLove = productLove;
	}

	public String getProductEvaluate() {
		return this.productEvaluate;
	}

	public void setProductEvaluate(String productEvaluate) {
		this.productEvaluate = productEvaluate;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantity() {
		return this.productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Set getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(Set shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	public Set getDayCounts() {
		return this.dayCounts;
	}

	public void setDayCounts(Set dayCounts) {
		this.dayCounts = dayCounts;
	}

	public Set getOrdereds() {
		return this.ordereds;
	}

	public void setOrdereds(Set ordereds) {
		this.ordereds = ordereds;
	}

}