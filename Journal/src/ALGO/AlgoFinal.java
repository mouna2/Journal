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
import java.util.Map;
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
import javafx.util.Pair;
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

	public static boolean ExecutedCallsTechnique=false; 
	public static boolean BasicTechnique=false; 
	public static boolean XCallsTechnique=true; 

	public static boolean ClassLevelTraces=true; 
	public static boolean MethodLevelTraces=false; 

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
	public static LinkedHashMap<String, MethodTrace> methodtraces2HashMap = new LinkedHashMap<String, MethodTrace>();
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
		BufferedWriter bwfile1itrust =null; 
		if(ProgramName.equals("chess")) {
			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\InterfacesNewRule.txt");
			FileOutputStream fosfila1 = new FileOutputStream(file1log);
			bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));

			File file2log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\LogFileUnderstandFP.txt");
			FileOutputStream fosfila2 = new FileOutputStream(file2log);
			bwfile2 = new BufferedWriter(new OutputStreamWriter(fosfila2));

			File file3log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\LogFileUnderstandFN.txt");
			FileOutputStream fosfila3 = new FileOutputStream(file3log);
			bwfile3 = new BufferedWriter(new OutputStreamWriter(fosfila3));
		}
		// TODO Auto-generated method stub
		LogInfo.CreateLogFiles(ProgramName);


		if(ProgramName.equals("itrust")) {
			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\iTrustMethodCallsComparison.txt");
			FileOutputStream fosfila1 = new FileOutputStream(file1log);
			bwfile1itrust = new BufferedWriter(new OutputStreamWriter(fosfila1));
		}



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
		PredictionValues CountPredictionValues = new PredictionValues(); 

		CountTracesClassesValues(PredictionClassTraceBefore, methodtraces2HashMap);
		LogInfo.InitializeLogInfoHashMap(LogInfoHashMap,MethodTracesHashmapValues, methodtraces2HashMap ); 

		LogInfo.bwTraceClass.write("BEFORE PATTERN 0 "+PredictionClassTraceBefore.toString());
		LogInfo.bwTraceClass.newLine();

		//		ResetAllTraceSetFlags(methodtraces2HashMap);



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
//			LogInfoHashMap=InitializeInputHashMapErrorSeeding(MethodTracesList, LogInfoHashMap);

		}
		else if(AlgoFinal.IncompletenessSeeding==true) {
//			LogInfoHashMap=InitializeInputHashMapIncompleteness(MethodTracesList, LogInfoHashMap);

		}else if(AlgoFinal.NoSeeding==true) {
			LogInfoHashMap=InitializeInputHashMapNoSeeding(MethodTracesList, LogInfoHashMap); 

		}


		//TRACE MATRIX 
		
		
		
//		System.out.println("yes");
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//STEP 1
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////
//		int iteration=1; 
//		MethodTrace.modified = true;
//
//		while (MethodTrace.modified ) {
//			System.out.println("iteration "+iteration);
//			MethodTrace.modified = false;
			TraceValidator.MakePredictions(MethodTracesList, LogInfoHashMap); 
//
//			iteration++; 
//		}	
			for(MethodTrace methodtrace: MethodTracesList) {
			String reqMethod= methodtrace.Requirement.ID+"-"+methodtrace.Method.ID; 
				methodtrace.UpdateCallersCallees(LogInfoHashMap, reqMethod);			

			

		}


		
		LogInfo.ComputePrecisionAndRecallNONCUMULATIVE(methodtraces2HashMap,TotalPattern, ProgramName, CountPredictionValues, LogInfoHashMap);

		LogInfo.updateResultsLog(TotalPattern, CountPredictionValues, ProgramName, "OWNER CLASS PRED", "owner class prediction values", "INDIVIDUAL");



		int ITERATION = 0;
		

		LogInfo.CheckCallersCalleesSymmetry(); 

		int counter2=0; 

		


	
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
		System.out.println("YES2");
		//			ComputeStepResults(TotalPattern, TotalPredictionValues, LogInfoHashMap, ProgramName, "TOTAL  PREDICTION", "total prediction values", zeroPred); 





		LogInfo.updateTableLog(ProgramName, MethodTracesHashmapValues, LogInfoHashMap);

		System.out.println("YES6");
		LogInfo.closeLogFile(); 




		LogInfo.CloseFiles(ProgramName); 
		System.out.println();

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
//	public void ResetAllTraceSetFlags(HashMap<String, MethodTrace> methodtraces2HashMap2) {
//		// TODO Auto-generated method stub
//
//		for(String key: methodtraces2HashMap2.keySet()) {
//			MethodTrace MethodTrace = methodtraces2HashMap2.get(key); 
//			MethodTrace.setTraceSet(false);
//		}
//
//	}

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


//
//
//	/************************************************************************************************************************************************/
//	/************************************************************************************************************************************************/
//	private LinkedHashMap<String, LogInfo> InitializeInputHashMapErrorSeeding(
//			List<MethodTrace> methodTracesHashmapValues, LinkedHashMap<String, LogInfo> LogInfoHashMap) {
//		// TODO Auto-generated method stub
//		int ErrorSeedingPercentage=(int)(Math.random() * 100 + 1);
//		int AmountofSeededErrors= ErrorSeedingPercentage*methodTracesHashmapValues.size()/100; 
//		int i=0; 
//		while(i<AmountofSeededErrors) {
//			int random = (int)(Math.random() * methodTracesHashmapValues.size());
//			if(methodTracesHashmapValues.get(random).getGold().equals("T")) {
//				methodTracesHashmapValues.get(random).setPrediction("N");
//				LogInfoHashMap.get(methodTracesHashmapValues.get(random).Requirement.ID+"-"+methodTracesHashmapValues.get(random).Method.ID).setPrediction("N");
//			}else if(methodTracesHashmapValues.get(random).getGold().equals("N")) {
//				methodTracesHashmapValues.get(random).setPrediction("T");
//				LogInfoHashMap.get(methodTracesHashmapValues.get(random).Requirement.ID+"-"+methodTracesHashmapValues.get(random).Method.ID).setPrediction("T");
//
//
//			}
//			i++; 
//		}
//
//		for (MethodTrace methodtrace : methodTracesHashmapValues) {
//
//			if(methodtrace.getPrediction().equals("E")) {
//				methodtrace.setPrediction(methodtrace.getGold());
//
//				LogInfoHashMap.get(methodtrace.Requirement.ID+"-"+methodtrace.Method.ID).setPrediction("E");
//
//
//			}
//
//		}
//
//		return LogInfoHashMap;
//	}
//
//
//	/************************************************************************************************************************************************/
//	/************************************************************************************************************************************************/
//	private LinkedHashMap<String, LogInfo> InitializeInputHashMapIncompleteness(
//			List<MethodTrace> methodTracesHashmapValues, LinkedHashMap<String, LogInfo> LogInfoHashMap) {
//		// TODO Auto-generated method stub
//		for (MethodTrace methodtrace : methodTracesHashmapValues) {
//
//			methodtrace.setPrediction(methodtrace.getGold());
//			LogInfoHashMap.get(methodtrace.Requirement.ID+"-"+methodtrace.Method.ID).setPrediction(methodtrace.getGold());
//		}
//
//
//		int IncompletenessSeedingPercentage=(int)(Math.random() * 100 + 1);
//		int AmountofSeededIncompleteness= IncompletenessSeedingPercentage*methodTracesHashmapValues.size()/100; 
//		int i=0; 
//		while(i<AmountofSeededIncompleteness) {
//			int random = (int)(Math.random() * methodTracesHashmapValues.size());	
//			methodtrace.setPrediction(Prediction.EInitializedPrediction);
//			LogInfoHashMap.get(methodTracesHashmapValues.get(random).Requirement.ID+"-"+methodTracesHashmapValues.get(random).Method.ID).setPrediction("E");
//			i++; 
//		}
//
//
//
//		return LogInfoHashMap;
//	}

	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	private LinkedHashMap<String, LogInfo> InitializeInputHashMapNoSeeding(
			List<MethodTrace> methodTracesHashmapValues, LinkedHashMap<String, LogInfo> LogInfoHashMap) {
		// TODO Auto-generated method stub


		for (MethodTrace methodtrace : methodTracesHashmapValues) {
			if(AlgoFinal.ClassLevelTraces) {
				methodtrace.setInput(methodtrace.getClassLevelGold());

			}else if(AlgoFinal.MethodLevelTraces){
				methodtrace.setInput(methodtrace.getGold());

			}
			methodtrace.setPrediction(Prediction.EInitializedPrediction);
			LogInfoHashMap.get(methodtrace.Requirement.ID+"-"+methodtrace.Method.ID).setPrediction("E");


		}

		return LogInfoHashMap;
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


//					System.out.println(mykey);
					MethodTrace methodtrace = methodTraceHashMap.get(mykey); 
					methodtrace.setSubjectDeveloperEqualityFlag(true);
					methodTraceHashMap.put(mykey, methodtrace); 
				}
			}


		}

	}




	public ArrayList<Method> intersection( MethodList callersShell, MethodList callersExecuted) {   
		ArrayList<Method> result = new ArrayList<Method>(callersShell);

		result.retainAll(callersExecuted);

		return result;
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
//			
//						String ProgramName2 = "gantt";
//						AlgoFinal frame = new AlgoFinal(ProgramName2);
			////			
			////////			String ProgramName2 = "dummy";
			////////			AlgoFinal	 frame = new AlgoFinal(ProgramName2);
			//////	//
//						String ProgramName3 = "itrust";
//						AlgoFinal	 frame = new AlgoFinal(ProgramName3);
//			
//							 //ooo
//							 
//						String ProgramName4 = "jhotdraw";
//						AlgoFinal	frame = new AlgoFinal(ProgramName4);

		}
	}







}