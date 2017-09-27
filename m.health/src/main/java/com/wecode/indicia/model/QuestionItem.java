package com.wecode.indicia.model;

public class QuestionItem {
	private String id;
	private String name;
	private Choice choices[];
	
	public QuestionItem(String id, String name, Choice choices[]){
		this.id = id;
		this.name = name;
		this.choices = choices;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Choice[] getChoices(){
		return choices;
	}
	
	public void setChoices(Choice choices[]){
		this.choices = choices;
	}
	
	

}
