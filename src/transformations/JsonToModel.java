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
		
		//for each json file in data folder
		//map it to java objects
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String jsonTest = "{\"au_id\" : \"172-32-1176\",\"au_lname\" : \"White\",\"au_fname\" : \"Johnson\",\"phone\" : \"408 496-7223\",\"address\" : \"10932 Bigge Rd.\",\"city\" : \"Menlo Park\",\"state\" : \"CA\",\"zip\" : \"94025\",\"contract\" : 1}";
		
		//TESTING
		try {
			Author test = objectMapper.readValue(jsonTest, Author.class);
			System.out.println(test.au_id);
		} catch (JsonParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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
		//Mapping authors
		try {
			
//			List<Author> authorObjects = objectMapper.readValue(authorFile, new TypeReference<List<Author>>(){});
//			List<Discount> discountObjects = objectMapper.readValue(discountFile, new TypeReference<List<Discount>>(){});
//			List<Employee> employeeObjects = objectMapper.readValue(employeeFile, new TypeReference<List<Employee>>(){});
//			List<Jobs> jobObjects = objectMapper.readValue(jobFile, new TypeReference<List<Jobs>>(){});
//			List<Pub_info> pubInfoObjects = objectMapper.readValue(pubInfoFile, new TypeReference<List<Pub_info>>(){});
//			List<Publisher> publisherObjects = objectMapper.readValue(publisherFile, new TypeReference<List<Publisher>>(){});
//			List<Roysched> royschedObjects = objectMapper.readValue(royschedFile, new TypeReference<List<Roysched>>(){});
//			List<Sale> saleObjects = objectMapper.readValue(saleFile, new TypeReference<List<Sale>>(){});
//			List<Store> storeObjects = objectMapper.readValue(storeFile, new TypeReference<List<Store>>(){});
//			List<Title> titleObjects = objectMapper.readValue(titleFile, new TypeReference<List<Title>>(){});
			
				
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
//			int count = 0;
//			for(int i = 0; i < javaObjectsMap.get("titleAuthors").size(); i++) {
//				TitleAuthor ta = (TitleAuthor) javaObjectsMap.get("titleAuthors").get(i);
//				for(int j = 0; j < javaObjectsMap.get("titles").size(); j++) {
//					Title t = (Title) javaObjectsMap.get("titles").get(j);
//					t.au_ids = new ArrayList<String>();
//					//System.out.println("JAVA OBJECT AU SIZE BEFORE ADDING: " + t.au_ids.size());
//					for(int k = 0; k < javaObjectsMap.get("authors").size(); k++) {
//						Author a = (Author) javaObjectsMap.get("authors").get(k);
//						
////						System.out.println("titleauthor: " + ta.title_id +" " +ta.au_id);
////						System.out.println("author: " + a.au_id);
////						System.out.println("title: " + t.title_id);
//						if(ta.au_id.equals(a.au_id) && ta.title_id.equals(t.title_id)) {
//							//add author to the title's author id list
//							//System.out.println("MATCH " + a.au_id);
//							t.au_ids.add(a.au_id);
//						}
//						//System.out.println(count);
//						count++;
//					}
//					//System.out.println("JAVA OBJECT AU SIZE AFTER ADDING: " + t.au_ids.size());
//					//System.out.println("combinations: " + javaObjectsMap.get("titleAuthors").size()*javaObjectsMap.get("titles").size()*javaObjectsMap.get("authors").size());
//				}
//			}
			
			//Mapping authors to title
			//DETTE FUNGERER SOM DET SKAL
			int titleIdMatches = 0; //For testing
			int titleIdAuthorIdMatches = 0; //for testing
			for(int i = 0; i < javaObjectsMap.get("titleAuthors").size(); i++) {
				TitleAuthor ta = (TitleAuthor) javaObjectsMap.get("titleAuthors").get(i);
				
				for(int j = 0; j < javaObjectsMap.get("titles").size(); j++) {
					Title t = (Title) javaObjectsMap.get("titles").get(j);
					t.au_ids = new ArrayList<String>();
					if(ta.title_id.equals(t.title_id)) {
						//System.out.println("TA titleID equal to title titleID");
						titleIdMatches++;
					}
					else {
						//System.out.println("TA titleID NOT equal to title titleID");
					}
					
					for(int k = 0; k < javaObjectsMap.get("authors").size(); k++) {
						Author a = (Author) javaObjectsMap.get("authors").get(k);
						
						if(ta.au_id.equals(a.au_id) && ta.title_id.equals(t.title_id)) {
							titleIdAuthorIdMatches++;
							t.au_ids.add(a.au_id);
						}
					}
					System.out.println("Title nr " + j + " au ids: " + t.au_ids.size());
				}
			}
			System.out.println("TitleIdMatches: " + titleIdMatches + " out of " + javaObjectsMap.get("titleAuthors").size() + " TA, and " + javaObjectsMap.get("titles").size() + " titles");
			System.out.println("Number of authors: " + javaObjectsMap.get("authors").size() + ". titleIdAuthorIdMatches: " + titleIdAuthorIdMatches);
			
			
				
			//System.out.println(javaObjectsMap);
			
			
			//System.out.println(authorObjects.get(0)); //calls toString
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
