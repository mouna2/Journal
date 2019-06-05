package ALGO;

public class Prediction {
	
	public String PredictionValue=""; 
	public String Reason ="";
	public String likelihood;
	public String why;
	public String Type =""; 
	public String pattern=""; 
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
	
	
	
}