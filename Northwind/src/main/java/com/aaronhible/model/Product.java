package com.aaronhible.model;

// Generated Dec 12, 2012 8:51:28 AM by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Category category;
	private Supplier supplier;
	private String productName;
	private String quantityPerUnit;
	private BigDecimal unitPrice;
	private Short unitsInStock;
	private Short unitsOnOrder;
	private Short reorderLevel;
	private boolean discontinued;

	public Product() {
	}

	public Product(int id, String productName, boolean discontinued) {
		this.id = id;
		this.productName = productName;
		this.discontinued = discontinued;
	}

	public Product(int id, Category category, Supplier supplier,
			String productName, String quantityPerUnit, BigDecimal unitPrice,
			Short unitsInStock, Short unitsOnOrder, Short reorderLevel,
			boolean discontinued) {
		this.id = id;
		this.category = category;
		this.supplier = supplier;
		this.productName = productName;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.unitsOnOrder = unitsOnOrder;
		this.reorderLevel = reorderLevel;
		this.discontinued = discontinued;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategories() {
		return this.category;
	}

	public void setCategories(Category category) {
		this.category = category;
	}

	public Supplier getSuppliers() {
		return this.supplier;
	}

	public void setSuppliers(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantityPerUnit() {
		return this.quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Short getUnitsInStock() {
		return this.unitsInStock;
	}

	public void setUnitsInStock(Short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Short getUnitsOnOrder() {
		return this.unitsOnOrder;
	}

	public void setUnitsOnOrder(Short unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}

	public Short getReorderLevel() {
		return this.reorderLevel;
	}

	public void setReorderLevel(Short reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public boolean isDiscontinued() {
		return this.discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", category="
				+ category + ", supplier=" + supplier + ", productName="
				+ productName + ", quantityPerUnit=" + quantityPerUnit
				+ ", unitPrice=" + unitPrice + ", unitsInStock=" + unitsInStock
				+ ", unitsOnOrder=" + unitsOnOrder + ", reorderLevel="
				+ reorderLevel + ", discontinued=" + discontinued + "]";
	}

	
}