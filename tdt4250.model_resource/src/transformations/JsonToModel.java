package transformations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dataModels.Author;
import dataModels.Discount;
import dataModels.Employee;
import dataModels.Jobs;
import dataModels.PubInfo;
import dataModels.Publisher;
import dataModels.Roysched;
import dataModels.Sale;
import dataModels.Store;
import dataModels.Title;
import dataModels.TitleAuthor;

public class JsonToModel {

	public static void main(String[] args) {
		//
		HashMap javaObjects = mapJsonToObjects();
		JavaMToEcoreM.Transform(javaObjects);

	}
	
	public static HashMap mapJsonToObjects() {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		File authorFile = new File("data/pubsJSON/authors.json");
		File discountFile = new File("data/pubsJSON/discounts.json");
		File employeeFile = new File("data/pubsJSON/employee.json");
		File jobFile = new File("data/pubsJSON/jobs.json");
		File pubInfoFile = new File("data/pubsJSON/pub_info.json");
		File publisherFile = new File("data/pubsJSON/publishers.json");
		File royschedFile = new File("data/pubsJSON/roysched.json");
		File saleFile = new File("data/pubsJSON/sales.json");
		File storeFile = new File("data/pubsJSON/stores.json");
		File titleFile = new File("data/pubsJSON/titles.json");
		File titleAuthorFile = new File("data/pubsJSON/titleauthor.json");

		
		HashMap<String, List> javaObjectsMap = new HashMap();
		try {	
				
			javaObjectsMap.put("authors", (objectMapper.readValue(authorFile, new TypeReference<List<Author>>(){})));
			javaObjectsMap.put("discounts", (objectMapper.readValue(discountFile, new TypeReference<List<Discount>>(){})));
			javaObjectsMap.put("employees", (objectMapper.readValue(employeeFile, new TypeReference<List<Employee>>(){})));
			javaObjectsMap.put("jobs", (objectMapper.readValue(jobFile, new TypeReference<List<Jobs>>(){})));
			javaObjectsMap.put("pubInfos", (objectMapper.readValue(pubInfoFile, new TypeReference<List<PubInfo>>(){})));
			javaObjectsMap.put("publishers", (objectMapper.readValue(publisherFile, new TypeReference<List<Publisher>>(){})));
			javaObjectsMap.put("royscheds", (objectMapper.readValue(royschedFile, new TypeReference<List<Roysched>>(){})));
			javaObjectsMap.put("sales", (objectMapper.readValue(saleFile, new TypeReference<List<Sale>>(){})));
			javaObjectsMap.put("stores", (objectMapper.readValue(storeFile, new TypeReference<List<Store>>(){})));
			javaObjectsMap.put("titles", (objectMapper.readValue(titleFile, new TypeReference<List<Title>>(){})));
			javaObjectsMap.put("titleAuthors", (objectMapper.readValue(titleAuthorFile, new TypeReference<List<TitleAuthor>>(){})));

			
			//Mapping job description to employees
			for(int i = 0; i < javaObjectsMap.get("employees").size(); i++) {
				Employee emp = (Employee) javaObjectsMap.get("employees").get(i);
				for(int j = 0; j < javaObjectsMap.get("jobs").size(); j++) {
					Jobs job = (Jobs) javaObjectsMap.get("jobs").get(j);
					if(emp.job_id == job.job_id) {
						emp.job_desc = job.job_desc;
					}		
				}
			}
			
			
			//Mapping authors to title
			
			//Initialize title object's author id list
			for(int i = 0; i < javaObjectsMap.get("titles").size(); i++) {
				Title t = (Title) javaObjectsMap.get("titles").get(i);
				t.au_ids = new ArrayList<String>();
			}
			
			for(int i = 0; i < javaObjectsMap.get("titleAuthors").size(); i++) {
				
				TitleAuthor ta = (TitleAuthor) javaObjectsMap.get("titleAuthors").get(i);
				for(int j = 0; j < javaObjectsMap.get("titles").size(); j++) {
					
					Title t = (Title) javaObjectsMap.get("titles").get(j);
					for(int k = 0; k < javaObjectsMap.get("authors").size(); k++) {
						Author a = (Author) javaObjectsMap.get("authors").get(k);
						
						if(ta.au_id.equals(a.au_id) && ta.title_id.equals(t.title_id)) {
							t.au_ids.add(a.au_id);
						}
					}
				}
			}
			
				
			//System.out.println(javaObjectsMap);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return javaObjectsMap;
	}
	

}
