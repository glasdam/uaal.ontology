package org.universAAL.ontology.rehabontology;

import org.universAAL.middleware.owl.ManagedIndividual;

public class SuggestionResult extends ManagedIndividual {
	public static final String MY_URI = RehabontologyOntology.NAMESPACE
			+ "SuggestionResult";
	public static final String PROP_SLOPE = RehabontologyOntology.NAMESPACE
			+ "slope";
	public static final String PROP_ESTIMATE = RehabontologyOntology.NAMESPACE
			+ "estimate";
	public static final String PROP_RECOMMENDATION = RehabontologyOntology.NAMESPACE
			+ "recommendation";

	public SuggestionResult(){
		super();
	}

	public SuggestionResult(String instanceURI) {
		super(instanceURI);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	} 

	public boolean isWellFormed() {
		return super.isWellFormed() 
				&& hasProperty(PROP_SLOPE)
				&& hasProperty(PROP_ESTIMATE)
				&& hasProperty(PROP_RECOMMENDATION);
	}

	public Double getSlope() {
		Object prop = getProperty(PROP_SLOPE);
		if (prop instanceof Double)
			return (Double) prop;
		return 0d;
	}
	public void setSlope(Double propertyValue) {
		changeProperty(PROP_SLOPE, propertyValue);
	}

	public Double getEstimate() {
		Object prop = getProperty(PROP_ESTIMATE);
		if (prop instanceof Double)
			return (Double) prop;
		return 0d;
	}
	public void setEstimate(Double propertyValue) {
		changeProperty(PROP_ESTIMATE, propertyValue);
	}

	public Double getRecommendation() {
		Object prop = getProperty(PROP_RECOMMENDATION);
		if (prop instanceof Double)
			return (Double) prop;
		return 0d;
	}
	public void setRecommendation(Double propertyValue) {
		changeProperty(PROP_RECOMMENDATION, propertyValue);
	}
	
	public String toString(){
		StringBuffer text = new StringBuffer();
		text.append('\n');
		text.append("\nSlope:          "+getSlope());
		text.append("\nEstimate:       "+getEstimate());
		text.append("\nRecommendation: "+getRecommendation());
		return text.toString();
	}


}
