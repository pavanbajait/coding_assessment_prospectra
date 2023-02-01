package com.pavan_bajait.demo.exception;

import java.time.LocalTime;

public class MyError {

	private LocalTime localTime;
	private String message;
	private String description;
	
	public MyError(LocalTime localTime, String message, String description) {
		super();
		this.localTime = localTime;
		this.message = message;
		this.description = description;
	}
	public LocalTime getLocalTime() {
		return localTime;
	}
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}