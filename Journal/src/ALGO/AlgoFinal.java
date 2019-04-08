package ALGO;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.table.*;




import Chess.LogInfo;
import Chess.PredictionEvaluation;

import mypackage.Children2;
import mypackage.ClassField2;
import mypackage.ClassTrace2;
import mypackage.ColumnGroup;
import mypackage.Method;
import mypackage.MethodTrace;
import mypackage.Requirement;


public class AlgoFinal  {
	public static String ProgramName=""; 
	public static boolean InheritanceFlag=true; 
	public static boolean InterfaceImplementationFlag=true; 
	public static boolean RecursiveDescent=false; 
	


	 PredictionValues zeroPred= new PredictionValues(0,0,0); 

	public static boolean InheritanceOnFlagSteps2And4=true; 
	
	
	public static boolean AtLeast2FlagOnStep3=false; 
	public static boolean InheritanceRecursion=false; 
	
	
	
	
	
	public static boolean ErrorSeeding=false; 
	public static boolean IncompletenessSeeding=false; 
	public static boolean NoSeeding=true; 
	
	public static boolean AchrafTechnique=true; 
	public static boolean MounaTechnique=false; 

	/**
	 * Run a SQL command which does not return a recordset:
	 * CREATE/INSERT/UPDATE/DELETE/DROP/etc.
	 * 
	 * @throws SQLException
	 *             If something goes wrong
	 */
	public boolean executeUpdate(Connection conn, String command) throws SQLException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(command); // This will throw a SQLException if it fails
			return true;
		} finally {

			// This will run whether we throw an exception or not
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	ResultSet rs = null;
	// Connect to MySQL

	PredictionEvaluation TotalPattern = new PredictionEvaluation();
	PredictionEvaluation RemainingPattern = new PredictionEvaluation();
	PredictionEvaluation Step2Pattern = new PredictionEvaluation();
	PredictionEvaluation Step3Pattern = new PredictionEvaluation();
	PredictionEvaluation Step4Pattern = new PredictionEvaluation();

	PredictionEvaluation Step2PatternCumulative = new PredictionEvaluation();
	PredictionEvaluation Step3PatternCumulative = new PredictionEvaluation();
	PredictionEvaluation Step4PatternCumulative = new PredictionEvaluation();

	
	
	
	static List<MethodTrace> methodtraces = new ArrayList<MethodTrace>();
	HashMap<String, List<String>> classMethodsHashMap = new HashMap<String, List<String>>();
	public static HashMap<String, MethodTrace> methodtraces2HashMap = new HashMap<String, MethodTrace>();
	LinkedHashMap<String, ClassTrace2> methodtracesRequirementClass = new LinkedHashMap<String, ClassTrace2>();


	
	
	
	
	
	
	JTable table = new JTable();
	// File fout = new
	// File("C:\\Users\\mouna\\new_workspace\\SpoonProcessorFinal\\TableLog.txt");

	public final String userName = "root";
	public final String password = "123456";
	List<Method> CallerMethodListFinal = new ArrayList<Method>();
	List<Method> CalleeMethodListFinal = new ArrayList<Method>();

	public List<Method> getCallerMethodListFinal() {
		return CallerMethodListFinal;
	}

	public void setCallerMethodListFinal(List<Method> callerMethodListFinal) {
		CallerMethodListFinal = callerMethodListFinal;
	}

	public List<Method> getCalleeMethodListFinal() {
		return CalleeMethodListFinal;
	}

	public void setCalleeMethodListFinal(List<Method> calleeMethodListFinal) {
		CalleeMethodListFinal = calleeMethodListFinal;
	}

	public AlgoFinal(String ProgramName) throws Exception {

		AlgoFinal.ProgramName=ProgramName; 
//		List<MethodTrace> methodtracesNew = InitializePredictionsHashMap2(methodtraces2);
		TracePredictionFunction( ProgramName);

	}

	

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	/**
	 * @throws Exception **********************************************************************************************************************************************/

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void TracePredictionFunction( String ProgramName) throws Exception {
		// TODO Auto-generated method stub
		BufferedWriter bwfile1 =null; 
		BufferedWriter bwfile2 = null ; 
		BufferedWriter bwfile3 = null ; 
		
	if(ProgramName.equals("chess")) {
		File file1log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\InterfacesNewRule.txt");
		FileOutputStream fosfila1 = new FileOutputStream(file1log);
		 bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));
		
		File file2log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\LogFileUnderstandFP.txt");
		FileOutputStream fosfila2 = new FileOutputStream(file2log);
		 bwfile2 = new BufferedWriter(new OutputStreamWriter(fosfila2));
		 
			File file3log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\LogFileUnderstandFN.txt");
			FileOutputStream fosfila3 = new FileOutputStream(file3log);
			 bwfile3 = new BufferedWriter(new OutputStreamWriter(fosfila3));
	}
		// TODO Auto-generated method stub
		LogInfo.CreateLogFiles(ProgramName);

		
		

	
		
		DatabaseReading DatabaseReading= new DatabaseReading(ProgramName); 
		
		methodtraces2HashMap = DatabaseReading.getMethodtracehashmap();
		methodtraces = DatabaseReading.getMethodtracesList(); 

		
		

		LinkedHashMap<String, LogInfo> LogInfoHashMap = new LinkedHashMap<String, LogInfo>();
		

		Collection<MethodTrace> MethodTracesHashmapValues = methodtraces2HashMap.values();


		
		
		PredictionValues TotalPredictionValues = new PredictionValues(); 
		PredictionValues RemainingpredictionValues = new PredictionValues(); 
		PredictionValues Step2PredictionValues = new PredictionValues(); 
		PredictionValues Step3PredictionValues = new PredictionValues(); 
		PredictionValues Step4PredictionValues = new PredictionValues(); 
		PredictionValues Step4PredictionValuesCumulative = new PredictionValues(); 

		PredictionValues PredictionClassTraceBefore = new PredictionValues(); 
		PredictionValues PredictionClassTraceAfter = new PredictionValues(); 
		 PredictionValues OwnerClassPredictionValues = new PredictionValues(); 

		CountTracesClassesValues(PredictionClassTraceBefore, methodtraces2HashMap);
		LogInfo.InitializeLogInfoHashMap(LogInfoHashMap,MethodTracesHashmapValues, methodtraces2HashMap ); 

		LogInfo.bwTraceClass.write("BEFORE PATTERN 0 "+PredictionClassTraceBefore.toString());
		LogInfo.bwTraceClass.newLine();

		 

		
		CountTracesClassesValues(PredictionClassTraceAfter, methodtraces2HashMap);

		LogInfo.bwTraceClass.write("AFTER PATTERN 0 "+PredictionClassTraceAfter.toString());
		LogInfo.bwTraceClass.close();
	
		LogInfoHashMap=LogInfo.InitializeLogInfoHashMapTraceClassNewValue(LogInfoHashMap,MethodTracesHashmapValues, methodtraces2HashMap ); 

	
		MethodTracesHashmapValues = methodtraces2HashMap.values();
		List<MethodTrace> MethodTracesList = new ArrayList<MethodTrace>(MethodTracesHashmapValues); 
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//			THREE DIFFERENT METHODS TO INITIALIZE THE INPUT HASHMAP //////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(AlgoFinal.ErrorSeeding==true) {
			LogInfoHashMap=InitializeInputHashMapErrorSeeding(MethodTracesList, LogInfoHashMap);

		}
		else if(AlgoFinal.IncompletenessSeeding==true) {
			LogInfoHashMap=InitializeInputHashMapIncompleteness(MethodTracesList, LogInfoHashMap);

		}else if(AlgoFinal.NoSeeding==true) {
			LogInfoHashMap=InitializeInputHashMapNoSeeding(MethodTracesList, LogInfoHashMap); 

		}
		

	
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//STEP 1
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////////////////
	int counter=0;
		for (MethodTrace methodtrace : MethodTracesList) {
			//INNER NODE 
			String reqMethod= methodtrace.Requirement.ID+"-"+methodtrace.Method.ID; 
			MethodList Callers = new MethodList(); 
			MethodList Callees = new MethodList(); 
			MethodList CallersCallers = new MethodList(); 
			if(MounaTechnique==true) {
					Callers = methodtrace.Method.getCallersShell(); 
					Callees = methodtrace.Method.getCalleesShell(); 
					CallersCallers= methodtrace.Method.getCallersCallersShell(); 

			}else if(AchrafTechnique==true) {
				 	Callers = methodtrace.Method.getCallersExecuted(); 
				 	Callees = methodtrace.Method.getCalleesExecuted(); 
				 	CallersCallers= methodtrace.Method.getCallersCallersExecuted(); 
			}
					//INNER METHOD 
					if(!Callers.isEmpty() 
					&& !Callees.isEmpty()) {
						if (
								
								Callers.AtLeast1T(methodtrace.Requirement, methodtraces2HashMap)
								&& 	Callees.AtLeast1T(methodtrace.Requirement, methodtraces2HashMap)

						)

						{
							
							if(!Callers.AllNs(methodtrace.Requirement, methodtraces2HashMap)
							&& !Callees.AllNs(methodtrace.Requirement, methodtraces2HashMap)
							&& !Callers.AllEs(methodtrace.Requirement, methodtraces2HashMap)
							&& !Callees.AllEs(methodtrace.Requirement, methodtraces2HashMap)) {
								
								methodtrace.SetPrediction(LogInfoHashMap,"T", "T,Pure");
							
						}else {
							methodtrace.SetPrediction(LogInfoHashMap,"T", "T,Mixed");

						}
						
					}else if (
							
							Callers.AtLeast1N(methodtrace.Requirement, methodtraces2HashMap)
							&& 	Callees.AtLeast1N(methodtrace.Requirement, methodtraces2HashMap)

					)

					{
						
						if(!Callers.AllTs(methodtrace.Requirement, methodtraces2HashMap)
						&& !Callees.AllTs(methodtrace.Requirement, methodtraces2HashMap)
						&& !Callers.AllEs(methodtrace.Requirement, methodtraces2HashMap)
						&& !Callees.AllEs(methodtrace.Requirement, methodtraces2HashMap)) {
							
							methodtrace.SetPrediction(LogInfoHashMap,"N", "N,Pure");
						
					}
						else if(Callers.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap) 
						&& Callees.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap) ) {
									
							methodtrace.SetPrediction(LogInfoHashMap,"E", "E,Incomplete");
								
						}
						
						else {
						methodtrace.SetPrediction(LogInfoHashMap,"N", "N,Mixed");

					}
					
				}else if(Callers.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap)
						|| Callees.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap)) {
					methodtrace.SetPrediction(LogInfoHashMap,"E", "E,Incomplete");

				}else {
					methodtrace.SetPrediction(LogInfoHashMap,"E", "E,Boundary");

				}
					}
					
					
					
					
					
					
					
					
					
					
					//LEAF METHOD  
					
					else if(!Callers.isEmpty() 
							&& Callees.isEmpty()) {
						if (
								
								Callers.AtLeast1T(methodtrace.Requirement, methodtraces2HashMap)
								&& 	CallersCallers.AtLeast1T(methodtrace.Requirement, methodtraces2HashMap)


						)

						{
							
							if(!CallersCallers.AllNs(methodtrace.Requirement, methodtraces2HashMap)
							&& !CallersCallers.AllEs(methodtrace.Requirement, methodtraces2HashMap)
							&& !Callers.AllNs(methodtrace.Requirement, methodtraces2HashMap)
							&& !Callers.AllEs(methodtrace.Requirement, methodtraces2HashMap)
						
							
							) {
								
								methodtrace.SetPrediction(LogInfoHashMap,"T", "T,PureLeaf");
							
						}else {
							methodtrace.SetPrediction(LogInfoHashMap,"T", "T,MixedLeaf");

						}
						
					}else if (
							
							CallersCallers.AtLeast1N(methodtrace.Requirement, methodtraces2HashMap)
						&&	Callers.AtLeast1N(methodtrace.Requirement, methodtraces2HashMap)

					)

					{
						
						if(!CallersCallers.AllTs(methodtrace.Requirement, methodtraces2HashMap)
						&& !CallersCallers.AllEs(methodtrace.Requirement, methodtraces2HashMap)
						&& !Callers.AllTs(methodtrace.Requirement, methodtraces2HashMap)
						&& !Callers.AllEs(methodtrace.Requirement, methodtraces2HashMap)
						) {
							
							methodtrace.SetPrediction(LogInfoHashMap,"N", "N,PureLeaf");
						
					}
						else if(CallersCallers.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap) 
						&& Callers.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap) ) {
									
							methodtrace.SetPrediction(LogInfoHashMap,"E", "E,IncompleteLeaf");
								
						}
						
						else {
						methodtrace.SetPrediction(LogInfoHashMap,"N", "N,MixedLeaf");

					}
					
				}else if(CallersCallers.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap) 
						
						|| Callers.AtLeast1E(methodtrace.Requirement, methodtraces2HashMap) 
						) {
					methodtrace.SetPrediction(LogInfoHashMap,"E", "E,IncompleteLeaf");

				}else {
					methodtrace.SetPrediction(LogInfoHashMap,"E", "E,BoundaryLeaf");

				}
					}
		}
		
		
		for (MethodTrace methodtrace : MethodTracesList) {
			System.out.println(methodtrace.Requirement.ID+"-"+methodtrace.Method.ID);
			System.out.println(methodtrace.getGold());
			System.out.println(methodtrace.getPrediction());
			if(!methodtrace.getPrediction().equals(methodtrace.goldfinal)) {
				
				if(methodtrace.getPrediction().equals("T") && methodtrace.getGold().equals("N")) {
					System.out.println("False positive");
				}else if(methodtrace.getPrediction().equals("N") && methodtrace.getGold().equals("T")) {
					System.out.println("False Negative");
				}
			}
		}
		System.out.println(counter);
//		SetSubjectGoldDeveloperGoldEqualityFlag(methodtraces2HashMap, TotalPattern, LogInfoHashMap, ProgramName); 
			

			LogInfo.ComputePrecisionAndRecallNONCUMULATIVE(methodtraces2HashMap,TotalPattern, ProgramName, OwnerClassPredictionValues, LogInfoHashMap);

			LogInfo.updateResultsLog(TotalPattern, OwnerClassPredictionValues, ProgramName, "OWNER CLASS PRED", "owner class prediction values", "INDIVIDUAL");
		
		
		

		int ITERATION = 0;
	//	MethodTracesHashmapValues=methodtraces2HashMap.values(); 

		ComputeStepResults2(Step2PatternCumulative, OwnerClassPredictionValues, LogInfoHashMap, ProgramName, "Step 1 Cumulative", "Step 1 Prediction Values Cumulative", zeroPred); 


		
//		ComputeStepResults(Step4Pattern, Step4PredictionValues, LogInfoHashMap, ProgramName, "Step 4", "Step 4 Prediction Values", Step3PredictionValues); 
//
//				
//		ComputeStepResults2(Step4PatternCumulative, Step4PredictionValues, LogInfoHashMap, ProgramName, "Step 4 Cumulative", "Step 4 Prediction Values Cumulative", zeroPred); 
			
		LogInfo.CheckCallersCalleesSymmetry(); 
				
				int counter2=0; 
				
				for (MethodTrace methodtrace : MethodTracesHashmapValues) {
					
						methodtrace.UpdateCallersCallees(LogInfoHashMap);
						counter2++; 
						System.out.println("COUNTER2  "+counter2);
				}	
	
				
					
					
	
					
					
		System.out.println(ITERATION);
		System.out.println("FINISJED");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	

		if(ProgramName.equals("chess")) {
			bwfile2.close(); 
			bwfile1.close(); 
			bwfile3.close();
		}
	
		
		
		
		LogInfo.WriteMethodCalls(ProgramName);
		System.out.println("RemainingpredictionValues"+RemainingpredictionValues);
		System.out.println("OWNERRRRRRRRRR");
//		ComputeStepResults(RemainingPattern, RemainingpredictionValues, LogInfoHashMap, ProgramName, "Steps 1+2+3+4", "Steps 1+2+3+4 prediction values"); 
		
//		LogInfo.ComputePrecisionAndRecall(methodtraces2HashMap, RemainingPattern, ProgramName, RemainingpredictionValues, LogInfoHashMap);
//		System.out.println("RemainingpredictionValues"+TotalPattern);
//		LogInfo.updateResultsLog(RemainingPattern, RemainingpredictionValues, ProgramName, "NON OWNER CLASS PRED", "non owner class prediction values");



		 TotalPredictionValues = new PredictionValues(); 
		 TotalPattern = new PredictionEvaluation();
		 RemainingpredictionValues = new PredictionValues(); 
		
		 System.out.println("YES");
		

		 LogInfo.updateInheritanceLogs(ProgramName, MethodTracesHashmapValues, LogInfoHashMap); 
		ResetAllTraceSetFlags(methodtraces2HashMap);
		 System.out.println("YES2");
			ComputeStepResults(TotalPattern, TotalPredictionValues, LogInfoHashMap, ProgramName, "TOTAL  PREDICTION", "total prediction values", zeroPred); 

		 

		 
		 
	 LogInfo.updateTableLog(ProgramName, MethodTracesHashmapValues, LogInfoHashMap);

		 System.out.println("YES6");
		 LogInfo.closeLogFile(); 
		
		

		
		LogInfo.CloseFiles(ProgramName); 
		
		
	}
	
	
	

	private void ComputeStepResults(PredictionEvaluation step2Pattern2, PredictionValues step2PredictionValues, LinkedHashMap<String, LogInfo> LogInfoHashMap, String ProgramName, String Step, String PredictionValues, PredictionValues step1PredictionValues) throws IOException, SQLException {
		// TODO Auto-generated method stub
		LogInfo.ComputePrecisionAndRecallNONCUMULATIVE(methodtraces2HashMap, step2Pattern2, ProgramName, step2PredictionValues, LogInfoHashMap);
		System.out.println("RemainingpredictionValues"+TotalPattern);
		
		PredictionValues SubstractedPredictionValues = new PredictionValues(); 
		 SubstractedPredictionValues = SubstractPredictionValues(step2PredictionValues, step1PredictionValues); 

		LogInfo.updateResultsLog(step2Pattern2, SubstractedPredictionValues, ProgramName, Step, PredictionValues, "INDIVIDUAL");
	}
	
	
	private void ComputeStepResults2(PredictionEvaluation step2Pattern2, PredictionValues step2PredictionValues, LinkedHashMap<String, LogInfo> LogInfoHashMap, String ProgramName, String Step, String PredictionValues, PredictionValues step1PredictionValues) throws IOException, SQLException {
		// TODO Auto-generated method stub
		LogInfo.ComputePrecisionAndRecallCUMULATIVE(methodtraces2HashMap, step2Pattern2, ProgramName, step2PredictionValues, LogInfoHashMap);
		System.out.println("RemainingpredictionValues"+TotalPattern);
		
//		PredictionValues SubstractedPredictionValues = SubstractPredictionValues(step2PredictionValues, step1PredictionValues); 


		LogInfo.updateResultsLog(step2Pattern2, step2PredictionValues, ProgramName, Step, PredictionValues, "CUMULATIVE");
	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	public void SetLogFileIterations(Collection<MethodTrace> methodTracesHashmapValues, List<MethodTrace> methodtraces22, LinkedHashMap<String, LogInfo> LogInfoHashMap, int ITERATION ) {
		// TODO Auto-generated method stub
		for (MethodTrace methodtrace : methodTracesHashmapValues) {
			String ReqMethod = methodtrace.Requirement.ID + "-" + methodtrace.Method.ID;
			LogInfo LogInfo = LogInfoHashMap.get(ReqMethod);
			List<String> myits = LogInfo.getIterationValues();
			

			if (myits.size() == ITERATION + 1) {
				//System.out.println(myits.get(ITERATION));

			} else {
				myits.add(",");
				LogInfo.setIterationValues(myits);
			}

			for (String it : myits) {
				//System.out.println("it" + it + " it");
			}
			LogInfoHashMap.put(ReqMethod, LogInfo);
		}
	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	public PredictionValues SubstractPredictionValues(PredictionValues totalPredictionValues,
			PredictionValues ownerClassPredictionValues) {
			
		int totalT = totalPredictionValues.T; 
		int totalN=totalPredictionValues.N; 
		int totalE=totalPredictionValues.E;
		
		int ownerT=ownerClassPredictionValues.T; 
		int ownerN=ownerClassPredictionValues.N; 
		int ownerE=ownerClassPredictionValues.E; 

		
		int remainingT= totalT-ownerT; 
		int remainingN= totalN-ownerN;
		int remainingE= ownerT+ownerN+ownerE-remainingT-remainingN;
		PredictionValues RemainingPredictionValues= new PredictionValues(); 
		RemainingPredictionValues.setT(remainingT);
		RemainingPredictionValues.setN(remainingN);
		RemainingPredictionValues.setE(remainingE);
				return RemainingPredictionValues;
		// TODO Auto-generated method stub
		
	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	public void ResetAllTraceSetFlags(HashMap<String, MethodTrace> methodtraces2HashMap2) {
		// TODO Auto-generated method stub
		
		for(String key: methodtraces2HashMap2.keySet()) {
			MethodTrace MethodTrace = methodtraces2HashMap2.get(key); 
			MethodTrace.setTraceSet(false);
		}
		
	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	
	/************************************************************************************************************************************************/
	/**
	 * @param methodtraces2HashMap2 **********************************************************************************************************************************************/
	public void CountTracesClassesValues(PredictionValues PredictionClassTraceBefore,  HashMap<String, MethodTrace> methodtraces2HashMap2) {
		// TODO Auto-generated method stub
		HashMap<String, String> myhashmap= new HashMap<String, String> (); 
		
		for(String mykey: methodtraces2HashMap2.keySet()) {
			String reqClass= methodtraces2HashMap2.get(mykey).Requirement.ID+"-"+methodtraces2HashMap2.get(mykey).Method.Owner.ID; 
//			myhashmap.put(reqClass, methodtraces2HashMap2.get(mykey).Method.Owner.DeveloperGold);
			myhashmap.put(reqClass, DatabaseInput.OwnerTraceHashMap.get(reqClass));
		
		}
		
		
		
		
			for(String mykey: myhashmap.keySet()) {
				 String value = myhashmap.get(mykey); 
				
				PredictionClassTraceBefore.ComputePredictionValues(PredictionClassTraceBefore,value);
			}
		
		
		
		
	}
	
	
	

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	private LinkedHashMap<String, LogInfo> InitializeInputHashMapErrorSeeding(
			List<MethodTrace> methodTracesHashmapValues, LinkedHashMap<String, LogInfo> logHashMapRemaining) {
		// TODO Auto-generated method stub
		int ErrorSeedingPercentage=(int)(Math.random() * 100 + 1);
		int AmountofSeededErrors= ErrorSeedingPercentage*methodTracesHashmapValues.size()/100; 
		int i=0; 
		while(i<AmountofSeededErrors) {
			int random = (int)(Math.random() * methodTracesHashmapValues.size());
			if(methodTracesHashmapValues.get(random).getGold().equals("T")) {
				methodTracesHashmapValues.get(random).setPrediction("N");
			}else if(methodTracesHashmapValues.get(random).getGold().equals("N")) {
				methodTracesHashmapValues.get(random).setPrediction("T");
			}
			i++; 
		}
		
		for (MethodTrace methodtrace : methodTracesHashmapValues) {
			
			if(methodtrace.getPrediction().equals("E")) {
				methodtrace.setPrediction(methodtrace.getGold());

			}
			
		}
	
		return logHashMapRemaining;
	}

	
	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	private LinkedHashMap<String, LogInfo> InitializeInputHashMapIncompleteness(
			List<MethodTrace> methodTracesHashmapValues, LinkedHashMap<String, LogInfo> logHashMapRemaining) {
		// TODO Auto-generated method stub
		for (MethodTrace methodtrace : methodTracesHashmapValues) {
				methodtrace.setPrediction(methodtrace.getGold());
		}
		
		
		int IncompletenessSeedingPercentage=(int)(Math.random() * 100 + 1);
		int AmountofSeededIncompleteness= IncompletenessSeedingPercentage*methodTracesHashmapValues.size()/100; 
		int i=0; 
		while(i<AmountofSeededIncompleteness) {
			int random = (int)(Math.random() * methodTracesHashmapValues.size());	
			methodTracesHashmapValues.get(random).setPrediction("E");
			i++; 
		}
		
		
	
		return logHashMapRemaining;
	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	private LinkedHashMap<String, LogInfo> InitializeInputHashMapNoSeeding(
			List<MethodTrace> methodTracesHashmapValues, LinkedHashMap<String, LogInfo> logHashMapRemaining) {
		// TODO Auto-generated method stub
		
		
		for (MethodTrace methodtrace : methodTracesHashmapValues) {
			
				methodtrace.setPrediction(methodtrace.getGold());

			
			
		}
	
		return logHashMapRemaining;
	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	/**
	 * @param methodtracesRequirementClass2 
	 * @return
	 * @throws Exception 
	 **********************************************************************************************************************************************/

	private void GenerateNewValuesInTracesClasses(
			LinkedHashMap<String, ClassTrace2> methodtracesRequirementClass2) throws Exception {
		// TODO Auto-generated method stub
		
		Collection<MethodTrace> MethodTracesHashmapValues = methodtraces2HashMap.values();

		for (MethodTrace methodtrace : MethodTracesHashmapValues) {


			// PATTERN 0
			
			MethodList children = methodtrace.Method.Children; 
			MethodList parents = methodtrace.Method.Superclasses; 
			MethodList implementations = methodtrace.Method.Implementations; 
			MethodList interfaces = methodtrace.Method.Interfaces; 
			ClassTraceList ChilrenGold= new ClassTraceList(); 
			ClassTraceList ParentsGold= new ClassTraceList(); 
			ClassTraceList ImplementationsGold= new ClassTraceList(); 
			ClassTraceList InterfacesGold= new ClassTraceList(); 
			for(Method child:children) {
				String ChildGold = child.Owner.DeveloperGold; 
				ChilrenGold.add(ChildGold); 
			}
			
			
			for(Method parent:parents) {
				String ParentGold = parent.Owner.DeveloperGold; 
				ParentsGold.add(ParentGold); 
			}
			for(Method myinterface:interfaces) {
				String InterfaceGold = myinterface.Owner.DeveloperGold; 
				InterfacesGold.add(InterfaceGold); 

			}
			for(Method implementation:implementations) {
				String ImplementationGold = implementation.Owner.DeveloperGold; 
				ImplementationsGold.add(ImplementationGold); 
			}
			
			
			
			if(methodtrace.Method.Owner.DeveloperGold.equals("E") ) {
				if(ImplementationsGold.AllTs()) {
					methodtrace.Method.Owner.DeveloperGold="T";
				}else if(InterfacesGold.AllTs()) {
					methodtrace.Method.Owner.DeveloperGold="T";

				}else if(ParentsGold.AllTs()) {
					methodtrace.Method.Owner.DeveloperGold="T";

				}else if(ChilrenGold.AllTs()) {
					methodtrace.Method.Owner.DeveloperGold="T";

				}
				
				
				 if(ImplementationsGold.AllNs()) {
					methodtrace.Method.Owner.DeveloperGold="N";
				}else if(InterfacesGold.AllNs()) {
					methodtrace.Method.Owner.DeveloperGold="N";

				}else if(ParentsGold.AllNs()) {
					methodtrace.Method.Owner.DeveloperGold="N";

				}else if(ChilrenGold.AllNs()) {
					methodtrace.Method.Owner.DeveloperGold="N";

				}
			}
			
		}
	}
	
	
	
	
	
	
	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	/**
	 * @param logInfoHashMap 
	 * @param programName **********************************************************************************************************************************************/
	public void SetSubjectGoldDeveloperGoldEqualityFlag(HashMap<String, MethodTrace> methodTraceHashMap,
			PredictionEvaluation nEWPATTERNMethodFields2, LinkedHashMap<String, LogInfo> logInfoHashMap, String programName) {
		for (String mykey : methodTraceHashMap.keySet()) {
			
			 LogInfo loginfo = logInfoHashMap.get(mykey);
			MethodTrace methodtraceValue = methodTraceHashMap.get(mykey); 
			if( programName.equals("gantt")||programName.equals("jhotdraw") ) {
				String reqClass= methodtraceValue.Requirement.ID+"-"+methodtraceValue.Method.Owner.ID; 

//				if (methodtraceValue.Method.Owner.DeveloperGold.equals(methodtraceValue.Method.Owner.SubjectGold) ) 
					if (DatabaseInput.OwnerTraceHashMap.get(reqClass).equals(DatabaseInput.SubjectTraceHashMap.get(reqClass)) )

				{
					loginfo.setSubjectDeveloperEqualityFlag(true);
					logInfoHashMap.put(mykey, loginfo); 
					
					
					System.out.println(mykey);
					MethodTrace methodtrace = methodTraceHashMap.get(mykey); 
					methodtrace.setSubjectDeveloperEqualityFlag(true);
					methodTraceHashMap.put(mykey, methodtrace); 
				}
			}
			

		}
		
	}
	
	
	
	
	
	

	
	
	

	


	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	/**
	 * @throws Exception **********************************************************************************************************************************************/
	public static void main(String[] args) throws Exception {
		
		for(int i=0; i<1; i++) {
			System.out.println("========================> RUN "+i);
			String ProgramName = "chess";
			AlgoFinal frame = new AlgoFinal(
					ProgramName);

			String ProgramName2 = "gantt";
				 frame = new AlgoFinal(ProgramName2);
////			
//////			String ProgramName2 = "dummy";
//////			AlgoFinal	 frame = new AlgoFinal(ProgramName2);
	////
			String ProgramName3 = "itrust";
				 frame = new AlgoFinal(ProgramName3);

				 //ooo
				 
			String ProgramName4 = "jhotdraw";
				frame = new AlgoFinal(ProgramName4);
				
			}
		}
		
		
		
		



}