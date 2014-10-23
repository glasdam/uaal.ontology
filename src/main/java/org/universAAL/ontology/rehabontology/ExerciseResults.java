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

  public Long[] getResults() {
    Object propList = getProperty(PROP_RESULTS);
    if (propList instanceof List)
      return (Long[]) ((List) propList).toArray(new Long[0]);
    else if (propList != null)
      return new Long[] {(Long)propList}; // Handle special case of a single item not contained in a list
    return new Long[0];
  }

  public void addResults(Long newValue) {
    Object propList = getProperty(PROP_RESULTS);
    List newList;
    if (propList instanceof List)
      newList = (List)propList;
    else {
      newList = new ArrayList();
      if (propList != null)
        newList.add(propList); // Handle special case of a single previous item not contained in a list
    }
    newList.add(newValue);
    changeProperty(PROP_RESULTS, newList);
  }
  

  public void setResults(Long[] propertyValue) {
    List propList = new ArrayList(propertyValue.length);
    for (int i = 0; i < propertyValue.length; i++) {
      propList.add(propertyValue[i]);
    }
    changeProperty(PROP_RESULTS, propList);
  }

  public Long[] getTime() {
    Object propList = getProperty(PROP_TIME);
    if (propList instanceof List)
      return (Long[]) ((List) propList).toArray(new Long[0]);
    else if (propList != null)
      return new Long[] {(Long)propList}; // Handle special case of a single item not contained in a list
    return new Long[0];
  }

  public void addTime(Long newValue) {
    Object propList = getProperty(PROP_TIME);
    List newList;
    if (propList instanceof List)
      newList = (List)propList;
    else {
      newList = new ArrayList();
      if (propList != null)
        newList.add(propList); // Handle special case of a single previous item not contained in a list
    }
    newList.add(newValue);
    changeProperty(PROP_TIME, newList);
  }
  

  public void setTime(Long[] propertyValue) {
    List propList = new ArrayList(propertyValue.length);
    for (int i = 0; i < propertyValue.length; i++) {
      propList.add(propertyValue[i]);
    }
    changeProperty(PROP_TIME, propList);
  }

}