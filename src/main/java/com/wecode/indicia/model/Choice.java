package com.wecode.indicia.model;

public class Choice {
	private String id;
	private String label;
	
	public Choice(){
		id = null;
	}
	
	public Choice(String id, String label){
		this.id = id;
		this.label = label;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getLabel(){
		return label;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	
	@Override
	public String toString(){
		return "Id= " + id + ", Label= " + label ;
	}
	
	

}
