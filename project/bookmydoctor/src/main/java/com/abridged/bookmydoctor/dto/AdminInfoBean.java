package com.abridged.bookmydoctor.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
@Data
@Entity
@Table(name = "admin_info")
@JsonRootName("AdminInfoBean")
@JsonInclude(content = Include.NON_NULL)
public class AdminInfoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
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

}
