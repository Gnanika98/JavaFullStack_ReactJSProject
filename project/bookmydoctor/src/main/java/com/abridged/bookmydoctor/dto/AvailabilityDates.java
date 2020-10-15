package com.abridged.bookmydoctor.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
@Data
@Entity
@Table(name = "availability_info")
@JsonRootName("AvailabilityDates")
@JsonInclude(content=Include.NON_NULL)
public class AvailabilityDates implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int availabilityId;
	@Column
	@JsonProperty
	private int doctorId;
	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Type(type="date") 
	private Date fromDate;
	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Type(type="date")
	private Date toDate;
	public int getAvailabilityId() {
		return availabilityId;
	}
	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}
//	public int getDoctorId() {
//		return doctorId;
//	}
//	public void setDoctorId(int doctorId) {
//		this.doctorId = doctorId;
//	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	
	
}
