
package org.universAAL.ontology.creator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import org.universAAL.middleware.owl.OntologyManagement;
import org.universAAL.middleware.serialization.MessageContentSerializer;
import org.universAAL.middleware.serialization.turtle.TurtleSerializer;
import org.universAAL.ontology.rehabontology.RehabontologyOntology;

public class RehabontologyOWLCreator {

	private static RehabontologyOntology ontology = new RehabontologyOntology();
	private static MessageContentSerializer contentSerializer = new TurtleSerializer();

	public static void main(String[] args) {
		OntologyManagement.getInstance().register(null, ontology);
		String serializedOntology = contentSerializer.serialize(ontology);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("Rehabontology.owl", false));
			out.write(serializedOntology);
			out.close();
		} catch (IOException e) {
			System.out.println("Exception ");

		}
		
		File file = new File("Rehabontology.owl");
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		IRI documentIRI = IRI.create(file);
		OWLOntology owlOntology;
		try {
			owlOntology = manager.loadOntologyFromOntologyDocument(documentIRI);
			System.out.println("Loaded ontology: " + owlOntology);
			
			OWLOntologyFormat format = manager.getOntologyFormat(owlOntology);
			 
			RDFXMLOntologyFormat rdfxmlFormat = new RDFXMLOntologyFormat();
			if(format.isPrefixOWLOntologyFormat()) {
				rdfxmlFormat.copyPrefixesFrom(format.asPrefixOWLOntologyFormat());
			}
			manager.saveOntology(owlOntology, rdfxmlFormat, IRI.create(file));
			System.out.println("Saved ontology " + owlOntology + " in file Rehabontology.owl");
		} catch (OWLOntologyCreationException e1) {
			e1.printStackTrace();
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		}

		return;
	}

}

