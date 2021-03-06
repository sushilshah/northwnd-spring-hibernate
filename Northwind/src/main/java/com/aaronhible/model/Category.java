package com.aaronhible.model;

// Generated Dec 12, 2012 8:51:28 AM by Hibernate Tools 3.2.2.GA

import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String description;
	private Blob picture;
	private Set<Product> product = new HashSet<Product>(0);

	public Category() {
	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Category(int id, String name, String description,
			Blob picture, Set<Product> product) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.picture = picture;
		this.product = product;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getPicture() {
		return this.picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	//TODO: Hibernate specific! move this to the dao, change class data type to 
	//byte[] from blob
	public void setPicture(byte[] picture) {
		Blob picBlob = Hibernate.createBlob(picture);
		this.picture = picBlob;
	}

	public Set<Product> getProducts() {
		return this.product;
	}

	public void setProducts(Set<Product> product) {
		this.product = product;
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
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name="
				+ name + ", description=" + description + ", picture="
				+ picture + ", product=" + product + "]";
	}
	
}
