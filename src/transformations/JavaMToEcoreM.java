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

import dataModels.Publisher;
import pubs.PubsFactory;
import pubs.PubsPackage;
import pubs.publisher;
import pubs.root;

public class JavaMToEcoreM {

	public static void Transform(HashMap javaObjects) {
		// TODO Auto-generated method stub
		PubsPackage.eINSTANCE.eClass();
		
		PubsFactory factory = PubsFactory.eINSTANCE;
		root r = factory.createroot();
		r.setPub_id("test1");
		r.setStor_id("test2");
		System.out.println(r);
		
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
		
		//
		
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = registry.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        
        Resource resource = resSet.createResource(URI.createURI("../tdt4250.project/model/sample.xmi"));
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
