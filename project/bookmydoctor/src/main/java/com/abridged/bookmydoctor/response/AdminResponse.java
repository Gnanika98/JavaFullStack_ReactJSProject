package com.abridged.bookmydoctor.response;



import com.abridged.bookmydoctor.dto.AdminInfoBean;

import lombok.Data;

@Data
public class AdminResponse {
	private int statusCode;
	private boolean isError;
	private String message;
	private AdminInfoBean bean;
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
	public AdminInfoBean getBean() {
		return bean;
	}
	public void setBean(AdminInfoBean bean) {
		this.bean = bean;
	}
	
	
}


