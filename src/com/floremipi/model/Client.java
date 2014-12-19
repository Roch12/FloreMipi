package com.floremipi.model;

public class Client {

	public Integer id;
	public String firstName;
	public String name;
	public String email;
	public String phone;
	/**
	 * @param id
	 * @param firstName
	 * @param name
	 * @param email
	 * @param phone
	 */
	public Client(Integer id, String firstName, String name, String email,
			String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
