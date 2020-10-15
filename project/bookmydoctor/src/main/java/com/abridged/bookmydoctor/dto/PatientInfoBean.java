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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
@Table(name = "patient_info")
@JsonRootName("PatientInfoBean")
@JsonInclude(content = Include.NON_NULL)
public class PatientInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "patient_id")
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;

	@Column
	@JsonProperty
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+[\\s[[a-zA-Z]+]]*", message = "Patient name should have only characters")
	private String patientName;

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
	@Column
	@JsonProperty
	@Pattern(regexp = "[[A-Z] {1,2}][+,-]" , message = "Blood Valid Blood group")
	private String bloodGroup;
	@Column
	@JsonProperty
	private String gender;
	@Column
	@JsonProperty
	@NotNull
	@Min(value = 1 ,message = "Age must be greater than 1")
	@Max(value = 130 , message = "Age must be less than 130")
	private int age;
	@Column
	@JsonProperty
	private String address;
	

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("patient")
	@JsonIgnore
	private List<AppointmentInfoBean> appointment = new ArrayList<AppointmentInfoBean>();

	@OneToMany(mappedBy = "patientInfo", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("patientInfo")
	@JsonIgnore
	private List<FeedBackInfoBean> feedback = new ArrayList<FeedBackInfoBean>();
}
