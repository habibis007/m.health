package com.wecode.indicia.model;

import java.util.ArrayList;

public class Conditions {
	private String id;
	private String name;
	private String common_name;
	private String sex_filter;
	private ArrayList<String> categories[];
	private String prevalence;
	private String acuteness;
	private String severity;
	private Object extra;
	private String triage_level;
	
	public Conditions(){
		id = null;
	}
	
	public Conditions(String id, String name, String common_name, String sex_filter, ArrayList<String> categories[]){
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.sex_filter = sex_filter;
		this.categories = categories;
		
	}
	
	public Conditions(String id, String name, String common_name, String sex_filter, ArrayList<String> categories[], String prevalence, String acuteness,
			String severity, Object extra, String triage_level){
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.sex_filter = sex_filter;
		this.categories = categories;
		this.prevalence = prevalence;
		this.acuteness = acuteness;
		this.severity = severity;
		this.extra = extra;
		this.triage_level = triage_level;
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
	
	public String getCommonName(){
		return common_name;
	}
	
	public void setCommonName(String common_name){
		this.common_name = common_name; 
	}
	
	public String getSexFilter(){
		return sex_filter;
	}
	
	public void setSexFilter(String sex_filter){
		this.sex_filter = sex_filter;
	}
	
	public ArrayList<String>[] getCategories(){
		return categories;
	}
	
	public void setCategories(ArrayList<String>[] categories){
		this.categories = categories;
	}
	
	public String getPrevalence(){
		return prevalence;
	}
	
	public void setPrevalence(String prevalence){
		this.prevalence = prevalence;
	}
	
	public String getAcuteness(){
		return acuteness;
	}
	
	public void setAcuteness(String acuteness){
		this.acuteness = acuteness;
	}
	
	public String getSeverity(){
		return severity;
	}
	
	public void setSeverity(String severity){
		this.severity = severity;
	}
	
	public Object getExtra(){
		return extra;
	}
	
	public void setExtra(Object extra){
		this.extra = extra;
	}
	
	public String getTriageLevel(){
		return triage_level;
	}
	
	public void setTriageLevel(String triage_level){
		this.triage_level = triage_level;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conditions other = (Conditions) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conditions [id=" + id + ", name=" + name + ", Common name=" + common_name
				+ ", sex=" + sex_filter + ", Categories=" + categories + ", Prevalence=" + prevalence + ", acuteness=" + acuteness + ", Severity=" + severity + ", extra=" + extra + ", Triage_level=" + triage_level + "]";
	}

	
	

}
