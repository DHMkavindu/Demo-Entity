package com.entity.demoentity.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Schedule")
public class Schedule {

	public Schedule() {

	}

	

	public Schedule(String sc_Id, String time_Slot, int max_Patient_Count, Day day, List<Appoinment> appoinmetList) {
		super();
		this.sc_Id = sc_Id;
		this.time_Slot = time_Slot;
		this.max_Patient_Count = max_Patient_Count;
		this.day = day;
		this.appoinmetList = appoinmetList;
	}



	@Id
	@Column(name = "sc_Id")
	private String sc_Id;

	public String getSc_Id() {
		return sc_Id;
	}

	public void setSc_Id(String sc_Id) {
		this.sc_Id = sc_Id;
	}

	@Column(name = "time_Slot")
	private String time_Slot;

	public String getTime_Slot() {
		return time_Slot;
	}

	public void setTime_Slot(String time_Slot) {
		this.time_Slot = time_Slot;
	}

	@Column(name = "max_Patient_Count")
	private int max_Patient_Count;

	public int getMax_Patient_Count() {
		return max_Patient_Count;
	}

	public void setMax_Patient_Count(int max_Patient_Count) {
		this.max_Patient_Count = max_Patient_Count;
	}

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "dr_Id", referencedColumnName = "dr_Id", insertable = false, updatable = false)
//	private Doctor doctor;
//
//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "day_Name", referencedColumnName = "day_Name", insertable = false, updatable = false)
	private Day day;

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}
	
	@OneToMany(mappedBy = "Schedule", cascade = CascadeType.ALL)
	private List<Appoinment> appoinmetList;

	public List<Appoinment> getAppoinmetList() {
		return appoinmetList;
	}

	public void setAppoinmetList(List<Appoinment> appoinmetList) {
		this.appoinmetList = appoinmetList;
	}

	@Override
	public String toString() {
		return "Schedule [sc_Id=" + sc_Id + ", time_Slot=" + time_Slot + ", max_Patient_Count=" + max_Patient_Count
				+ ", day=" + day + ", appoinmetList=" + appoinmetList + "]";
	}
	
	

}
