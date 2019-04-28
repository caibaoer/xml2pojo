package com.huangpan.pojo;

import java.io.Serializable;

public class ResponseBase implements Serializable {
	
	private static final long serialVersionUID = 6524831387688715261L;
	
	private String result;
	
	
	private String message;
	
	private PolicySchedule schedule;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public PolicySchedule getSchedule() {
		return schedule;
	}
	
	public void setSchedule(PolicySchedule schedule) {
		this.schedule = schedule;
	}
	
	
}
