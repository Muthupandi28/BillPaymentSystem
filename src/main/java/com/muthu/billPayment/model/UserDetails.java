package com.muthu.billPayment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.muthu.billPayment.utils.JasyptEncryptionUtils;

@Entity
/*
 * @Getter
 *
 * @Setter
 *
 * @ToString
 *
 * @NoArgsConstructor
 *
 * @AllArgsConstructor
 */
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "USER_ID")
	int userId;
	
	@Column(name = "ADDRESS")
	String address;
	
	@Column(name = "FIRST_NAME")
	String firstName;
	
	@Column(name = "GENDER")
	String gender;
	
	@Column(name = "LAST_NAME")
	String lastName;
	
	@Column(name = "PASSWORD")
	String password;
	
	@Column(name = "ROLE")
	String role;
	

	public UserDetails() {
		super();
	}

	public UserDetails(String address, String firstName, String lastName, String gender, String password, String role,
			int userId) {
		super();
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.role = role;
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getGender() {
		return gender;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public int getUserId() {
		return userId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = JasyptEncryptionUtils.encrypt(password);
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
