package ALGO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Chess.LogInfo;
import mypackage.Method;
import mypackage.MethodTrace;
import mypackage.Requirement;

public class TraceValidator {

	
	
	public static HashMap<String, Prediction> InnerMatrix= new HashMap<String, Prediction>(){{
		put("T-T", Prediction.TPureTPredictionInner) ; 
	put("T-N", Prediction.EBoundaryPredictionInner) ; 
	put("T-E", Prediction.EUndecidablePredictionInner) ; 
	put("T-NT", Prediction.TMixedTPredictionInner) ; 
	put("T-ET", Prediction.TMixedTPredictionInner) ; 
	put("T-EN", Prediction.EUndecidablePredictionInner) ; 
	put("T-ENT",  Prediction.TMixedTPredictionInner) ; 
	
	put("N-T", Prediction.EBoundaryPredictionInner) ; 
	put("N-N", Prediction.NPureNPredictionInner) ; 
	put("N-E", Prediction.EUndecidablePredictionInner) ; 
	put("N-NT", Prediction.NMixedNPredictionInner) ; 
	put("N-ET", Prediction.EUndecidablePredictionInner) ; 
	put("N-EN",Prediction.NMixedNPredictionInner) ; 
	put("N-ENT", Prediction.NMixedNPredictionInner) ; 
	
	
	put("E-T", Prediction.EUndecidablePredictionInner) ; 
	put("E-N", Prediction.EUndecidablePredictionInner) ; 
	put("E-E", Prediction.EUndecidablePredictionInner) ; 
	put("E-NT", Prediction.EUndecidablePredictionInner) ; 
	put("E-ET", Prediction.EUndecidablePredictionInner) ; 
	put("E-EN", Prediction.EUndecidablePredictionInner) ; 
	put("E-ENT", Prediction.EUndecidablePredictionInner) ; 

	
	put("NT-T", Prediction.TMixedTPredictionInner) ; 
	put("NT-N", Prediction.NMixedNPredictionInner) ; 
	put("NT-E", Prediction.EUndecidablePredictionInner) ; 
	put("NT-NT",  Prediction.TMixedTPredictionInner) ; 
	put("NT-ET",  Prediction.TMixedTPredictionInner) ; 
	put("NT-EN", Prediction.EUndecidablePredictionInner) ; 
	put("NT-ENT",  Prediction.TMixedTPredictionInner) ; 
	
	
	put("ET-T",  Prediction.TMixedTPredictionInner) ; 
	put("ET-N", Prediction.EUndecidablePredictionInner) ; 
	put("ET-E", Prediction.EUndecidablePredictionInner) ; 
	put("ET-NT",  Prediction.TMixedTPredictionInner) ; 
	put("ET-ET",  Prediction.TMixedTPredictionInner) ; 
	put("ET-EN", Prediction.EUndecidablePredictionInner) ; 
	put("ET-ENT",  Prediction.TMixedTPredictionInner) ; 

	
	put("EN-T", Prediction.EUndecidablePredictionInner) ; 
	put("EN-N", Prediction.NMixedNPredictionInner) ; 
	put("EN-E", Prediction.EUndecidablePredictionInner) ; 
	put("EN-NT", Prediction.EUndecidablePredictionInner) ; 
	put("EN-ET", Prediction.EUndecidablePredictionInner) ; 
	put("EN-EN", Prediction.EUndecidablePredictionInner) ; 
	put("EN-ENT", Prediction.EUndecidablePredictionInner) ; 
	
	
	put("ENT-T", Prediction.TMixedTPredictionInner) ; 
	put("ENT-N", Prediction.NMixedNPredictionInner) ; 
	put("ENT-E", Prediction.EUndecidablePredictionInner) ; 
	put("ENT-NT", Prediction.TMixedTPredictionInner) ; 
	put("ENT-ET", Prediction.TMixedTPredictionInner) ; 
	put("ENT-EN", Prediction.EUndecidablePredictionInner) ; 
	put("ENT-ENT", Prediction.TMixedTPredictionInner); }}; 
	
	
	
	public static HashMap<String, Prediction> LeafMatrix= new HashMap<String, Prediction>(){{
		put("T-T", Prediction.TPureTPredictionLeaf) ; 
	put("T-N", Prediction.EBoundaryPredictionLeaf) ; 
	put("T-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("T-NT", Prediction.TMixedTPredictionLeaf) ; 
	put("T-ET", Prediction.TMixedTPredictionLeaf) ; 
	put("T-EN", Prediction.EUndecidablePredictionLeaf) ; 
	put("T-ENT",  Prediction.TMixedTPredictionLeaf) ; 
	
	put("N-T", Prediction.EBoundaryPredictionLeaf) ; 
	put("N-N", Prediction.NPureNPredictionLeaf) ; 
	put("N-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("N-NT", Prediction.NMixedNPredictionLeaf) ; 
	put("N-ET", Prediction.EUndecidablePredictionLeaf) ; 
	put("N-EN",Prediction.NMixedNPredictionLeaf) ; 
	put("N-ENT", Prediction.NMixedNPredictionLeaf) ; 
	
	
	put("E-T", Prediction.EUndecidablePredictionLeaf) ; 
	put("E-N", Prediction.EUndecidablePredictionLeaf) ; 
	put("E-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("E-NT", Prediction.EUndecidablePredictionLeaf) ; 
	put("E-ET", Prediction.EUndecidablePredictionLeaf) ; 
	put("E-EN", Prediction.EUndecidablePredictionLeaf) ; 
	put("E-ENT", Prediction.EUndecidablePredictionLeaf) ; 

	
	put("NT-T", Prediction.TMixedTPredictionLeaf) ; 
	put("NT-N", Prediction.NMixedNPredictionLeaf) ; 
	put("NT-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("NT-NT",  Prediction.TMixedTPredictionLeaf) ; 
	put("NT-ET",  Prediction.TMixedTPredictionLeaf) ; 
	put("NT-EN", Prediction.EUndecidablePredictionLeaf) ; 
	put("NT-ENT",  Prediction.TMixedTPredictionLeaf) ; 
	
	
	put("ET-T",  Prediction.TMixedTPredictionLeaf) ; 
	put("ET-N", Prediction.EUndecidablePredictionLeaf) ; 
	put("ET-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("ET-NT",  Prediction.TMixedTPredictionLeaf) ; 
	put("ET-ET",  Prediction.TMixedTPredictionLeaf) ; 
	put("ET-EN", Prediction.EUndecidablePredictionLeaf) ; 
	put("ET-ENT",  Prediction.TMixedTPredictionLeaf) ; 

	
	put("EN-T", Prediction.EUndecidablePredictionLeaf) ; 
	put("EN-N", Prediction.NMixedNPredictionLeaf) ; 
	put("EN-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("EN-NT", Prediction.EUndecidablePredictionLeaf) ; 
	put("EN-ET", Prediction.EUndecidablePredictionLeaf) ; 
	put("EN-EN", Prediction.EUndecidablePredictionLeaf) ; 
	put("EN-ENT", Prediction.EUndecidablePredictionLeaf) ; 
	
	
	put("ENT-T", Prediction.TMixedTPredictionLeaf) ; 
	put("ENT-N", Prediction.NMixedNPredictionLeaf) ; 
	put("ENT-E", Prediction.EUndecidablePredictionLeaf) ; 
	put("ENT-NT", Prediction.TMixedTPredictionLeaf) ; 
	put("ENT-ET", Prediction.TMixedTPredictionLeaf) ; 
	put("ENT-EN", Prediction.EUndecidablePredictionLeaf) ; 
	put("ENT-ENT", Prediction.TMixedTPredictionLeaf); }}; 
	
	
	
	public static HashMap<String, Prediction> RootMatrix= new HashMap<String, Prediction>(){{put("T-T", Prediction.TPureTPredictionRoot) ; 
	put("T-N", Prediction.EBoundaryPredictionRoot) ; 
	put("T-E", Prediction.EUndecidablePredictionRoot) ; 
	put("T-NT", Prediction.TMixedTPredictionRoot) ; 
	put("T-ET", Prediction.TMixedTPredictionRoot) ; 
	put("T-EN", Prediction.EUndecidablePredictionRoot) ; 
	put("T-ENT",  Prediction.TMixedTPredictionRoot) ; 
	
	put("N-T", Prediction.EBoundaryPredictionRoot) ; 
	put("N-N", Prediction.NPureNPredictionRoot) ; 
	put("N-E", Prediction.EUndecidablePredictionRoot) ; 
	put("N-NT", Prediction.NMixedNPredictionRoot) ; 
	put("N-ET", Prediction.EUndecidablePredictionRoot) ; 
	put("N-EN",Prediction.NMixedNPredictionRoot) ; 
	put("N-ENT", Prediction.NMixedNPredictionRoot) ; 
	
	
	put("E-T", Prediction.EUndecidablePredictionRoot) ; 
	put("E-N", Prediction.EUndecidablePredictionRoot) ; 
	put("E-E", Prediction.EUndecidablePredictionRoot) ; 
	put("E-NT", Prediction.EUndecidablePredictionRoot) ; 
	put("E-ET", Prediction.EUndecidablePredictionRoot) ; 
	put("E-EN", Prediction.EUndecidablePredictionRoot) ; 
	put("E-ENT", Prediction.EUndecidablePredictionRoot) ; 

	
	put("NT-T", Prediction.TMixedTPredictionRoot) ; 
	put("NT-N", Prediction.NMixedNPredictionRoot) ; 
	put("NT-E", Prediction.EUndecidablePredictionRoot) ; 
	put("NT-NT",  Prediction.TMixedTPredictionRoot) ; 
	put("NT-ET",  Prediction.TMixedTPredictionRoot) ; 
	put("NT-EN", Prediction.EUndecidablePredictionRoot) ; 
	put("NT-ENT",  Prediction.TMixedTPredictionRoot) ; 
	
	
	put("ET-T",  Prediction.TMixedTPredictionRoot) ; 
	put("ET-N", Prediction.EUndecidablePredictionRoot) ; 
	put("ET-E", Prediction.EUndecidablePredictionRoot) ; 
	put("ET-NT",  Prediction.TMixedTPredictionRoot) ; 
	put("ET-ET",  Prediction.TMixedTPredictionRoot) ; 
	put("ET-EN", Prediction.EUndecidablePredictionRoot) ; 
	put("ET-ENT",  Prediction.TMixedTPredictionRoot) ; 

	
	put("EN-T", Prediction.EUndecidablePredictionRoot) ; 
	put("EN-N", Prediction.NMixedNPredictionRoot) ; 
	put("EN-E", Prediction.EUndecidablePredictionRoot) ; 
	put("EN-NT", Prediction.EUndecidablePredictionRoot) ; 
	put("EN-ET", Prediction.EUndecidablePredictionRoot) ; 
	put("EN-EN", Prediction.EUndecidablePredictionRoot) ; 
	put("EN-ENT", Prediction.EUndecidablePredictionRoot) ; 
	
	
	put("ENT-T", Prediction.TMixedTPredictionRoot) ; 
	put("ENT-N", Prediction.NMixedNPredictionRoot) ; 
	put("ENT-E", Prediction.EUndecidablePredictionRoot) ; 
	put("ENT-NT", Prediction.TMixedTPredictionRoot) ; 
	put("ENT-ET", Prediction.TMixedTPredictionRoot) ; 
	put("ENT-EN", Prediction.EUndecidablePredictionRoot) ; 
	put("ENT-ENT", Prediction.TMixedTPredictionRoot); }}; 

		static void MakePredictions(List<MethodTrace> MethodTracesList, LinkedHashMap<String, LogInfo> LogInfoHashMap) throws Exception {
			// TODO Auto-generated method stub
			int iteration =1; 
			for (MethodTrace methodtrace : MethodTracesList) {
				
				String reqMethod= methodtrace.Requirement.ID+"-"+methodtrace.Method.ID; 


				
				
				//INNER METHOD 
				if(!methodtrace.getCallers().isEmpty() && !methodtrace.getCallees().isEmpty())
				{
					
					TraceValidator.Predict(methodtrace, methodtrace.getCallers(), methodtrace.getCallees(), TraceValidator.InnerMatrix, LogInfoHashMap, "Inner", iteration);
					
				}


				//LEAF METHOD  

				else if(!methodtrace.getCallers().isEmpty() && methodtrace.getCallees().isEmpty() && !methodtrace.getCallersCallers().isEmpty())
				{
					
					TraceValidator.Predict(methodtrace, methodtrace.getCallers(), methodtrace.getCallersCallers(), TraceValidator.LeafMatrix, LogInfoHashMap, "Leaf", iteration);

					
					
				}		//ROOT METHOD 
				else if(methodtrace.getCallers().isEmpty() && !methodtrace.getCallees().isEmpty()&& !methodtrace.getCalleesCallees().isEmpty())
				{
					
					TraceValidator.Predict(methodtrace, methodtrace.getCallees(), methodtrace.getCalleesCallees(), TraceValidator.RootMatrix, LogInfoHashMap, "Root", iteration);
					
				}

				else if(methodtrace.getCallers().isEmpty() && methodtrace.getCallees().isEmpty())
				{
					 
						methodtrace.SetPrediction(LogInfoHashMap, Prediction.EIsolatedPrediction, "", iteration);

					
					
				}else {
					methodtrace.SetPrediction(LogInfoHashMap, Prediction.ENotApplicablePrediction, "", iteration);

				}












				if(LogInfoHashMap.get(reqMethod).getIterationValues().size()==iteration-1) {
					LogInfoHashMap.get(reqMethod).getIterationValues().add("");

				}	

				iteration ++; 
			}
		}
		public static void  Predict(MethodTrace methodTrace, MethodList rows, MethodList columns, HashMap<String, Prediction> MatrixHashMap, LinkedHashMap<String, LogInfo> LogInfoHashMap, String Type, int iteration) throws CloneNotSupportedException {
			 String rowKey = CalculateTNE(methodTrace.Requirement, rows); 
			 String columnKey = CalculateTNE(methodTrace.Requirement, columns); 

			Prediction prediction = MatrixHashMap.get(rowKey+"-"+columnKey);  
			prediction.pattern=rowKey+"-"+columnKey; 
			methodTrace.SetPrediction(LogInfoHashMap, prediction, Type,iteration);
			
		}



		
		
		private static String CalculateTNE(Requirement requirement, MethodList methods) {
			// TODO Auto-generated method stub
			String Key=""; 
			for(Method method: methods) {
			String Prediction= MethodTrace.getMethodTrace(requirement, method).getPrediction(); 
				if(Prediction.equals("T") && !Key.contains("T")) {
					Key=Key+"T"; 
				}
				if(Prediction.equals("N") && !Key.contains("N")) {
					Key=Key+"N"; 
				}
				if(Prediction.equals("E") && !Key.contains("E")) {
					Key=Key+"E"; 
				}
			}
			char SortedKeyArray[] = Key.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(SortedKeyArray); 
	          
	        // return new sorted string 
	        return new String(SortedKeyArray); 
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	

