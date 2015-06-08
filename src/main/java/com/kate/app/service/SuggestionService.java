package com.kate.app.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SuggestionService {
	/*private static final String dataPath = "/data/";
	private static final String dataName = "1.txt";*/
	
	/*q.add("The Atrium,Nunawading,Melbourne 墨尔本,3131");
	q.add("Thrive Parkside,Parkville,Melbourne 墨尔本,3052");*/

	/*3,The Moreland,Brunswick,Melbourne 墨尔本,3056
	4,Regent Residences,Richmond,Melbourne 墨尔本,3121
	5,Amber,Camberwell,Melbourne 墨尔本,3124
	6,Hamilton 853,Chermside West,Brisbane 布里斯班,4032
	7,Forest Ridge,Doolandella,Brisbane 布里斯班,4077
	8,Claremont Manor,South Yarra,Melbourne 墨尔本,
	9,Kornhill Gardens,Boronia Heights,Brisbane 布里斯班,
	10,Evergreen,Ivanhoe,Melbourne 墨尔本,*/
	public List<String>  getSuggestion(String query){
		List<String> q = new ArrayList<String>();
		q.add("The Atrium,Nunawading,Melbourne 墨尔本,3131");
		q.add("Thrive Parkside,Parkville,Melbourne 墨尔本,3052");
		q.add("The Moreland,Brunswick,Melbourne 墨尔本,3056");
		q.add("Regent Residences,Richmond,Melbourne 墨尔本,3121");
		List<String> resultList = new ArrayList<String>();
		/*for(String a : q){
			String result = "";  
			String[] list = a.split(",");
	    	int temp = 0;*/
	        for(int i=0; i<q.size(); i++){
	        	if(q.get(i).startsWith(query)){
	        		resultList.add(q.get(i));
	        		/*temp = i;
	        		for(int j=temp; j<list[i].length(); j++){
	   	        	 result = result + list[i];
	        		}
	        		break;*/
	        	}
	       // }
	        
	        //if(result!=null && !"".equals(result)){
	        	
	        //}
		}
		
		/*File file = new File("/data/1.txt");  
		  
		BufferedReader reader = null;  
		 List<String> resultList = new ArrayList<String>();
		try {  
		    reader = new BufferedReader(new FileReader(file));  
		   
		    while (reader.readLine() != null) {  */
		    	/*String result = null;  
		    	String[] list = reader.readLine().split(",");
		    	int temp = 0;
		        for(int i=0; i<list.length; i++){
		        	if(list[i].startsWith(query)){
		        		temp = i;
		        		break;
		        	}
		        }
		        for(int i=temp; i<list.length; i++){
		        	 result = result + list[i];
		        }
		        if(result!=null && !"".equals(result)){
		        	resultList.add(result);
		        }
		    }  
		} catch (Exception e) {  
		    e.printStackTrace();  
		} finally {  
		    if (reader != null) {  
		        try {  
		            reader.close();  
		        } catch (Exception e) {  
		            e.printStackTrace();  
		        }  
		    }  
		}*/
		return resultList;
	}
	
}

