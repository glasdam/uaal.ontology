
package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;

import org.universAAL.ontology.rehabontology.ExerciseResults;
import org.universAAL.ontology.rehabontology.ExerciseAnalyser;
import org.universAAL.ontology.rehabontology.SuggestionResult;

public class RehabontologyFactory implements ResourceFactory {


	public Resource createInstance(String classURI, String instanceURI, int factoryIndex) {

		switch (factoryIndex) {
		case 0:
			return new ExerciseResults(instanceURI);
		case 1:
			return new ExerciseAnalyser(instanceURI);
		case 2:
			return new SuggestionResult(instanceURI);

		}
		return null;
	}
}
