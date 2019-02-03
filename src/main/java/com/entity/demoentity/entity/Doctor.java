package com.entity.demoentity.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {

	public Doctor() {

	}

	public Doctor(String dr_Id, String dr_Name, int dr_Tel, String dr_Mail, String password, Speciality speciality,
			List<Schedule> list, Hospital hospital) {
		super();
		this.dr_Id = dr_Id;
		this.dr_Name = dr_Name;
		this.dr_Tel = dr_Tel;
		this.dr_Mail = dr_Mail;
		this.password = password;
		this.speciality = speciality;
//		this.list = list;
		this.hospital = hospital;
	}

	@Id
	@Column(name = "dr_Id")
	private String dr_Id;

	public String getDr_Id() {
		return dr_Id;
	}

	public void setDr_Id(String dr_Id) {
		this.dr_Id = dr_Id;
	}

	@Column(name = "dr_Name")
	private String dr_Name;

	public String getDr_Name() {
		return dr_Name;
	}

	public void setDr_Name(String dr_Name) {
		this.dr_Name = dr_Name;
	}

	@Column(name = "dr_Tel")
	private int dr_Tel;

	public int getDr_Tel() {
		return dr_Tel;
	}

	public void setDr_Tel(int dr_Tel) {
		this.dr_Tel = dr_Tel;
	}

	@Column(name = "dr_Mail")
	private String dr_Mail;

	public String getDr_Mail() {
		return dr_Mail;
	}

	public void setDr_Mail(String dr_Mail) {
		this.dr_Mail = dr_Mail;
	}

	@Column(name = "password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sp_Id", referencedColumnName = "sp_Id", insertable = false, updatable = false)
	private Speciality speciality;

//	@OneToMany(mappedBy = "Doctor", cascade = CascadeType.ALL)
//	private List<Schedule> list;
//
//	public List<Schedule> getList() {
//		return list;
//	}
//
//	public void setList(List<Schedule> list) {
//		this.list = list;
//	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "h_Id", referencedColumnName = "h_Id", insertable = false, updatable = false)
	private Hospital hospital;

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Doctor [dr_Id=" + dr_Id + ", dr_Name=" + dr_Name + ", dr_Tel=" + dr_Tel + ", dr_Mail=" + dr_Mail
				+ ", password=" + password + ", speciality=" + speciality +", hospital=" + hospital
				+ "]";
	}

}
