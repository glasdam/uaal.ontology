package org.universAAL.ontology.rehabontology;

import org.universAAL.middleware.service.owl.Service;


/**
 * Ontological representation of ExerciseAnalyser in the rehabontology ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class ExerciseAnalyser extends Service {
  public static final String MY_URI = RehabontologyOntology.NAMESPACE
    + "ExerciseAnalyser";
  public static final String PROP_EXERCISE_RESULTS = RehabontologyOntology.NAMESPACE
    + "exerciseResults";


  public ExerciseAnalyser () {
    super();
  }
  
  public ExerciseAnalyser (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {
    if (PROP_EXERCISE_RESULTS.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    return super.getPropSerializationType(propURI);
  } 

  public boolean isWellFormed() {
	return super.isWellFormed() 
      && hasProperty(PROP_EXERCISE_RESULTS);
  }

  public ExerciseResults getExerciseResults() {
    return (ExerciseResults)getProperty(PROP_EXERCISE_RESULTS);
  }		

  public void setExerciseResults(ExerciseResults newPropValue) {
    if (newPropValue != null)
      changeProperty(PROP_EXERCISE_RESULTS, newPropValue);
  }		

}
