package com.pavan_bajait.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan_bajait.demo.service.Service;
import com.pavan_bajait.demo.exception.CategoryException;
import com.pavan_bajait.demo.model.Entry;


@RestController
@RequestMapping("/v1/")
public class Controller {

	@Autowired
	private Service service;
	
	@GetMapping("/entries/{category}")
	public ResponseEntity<List<Entry>> getEntriesBycategory(@PathVariable String category) throws CategoryException{
		
		List<Entry> rlist=service.getTitle(category);
		
		return new ResponseEntity<List<Entry>>(rlist, HttpStatus.OK);
	}
	@PostMapping("/entries")
	public ResponseEntity<List<Entry>> saveEntry(@RequestBody Entry entry){
		
		List<Entry> elist=service.saveEntry(entry);
		
		return new ResponseEntity<List<Entry>>(elist, HttpStatus.OK);
	}
	
}