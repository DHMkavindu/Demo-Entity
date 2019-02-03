package com.entity.demoentity.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patient {

	public Patient() {

	}

	public Patient(String p_Id, String p_Name, String p_Address, String gender, String p_Age, String p_Tel,
			String p_Mail, String password, List<Appoinment> list) {
		this.p_Id = p_Id;
		this.p_Name = p_Name;
		this.p_Address = p_Address;
		this.gender = gender;
		this.p_Age = p_Age;
		this.p_Tel = p_Tel;
		this.p_Mail = p_Mail;
		this.password = password;
		this.list = list;
	}

	@Id
	@Column(name = "p_Id")
	private String p_Id;

	public String getP_Id() {
		return p_Id;
	}

	public void setP_Id(String p_Id) {
		this.p_Id = p_Id;
	}

	@Column(name = "p_Name")
	private String p_Name;

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	@Column(name = "p_Address")
	private String p_Address;

	public String getP_Address() {
		return p_Address;
	}

	public void setP_Address(String p_Address) {
		this.p_Address = p_Address;
	}

	@Column(name = "gender")
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "p_Age")
	private String p_Age;

	public String getP_Age() {
		return p_Age;
	}

	public void setP_Age(String p_Age) {
		this.p_Age = p_Age;
	}

	@Column(name = "p_Tel")
	private String p_Tel;

	public String getP_Tel() {
		return p_Tel;
	}

	public void setP_Tel(String p_Tel) {
		this.p_Tel = p_Tel;
	}

	@Column(name = "p_Mail")
	private String p_Mail;

	public String getP_Mail() {
		return p_Mail;
	}

	public void setP_Mail(String p_Mail) {
		this.p_Mail = p_Mail;
	}

	@Column(name = "password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(mappedBy = "Patient", cascade = CascadeType.ALL)
	private List<Appoinment> list;

	public List<Appoinment> getList() {
		return list;
	}

	public void setList(List<Appoinment> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "patient [p_Id=" + p_Id + ", p_Name=" + p_Name + ", p_Address=" + p_Address + ", gender=" + gender
				+ ", p_Age=" + p_Age + ", p_Tel=" + p_Tel + ", p_Mail=" + p_Mail + ", password=" + password + ", list="
				+ list + "]";
	}

}
