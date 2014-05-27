package org.madbit.hibernate.entity;

// Generated 14 mars 2013 22:01:57 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Agency generated by hbm2java
 */
public class Agency implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer agencyId;
	private String name;
	private Set<Company> companies = new HashSet<Company>(0);
	private Set<User> users = new HashSet<User>(0);

	public Agency() {
	
	}

	public Agency(String name) {
		this.name = name;
	}

	public Agency(String name, Set<Company> companies, Set<User> users) {
		this.name = name;
		this.companies = companies;
		this.users = users;
	}

	public Integer getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
