package com.pavan_bajait.demo.model;

import java.util.List;


public class JsonData {

	private Integer count;
	
	private List<Entry> entries;

	public JsonData(Integer count, List<Entry> entries) {
		super();
		this.count = count;
		this.entries = entries;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	
	
	
}