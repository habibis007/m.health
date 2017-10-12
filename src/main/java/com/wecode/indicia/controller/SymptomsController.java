package com.wecode.indicia.controller;

import java.nio.charset.Charset;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wecode.indicia.model.Symptoms;

@Component
public class SymptomsController {
	private static final Logger logger = LoggerFactory.getLogger(SymptomsController.class);
	RestTemplate restTemplate = new RestTemplate();
	
	/**
	public List getSymptoms(){
		ResponseEntity<List<Symptoms>> symptomsResponse = restTemplate.exchange("https://api.infermedica.com/v2/diagnosis", 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Symptoms>>() {	
		});
		
		List<Symptoms> symptoms = symptomsResponse.getBody();
		return symptoms;
	}
	
	**/
	
	@RequestMapping("/symptoms")
	private void displaySymptoms() {
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("4d482fc1","2b1dd49af8c132d86be9eedd11650103"));
		
		Symptoms symptoms = restTemplate.getForObject("https://api.infermedica.com/v2/diagnosis", Symptoms.class);
		System.out.print(symptoms.toString());
	}

	
	
}
