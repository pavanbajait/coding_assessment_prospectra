package com.pavan_bajait.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {

	@JsonProperty("API")
	private String api;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Auth")
	private String auth;
	
	@JsonProperty("HTTPS")
	private String https;
	
	@JsonProperty("Cors")
	private String cors;
	
	@JsonProperty("Link")
	private String links;
	
	@JsonProperty("Category")
	private String category;

	public Entry(String api, String description, String auth, String https, String cors, String links,
			String category) {
		super();
		this.api = api;
		this.description = description;
		this.auth = auth;
		this.https = https;
		this.cors = cors;
		this.links = links;
		this.category = category;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getHttps() {
		return https;
	}

	public void setHttps(String https) {
		this.https = https;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}