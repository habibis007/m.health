package com.wecode.indicia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Symptoms {
	private String id;
	private String name;
	private String common_name;
	private String question;
	private String sex_filter;
	private String category;
	private Object extras;
	private Object children;
	private String image_url;
	private String image_source;
	private String parent_id;
	private String parent_relation;
	
	public Symptoms(){
		id = null;
	}
	
	public Symptoms(String id, String name, String question, String sex_filter){
		this.id = id;
		this.name = name;
		this.question = question;
		this.sex_filter = sex_filter;
	}
	
	public Symptoms(String id, String name, String common_name, String question, String sex_filter, String category, Object extras, Object children, String image_url,
			String image_source, String parent_id, String parent_relation){
		this.id = id;
		this.name = name;
		this.common_name = common_name;
		this.question = question;
		this.sex_filter = sex_filter;
		this.category = category;
		this.extras = extras;
		this.children = children;
		this.image_url = image_url;
		this.image_source = image_source;
		this.parent_id = parent_id;
		this.parent_relation = parent_relation;
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
	
	public String getQuestion(){
		return question;
	}
	
	public void setQuestion(String question){
		this.question = question;
	}
	
	public String getSexFilter(){
		return sex_filter;
	}
	
	public void setSexFilter(String sex_filter){
		this.sex_filter = sex_filter;
	}
	
	public String getCategory(){
		return category;
	}
	
	public void setCategory(String category){
		this.category = category;
	}
	
	public Object getExtras(){
		return extras;
	}
	
	public void setExtras(Object extras){
		this.extras = extras;
	}
	
	public Object getChildren(){
		return children;
	}
	
	public void setChildren(Object children){
		this.children = children;
	}
	
	public String getImageUrl(){
		return image_url;
	}
	
	public void setImageUrl(String image_url){
		this.image_url = image_url;
	}
	
	public String getImageSource(){
		return image_source;
	}
	
	public void setImageSource(String image_source){
		this.image_source = image_source;
	}
	
	public String getParentId(){
		return parent_id;
	}
	
	public void setParentId(String parent_id){
		this.parent_id = parent_id;
	}
	
	public String getParentRelation(){
		return parent_relation;
	}
	
	public void setParentRelation(String parent_relation){
		this.parent_relation = parent_relation;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symptoms other = (Symptoms) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Symptoms [id=" + id + ", name=" + name + ", Common name=" + common_name
				+ ", sex=" + sex_filter + ", Category=" + category + ", Extras=" + extras + ", Children=" + children + ", Image Url=" + image_url + ", Image Source=" + image_source + ", Parent Id=" + parent_id + ", Parent Relation=" + parent_relation + "]";
	}
}
