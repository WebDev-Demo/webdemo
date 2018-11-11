package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String beophi() {
		return "beo phi";
	}
	
	@RequestMapping(value = "/beophi", method = RequestMethod.GET)
	String beophi2() {
		return "krjshgfvkzjrdgfvuzhsrkuvzgdrsjuvrhz";
	}
	
}
