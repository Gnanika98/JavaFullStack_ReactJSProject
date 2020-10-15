package com.abridged.bookmydoctor.response;

import java.util.List;

import com.abridged.bookmydoctor.dto.PatientInfoBean;

import lombok.Data;

@Data
public class PatientResponse {

	private int statusCode;
	private boolean isError;
	private String message;
	private PatientInfoBean bean;
	private List<PatientInfoBean> list;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public boolean isError() {
		return isError;
	}
	public void setError(boolean isError) {
		this.isError = isError;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PatientInfoBean getBean() {
		return bean;
	}
	public void setBean(PatientInfoBean bean) {
		this.bean = bean;
	}
	public List<PatientInfoBean> getList() {
		return list;
	}
	public void setList(List<PatientInfoBean> list) {
		this.list = list;
	}
	
}
