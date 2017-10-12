package com.wecode.indicia.model;

public class Diagnosis {
	private DiagnosisResponse diagnosisResponse;
	private Questions question;
	private ConditionProbability conditionProbability;
	private QuestionItem questionItem;
	private Choice choice;
	
	public Diagnosis(DiagnosisResponse diagnosisResponse, Questions question, ConditionProbability conditionProbability, QuestionItem questionItem, Choice choice){
		this.diagnosisResponse = diagnosisResponse;
		this.question = question;
		this.conditionProbability = conditionProbability;
		this.questionItem = questionItem;
		this.choice = choice;
	}
	
	public DiagnosisResponse getDiagnosisResponse(){
		return diagnosisResponse;
	}
	
	public void setDiagnosisResponse(DiagnosisResponse diagnosisResponse){
		this.diagnosisResponse = diagnosisResponse;
	}
	
	public Questions getQuestion(){
		return question;
	}
	
	public void setQuestion(Questions question){
		this.question = question;
	}
	
	public ConditionProbability getConditionProbability(){
		return conditionProbability;
	}
	
	public void setConditionProbability(ConditionProbability conditionProbability){
		this.conditionProbability = conditionProbability;
	}
	
	public QuestionItem getQuestionItem(){
		return questionItem;
	}
	
	public void setQuestionItem(QuestionItem questionItem){
		this.questionItem = questionItem;
	}
	
	public Choice getChoice(){
		return choice;
	}
	
	public void setChoice(Choice choice){
		this.choice = choice;
	}
	
	

}
