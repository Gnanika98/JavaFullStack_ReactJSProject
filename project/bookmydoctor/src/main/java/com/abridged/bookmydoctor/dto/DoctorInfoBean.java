package com.abridged.bookmydoctor.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor_info")
@JsonRootName("DoctorInfoBean")
@JsonInclude(content = Include.NON_NULL)
public class DoctorInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "doctor_id")
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId;
	@Column
	@JsonProperty
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+[\\s[[a-zA-Z]+]]*", message = "Doctor name should have only characters")
	private String doctorName;
	@Column
	@JsonProperty
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+[\\s[[a-zA-Z]+]]*", message = "Specialization name should have only characters")
	private String speciality;
	@Column
	@JsonProperty
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+[\\s[[a-zA-Z]+]]*", message = "Location should have only characters")
	private String location;
	@Column
	@JsonProperty
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+[\\s[[a-zA-Z]+]]*", message = "Hospital name should have only characters")
	private String hospitalName;
	@Column
	@JsonProperty
	@NotNull
	private long mobileNo;
	@Column
	@JsonProperty
	@NotNull
	@Email
	private String email;
	@Column
	@NotNull
	@JsonProperty
	@Pattern(regexp = "[[a-zA-Z][@!#$%^&*]{1,}[0-9]{1,}]{8,16}", message = "Password should have min 8 character and 1 special character ")
	private String password;

	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AppointmentInfoBean> getAppointment() {
		return appointment;
	}
	public void setAppointment(List<AppointmentInfoBean> appointment) {
		this.appointment = appointment;
	}
	public List<FeedBackInfoBean> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<FeedBackInfoBean> feedback) {
		this.feedback = feedback;
	}
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	@JsonIgnoreProperties("doctor")
	private List<AppointmentInfoBean> appointment = new ArrayList<AppointmentInfoBean>();
	@OneToMany(mappedBy = "doctorInfo", cascade = CascadeType.ALL)
	@JsonIgnore
	@JsonIgnoreProperties("doctorInfo")
	private List<FeedBackInfoBean> feedback = new ArrayList<FeedBackInfoBean>();
}
