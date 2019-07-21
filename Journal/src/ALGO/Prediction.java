package ALGO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Prediction {
	
	public String PredictionValue=""; 
	public String Reason ="";
	public String likelihood;
	public String why;
	public String Type =""; 
	public String pattern="";
	public boolean PredictionSet=false; 
	public int GoldT=0;
	public int GoldN=0;
	public int GoldE=0;
	public Prediction(String predictionValue, String reason, String mypattern) {
//		super();
		PredictionValue = predictionValue;
		Reason = reason;
		pattern=mypattern; 
		
	} 
	public static Prediction EIsolatedPrediction = new Prediction("E", "IsolatedE", ""); 
	public static Prediction EInitializedPrediction = new Prediction("E", "InitializedE", ""); 
	public static Prediction ENotApplicablePrediction = new Prediction("E", "NotApplicableE", ""); 
	
	public static Prediction EBoundaryPredictionInner = new Prediction("E", "BoundaryE", "Inner"); 
	public static Prediction EUndecidablePredictionInner = new Prediction("E", "UndecidableE", "Inner");  

	public static Prediction TPureTPredictionInner = new Prediction("T","PureT", "Inner"); 
	public static Prediction TMixedTPredictionInner = new Prediction("T","MixedT", "Inner");  
	public static Prediction NMixedNPredictionInner = new Prediction("N","MixedN", "Inner");  
	public static Prediction NPureNPredictionInner = new Prediction("N","PureN", "Inner");  

	/******************************************************************************************/
	
	public static Prediction EBoundaryPredictionLeaf = new Prediction("E", "BoundaryE", "Leaf"); 
	public static Prediction EUndecidablePredictionLeaf = new Prediction("E", "UndecidableE", "Leaf");  

	public static Prediction TPureTPredictionLeaf = new Prediction("T","PureT", "Leaf"); 
	public static Prediction TMixedTPredictionLeaf = new Prediction("T","MixedT", "Leaf");  
	public static Prediction NMixedNPredictionLeaf = new Prediction("N","MixedN", "Leaf");  
	public static Prediction NPureNPredictionLeaf = new Prediction("N","PureN", "Leaf");  
	
	/******************************************************************************************/
	public static Prediction EBoundaryPredictionRoot = new Prediction("E", "BoundaryE", "Root"); 
	public static Prediction EUndecidablePredictionRoot = new Prediction("E", "UndecidableE", "Root");  

	public static Prediction TPureTPredictionRoot = new Prediction("T","PureT", "Root"); 
	public static Prediction TMixedTPredictionRoot = new Prediction("T","MixedT", "Root");  
	public static Prediction NMixedNPredictionRoot = new Prediction("N","MixedN", "Root");  
	public static Prediction NPureNPredictionRoot = new Prediction("N","PureN", "Root");  
	

	
	public static LinkedHashMap<String, ENTGoldValues> Matrix= new LinkedHashMap<String, ENTGoldValues>(){{
		

		put("Isolated/", new ENTGoldValues(0,0,0)) ; 
		put("NotApplicable/", new ENTGoldValues(0,0,0)) ; 

		put("T-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("T-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("T-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("T-ET/Inner", new ENTGoldValues(0,0,0)) ; 
		put("T-EN/Inner", new ENTGoldValues(0,0,0)) ; 
		put("T-NT/Inner", new ENTGoldValues(0,0,0)) ; 
		put("T-ENT/Inner",  new ENTGoldValues(0,0,0)) ; 

		put("N-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("N-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("N-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("N-ET/Inner", new ENTGoldValues(0,0,0)) ; 
		put("N-EN/Inner",new ENTGoldValues(0,0,0)) ; 
		put("N-NT/Inner", new ENTGoldValues(0,0,0)) ; 
		put("N-ENT/Inner", new ENTGoldValues(0,0,0)) ; 


		put("E-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("E-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("E-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("E-ET/Inner", new ENTGoldValues(0,0,0)) ; 
		put("E-EN/Inner", new ENTGoldValues(0,0,0)) ; 
		put("E-NT/Inner", new ENTGoldValues(0,0,0)) ; 
		put("E-ENT/Inner", new ENTGoldValues(0,0,0)) ; 

		
		put("ET-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ET-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ET-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ET-ET/Inner",  new ENTGoldValues(0,0,0)) ; 
		put("ET-EN/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ET-NT/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ET-ENT/Inner",  new ENTGoldValues(0,0,0)) ; 


		put("EN-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("EN-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("EN-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("EN-ET/Inner",new ENTGoldValues(0,0,0)) ; 
		put("EN-EN/Inner", new ENTGoldValues(0,0,0)) ; 
		put("EN-NT/Inner", new ENTGoldValues(0,0,0)) ; 
		put("EN-ENT/Inner", new ENTGoldValues(0,0,0)) ; 

		put("NT-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("NT-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("NT-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("NT-ET/Inner",  new ENTGoldValues(0,0,0)) ; 
		put("NT-EN/Inner", new ENTGoldValues(0,0,0)) ; 
		put("NT-NT/Inner", new ENTGoldValues(0,0,0)) ; 
		put("NT-ENT/Inner",new ENTGoldValues(0,0,0)) ; 


		


		put("ENT-T/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ENT-N/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ENT-E/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ENT-ET/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ENT-EN/Inner", new ENTGoldValues(0,0,0)) ; 
		put("ENT-NT/Inner",new ENTGoldValues(0,0,0)) ; 	
		put("ENT-ENT/Inner",new ENTGoldValues(0,0,0)); 
		
		
		/*******************************/

		put("T-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("T-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("T-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("T-ET/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("T-EN/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("T-NT/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("T-ENT/Leaf",  new ENTGoldValues(0,0,0)) ; 

		put("N-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("N-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("N-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("N-ET/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("N-EN/Leaf",new ENTGoldValues(0,0,0)) ; 
		put("N-NT/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("N-ENT/Leaf", new ENTGoldValues(0,0,0)) ; 


		put("E-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("E-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("E-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("E-ET/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("E-EN/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("E-NT/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("E-ENT/Leaf", new ENTGoldValues(0,0,0)) ; 

		
		put("ET-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ET-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ET-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ET-ET/Leaf",  new ENTGoldValues(0,0,0)) ; 
		put("ET-EN/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ET-NT/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ET-ENT/Leaf",  new ENTGoldValues(0,0,0)) ; 


		put("EN-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("EN-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("EN-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("EN-ET/Leaf",new ENTGoldValues(0,0,0)) ; 
		put("EN-EN/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("EN-NT/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("EN-ENT/Leaf", new ENTGoldValues(0,0,0)) ; 

		put("NT-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("NT-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("NT-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("NT-ET/Leaf",  new ENTGoldValues(0,0,0)) ; 
		put("NT-EN/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("NT-NT/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("NT-ENT/Leaf",new ENTGoldValues(0,0,0)) ; 


		


		put("ENT-T/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ENT-N/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ENT-E/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ENT-ET/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ENT-EN/Leaf", new ENTGoldValues(0,0,0)) ; 
		put("ENT-NT/Leaf",new ENTGoldValues(0,0,0)) ; 	
		put("ENT-ENT/Leaf",new ENTGoldValues(0,0,0)); 
		
		/*******************************/
		
		put("T-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("T-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("T-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("T-ET/Root", new ENTGoldValues(0,0,0)) ; 
		put("T-EN/Root", new ENTGoldValues(0,0,0)) ; 
		put("T-NT/Root", new ENTGoldValues(0,0,0)) ; 
		put("T-ENT/Root",  new ENTGoldValues(0,0,0)) ; 

		put("N-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("N-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("N-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("N-ET/Root", new ENTGoldValues(0,0,0)) ; 
		put("N-EN/Root",new ENTGoldValues(0,0,0)) ; 
		put("N-NT/Root", new ENTGoldValues(0,0,0)) ; 
		put("N-ENT/Root", new ENTGoldValues(0,0,0)) ; 


		put("E-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("E-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("E-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("E-ET/Root", new ENTGoldValues(0,0,0)) ; 
		put("E-EN/Root", new ENTGoldValues(0,0,0)) ; 
		put("E-NT/Root", new ENTGoldValues(0,0,0)) ; 
		put("E-ENT/Root", new ENTGoldValues(0,0,0)) ; 

		
		put("ET-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("ET-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("ET-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("ET-ET/Root",  new ENTGoldValues(0,0,0)) ; 
		put("ET-EN/Root", new ENTGoldValues(0,0,0)) ; 
		put("ET-NT/Root", new ENTGoldValues(0,0,0)) ; 
		put("ET-ENT/Root",  new ENTGoldValues(0,0,0)) ; 


		put("EN-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("EN-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("EN-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("EN-ET/Root",new ENTGoldValues(0,0,0)) ; 
		put("EN-EN/Root", new ENTGoldValues(0,0,0)) ; 
		put("EN-NT/Root", new ENTGoldValues(0,0,0)) ; 
		put("EN-ENT/Root", new ENTGoldValues(0,0,0)) ; 

		put("NT-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("NT-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("NT-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("NT-ET/Root",  new ENTGoldValues(0,0,0)) ; 
		put("NT-EN/Root", new ENTGoldValues(0,0,0)) ; 
		put("NT-NT/Root", new ENTGoldValues(0,0,0)) ; 
		put("NT-ENT/Root",new ENTGoldValues(0,0,0)) ; 


		


		put("ENT-T/Root", new ENTGoldValues(0,0,0)) ; 
		put("ENT-N/Root", new ENTGoldValues(0,0,0)) ; 
		put("ENT-E/Root", new ENTGoldValues(0,0,0)) ; 
		put("ENT-ET/Root", new ENTGoldValues(0,0,0)) ; 
		put("ENT-EN/Root", new ENTGoldValues(0,0,0)) ; 
		put("ENT-NT/Root",new ENTGoldValues(0,0,0)) ; 	
		put("ENT-ENT/Root",new ENTGoldValues(0,0,0)); 
	}}; 
	
	
	
	
	
	
	
	
	
}