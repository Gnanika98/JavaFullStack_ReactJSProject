package com.abridged.bookmydoctor.response;

import java.util.List;

import com.abridged.bookmydoctor.dto.AvailabilityDates;
import lombok.Data;

@Data
public class AvailabilityDatesResponse {

	private int statusCode;
	private boolean isError;
	private String message;
	private AvailabilityDates bean;
	private List<AvailabilityDates> list;
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
	public AvailabilityDates getBean() {
		return bean;
	}
	public void setBean(AvailabilityDates bean) {
		this.bean = bean;
	}
	public List<AvailabilityDates> getList() {
		return list;
	}
	public void setList(List<AvailabilityDates> list) {
		this.list = list;
	}
	
}
