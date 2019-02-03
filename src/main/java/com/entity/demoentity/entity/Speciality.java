package com.entity.demoentity.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Speciality")
public class Speciality {

	public Speciality() {

	}

	public Speciality(String sp_Id, String sp_Type, List<Doctor> doctorList) {
		super();
		this.sp_Id = sp_Id;
		this.sp_Type = sp_Type;
		this.doctorList = doctorList;
	}

	@Id
	@Column(name = "sp_Id")
	private String sp_Id;

	public String getSp_Id() {
		return sp_Id;
	}

	public void setSp_Id(String sp_Id) {
		this.sp_Id = sp_Id;
	}

	@Column(name = "sp_Type")
	private String sp_Type;

	public String getSp_Type() {
		return sp_Type;
	}

	public void setSp_Type(String sp_Type) {
		this.sp_Type = sp_Type;
	}

	@OneToMany(mappedBy = "Speciality", cascade = CascadeType.ALL)
	private List<Doctor> doctorList;

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	@Override
	public String toString() {
		return "speciality [sp_Id=" + sp_Id + ", sp_Type=" + sp_Type + ", doctorList=" + doctorList + "]";
	}

}
