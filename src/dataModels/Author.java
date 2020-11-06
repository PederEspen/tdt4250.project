package dataModels;

public class Author {
	
	public String au_id;
	public String au_lname;
	public String au_fname;
	public String phone;
	public String address;
	public String city;
	public String state;
	public int zip;
	public int contract;
	
	public String getId() {
		return au_id;
	}
	
	public String toString() {
		return ("objektet i string: " + au_lname);
	}

}
