package com.entity.demoentity.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appoinment")
public class Appoinment {

	public Appoinment() {

	}

	public Appoinment(String ap_Id, String ap_No, Date ap_Date, Patient patient, Schedule schedule) {
		super();
		this.ap_Id = ap_Id;
		this.ap_No = ap_No;
		this.ap_Date = ap_Date;
		this.patient = patient;
		this.schedule = schedule;
	}

	@Id
	@Column(name = "ap_Id")
	private String ap_Id;

	public String getAp_Id() {
		return ap_Id;
	}

	public void setAp_Id(String ap_Id) {
		this.ap_Id = ap_Id;
	}

	@Column(name = "ap_No")
	private String ap_No;

	public String getAp_No() {
		return ap_No;
	}

	public void setAp_No(String ap_No) {
		this.ap_No = ap_No;
	}

	@Column(name = "ap_Date")
	private Date ap_Date;

	public Date getAp_Date() {
		return ap_Date;
	}

	public void setAp_Date(Date ap_Date) {
		this.ap_Date = ap_Date;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "p_Id", referencedColumnName = "p_Id", insertable = false, updatable = false)
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sc_Id", referencedColumnName = "sc_Id", insertable = false, updatable = false)
	private Schedule schedule;

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Appoinment [ap_Id=" + ap_Id + ", ap_No=" + ap_No + ", ap_Date=" + ap_Date + ", patient=" + patient
				+ ", schedule=" + schedule + "]";
	}

}
