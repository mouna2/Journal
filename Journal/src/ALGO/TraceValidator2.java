package ALGO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.mysql.cj.result.Row;

import Chess.LogInfo;
import mypackage.Method;
import mypackage.MethodTrace;
import mypackage.Requirement;

public class TraceValidator2 {



	public static HashMap<String, Prediction> InnerMatrix= new HashMap<String, Prediction>(){{
		put("T-T", Prediction.TPureTPredictionInner) ; 
		put("T-N", Prediction.EBoundaryPredictionInnerT_N) ; 
		put("T-E", Prediction.EUndecidablePredictionInnerT_E) ; 
		put("T-NT", Prediction.TMixedTPredictionInnerT_NT) ; 
		put("T-ET", Prediction.TMixedTPredictionInnerT_ET) ; 
		put("T-EN", Prediction.EUndecidablePredictionInnerT_EN) ; 
		put("T-ENT",  Prediction.TMixedTPredictionInnerT_ENT) ; 

		put("N-T", Prediction.EBoundaryPredictionInnerN_T) ; 
		put("N-N", Prediction.NPureNPredictionInner) ; 
		put("N-E", Prediction.EUndecidablePredictionInnerN_E) ; 
		put("N-NT", Prediction.NMixedNPredictionInnerN_NT) ; 
		put("N-ET", Prediction.EUndecidablePredictionInnerN_ET) ; 
		put("N-EN",Prediction.NMixedNPredictionInnerN_EN) ; 
		put("N-ENT", Prediction.NMixedNPredictionInnerN_ENT) ; 


		put("E-T", Prediction.EUndecidablePredictionInnerE_T) ; 
		put("E-N", Prediction.EUndecidablePredictionInnerE_N) ; 
		put("E-E", Prediction.EUndecidablePredictionInnerE_E) ; 
		put("E-NT", Prediction.EUndecidablePredictionInnerE_NT) ; 
		put("E-ET", Prediction.EUndecidablePredictionInnerE_ET) ; 
		put("E-EN", Prediction.EUndecidablePredictionInnerE_EN) ; 
		put("E-ENT", Prediction.EUndecidablePredictionInnerE_ENT) ; 


		put("NT-T", Prediction.TMixedTPredictionInnerNT_T) ; 
		put("NT-N", Prediction.NMixedNPredictionInnerNT_N) ; 
		put("NT-E", Prediction.EUndecidablePredictionInnerNT_E) ; 
		put("NT-NT",  Prediction.TMixedTPredictionInnerNT_NT) ; 
		put("NT-ET",  Prediction.TMixedTPredictionInnerNT_ET) ; 
		put("NT-EN", Prediction.EUndecidablePredictionInnerNT_EN) ; 
		put("NT-ENT",  Prediction.TMixedTPredictionInnerNT_ENT) ; 


		put("ET-T",  Prediction.TMixedTPredictionInnerET_T) ; 
		put("ET-N", Prediction.EUndecidablePredictionInnerET_N) ; 
		put("ET-E", Prediction.EUndecidablePredictionInnerET_E) ; 
		put("ET-NT",  Prediction.TMixedTPredictionInnerET_NT) ; 
		put("ET-ET",  Prediction.TMixedTPredictionInnerET_ET) ; 
		put("ET-EN", Prediction.EUndecidablePredictionInnerET_EN) ; 
		put("ET-ENT",  Prediction.TMixedTPredictionInnerET_ENT) ; 


		put("EN-T", Prediction.EUndecidablePredictionInnerEN_T) ; 
		put("EN-N", Prediction.NMixedNPredictionInnerEN_N) ; 
		put("EN-E", Prediction.EUndecidablePredictionInnerEN_E) ; 
		put("EN-NT", Prediction.EUndecidablePredictionInnerEN_NT) ; 
		put("EN-ET", Prediction.EUndecidablePredictionInnerEN_ET) ; 
		put("EN-EN", Prediction.EUndecidablePredictionInnerEN_EN) ; 
		put("EN-ENT", Prediction.EUndecidablePredictionInnerEN_ENT) ; 


		put("ENT-T", Prediction.TMixedTPredictionInnerENT_T) ; 
		put("ENT-N", Prediction.NMixedNPredictionInnerENT_N) ; 
		put("ENT-E", Prediction.EUndecidablePredictionInnerENT_E) ; 
		put("ENT-NT", Prediction.TMixedTPredictionInnerENT_NT) ; 
		put("ENT-ET", Prediction.TMixedTPredictionInnerENT_ET) ; 
		put("ENT-EN", Prediction.EUndecidablePredictionInnerENT_EN) ; 
		put("ENT-ENT", Prediction.TMixedTPredictionInnerENT_ENT); }}; 



		public static HashMap<String, Prediction> LeafMatrix= new HashMap<String, Prediction>(){{
			put("T-T", Prediction.TPureTPredictionLeaf) ; 
			put("T-N", Prediction.EBoundaryPredictionLeafT_N) ; 
			put("T-E", Prediction.EUndecidablePredictionLeafT_E) ; 
			put("T-NT", Prediction.TMixedTPredictionLeafT_NT) ; 
			put("T-ET", Prediction.TMixedTPredictionLeafT_ET) ; 
			put("T-EN", Prediction.EUndecidablePredictionLeafT_EN) ; 
			put("T-ENT",  Prediction.TMixedTPredictionLeafT_ENT) ; 

			put("N-T", Prediction.EBoundaryPredictionLeafN_T) ; 
			put("N-N", Prediction.NPureNPredictionLeaf) ; 
			put("N-E", Prediction.EUndecidablePredictionLeafN_E) ; 
			put("N-NT", Prediction.NMixedNPredictionLeafN_NT) ; 
			put("N-ET", Prediction.EUndecidablePredictionLeafN_ET) ; 
			put("N-EN",Prediction.NMixedNPredictionLeafN_EN) ; 
			put("N-ENT", Prediction.NMixedNPredictionLeafN_ENT) ; 


			put("E-T", Prediction.EUndecidablePredictionLeafE_T) ; 
			put("E-N", Prediction.EUndecidablePredictionLeafE_N) ; 
			put("E-E", Prediction.EUndecidablePredictionLeafE_E) ; 
			put("E-NT", Prediction.EUndecidablePredictionLeafE_NT) ; 
			put("E-ET", Prediction.EUndecidablePredictionLeafE_ET) ; 
			put("E-EN", Prediction.EUndecidablePredictionLeafE_EN) ; 
			put("E-ENT", Prediction.EUndecidablePredictionLeafE_ENT) ; 


			put("NT-T", Prediction.TMixedTPredictionLeafNT_T) ; 
			put("NT-N", Prediction.NMixedNPredictionLeafNT_N) ; 
			put("NT-E", Prediction.EUndecidablePredictionLeafNT_E) ; 
			put("NT-NT",  Prediction.TMixedTPredictionLeafNT_NT) ; 
			put("NT-ET",  Prediction.TMixedTPredictionLeafNT_ET) ; 
			put("NT-EN", Prediction.EUndecidablePredictionLeafNT_EN) ; 
			put("NT-ENT",  Prediction.TMixedTPredictionLeafNT_ENT) ; 


			put("ET-T",  Prediction.TMixedTPredictionLeafET_T) ; 
			put("ET-N", Prediction.EUndecidablePredictionLeafET_N) ; 
			put("ET-E", Prediction.EUndecidablePredictionLeafET_E) ; 
			put("ET-NT",  Prediction.TMixedTPredictionLeafET_NT) ; 
			put("ET-ET",  Prediction.TMixedTPredictionLeafET_ET) ; 
			put("ET-EN", Prediction.EUndecidablePredictionLeafET_EN) ; 
			put("ET-ENT",  Prediction.TMixedTPredictionLeafET_ENT) ; 


			put("EN-T", Prediction.EUndecidablePredictionLeafEN_T) ; 
			put("EN-N", Prediction.NMixedNPredictionLeafEN_N) ; 
			put("EN-E", Prediction.EUndecidablePredictionLeafEN_E) ; 
			put("EN-NT", Prediction.EUndecidablePredictionLeafEN_NT) ; 
			put("EN-ET", Prediction.EUndecidablePredictionLeafEN_ET) ; 
			put("EN-EN", Prediction.EUndecidablePredictionLeafEN_EN) ; 
			put("EN-ENT", Prediction.EUndecidablePredictionLeafEN_ENT) ; 


			put("ENT-T", Prediction.TMixedTPredictionLeafENT_T) ; 
			put("ENT-N", Prediction.NMixedNPredictionLeafENT_N) ; 
			put("ENT-E", Prediction.EUndecidablePredictionLeafENT_E) ; 
			put("ENT-NT", Prediction.TMixedTPredictionLeafENT_NT) ; 
			put("ENT-ET", Prediction.TMixedTPredictionLeafENT_ET) ; 
			put("ENT-EN", Prediction.EUndecidablePredictionLeafENT_EN) ; 
			put("ENT-ENT", Prediction.TMixedTPredictionLeafENT_ENT); }}; 



			public static HashMap<String, Prediction> RootMatrix= new HashMap<String, Prediction>(){{
				put("T-T", Prediction.TPureTPredictionRoot) ; 
				put("T-N", Prediction.EBoundaryPredictionRootT_N) ; 
				put("T-E", Prediction.EUndecidablePredictionRootT_E) ; 
				put("T-NT", Prediction.TMixedTPredictionRootT_NT) ; 
				put("T-ET", Prediction.TMixedTPredictionRootT_ET) ; 
				put("T-EN", Prediction.EUndecidablePredictionRootT_EN) ; 
				put("T-ENT",  Prediction.TMixedTPredictionRootT_ENT) ; 

				put("N-T", Prediction.EBoundaryPredictionRootN_T) ; 
				put("N-N", Prediction.NPureNPredictionRoot) ; 
				put("N-E", Prediction.EUndecidablePredictionRootN_E) ; 
				put("N-NT", Prediction.NMixedNPredictionRootN_NT) ; 
				put("N-ET", Prediction.EUndecidablePredictionRootN_ET) ; 
				put("N-EN",Prediction.NMixedNPredictionRootN_EN) ; 
				put("N-ENT", Prediction.NMixedNPredictionRootN_ENT) ; 


				put("E-T", Prediction.EUndecidablePredictionRootE_T) ; 
				put("E-N", Prediction.EUndecidablePredictionRootE_N) ; 
				put("E-E", Prediction.EUndecidablePredictionRootE_E) ; 
				put("E-NT", Prediction.EUndecidablePredictionRootE_NT) ; 
				put("E-ET", Prediction.EUndecidablePredictionRootE_ET) ; 
				put("E-EN", Prediction.EUndecidablePredictionRootE_EN) ; 
				put("E-ENT", Prediction.EUndecidablePredictionRootE_ENT) ; 


				put("NT-T", Prediction.TMixedTPredictionRootNT_T) ; 
				put("NT-N", Prediction.NMixedNPredictionRootNT_N) ; 
				put("NT-E", Prediction.EUndecidablePredictionRootNT_E) ; 
				put("NT-NT",  Prediction.TMixedTPredictionRootNT_NT) ; 
				put("NT-ET",  Prediction.TMixedTPredictionRootNT_ET) ; 
				put("NT-EN", Prediction.EUndecidablePredictionRootNT_EN) ; 
				put("NT-ENT",  Prediction.TMixedTPredictionRootNT_ENT) ; 


				put("ET-T",  Prediction.TMixedTPredictionRootET_T) ; 
				put("ET-N", Prediction.EUndecidablePredictionRootET_N) ; 
				put("ET-E", Prediction.EUndecidablePredictionRootET_E) ; 
				put("ET-NT",  Prediction.TMixedTPredictionRootET_NT) ; 
				put("ET-ET",  Prediction.TMixedTPredictionRootET_ET) ; 
				put("ET-EN", Prediction.EUndecidablePredictionRootET_EN) ; 
				put("ET-ENT",  Prediction.TMixedTPredictionRootET_ENT) ; 


				put("EN-T", Prediction.EUndecidablePredictionRootEN_T) ; 
				put("EN-N", Prediction.NMixedNPredictionRootEN_N) ; 
				put("EN-E", Prediction.EUndecidablePredictionRootEN_E) ; 
				put("EN-NT", Prediction.EUndecidablePredictionRootEN_NT) ; 
				put("EN-ET", Prediction.EUndecidablePredictionRootEN_ET) ; 
				put("EN-EN", Prediction.EUndecidablePredictionRootEN_EN) ; 
				put("EN-ENT", Prediction.EUndecidablePredictionRootEN_ENT) ; 


				put("ENT-T", Prediction.TMixedTPredictionRootENT_T) ; 
				put("ENT-N", Prediction.NMixedNPredictionRootENT_N) ; 
				put("ENT-E", Prediction.EUndecidablePredictionRootENT_E) ; 
				put("ENT-NT", Prediction.TMixedTPredictionRootENT_NT) ; 
				put("ENT-ET", Prediction.TMixedTPredictionRootENT_ET) ; 
				put("ENT-EN", Prediction.EUndecidablePredictionRootENT_EN) ; 
				put("ENT-ENT", Prediction.TMixedTPredictionRootENT_ENT); }}; 

			static void MakePredictions(List<MethodTrace> methodTracesList, LinkedHashMap<String, LogInfo> logInfoHashMap) throws Exception {
				// TODO Auto-generated method stub
				MethodTrace.modified = true;
				int iteration =1; 
				while (MethodTrace.modified ) {
					System.out.println("iteration "+iteration);
					MethodTrace.modified = false;
					for (MethodTrace methodtrace : methodTracesList) {

						String reqMethod= methodtrace.Requirement.ID+"-"+methodtrace.Method.ID; 




						//INNER METHOD 
						if(!methodtrace.getCallers().isEmpty() && !methodtrace.getCallees().isEmpty())
						{

							TraceValidator2.predict(methodtrace, methodtrace.getCallers(), methodtrace.getCallees(), TraceValidator2.InnerMatrix, logInfoHashMap, "Inner", iteration);

						}


						//LEAF METHOD  

						else if(!methodtrace.getCallers().isEmpty() && methodtrace.getCallees().isEmpty() && !methodtrace.getCallersCallers().isEmpty())
						{

							TraceValidator2.predict(methodtrace, methodtrace.getCallers(), methodtrace.getCallersCallers(), TraceValidator2.LeafMatrix, logInfoHashMap, "Leaf", iteration);



						}		//ROOT METHOD 
						else if(methodtrace.getCallers().isEmpty() && !methodtrace.getCallees().isEmpty()&& !methodtrace.getCalleesCallees().isEmpty())
						{

							TraceValidator2.predict(methodtrace, methodtrace.getCallees(), methodtrace.getCalleesCallees(), TraceValidator2.RootMatrix, logInfoHashMap, "Root", iteration);

						}

						else if(methodtrace.getCallers().isEmpty() && methodtrace.getCallees().isEmpty())
						{

							methodtrace.SetPrediction(logInfoHashMap, Prediction.EIsolatedPrediction, "", iteration);



						}else {
							methodtrace.SetPrediction(logInfoHashMap, Prediction.ENotApplicablePrediction, "", iteration);

						}












						if(logInfoHashMap.get(reqMethod).getIterationValues().size()==iteration-1) {
							logInfoHashMap.get(reqMethod).getIterationValues().add("");

						}	


					}
					iteration++; 
				}
			}
			public static void  predict(MethodTrace methodTrace, MethodList rows, MethodList columns, HashMap<String, Prediction> matrixHashMap, LinkedHashMap<String, LogInfo> logInfoHashMap, String type, int iteration) throws CloneNotSupportedException {
				String rowKey = CalculateTNE(methodTrace.Requirement, rows); 
				String columnKey = CalculateTNE(methodTrace.Requirement, columns); 

				Prediction prediction = matrixHashMap.get(rowKey+"-"+columnKey);  
				prediction.pattern=rowKey+"-"+columnKey; 
				methodTrace.SetPrediction(logInfoHashMap, prediction, type,iteration);

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





