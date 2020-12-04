package transformations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dataModels.Author;
import dataModels.Discount;
import dataModels.Employee;
import dataModels.PubInfo;
import dataModels.Publisher;
import dataModels.Roysched;
import dataModels.Sale;
import dataModels.Store;
import dataModels.Title;
import pubs.PubsFactory;
import pubs.PubsPackage;
import pubs.author;
import pubs.discount;
import pubs.employee;
import pubs.pubInfo;
import pubs.pub_info;
import pubs.publisher;
import pubs.root;
import pubs.roysched;
import pubs.sale;
import pubs.store;
import pubs.title;

public class JavaMToEcoreM {
	
	public static void transformPublisher(root r, PubsFactory factory, List<Publisher> publishers) {
		for(int i = 0; i < publishers.size(); i++) {
			//System.out.println(publishers.get(i));
			publisher p = factory.createpublisher();
			p.setCity(publishers.get(i).city);
			p.setCountry(publishers.get(i).country);
			p.setPubname(publishers.get(i).pub_name);
			p.setState(publishers.get(i).state);
			p.setPub_id(publishers.get(i).pub_id);
			r.getPublishers().add(p);
		}
	}
	
	
	public static void transformPubInfo(root r, PubsFactory factory, List<PubInfo> pubInfos) {
		for(int i = 0; i < pubInfos.size(); i++) {
			pub_info pi = factory.createpub_info();
			pi.setPr_info(pubInfos.get(i).pr_info); //pubInfos.get(i).getPr_info()
			pi.setPub_id(pubInfos.get(i).pub_id);
			
			for(int j = 0; j < r.getPublishers().size(); j++) {
				if(pi.getPub_id().equals(r.getPublishers().get(j).getPub_id())) {
					r.getPublishers().get(j).setPub_info(pi);
				}
			}
		}
	}
	
	
	public static void transformEmployee(root r, PubsFactory factory, List<Employee> employees) {
		for(int i = 0; i < employees.size(); i++) {
			employee employee = factory.createemployee();
			employee.setEmp_id(employees.get(i).emp_id);
			employee.setFname(employees.get(i).fname);
			employee.setLname(employees.get(i).lname);
			employee.setJob_desc(employees.get(i).job_desc);
			employee.setJob_id(employees.get(i).job_id);
			employee.setJob_lvl(employees.get(i).job_lvl);
			employee.setMinit(employees.get(i).minit);
			employee.setHire_date(employees.get(i).hire_date);
			employee.setPub_id(employees.get(i).pub_id);
			
			for(int j = 0; j < r.getPublishers().size(); j++) {
				if(employee.getPub_id().equals(r.getPublishers().get(j).getPub_id())) {
					r.getPublishers().get(j).getEmployees().add(employee);
				}
			}
		}
	}
	
	
	public static void transformStore(root r, PubsFactory factory, List<Store> stores) {
		for(int i = 0; i < stores.size(); i++) {
			store s = factory.createstore();
			s.setStor_name(stores.get(i).stor_name);
			s.setStor_address(stores.get(i).stor_address);
			s.setStor_id(stores.get(i).stor_id);
			s.setCity(stores.get(i).city);
			s.setState(stores.get(i).state);
			s.setZip(stores.get(i).zip);
			r.getStores().add(s);
		}
	}
	
	
	public static void transformDiscount(root r, PubsFactory factory, List<Discount> discounts) {
		for(int i = 0; i < discounts.size(); i++) {
			discount d = factory.creatediscount();
			d.setStor_id(discounts.get(i).stor_id);
			d.setDiscounttype(discounts.get(i).discounttype);
			d.setLowqty(discounts.get(i).lowqty);
			d.setHighqty(discounts.get(i).highqty);
			d.setDiscount(discounts.get(i).discount);
			
			for(int j = 0; j < r.getStores().size(); j++) {
				if(d.getStor_id().equals(r.getStores().get(j).getStor_id())) {
					r.getStores().get(j).getDiscounts().add(d);
				}
			}
		}
	}
	
	
	public static void transformSale(root r, PubsFactory factory, List<Sale> sales) {
		for(int i = 0; i < sales.size(); i++) {
			sale s = factory.createsale();
			s.setOrd_num(sales.get(i).ord_num);
			s.setStor_id(sales.get(i).stor_id);
			s.setOrd_date(sales.get(i).ord_date);
			s.setQty(sales.get(i).qty);
			s.setPayterms(sales.get(i).payterms);
			
			for(int j = 0; j < r.getStores().size(); j++) {
				//System.out.println("Print: " + s.getStor_id());
				if(s.getStor_id().equals(r.getStores().get(j).getStor_id())) {
					r.getStores().get(j).getSales().add(s);
				}
			}
		}
	}
	
	
	public static void transformTitle(root r, PubsFactory factory, List<Title> titles) {
		for(int i = 0; i < titles.size(); i++) {
			title t = factory.createtitle();
			t.setTitle(titles.get(i).title);
			t.setTitle_id(titles.get(i).title_id);
			t.setType(titles.get(i).type);
			t.setPub_id(titles.get(i).pub_id);
			t.setPrice(titles.get(i).price);
			t.setAdvance(titles.get(i).advance);
			t.setRoyalty(titles.get(i).royalty);
			t.setYtd_sales(titles.get(i).ytd_sales);
			t.setNotes(titles.get(i).notes);
			t.setPubdate(titles.get(i).pubdate);
			
			//Set au ids.
			for(int x = 0; x < titles.get(i).au_ids.size(); x++) {
				t.getAu_ids().add(titles.get(i).au_ids.get(x));
			}
			
			//link titles to publishers
			for(int j = 0; j < r.getPublishers().size(); j++) {
				if(t.getPub_id().equals(r.getPublishers().get(j).getPub_id())) {
					r.getPublishers().get(j).getTitles().add(t);
				}
			}
		}
	}
	
	
	public static void transformAuthor(root r, PubsFactory factory, List<Author> authors) {
		//List<author> ecoreAuthors = new ArrayList<author>();
		for(int i = 0; i < authors.size(); i++) {
			author a = factory.createauthor();
			a.setAu_lname(authors.get(i).au_lname);
			a.setAu_fname(authors.get(i).au_fname);
			a.setAu_id(authors.get(i).au_id);
			a.setPhone(authors.get(i).phone);
			a.setAddress(authors.get(i).address);
			a.setCity(authors.get(i).city);
			a.setState(authors.get(i).state);
			a.setZip(authors.get(i).zip);
			a.setContract(authors.get(i).contract);
			r.getAuthors().add(a);
			
			//ecoreAuthors.add(a);
			
			//mapping authors to titles
			for(int j = 0; j < r.getPublishers().size(); j++) {
				publisher p = r.getPublishers().get(j);
				for(int k = 0; k < p.getTitles().size(); k++) {
					title t = r.getPublishers().get(j).getTitles().get(k);
					if(t.getAu_ids().contains(a.getAu_id())) {
						t.getAuthors().add(a);
					}
				}
			}
		}
	}
	
	
	public static void transformRoysched(root r, PubsFactory factory, List<Roysched> royscheds) {
		for(int i = 0; i < royscheds.size(); i++) {
			roysched roy = factory.createroysched();
			roy.setTitle_id(royscheds.get(i).title_id);
			roy.setLorange(royscheds.get(i).lorange);
			roy.setHirange(royscheds.get(i).hirange);
			roy.setRoyalty(royscheds.get(i).royalty);
			
			//loop through all publishers
			for(int j = 0; j < r.getPublishers().size(); j++) { 
				//loop through all titles
				for(int k = 0; k < r.getPublishers().get(j).getTitles().size(); k++) {
					title t = r.getPublishers().get(j).getTitles().get(k);
					//if the id matches, set the roysched
					//System.out.println("Title ID: " + t.getTitle_id() + " - " + "Roy ID: " + roy.getTitle_id());
					if(t.getTitle_id().equals(roy.getTitle_id())) {
						t.setRoysched(roy);
					}
				}
			}
		}
	}
	
	

	public static void Transform(HashMap javaObjects) {
		
		PubsPackage.eINSTANCE.eClass();
		PubsFactory factory = PubsFactory.eINSTANCE;
		root r = factory.createroot();

		transformPublisher(r, factory, (List) javaObjects.get("publishers"));
		transformPubInfo(r, factory, (List) javaObjects.get("pubInfos"));
		transformEmployee(r, factory, (List) javaObjects.get("employees"));
		transformStore(r, factory, (List) javaObjects.get("stores"));
		transformDiscount(r, factory, (List) javaObjects.get("discounts"))
		transformSale(r, factory, (List) javaObjects.get("sales"));
		transformTitle(r, factory, (List) javaObjects.get("titles"));
		transformAuthor(r, factory, (List) javaObjects.get("authors"));
		transformRoysched(r, factory, (List) javaObjects.get("royscheds"));
	
		//Prints
		System.out.println("*****ECORE OBJECTS PRINTS*****");
		System.out.println("Publishers: " + r.getPublishers());
		System.out.println("Authors: " + r.getAuthors());
		System.out.println("Stores: " + r.getStores());
		System.out.println("*****ECORE OBJECTS PRINTS END*****");
		
		
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = registry.getExtensionToFactoryMap();
		
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createURI("../tdt4250.model_resource/model/pubs.xmi"));

		resource.getContents().add(r);

		try {
		    resource.save(Collections.EMPTY_MAP);
		    System.out.println("Successfully created an XMI file in /tdt4250.model_resource/model/. "
				+ "\nPlease refresh this folder in Eclipse to show the file properly.");
			} catch (IOException e) {
			    e.printStackTrace();
			}
		}

}
