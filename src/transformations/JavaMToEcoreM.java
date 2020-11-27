package transformations;

import java.io.IOException;
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

	public static void Transform(HashMap javaObjects) {
		// TODO Auto-generated method stub
		PubsPackage.eINSTANCE.eClass();
		
		PubsFactory factory = PubsFactory.eINSTANCE;
		root r = factory.createroot();
		
		//for each key Value pair, for each el in value
		for(int i = 0; i < javaObjects.size(); i++) {
			
		}
		
		//Publishers
		List<Publisher> publishers = (List) javaObjects.get("publishers");
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
		
		//Pub_info
		List<PubInfo> pubInfos = (List) javaObjects.get("pubInfos");
		for(int i = 0; i < pubInfos.size(); i++) {
			pub_info pi = factory.createpub_info();
			pi.setPr_info(pubInfos.get(i).pr_info); //pubInfos.get(i).getPr_info()
			pi.setPub_id(pubInfos.get(i).pub_id);
			
			//if id equals an id in publishers, add pubInfo to publisher
			//System.out.println("publishers size: " + r.getPublishers().size());
			//System.out.println("pubinfo pub id: " + pi.getPub_id());
			for(int j = 0; j < r.getPublishers().size(); j++) {
				//System.out.println("publisher id: " + r.getPublishers().get(j));
				if(pi.getPub_id().equals(r.getPublishers().get(j).getPub_id())) {
					r.getPublishers().get(j).setPub_info(pi);
					//System.out.println(pi.getPub_id());
				}
			}
		}
		
		//employee
		List<Employee> employees = (List) javaObjects.get("employees");
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
		
		//stores
		List<Store> stores = (List) javaObjects.get("stores");
		for(int i = 0; i < stores.size(); i++) {
			System.out.println("Store name: " + stores.get(i).stor_name);
			store s = factory.createstore();
			s.setStor_name(stores.get(i).stor_name);
			s.setStor_address(stores.get(i).stor_address);
			s.setStor_id(stores.get(i).stor_id);
			s.setCity(stores.get(i).city);
			s.setState(stores.get(i).state);
			s.setZip(stores.get(i).zip);
			r.getStores().add(s);
		}
		
		//discounts
		List<Discount> discounts = (List) javaObjects.get("discounts");
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
		
		//sales
		List<Sale> sales = (List) javaObjects.get("sales");
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
		
		
		//title
		List<Title> titles = (List) javaObjects.get("titles");
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
			//t.getAu_id().addAll(titles.get(i).au_ids);
			
			//Set Ecore object au ids.
			System.out.println("TEST: " + titles.get(i).au_ids);
			for(int x = 0; x < titles.get(i).au_ids.size(); x++) {
				System.out.println("ASDASDSD " + titles.get(i).au_ids.get(x));
				t.getAu_ids().add(titles.get(i).au_ids.get(x));
			}
			
			
			//link titles to publishers
			for(int j = 0; j < r.getPublishers().size(); j++) {
				if(t.getPub_id().equals(r.getPublishers().get(j).getPub_id())) {
					r.getPublishers().get(j).getTitles().add(t);
				}
			}
		}
		
		
		//author
		List<Author> authors = (List) javaObjects.get("authors");
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
			
			for(int j = 0; j < r.getPublishers().size(); j++) { //for each publicher
				for(int k = 0; k < r.getPublishers().get(j).getTitles().size(); k++) {
					title t = r.getPublishers().get(j).getTitles().get(k);
					if(t.getAu_ids().contains(a.getAu_id())) {
						t.getAu_ids().add(a.getAu_id());
					}
				}
			}
			
		}
		
		//royched
		List<Roysched> royscheds = (List) javaObjects.get("royscheds");
		for(int i = 0; i < royscheds.size(); i++) {
			roysched roy = factory.createroysched();
			roy.setTitle_id(royscheds.get(i).title_id);
			roy.setLorange(royscheds.get(i).lorange);
			roy.setHirange(royscheds.get(i).hirange);
			roy.setRoyalty(royscheds.get(i).royalty);
			
			//TODO: LINK TO TITLE
			//loop through all publishers
			for(int j = 0; j < r.getPublishers().size(); j++) { 
				//loop through all titles
				for(int k = 0; k < r.getPublishers().get(j).getTitles().size(); k++) {
					title t = r.getPublishers().get(j).getTitles().get(k);
					//if the id matches, set the roysched
					//System.out.println("Title ID: " + t.getTitle_id() + " - " + "Roy ID: " + roy.getTitle_id());
					if(t.getTitle_id().equals(roy.getTitle_id())) {
						//System.out.println("Match!");
						t.setRoysched(roy);
					}
				}
			}
		}
		
		
		
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = registry.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        
        Resource resource = resSet.createResource(URI.createURI("../tdt4250.project/model/pubs.xmi"));
        System.out.println(resource);
        
        resource.getContents().add(r);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

}
