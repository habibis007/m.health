package com.wecode.indicia.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evidence {
	String id;
	String choice_id;
	
	public Evidence(String id, String choice_id){
		this.id = id;
		this.choice_id = choice_id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getChoiceId(){
		return choice_id;
	}
	
	public void setChoiceId(String choice_id){
		this.choice_id = choice_id;
	}

}
