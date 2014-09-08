package mainpackage;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.osgi.uAALBundleContainer;
import org.universAAL.middleware.owl.OntologyManagement;


public class Activator implements BundleActivator {
	public static BundleContext osgiContext = null;
	public static ModuleContext context = null;
	public static RehabOntology reont = new RehabOntology();

	class SimpleThread extends Thread {
	    public SimpleThread(String str) {
	    	super(str);
	    }
	    public void run() {
			while(true){
				System.out.println("Fetching!");
				try {
					JsonServer.service_server();
					sleep(10000);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					break;
				}
			}
			System.out.println("Ended");
	    }
	}
	
	
	public void start(BundleContext bcontext) throws Exception {
		Activator.osgiContext = bcontext;
		Activator.context = uAALBundleContainer.THE_CONTAINER
			.registerModule(new Object[] { bcontext });
		OntologyManagement.getInstance().register(context, reont);
		new SimpleThread("").start();
	}

	public void stop(BundleContext arg0) throws Exception {
	}

}
