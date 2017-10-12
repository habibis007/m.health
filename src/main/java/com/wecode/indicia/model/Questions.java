package com.wecode.indicia.model;

public class Questions {
	private String type;
	private String text;
	private QuestionItem item[];
	private Object extras;
	
	public Questions(String type, String text, QuestionItem item[], Object extras){
		this.type = type;
		this.text = text;
		this.item = item;
		this.extras = extras;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getText(){
		return text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public QuestionItem[] getItem(){
		return item;
	}
	
	public void setItem(QuestionItem[] item){
		this.item = item;
	}
	
	public Object getExtras(){
		return extras;
	}
	
	public void setExtras(Object extras){
		this.extras = extras;
	}
	
	

}
