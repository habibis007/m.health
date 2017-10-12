package com.wecode.indicia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Diagnose {
	private String sex;
	private String age;
	private Evidence evidence;
	
	public Diagnose(String sex, String age, Evidence evidence){
		this.sex = sex;
		this.age = age;
		this.evidence = evidence;
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public String getAge(){
		return age;
	}
	
	public void setAge(String age){
		this.age = age;
	}
	
	public Evidence getEvidence(){
		return evidence;
	}
	
	public void setEvidence(Evidence evidence){
		this.evidence = evidence;
	}

}
