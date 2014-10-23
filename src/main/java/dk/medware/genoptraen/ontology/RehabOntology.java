package dk.medware.genoptraen.ontology;

import org.universAAL.middleware.owl.Ontology;

public class RehabOntology extends Ontology {

	public static final String NAMESPACE = "http://ontology.universaal.org/Rehab.owl#";
	
	public RehabOntology() {
		super(NAMESPACE);
	}

	@Override
	public void create() {
		createNewAbstractOntClassInfo("SAY_HELLO");
		createNewOntClassInfo("SAY_HELLO", new RehabFactory());
//		createNewOntClassInfo(String classURI, ResourceFactory fac, 0);
//		extendExistingOntClassInfo()
	}

}
