package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.data.provider.SearchObjectProvider;

@RestController
public class WebController {
	@Autowired
	private SearchObjectProvider soop;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String beophi() {
		return "beo phi";
	}
	
	@RequestMapping(value = "/beophi/{search}", method = RequestMethod.POST)
	String beophi2(@PathVariable("search") String searchItem) {
		return "krjshgfvkzjrdgfvuzhsrkuvzgdrsjuvrhz";
	}
	
}
