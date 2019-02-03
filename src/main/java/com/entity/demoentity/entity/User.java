package com.entity.demoentity.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	public User() {
		super();
	}

	public User(String user_name, String password) {
		this.user_name = user_name;
		this.password = password;
	}

	@Id
	@Column(name = "user_Id")
	private String user_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Column(name = "user_Name")
	private String user_name;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Column(name = "user_Password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + "]";
	}

}
