package com.abridged.bookmydoctor.response;

import java.util.List;

import com.abridged.bookmydoctor.dto.DoctorInfoBean;

import lombok.Data;

@Data
public class DoctorResponse {

	private int statusCode;
	private boolean isError;
	private String message;
	private DoctorInfoBean bean;
	private List<DoctorInfoBean> list;
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
	public DoctorInfoBean getBean() {
		return bean;
	}
	public void setBean(DoctorInfoBean bean) {
		this.bean = bean;
	}
	public List<DoctorInfoBean> getList() {
		return list;
	}
	public void setList(List<DoctorInfoBean> list) {
		this.list = list;
	}
	
}
