package dk.medware.genoptraen.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.osgi.uAALBundleContainer;
import org.universAAL.middleware.owl.OntologyManagement;


public class Activator implements BundleActivator {
	public static BundleContext osgiContext = null;
	public static ModuleContext context = null;
	public static RehabOntology reont = new RehabOntology();
		
	public void start(BundleContext bcontext) throws Exception {
		Activator.osgiContext = bcontext;
		Activator.context = uAALBundleContainer.THE_CONTAINER
			.registerModule(new Object[] { bcontext });
		OntologyManagement.getInstance().register(context, reont);
		System.out.println("Ontology registered");
	}

	public void stop(BundleContext arg0) throws Exception {
		System.out.println("Ontology stop");
	}

}
