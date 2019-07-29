package ALGO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Prediction {
	
	public String PredictionValue=""; 
	public int Likelihood;
	public String why;
	public String Type =""; 
	public String Reason =""; 
	public String pattern="";
	public boolean PredictionSet=false; 
	public int GoldT=0;
	public int GoldN=0;
	public int GoldE=0;
	public Prediction(String predictionValue,String reason,  String type, int likelihood) {
//		super();
		PredictionValue = predictionValue;
		Type = type;
		Reason=reason; 
		Likelihood=likelihood; 
		
	} 
	public static Prediction EIsolatedPrediction = new Prediction("E", "IsolatedE", "", 0); 
	public static Prediction EInitializedPrediction = new Prediction("E", "InitializedE", "", 0);  
	public static Prediction ENotApplicablePrediction = new Prediction("E", "NotApplicableE", "", 0); 
	
	public static Prediction EBoundaryPredictionInner = new Prediction("E", "BoundaryE", "Inner", 0); 
	public static Prediction EUndecidablePredictionInner = new Prediction("E", "UndecidableE", "Inner", 0);  

	public static Prediction TPureTPredictionInner = new Prediction("T","PureT", "Inner", 90); 
	public static Prediction TMixedTPredictionInner = new Prediction("T","MixedT", "Inner", 70);   
	public static Prediction NMixedNPredictionInner = new Prediction("N","MixedN", "Inner", 70);   
	public static Prediction NPureNPredictionInner = new Prediction("N","PureN", "Inner", 90);  

	/******************************************************************************************/
	
	public static Prediction EBoundaryPredictionLeaf = new Prediction("E", "BoundaryE", "Leaf", 0);  
	public static Prediction EUndecidablePredictionLeaf = new Prediction("E", "UndecidableE", "Leaf", 0);  

	public static Prediction TPureTPredictionLeaf = new Prediction("T","PureT", "Leaf", 90);  
	public static Prediction TMixedTPredictionLeaf = new Prediction("T","MixedT", "Leaf", 70);  
	public static Prediction NMixedNPredictionLeaf = new Prediction("N","MixedN", "Leaf", 70);   
	public static Prediction NPureNPredictionLeaf = new Prediction("N","PureN", "Leaf", 90);    
	
	/******************************************************************************************/
	public static Prediction EBoundaryPredictionRoot = new Prediction("E", "BoundaryE", "Root", 0);  
	public static Prediction EUndecidablePredictionRoot = new Prediction("E", "UndecidableE", "Root", 0);  

	public static Prediction TPureTPredictionRoot = new Prediction("T","PureT", "Root", 90);  
	public static Prediction TMixedTPredictionRoot = new Prediction("T","MixedT", "Root", 70);  
	public static Prediction NMixedNPredictionRoot = new Prediction("N","MixedN", "Root", 70);    
	public static Prediction NPureNPredictionRoot = new Prediction("N","PureN", "Root", 90);  
	

	
	public static LinkedHashMap<String, ENTGoldValues> Matrix= new LinkedHashMap<String, ENTGoldValues>(){{
		

		put("IsolatedE", new ENTGoldValues(0,0,0)) ; 
		put("NotApplicableE", new ENTGoldValues(0,0,0)) ; 
/************************************************************************/
		put("PureTInner/T-T", new ENTGoldValues(0,0,0)) ; 
		put("BoundaryEInner/T-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/T-E", new ENTGoldValues(0,0,0)) ;
		put("MixedTInner/T-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/T-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/T-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/T-ENT",  new ENTGoldValues(0,0,0)) ; 

		put("BoundaryEInner/N-T", new ENTGoldValues(0,0,0)) ; 
		put("PureNInner/N-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/N-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/N-ET", new ENTGoldValues(0,0,0)) ; 
		put("MixedNInner/N-EN",new ENTGoldValues(0,0,0)) ; 
		put("MixedNInner/N-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedNInner/N-ENT", new ENTGoldValues(0,0,0)) ; 


		put("UndecidableEInner/E-T", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/E-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/E-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/E-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/E-EN", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/E-NT", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/E-ENT", new ENTGoldValues(0,0,0)) ; 

		
		
		put("MixedTInner/ET-T", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/ET-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/ET-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/ET-ET",  new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/ET-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/ET-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/ET-ENT",  new ENTGoldValues(0,0,0)) ; 
		
		
		put("UndecidableEInner/EN-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNInner/EN-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/EN-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/EN-ET",new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/EN-EN", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/EN-NT", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/EN-ENT", new ENTGoldValues(0,0,0)) ; 
		
		put("MixedTInner/NT-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNInner/NT-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/NT-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/NT-ET",  new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/NT-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/NT-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/NT-ENT",new ENTGoldValues(0,0,0)) ; 
		
	


		

		


		


		put("MixedTInner/ENT-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNInner/ENT-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/ENT-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/ENT-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableEInner/ENT-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTInner/ENT-NT",new ENTGoldValues(0,0,0)) ; 	
		put("MixedTInner/ENT-ENT",new ENTGoldValues(0,0,0)); 
		
		
		/*******************************/

		put("PureTLeaf/T-T", new ENTGoldValues(0,0,0)) ; 
		put("BoundaryELeaf/T-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/T-E", new ENTGoldValues(0,0,0)) ;
		put("MixedTLeaf/T-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/T-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/T-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/T-ENT",  new ENTGoldValues(0,0,0)) ; 

		put("BoundaryELeaf/N-T", new ENTGoldValues(0,0,0)) ; 
		put("PureNLeaf/N-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/N-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/N-ET", new ENTGoldValues(0,0,0)) ; 
		put("MixedNLeaf/N-EN",new ENTGoldValues(0,0,0)) ; 
		put("MixedNLeaf/N-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedNLeaf/N-ENT", new ENTGoldValues(0,0,0)) ; 


		put("UndecidableELeaf/E-T", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/E-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/E-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/E-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/E-EN", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/E-NT", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/E-ENT", new ENTGoldValues(0,0,0)) ; 

		
		
		put("MixedTLeaf/ET-T", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/ET-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/ET-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/ET-ET",  new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/ET-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/ET-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/ET-ENT",  new ENTGoldValues(0,0,0)) ; 
		
		
		put("UndecidableELeaf/EN-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNLeaf/EN-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/EN-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/EN-ET",new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/EN-EN", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/EN-NT", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/EN-ENT", new ENTGoldValues(0,0,0)) ; 
		
		put("MixedTLeaf/NT-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNLeaf/NT-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/NT-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/NT-ET",  new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/NT-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/NT-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/NT-ENT",new ENTGoldValues(0,0,0)) ; 
		
		put("MixedTLeaf/ENT-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNLeaf/ENT-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/ENT-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/ENT-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableELeaf/ENT-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTLeaf/ENT-NT",new ENTGoldValues(0,0,0)) ; 	
		put("MixedTLeaf/ENT-ENT",new ENTGoldValues(0,0,0)); 
		
		/*******************************/
		
		put("PureTRoot/T-T", new ENTGoldValues(0,0,0)) ; 
		put("BoundaryERoot/T-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/T-E", new ENTGoldValues(0,0,0)) ;
		put("MixedTRoot/T-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/T-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/T-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/T-ENT",  new ENTGoldValues(0,0,0)) ; 

		put("BoundaryERoot/N-T", new ENTGoldValues(0,0,0)) ; 
		put("PureNRoot/N-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/N-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/N-ET", new ENTGoldValues(0,0,0)) ; 
		put("MixedNRoot/N-EN",new ENTGoldValues(0,0,0)) ; 
		put("MixedNRoot/N-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedNRoot/N-ENT", new ENTGoldValues(0,0,0)) ; 


		put("UndecidableERoot/E-T", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/E-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/E-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/E-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/E-EN", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/E-NT", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/E-ENT", new ENTGoldValues(0,0,0)) ; 

		
		
		put("MixedTRoot/ET-T", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/ET-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/ET-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/ET-ET",  new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/ET-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/ET-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/ET-ENT",  new ENTGoldValues(0,0,0)) ; 
		
		
		put("UndecidableERoot/EN-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNRoot/EN-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/EN-E", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/EN-ET",new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/EN-EN", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/EN-NT", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/EN-ENT", new ENTGoldValues(0,0,0)) ; 
		
		put("MixedTRoot/NT-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNRoot/NT-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/NT-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/NT-ET",  new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/NT-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/NT-NT", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/NT-ENT",new ENTGoldValues(0,0,0)) ; 
		
	


		

		


		


		put("MixedTRoot/ENT-T", new ENTGoldValues(0,0,0)) ; 
		put("MixedNRoot/ENT-N", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/ENT-E", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/ENT-ET", new ENTGoldValues(0,0,0)) ; 
		put("UndecidableERoot/ENT-EN", new ENTGoldValues(0,0,0)) ; 
		put("MixedTRoot/ENT-NT",new ENTGoldValues(0,0,0)) ; 	
		put("MixedTRoot/ENT-ENT",new ENTGoldValues(0,0,0)); 
	}}; 
	
	
	
	
	
	
	
	
}