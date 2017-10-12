/*
package com.wecode.indicia.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.wecode.indicia.model.Symptoms;


@Service("DiagnosisService")
public class DiagnosisServiceImp implements DiagnosisService {
	private static JSONArray diagnosis_set = new JSONArray();
	private static JSONArray symptoms = new JSONArray();
	static String sex;
	static String age;
	static String evidence[];
	static{
		diagnosis_set = populateDiagnosis(sex, age, evidence);
	}
	
	
	
	public void createDiagnosis(JSONArray diagnosis) {
	
		//Adding diagnosis to HashSet
		diagnosis_set.put(diagnosis);
		
	}
	
	
	private static JSONArray populateDiagnosis(String sex, String age, String evidence[]){
		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();
		try{
		obj.put("sex", sex);
		obj.put("age", age);
		obj.put("evidence", evidence);
		} catch(Exception e){
			e.printStackTrace();
		}
		
		array.put(obj);
		
		return array;
		
		
		
	}


}

*/