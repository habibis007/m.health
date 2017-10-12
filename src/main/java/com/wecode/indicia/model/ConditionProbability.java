package com.wecode.indicia.model;

public class ConditionProbability {
	private String id;
	private String name;
	private String common_name;
	private Number probability;
	
	public ConditionProbability(){
		id = null;
	}
	
	public ConditionProbability(String id, String name, String common_name, Number probability){
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.probability = probability;
		
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
	
	public String getCommon_name(){
		return common_name;
	}
	
	public void setCommon_name(String common_name){
		this.common_name = common_name;
	}
	
	public Number getProbability(){
		return probability;
	}
	
	public void setProbability(Number probability){
		this.probability = probability;
	}

}
