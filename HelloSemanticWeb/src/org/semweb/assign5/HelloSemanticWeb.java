package org.semweb.assign5;

import java.io.IOException;
import java.io.InputStream;

import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;

public class HelloSemanticWeb {

	static String defaultNameSpace = "http://org.semweb/assign5/people#";
	Model _friends = null;
	Model schema = null;
	InfModel inferredFriends = null;
	
	public static void main(String[] args) throws IOException {
		HelloSemanticWeb hello = new HelloSemanticWeb();
		
		System.out.println("Load my FOAF");
		hello.populateFOAFFriends();
	}
	
	private void populateFOAFFriends() throws IOException {
		_friends = ModelFactory.createOntologyModel();
		InputStream inFoafInstance = 
				FileManager.get().open("FOAFFriends.rdf");
		_friends.read(inFoafInstance,defaultNameSpace);
		inFoafInstance.close();
	}
	
	private void mySelf(Model model) {
		
	}

}
