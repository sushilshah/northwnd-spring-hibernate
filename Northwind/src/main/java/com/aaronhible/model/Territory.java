package com.aaronhible.model;

// Generated Dec 12, 2012 8:51:28 AM by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Territory generated by hbm2java
 */
public class Territory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private Region region;
	private String territoryDescription;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Territory() {
	}

	public Territory(String id, Region region,
			String territoryDescription) {
		this.id = id;
		this.region = region;
		this.territoryDescription = territoryDescription;
	}

	public Territory(String id, Region region,
			String territoryDescription, Set<Employee> employees) {
		this.id = id;
		this.region = region;
		this.territoryDescription = territoryDescription;
		this.employees = employees;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getTerritoryDescription() {
		return this.territoryDescription;
	}

	public void setTerritoryDescription(String territoryDescription) {
		this.territoryDescription = territoryDescription;
	}

	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id == null) ? 0 : id.hashCode());
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
		Territory other = (Territory) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Territory [id=" + id + ", region=" + region
				+ ", territoryDescription=" + territoryDescription
				+ ", employees=" + employees + "]";
	}

}