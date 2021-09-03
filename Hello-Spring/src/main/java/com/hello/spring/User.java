/**
 * 
 */
package com.hello.spring;

/**
 * @author HP
 *
 */
public class User {

	private String name;
	private String email;
	private Integer mobile;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public User(String name, String email, Integer mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

}
