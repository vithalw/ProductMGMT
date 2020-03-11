package com.zensar.product.management.beans;

public class Product {

	private int productId;
	private String productName;
	private int privateCost;

	public Product() {
		super();
	}

	public Product(int productId, String productName, int privateCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.privateCost = privateCost;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrivateCost() {
		return privateCost;
	}

	public void setPrivateCost(int privateCost) {
		this.privateCost = privateCost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", privateCost=" + privateCost
				+ "]";
	}

}
