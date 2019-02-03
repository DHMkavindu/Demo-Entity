package com.entity.demoentity.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Day")
public class Day {
	
	
	
	public Day() {

	}

	
	
	public Day(List<Schedule> scheduleList, String day_Name) {
		super();
		this.scheduleList = scheduleList;
		this.day_Name = day_Name;
	}



	@Id
	@Column(name = "day_Name")
	private String day_Name;

	public String getDay_Name() {
		return day_Name;
	}

	public void setDay_Name(String day_Name) {
		this.day_Name = day_Name;
	}
	
	@OneToMany(mappedBy = "Day", cascade = CascadeType.ALL)
	private List<Schedule> scheduleList;
	

	public List<Schedule> getScheduleList() {
		return scheduleList;
	}



	public void setScheduleList(List<Schedule> scheduleList) {
		this.scheduleList = scheduleList;
	}



	@Override
	public String toString() {
		return "Day [day_Name=" + day_Name + ", scheduleList=" + scheduleList + "]";
	}



	
}
