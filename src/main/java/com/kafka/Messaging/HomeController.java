package com.kafka.Messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	Environment env;
	
	@RequestMapping(value= "/home")
	public String getResponse(){
		return env.getProperty("message.response");
		
	}

}
