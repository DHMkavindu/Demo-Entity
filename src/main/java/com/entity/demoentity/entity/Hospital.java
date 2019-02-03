package com.entity.demoentity.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Hospital")
public class Hospital {

	public Hospital() {

	}

	public Hospital(String h_Id, String h_Name, List<Doctor> doctorList) {
		super();
		this.h_Id = h_Id;
		this.h_Name = h_Name;
		this.doctorList = doctorList;
	}

	@Id
	@Column(name = "h_Id")
	private String h_Id;

	public String getH_Id() {
		return h_Id;
	}

	public void setH_Id(String h_Id) {
		this.h_Id = h_Id;
	}

	@Column(name = "hospital_Name")
	private String h_Name;

	public String getH_Name() {
		return h_Name;
	}

	public void setH_Name(String h_Name) {
		this.h_Name = h_Name;
	}

	@OneToMany(mappedBy = "Hospital", cascade = CascadeType.ALL)
	private List<Doctor> doctorList;

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	@Override
	public String toString() {
		return "hospital [h_Id=" + h_Id + ", h_Name=" + h_Name + ", doctorList=" + doctorList + "]";
	}

}
