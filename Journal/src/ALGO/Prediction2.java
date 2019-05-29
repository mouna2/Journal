package ALGO;

public class Prediction2 {
	
	public String PredictionValue=""; 
	public String Reason ="";
	public String likelihood;
	public String why;
//	public String Type ; 
	public String pattern=""; 
	public Prediction2(String predictionValue, String reason, String mypattern) {
		super();
		PredictionValue = predictionValue;
		Reason = reason;
		pattern=mypattern; 
	} 
	public static Prediction2 EIsolatedPrediction = new Prediction2("E", "IsolatedE", ""); 
	public static Prediction2 EInitializedPrediction = new Prediction2("E", "InitializedE", ""); 
	public static Prediction2 ENotApplicablePrediction = new Prediction2("E", "NotApplicableE", ""); 
	
//	public static Prediction EBoundaryPredictionInner = new Prediction("E", "BoundaryE", "Inner"); 
//	public static Prediction EUndecidablePredictionInner = new Prediction("E", "UndecidableE", "Inner");  
//
//	public static Prediction TPureTPredictionInner = new Prediction("T","PureT", "Inner"); 
//	public static Prediction TMixedTPredictionInner = new Prediction("T","MixedT", "Inner");  
//	public static Prediction NMixedNPredictionInner = new Prediction("N","MixedN", "Inner");  
//	public static Prediction NPureNPredictionInner = new Prediction("N","PureN", "Inner");  
//
//	/******************************************************************************************/
//	
//	public static Prediction EBoundaryPredictionLeaf = new Prediction("E", "BoundaryE", "Leaf"); 
//	public static Prediction EUndecidablePredictionLeaf = new Prediction("E", "UndecidableE", "Leaf");  
//
//	public static Prediction TPureTPredictionLeaf = new Prediction("T","PureT", "Leaf"); 
//	public static Prediction TMixedTPredictionLeaf = new Prediction("T","MixedT", "Leaf");  
//	public static Prediction NMixedNPredictionLeaf = new Prediction("N","MixedN", "Leaf");  
//	public static Prediction NPureNPredictionLeaf = new Prediction("N","PureN", "Leaf");  
//	
//	/******************************************************************************************/
//	public static Prediction EBoundaryPredictionRoot = new Prediction("E", "BoundaryE", "Root"); 
//	public static Prediction EUndecidablePredictionRoot = new Prediction("E", "UndecidableE", "Root");  
//
//	public static Prediction TPureTPredictionRoot = new Prediction("T","PureT", "Root"); 
//	public static Prediction TMixedTPredictionRoot = new Prediction("T","MixedT", "Root");  
//	public static Prediction NMixedNPredictionRoot = new Prediction("N","MixedN", "Root");  
//	public static Prediction NPureNPredictionRoot = new Prediction("N","PureN", "Root");  
	
	
	public static Prediction2 EBoundaryPredictionInnerT_N = new Prediction2("E", "BoundaryEInner", "T-N"); 
	public static Prediction2 EBoundaryPredictionInnerN_T = new Prediction2("E", "BoundaryEInner", "N-T"); 

	public static Prediction2 EUndecidablePredictionInnerT_E = new Prediction2("E", "UndecidableEInner", "T-E");  
	public static Prediction2 EUndecidablePredictionInnerE_T = new Prediction2("E", "UndecidableEInner", "E-T");  
	public static Prediction2 EUndecidablePredictionInnerT_EN = new Prediction2("E", "UndecidableEInner", "T-EN");  
	public static Prediction2 EUndecidablePredictionInnerN_E = new Prediction2("E", "UndecidableEInner", "N-E");  
	public static Prediction2 EUndecidablePredictionInnerN_ET = new Prediction2("E", "UndecidableEInner", "N-ET");  
	public static Prediction2 EUndecidablePredictionInnerE_N = new Prediction2("E", "UndecidableEInner", "E-N");  
	public static Prediction2 EUndecidablePredictionInnerE_E = new Prediction2("E", "UndecidableEInner", "E-E");  
	public static Prediction2 EUndecidablePredictionInnerE_ET = new Prediction2("E", "UndecidableEInner", "E-ET");  
	public static Prediction2 EUndecidablePredictionInnerE_EN = new Prediction2("E", "UndecidableEInner", "E-EN");  
	public static Prediction2 EUndecidablePredictionInnerE_NT = new Prediction2("E", "UndecidableEInner", "E-NT");  
	public static Prediction2 EUndecidablePredictionInnerE_ENT = new Prediction2("E", "UndecidableEInner", "E-ENT");  
	public static Prediction2 EUndecidablePredictionInnerNT_E = new Prediction2("E", "UndecidableEInner", "NT-E");  
	public static Prediction2 EUndecidablePredictionInnerNT_EN = new Prediction2("E", "UndecidableEInner", "NT-EN");  
	public static Prediction2 EUndecidablePredictionInnerET_N = new Prediction2("E", "UndecidableEInner", "ET-N");  
	public static Prediction2 EUndecidablePredictionInnerET_E = new Prediction2("E", "UndecidableEInner", "ET-E");  
	public static Prediction2 EUndecidablePredictionInnerET_EN = new Prediction2("E", "UndecidableEInner", "ET-EN");  
	public static Prediction2 EUndecidablePredictionInnerEN_T = new Prediction2("E", "UndecidableEInner", "EN-T");  
	public static Prediction2 EUndecidablePredictionInnerEN_E = new Prediction2("E", "UndecidableEInner", "EN-E");  
	public static Prediction2 EUndecidablePredictionInnerEN_NT = new Prediction2("E", "UndecidableEInner", "EN-NT");  
	public static Prediction2 EUndecidablePredictionInnerEN_ET = new Prediction2("E", "UndecidableEInner", "EN-ET");  
	public static Prediction2 EUndecidablePredictionInnerEN_EN = new Prediction2("E", "UndecidableEInner", "EN-EN");  
	public static Prediction2 EUndecidablePredictionInnerEN_ENT = new Prediction2("E", "UndecidableEInner", "EN-ENT");  
	public static Prediction2 EUndecidablePredictionInnerENT_E = new Prediction2("E", "UndecidableEInner", "ENT-E"); 
	public static Prediction2 EUndecidablePredictionInnerENT_EN = new Prediction2("E", "UndecidableEInner", "ENT-EN");  


	public static Prediction2 TPureTPredictionInner = new Prediction2("T","PureTInner", "T-T"); 
//	public static Prediction TMixedTPredictionInner = new Prediction("T","MixedTInner", "Inner");  
	
	public static Prediction2 NMixedNPredictionInnerN_NT = new Prediction2("N","MixedNInner", "N-NT");  
	public static Prediction2 NMixedNPredictionInnerN_EN = new Prediction2("N","MixedNInner", "N-EN");  
	public static Prediction2 NMixedNPredictionInnerN_ENT = new Prediction2("N","MixedNInner", "N-ENT");  
	public static Prediction2 NMixedNPredictionInnerNT_N = new Prediction2("N","MixedNInner", "NT-N");  
	public static Prediction2 NMixedNPredictionInnerEN_N = new Prediction2("N","MixedNInner", "EN-N");  
	public static Prediction2 NMixedNPredictionInnerENT_N = new Prediction2("N","MixedNInner", "ENT-N");  

	

	public static Prediction2 TMixedTPredictionInnerT_NT = new Prediction2("T","MixedTInner", "T-NT");  
	public static Prediction2 TMixedTPredictionInnerT_ET = new Prediction2("T","MixedTInner", "T-ET");  
	public static Prediction2 TMixedTPredictionInnerT_ENT = new Prediction2("T","MixedTInner", "T-ENT");  
	public static Prediction2 TMixedTPredictionInnerNT_T = new Prediction2("T","MixedTInner", "NT-T");  
	public static Prediction2 TMixedTPredictionInnerNT_NT = new Prediction2("T","MixedTInner", "NT-NT");  
	public static Prediction2 TMixedTPredictionInnerNT_ET = new Prediction2("T","MixedTInner", "NT-ET");  
	public static Prediction2 TMixedTPredictionInnerNT_ENT = new Prediction2("T","MixedTInner", "NT-ENT");  
	public static Prediction2 TMixedTPredictionInnerET_T = new Prediction2("T","MixedTInner", "ET-T");  
	public static Prediction2 TMixedTPredictionInnerET_NT = new Prediction2("T","MixedTInner", "ET-NT");  
	public static Prediction2 TMixedTPredictionInnerET_ET = new Prediction2("T","MixedTInner", "ET-ET");  
	public static Prediction2 TMixedTPredictionInnerET_ENT = new Prediction2("T","MixedTInner", "ET-ENT");  
	public static Prediction2 TMixedTPredictionInnerENT_T = new Prediction2("T","MixedTInner", "ENT_T");  
	public static Prediction2 TMixedTPredictionInnerENT_NT = new Prediction2("T","MixedTInner", "ENT_NT");  
	public static Prediction2 TMixedTPredictionInnerENT_ET = new Prediction2("T","MixedTInner", "ENT_ET");  
	public static Prediction2 TMixedTPredictionInnerENT_ENT = new Prediction2("T","MixedTInner", "ENT_ENT");  
	

	

	public static Prediction2 NPureNPredictionInner = new Prediction2("N","PureNInner", "N-N");  

	/******************************************************************************************/
//	
//	public static Prediction EBoundaryPredictionLeaf = new Prediction("E", "BoundaryE", "Leaf"); 
//	public static Prediction EUndecidablePredictionLeaf = new Prediction("E", "UndecidableE", "Leaf");  
//
//	public static Prediction TPureTPredictionLeaf = new Prediction("T","PureT", "Leaf"); 
//	public static Prediction TMixedTPredictionLeaf = new Prediction("T","MixedT", "Leaf");  
//	public static Prediction NMixedNPredictionLeaf = new Prediction("N","MixedN", "Leaf");  
//	public static Prediction NPureNPredictionLeaf = new Prediction("N","PureN", "Leaf");  
//	
//	/******************************************************************************************/
//	public static Prediction EBoundaryPredictionRoot = new Prediction("E", "BoundaryE", "Root"); 
//	public static Prediction EUndecidablePredictionRoot = new Prediction("E", "UndecidableE", "Root");  
//
//	public static Prediction TPureTPredictionRoot = new Prediction("T","PureT", "Root"); 
//	public static Prediction TMixedTPredictionRoot = new Prediction("T","MixedT", "Root");  
//	public static Prediction NMixedNPredictionRoot = new Prediction("N","MixedN", "Root");  
//	public static Prediction NPureNPredictionRoot = new Prediction("N","PureN", "Root");  
	
	/*****************************************************************************************/
	public static Prediction2 EBoundaryPredictionLeafT_N = new Prediction2("E", "BoundaryELeaf", "T-N"); 
	public static Prediction2 EBoundaryPredictionLeafN_T = new Prediction2("E", "BoundaryELeaf", "N-T"); 

	public static Prediction2 EUndecidablePredictionLeafT_E = new Prediction2("E", "UndecidableELeaf", "T-E");  
	public static Prediction2 EUndecidablePredictionLeafE_T = new Prediction2("E", "UndecidableELeaf", "E-T");  
	public static Prediction2 EUndecidablePredictionLeafT_EN = new Prediction2("E", "UndecidableELeaf", "T-EN");  
	public static Prediction2 EUndecidablePredictionLeafN_E = new Prediction2("E", "UndecidableELeaf", "N-E");  
	public static Prediction2 EUndecidablePredictionLeafN_ET = new Prediction2("E", "UndecidableELeaf", "N-ET");  
	public static Prediction2 EUndecidablePredictionLeafE_N = new Prediction2("E", "UndecidableELeaf", "E-N");  
	public static Prediction2 EUndecidablePredictionLeafE_E = new Prediction2("E", "UndecidableELeaf", "E-E");  
	public static Prediction2 EUndecidablePredictionLeafE_ET = new Prediction2("E", "UndecidableELeaf", "E-ET");  
	public static Prediction2 EUndecidablePredictionLeafE_EN = new Prediction2("E", "UndecidableELeaf", "E-EN");  
	public static Prediction2 EUndecidablePredictionLeafE_NT = new Prediction2("E", "UndecidableELeaf", "E-NT");  
	public static Prediction2 EUndecidablePredictionLeafE_ENT = new Prediction2("E", "UndecidableELeaf", "E-ENT");  
	public static Prediction2 EUndecidablePredictionLeafNT_E = new Prediction2("E", "UndecidableELeaf", "NT-E");  
	public static Prediction2 EUndecidablePredictionLeafNT_EN = new Prediction2("E", "UndecidableELeaf", "NT-EN");  
	public static Prediction2 EUndecidablePredictionLeafET_N = new Prediction2("E", "UndecidableELeaf", "ET-N");  
	public static Prediction2 EUndecidablePredictionLeafET_E = new Prediction2("E", "UndecidableELeaf", "ET-E");  
	public static Prediction2 EUndecidablePredictionLeafET_EN = new Prediction2("E", "UndecidableELeaf", "ET-EN");  
	public static Prediction2 EUndecidablePredictionLeafEN_T = new Prediction2("E", "UndecidableELeaf", "EN-T");  
	public static Prediction2 EUndecidablePredictionLeafEN_E = new Prediction2("E", "UndecidableELeaf", "EN-E");  
	public static Prediction2 EUndecidablePredictionLeafEN_NT = new Prediction2("E", "UndecidableELeaf", "EN-NT");  
	public static Prediction2 EUndecidablePredictionLeafEN_ET = new Prediction2("E", "UndecidableELeaf", "EN-ET");  
	public static Prediction2 EUndecidablePredictionLeafEN_EN = new Prediction2("E", "UndecidableELeaf", "EN-EN");  
	public static Prediction2 EUndecidablePredictionLeafENT_E = new Prediction2("E", "UndecidableELeaf", "ENT-E"); 
	public static Prediction2 EUndecidablePredictionLeafENT_EN = new Prediction2("E", "UndecidableELeaf", "ENT-EN");  
	public static Prediction2 EUndecidablePredictionLeafEN_ENT = new Prediction2("E", "UndecidableELeaf", "EN-ENT");  


	public static Prediction2 TPureTPredictionLeaf = new Prediction2("T","PureTLeaf", "T-T"); 
	
	public static Prediction2 NMixedNPredictionLeafN_NT = new Prediction2("N","MixedNLeaf", "N-NT");  
	public static Prediction2 NMixedNPredictionLeafN_EN = new Prediction2("N","MixedNLeaf", "N-EN");  
	public static Prediction2 NMixedNPredictionLeafN_ENT = new Prediction2("N","MixedNLeaf", "N-ENT");  
	public static Prediction2 NMixedNPredictionLeafNT_N = new Prediction2("N","MixedNLeaf", "NT-N");  
	public static Prediction2 NMixedNPredictionLeafEN_N = new Prediction2("N","MixedNLeaf", "EN-N");  
	public static Prediction2 NMixedNPredictionLeafENT_N = new Prediction2("N","MixedNLeaf", "ENT-N");  

	

	public static Prediction2 TMixedTPredictionLeafT_NT = new Prediction2("T","MixedTLeaf", "T-NT");  
	public static Prediction2 TMixedTPredictionLeafT_ET = new Prediction2("T","MixedTLeaf", "T-ET");  
	public static Prediction2 TMixedTPredictionLeafT_ENT = new Prediction2("T","MixedTLeaf", "T-ENT");  
	public static Prediction2 TMixedTPredictionLeafNT_T = new Prediction2("T","MixedTLeaf", "NT-T");  
	public static Prediction2 TMixedTPredictionLeafNT_NT = new Prediction2("T","MixedTLeaf", "NT-NT");  
	public static Prediction2 TMixedTPredictionLeafNT_ET = new Prediction2("T","MixedTLeaf", "NT-ET");  
	public static Prediction2 TMixedTPredictionLeafNT_ENT = new Prediction2("T","MixedTLeaf", "NT-ENT");  
	public static Prediction2 TMixedTPredictionLeafET_T = new Prediction2("T","MixedTLeaf", "ET-T");  
	public static Prediction2 TMixedTPredictionLeafET_NT = new Prediction2("T","MixedTLeaf", "ET-NT");  
	public static Prediction2 TMixedTPredictionLeafET_ET = new Prediction2("T","MixedTLeaf", "ET-ET");  
	public static Prediction2 TMixedTPredictionLeafET_ENT = new Prediction2("T","MixedTLeaf", "ET-ENT");  
	public static Prediction2 TMixedTPredictionLeafENT_T = new Prediction2("T","MixedTLeaf", "ENT_T");  
	public static Prediction2 TMixedTPredictionLeafENT_NT = new Prediction2("T","MixedTLeaf", "ENT_NT");  
	public static Prediction2 TMixedTPredictionLeafENT_ET = new Prediction2("T","MixedTLeaf", "ENT_ET");  
	public static Prediction2 TMixedTPredictionLeafENT_ENT = new Prediction2("T","MixedTLeaf", "ENT_ENT");  
	

	

	public static Prediction2 NPureNPredictionLeaf = new Prediction2("N","PureNLeaf", "N-N");  
	
	
	/***********************************************************************************/
	
	public static Prediction2 EBoundaryPredictionRootT_N = new Prediction2("E", "BoundaryERoot", "T-N"); 
	public static Prediction2 EBoundaryPredictionRootN_T = new Prediction2("E", "BoundaryERoot", "N-T"); 

	public static Prediction2 EUndecidablePredictionRootT_E = new Prediction2("E", "UndecidableERoot", "T-E");  
	public static Prediction2 EUndecidablePredictionRootE_T = new Prediction2("E", "UndecidableERoot", "E-T");  
	public static Prediction2 EUndecidablePredictionRootT_EN = new Prediction2("E", "UndecidableERoot", "T-EN");  
	public static Prediction2 EUndecidablePredictionRootN_E = new Prediction2("E", "UndecidableERoot", "N-E");  
	public static Prediction2 EUndecidablePredictionRootN_ET = new Prediction2("E", "UndecidableERoot", "N-ET");  
	public static Prediction2 EUndecidablePredictionRootE_N = new Prediction2("E", "UndecidableERoot", "E-N");  
	public static Prediction2 EUndecidablePredictionRootE_E = new Prediction2("E", "UndecidableERoot", "E-E");  
	public static Prediction2 EUndecidablePredictionRootE_ET = new Prediction2("E", "UndecidableERoot", "E-ET");  
	public static Prediction2 EUndecidablePredictionRootE_EN = new Prediction2("E", "UndecidableERoot", "E-EN");  
	public static Prediction2 EUndecidablePredictionRootE_NT = new Prediction2("E", "UndecidableERoot", "E-NT");  
	public static Prediction2 EUndecidablePredictionRootE_ENT = new Prediction2("E", "UndecidableERoot", "E-ENT");  
	public static Prediction2 EUndecidablePredictionRootNT_E = new Prediction2("E", "UndecidableERoot", "NT-E");  
	public static Prediction2 EUndecidablePredictionRootNT_EN = new Prediction2("E", "UndecidableERoot", "NT-EN");  
	public static Prediction2 EUndecidablePredictionRootET_N = new Prediction2("E", "UndecidableERoot", "ET-N");  
	public static Prediction2 EUndecidablePredictionRootET_E = new Prediction2("E", "UndecidableERoot", "ET-E");  
	public static Prediction2 EUndecidablePredictionRootET_EN = new Prediction2("E", "UndecidableERoot", "ET-EN");  
	public static Prediction2 EUndecidablePredictionRootEN_T = new Prediction2("E", "UndecidableERoot", "EN-T");  
	public static Prediction2 EUndecidablePredictionRootEN_E = new Prediction2("E", "UndecidableERoot", "EN-E");  
	public static Prediction2 EUndecidablePredictionRootEN_NT = new Prediction2("E", "UndecidableERoot", "EN-NT");  
	public static Prediction2 EUndecidablePredictionRootEN_ET = new Prediction2("E", "UndecidableERoot", "EN-ET");  
	public static Prediction2 EUndecidablePredictionRootEN_EN = new Prediction2("E", "UndecidableERoot", "EN-EN");  
	public static Prediction2 EUndecidablePredictionRootENT_E = new Prediction2("E", "UndecidableERoot", "ENT-E"); 
	public static Prediction2 EUndecidablePredictionRootENT_EN = new Prediction2("E", "UndecidableERoot", "ENT-EN");  
	public static Prediction2 EUndecidablePredictionRootEN_ENT = new Prediction2("E", "UndecidableERoot", "EN-ENT");  


	public static Prediction2 TPureTPredictionRoot = new Prediction2("T","PureTRoot", "T-T"); 
	
	public static Prediction2 NMixedNPredictionRootN_NT = new Prediction2("N","MixedNRoot", "N-NT");  
	public static Prediction2 NMixedNPredictionRootN_EN = new Prediction2("N","MixedNRoot", "N-EN");  
	public static Prediction2 NMixedNPredictionRootN_ENT = new Prediction2("N","MixedNRoot", "N-ENT");  
	public static Prediction2 NMixedNPredictionRootNT_N = new Prediction2("N","MixedNRoot", "NT-N");  
	public static Prediction2 NMixedNPredictionRootEN_N = new Prediction2("N","MixedNRoot", "EN-N");  
	public static Prediction2 NMixedNPredictionRootENT_N = new Prediction2("N","MixedNRoot", "ENT-N");  

	

	public static Prediction2 TMixedTPredictionRootT_NT = new Prediction2("T","MixedTRoot", "T-NT");  
	public static Prediction2 TMixedTPredictionRootT_ET = new Prediction2("T","MixedTRoot", "T-ET");  
	public static Prediction2 TMixedTPredictionRootT_ENT = new Prediction2("T","MixedTRoot", "T-ENT");  
	public static Prediction2 TMixedTPredictionRootNT_T = new Prediction2("T","MixedTRoot", "NT-T");  
	public static Prediction2 TMixedTPredictionRootNT_NT = new Prediction2("T","MixedTRoot", "NT-NT");  
	public static Prediction2 TMixedTPredictionRootNT_ET = new Prediction2("T","MixedTRoot", "NT-ET");  
	public static Prediction2 TMixedTPredictionRootNT_ENT = new Prediction2("T","MixedTRoot", "NT-ENT");  
	public static Prediction2 TMixedTPredictionRootET_T = new Prediction2("T","MixedTRoot", "ET-T");  
	public static Prediction2 TMixedTPredictionRootET_NT = new Prediction2("T","MixedTRoot", "ET-NT");  
	public static Prediction2 TMixedTPredictionRootET_ET = new Prediction2("T","MixedTRoot", "ET-ET");  
	public static Prediction2 TMixedTPredictionRootET_ENT = new Prediction2("T","MixedTRoot", "ET-ENT");  
	public static Prediction2 TMixedTPredictionRootENT_T = new Prediction2("T","MixedTRoot", "ENT_T");  
	public static Prediction2 TMixedTPredictionRootENT_NT = new Prediction2("T","MixedTRoot", "ENT_NT");  
	public static Prediction2 TMixedTPredictionRootENT_ET = new Prediction2("T","MixedTRoot", "ENT_ET");  
	public static Prediction2 TMixedTPredictionRootENT_ENT = new Prediction2("T","MixedTRoot", "ENT_ENT");  
	

	

	public static Prediction2 NPureNPredictionRoot = new Prediction2("N","PureNRoot", "N-N");  
}
