package com.service.Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Service.Service.ResultService;

@RestController
@RequestMapping("/Result")
public class ResultControl {
	
	@Autowired
	private ResultService service;

}
