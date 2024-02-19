package org.jsp.SpringPractice;

import java.util.List;
import java.util.Set;

public class Student {

/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public Set<Long> getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public List<String> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(List<String> address) {
		this.address = address;
	}
private int id;
 private String name;
 private Set<Long> phone;
 private List<String> address;
}
