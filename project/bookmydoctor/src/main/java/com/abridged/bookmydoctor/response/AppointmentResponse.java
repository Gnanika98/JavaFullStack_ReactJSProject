package com.abridged.bookmydoctor.response;

import java.util.List;

import com.abridged.bookmydoctor.dto.AppointmentInfoBean;
import lombok.Data;

@Data
public class AppointmentResponse {

	private int statusCode;
	private boolean isError;
	private String message;
	private AppointmentInfoBean bean;
	private List<AppointmentInfoBean> list;
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
	public AppointmentInfoBean getBean() {
		return bean;
	}
	public void setBean(AppointmentInfoBean bean) {
		this.bean = bean;
	}
	public List<AppointmentInfoBean> getList() {
		return list;
	}
	public void setList(List<AppointmentInfoBean> list) {
		this.list = list;
	}
	
}
