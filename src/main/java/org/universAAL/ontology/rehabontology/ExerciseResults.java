package org.universAAL.ontology.rehabontology;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;


/**
 * Ontological representation of ExerciseResults in the rehabontology ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class ExerciseResults extends ManagedIndividual {
	public static final String MY_URI = RehabontologyOntology.NAMESPACE
			+ "ExerciseResults";
	public static final String PROP_RESULTS = RehabontologyOntology.NAMESPACE
			+ "results";
	public static final String PROP_TIME = RehabontologyOntology.NAMESPACE
			+ "time";


	public ExerciseResults () {
		super();
	}

	public ExerciseResults (String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		if (PROP_RESULTS.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		if (PROP_TIME.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		return PROP_SERIALIZATION_FULL;
	} 

	public boolean isWellFormed() {
		return super.isWellFormed() 
				&& hasProperty(PROP_RESULTS)
				&& hasProperty(PROP_TIME);
	}

	@SuppressWarnings("unchecked")
	public Double[] getResults() {
		Object propList = getProperty(PROP_RESULTS);
		if (propList instanceof List)
			return (Double[]) ((List<Object>) propList).toArray(new Double[0]);
		else if (propList != null)
			return new Double[] {(Double)propList}; // Handle special case of a single item not contained in a list
		return new Double[0];
	}

	@SuppressWarnings("unchecked")
	public void addResults(Double newValue) {
		Object propList = getProperty(PROP_RESULTS);
		List<Object> newList;
		if (propList instanceof List)
			newList = (List<Object>)propList;
		else {
			newList = new ArrayList<Object>();
			if (propList != null)
				newList.add(propList); // Handle special case of a single previous item not contained in a list
		}
		newList.add(newValue);
		changeProperty(PROP_RESULTS, newList);
	}


	public void setResults(Double[] propertyValue) {
		List<Double> propList = new ArrayList<Double>(propertyValue.length);
		for (int i = 0; i < propertyValue.length; i++) {
			propList.add(propertyValue[i]);
		}
		changeProperty(PROP_RESULTS, propList);
	}

	@SuppressWarnings("unchecked")
	public Double[] getTime() {
		Object propList = getProperty(PROP_TIME);
		if (propList instanceof List)
			return (Double[]) ((List<Double>) propList).toArray(new Double[0]);
		else if (propList != null)
			return new Double[] {(Double)propList}; // Handle special case of a single item not contained in a list
		return new Double[0];
	}

	@SuppressWarnings("unchecked")
	public void addTime(Double newValue) {
		Object propList = getProperty(PROP_TIME);
		List<Double> newList;
		if (propList instanceof List)
			newList = (List<Double>)propList;
		else {
			newList = new ArrayList<Double>();
			if (propList != null)
				newList.add((Double)propList); // Handle special case of a single previous item not contained in a list
		}
		newList.add(newValue);
		changeProperty(PROP_TIME, newList);
	}


	public void setTime(Double[] propertyValue) {
		List<Double> propList = new ArrayList<Double>(propertyValue.length);
		for (int i = 0; i < propertyValue.length; i++) {
			propList.add(propertyValue[i]);
		}
		changeProperty(PROP_TIME, propList);
	}
	
	public String toString(){
		StringBuffer text = new StringBuffer();
		text.append('\n');
		text.append("\nResults: "+getResults());
		text.append("\nTime:    "+getTime());
		return text.toString();
	}

}
