package mainpackage;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;

public class RehabFactory implements ResourceFactory {

	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {
		System.out.println("classURI: " +  classURI);
		System.out.println("instanceURI: " + instanceURI);
		System.out.println("factoryIndex: " + factoryIndex);
		return null;
	}
	

}
