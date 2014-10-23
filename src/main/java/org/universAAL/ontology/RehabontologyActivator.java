
package org.universAAL.ontology;

import org.universAAL.middleware.container.ModuleContext;
import org.universAAL.middleware.container.ModuleActivator;
import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.ontology.rehabontology.*;


public class RehabontologyActivator implements ModuleActivator {

  RehabontologyOntology _rehabontologyOntology = new RehabontologyOntology();


  public void start(ModuleContext mc) throws Exception {
    OntologyManagement.getInstance().register(mc, _rehabontologyOntology);
  }

  public void stop(ModuleContext mc) throws Exception {
    OntologyManagement.getInstance().unregister(mc, _rehabontologyOntology);
  }
}	
