package com.b2b.admin.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductBean {

	private String prodId;
	private String productName;
	private String productId;
	private String catId;
	private String categoryName;

	List<AttributeBean> attributeBeanLst = new ArrayList<>();

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<AttributeBean> getAttributeBeanLst() {
		return attributeBeanLst;
	}

	public void setAttributeBeanLst(List<AttributeBean> attributeBeanLst) {
		this.attributeBeanLst = attributeBeanLst;
	}

}
