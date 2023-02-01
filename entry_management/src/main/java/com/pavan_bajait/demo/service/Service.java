package com.pavan_bajait.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.pavan_bajait.demo.exception.CategoryException;
import com.pavan_bajait.demo.model.Entry;
import com.pavan_bajait.demo.model.JsonData;


@org.springframework.stereotype.Service
public class Service{

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Entry> getTitle(String category) throws CategoryException{
		
		  String url = "https://api.publicapis.org/entries";
	        Entry[] entries = restTemplate.getForObject(url, Entry[].class);
	        return Arrays.stream(entries)
	                .filter(entry -> entry.getCategory().equals(category))
	                .collect(Collectors.toList());

	}


	public List<Entry> saveEntry(Entry entry) {
		
		JsonData d=restTemplate.getForObject("https://api.publicapis.org/entries", JsonData.class);
		
		List<Entry> elist=d.getEntries();
		
		elist.add(entry);
		
		return elist;
	}

}