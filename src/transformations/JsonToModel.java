package transformations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dataModels.Author;
import dataModels.Discount;
import dataModels.Employee;
import dataModels.Jobs;
import dataModels.Pub_info;
import dataModels.Publisher;
import dataModels.Roysched;
import dataModels.Sale;
import dataModels.Store;
import dataModels.Title;

public class JsonToModel {

	public static void main(String[] args) {
		//
		mapJsonToObjects();

	}
	
	public static void mapJsonToObjects() {
		
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
		
		
		//Mapping authors
		try {
			List<Author> authorObjects = objectMapper.readValue(authorFile, new TypeReference<List<Author>>(){});
			List<Discount> discountObjects = objectMapper.readValue(discountFile, new TypeReference<List<Discount>>(){});
			List<Employee> employeeObjects = objectMapper.readValue(employeeFile, new TypeReference<List<Employee>>(){});
			List<Jobs> jobObjects = objectMapper.readValue(jobFile, new TypeReference<List<Jobs>>(){});
			List<Pub_info> pubInfoObjects = objectMapper.readValue(pubInfoFile, new TypeReference<List<Pub_info>>(){});
			List<Publisher> publisherObjects = objectMapper.readValue(publisherFile, new TypeReference<List<Publisher>>(){});
			List<Roysched> royschedObjects = objectMapper.readValue(royschedFile, new TypeReference<List<Roysched>>(){});
			List<Sale> saleObjects = objectMapper.readValue(saleFile, new TypeReference<List<Sale>>(){});
			List<Store> storeObjects = objectMapper.readValue(storeFile, new TypeReference<List<Store>>(){});
			List<Title> titleObjects = objectMapper.readValue(titleFile, new TypeReference<List<Title>>(){});
			
			System.out.println(authorObjects.get(0)); //calls toString
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
	}

}
