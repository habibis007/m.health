package com.wecode.indicia.model;

public class DiagnosisResponse {
	private Questions questions;
	private Conditions condition;
	private Object extras;
	
	public DiagnosisResponse(Questions questions, Conditions condition, Object extras){
		this.questions = questions;
		this.condition = condition;
		this.extras = extras;
	}
	
	public Questions getQuestions(){
		return questions;
	}
	
	public void setQuestions(Questions questions){
		this.questions = questions;
	}
	
	public Conditions getCondition(){
		return condition;
	}
	
	public void setCondition(Conditions condition){
		this.condition = condition;
	}
	
	public Object getExtras(){
		return extras;
	}
	
	public void setExtras(Object extras){
		this.extras = extras;
	}
	

}
