package com.abridged.bookmydoctor.response;

import java.util.List;

import com.abridged.bookmydoctor.dto.FeedBackInfoBean;

import lombok.Data;

@Data
public class FeedBackResponse {

	private int statusCode;
	private boolean isError;
	private String message;
	private FeedBackInfoBean bean;
	private List<FeedBackInfoBean> list;
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
	public FeedBackInfoBean getBean() {
		return bean;
	}
	public void setBean(FeedBackInfoBean bean) {
		this.bean = bean;
	}
	public List<FeedBackInfoBean> getList() {
		return list;
	}
	public void setList(List<FeedBackInfoBean> list) {
		this.list = list;
	}
	
}
