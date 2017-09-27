package com.wecode.indicia.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.wecode.indicia.model.Symptoms;

@Controller
public class SymptomsController {
	private static final Logger logger = LoggerFactory.getLogger(SymptomsController.class);
	RestTemplate restTemplate = new RestTemplate();
	public List getSymptoms(){
		ResponseEntity<List<Symptoms>> symptomsResponse = restTemplate.exchange("https://api.infermedica.com/v2/diagnosis", 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Symptoms>>() {	
		});
		
		List<Symptoms> symptoms = symptomsResponse.getBody();
		return symptoms;
	}
	
}
