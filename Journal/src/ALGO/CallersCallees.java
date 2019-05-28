package ALGO;

import java.util.ArrayList;
import java.util.List;

public class CallersCallees {
	public List<String> Callers= new ArrayList<String>(); 
	public List<String> Callees= new ArrayList<String>(); 
	public String prediction = ""; 
	public String predictionType = ""; 


	public String getPrediction() {
		return prediction;
	}
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}
	public String getPredictionType() {
		return predictionType;
	}
	public void setPredictionType(String predictionType) {
		this.predictionType = predictionType;
	}
	public List<String> getCallers() {
		return Callers;
	}
	public void setCallers(List<String> callers) {
		Callers = callers;
	}
	public List<String> getCallees() {
		return Callees;
	}
	public void setCallees(List<String> callees) {
		Callees = callees;
	}
	public CallersCallees(List<String> callers, List<String> callees) {
		super();
		Callers = callers;
		Callees = callees;
	} 
	
	public CallersCallees() {
		
	} 
	
	
}
