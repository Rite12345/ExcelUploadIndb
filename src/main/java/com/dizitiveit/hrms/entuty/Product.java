package com.dizitiveit.hrms.entuty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer productId;
	private String pruductName;
	private String productDesc;
	private Double productPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String pruductName, String productDesc, Double productPrice) {
		super();
		this.productId = productId;
		this.pruductName = pruductName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getPruductName() {
		return pruductName;
	}
	public void setPruductName(String pruductName) {
		this.pruductName = pruductName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	

}
