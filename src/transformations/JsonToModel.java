package transformations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dataModels.Author;

public class JsonToModel {

	public static void main(String[] args) {
		//
		mapJsonToObjects(new File("data/pubsJSON/authors.json"));

	}
	
	public static void mapJsonToObjects(File file) {
		
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
		
		
		//Mapping authors
//		try {
//			objectMapper.readValue(file, new TypeReference<List<Author>>(){});
//		} catch (JsonParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
