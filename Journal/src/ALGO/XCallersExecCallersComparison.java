package ALGO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.JTable;

import Chess.LogInfo;
import Chess.PredictionEvaluation;
import mypackage.ClassTrace2;
import mypackage.Method;
import mypackage.MethodTrace;

public class XCallersExecCallersComparison {
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
	
	public static boolean AchrafTechnique=false; 
	public static boolean MounaTechnique=true; 
	public static boolean BasicTechnique=false; 

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

	public XCallersExecCallersComparison(String ProgramName) throws Exception {

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
		
		BufferedWriter bwfile1chessCalleesExecCallees =null; 

		BufferedWriter bwfile1itrustXCalleesExecCallees =null; 
		BufferedWriter bwfile1itrustCalleesExecCallees =null; 

		BufferedWriter bwfile1ganttCalleesExecCallees =null; 
		
		
		BufferedWriter bwfile1jhotdrawCalleesExecCallees =null; 
		
		
		
		
		BufferedWriter bwfile1chessXCalleesExecCallees =null; 
		
		BufferedWriter bwfile1ganttXCalleesExecCallees =null; 

		
		BufferedWriter bwfile1jhotdrawXCalleesExecCallees =null; 
		
		
		
		BufferedWriter bwfile1itrustCallersEecCallers =null; 
		
		
		BufferedWriter bwfile1chessCallersEecCallers =null; 
	
		
		BufferedWriter bwfile1ganttCallersEecCallers =null; 
		
		
		BufferedWriter bwfile1jhotdrawCallersEecCallers =null; 
		
		if(ProgramName.equals("gantt")) {
			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\GanttMethodCallsComparisonXCallersExecutedCallers.txt");
			FileOutputStream fosfila1 = new FileOutputStream(file1log);
			bwfile1ganttXCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila1));
			

				
				
				
				
				
				File file4log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\GanttMethodCallsComparisonCallersExecutedCallers.txt");
				FileOutputStream fosfila4 = new FileOutputStream(file4log);
				bwfile1ganttCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila4));
			
		}
		if(ProgramName.equals("jhotdraw")) {
			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\JHotDrawMethodCallsComparisonXCallersExecutedCallers.txt");
			FileOutputStream fosfila1 = new FileOutputStream(file1log);
			bwfile1jhotdrawXCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila1));
			

		
		
				File file4log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\JHotDrawMethodCallsComparisonCallersExecutedCallers.txt");
				FileOutputStream fosfila4 = new FileOutputStream(file4log);
				bwfile1jhotdrawCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila4));
			
		
		
		
		}	
	if(ProgramName.equals("chess")) {
		File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ChessMethodCallsComparisonXCallersExecutedCallers.txt");
		FileOutputStream fosfila1 = new FileOutputStream(file1log);
		bwfile1chessXCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila1));
		
	


			
			File file4log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ChessMethodCallsComparisonCallersExecutedCallers.txt");
			FileOutputStream fosfila4 = new FileOutputStream(file4log);
			bwfile1chessCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila4));
			
			
	
	
	
	
	}
		// TODO Auto-generated method stub
		LogInfo.CreateLogFiles(ProgramName);

		
		if(ProgramName.equals("itrust")) {
			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\iTrustMethodCallsComparisonXCallersExecutedCallers.txt");
			FileOutputStream fosfila1 = new FileOutputStream(file1log);
			 bwfile1itrustXCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila1));
			 
		
				 
				 
				 
				 File file4log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\iTrustMethodCallsComparisonCallersExecutedCallers.txt");
					FileOutputStream fosfila4 = new FileOutputStream(file4log);
					bwfile1itrustCalleesExecCallees = new BufferedWriter(new OutputStreamWriter(fosfila4));
					
				
				 
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
		 PredictionValues OwnerClassPredictionValues = new PredictionValues(); 

		

		LogInfo.bwTraceClass.write("AFTER PATTERN 0 "+PredictionClassTraceAfter.toString());
		LogInfo.bwTraceClass.close();
	
		LogInfoHashMap=LogInfo.InitializeLogInfoHashMapTraceClassNewValue(LogInfoHashMap,MethodTracesHashmapValues, methodtraces2HashMap ); 

	
		MethodTracesHashmapValues = methodtraces2HashMap.values();
		List<MethodTrace> MethodTracesList = new ArrayList<MethodTrace>(MethodTracesHashmapValues); 
		
		
		
		if(ProgramName.equals("chess")) {
			bwfile1chessXCalleesExecCallees.write("METHOD ID/EQUALITY/ XCALLEES/ EXECUTED CALLEES/ ");
			

			bwfile1chessXCalleesExecCallees.newLine();
			
			
			bwfile1chessCalleesExecCallees.write("METHOD ID/EQUALITY/ CALLEES/ EXECUTED CALLEES/ ");
			

			bwfile1chessCalleesExecCallees.newLine();
			
			
			int count=0; 
			for (  Method method : DatabaseInput.MethodHashMap.values()) {
				System.out.println();
				bwfile1chessXCalleesExecCallees.write(method.ID+"/"); 
				bwfile1chessCalleesExecCallees.write(method.ID+"/"); 

				MethodList CallersShell = method.getCallersShell(); 
				MethodList CallersCallersShell =method.getCallersCallersShell(); 
				MethodList CalleesShell =method.getCalleesShell(); 
				MethodList CallersExecuted =method.getCallersExecuted(); 
				MethodList CalleesExecuted =method.getCalleesExecuted();
				MethodList CallersCallersExecuted =method.getCallersCallersExecuted(); 
				MethodList CALLEES =method.Callees;
				MethodList Callees =method.Callees; 
				MethodList CallersofCallers =method.CallersofCallers; 
				Collections.sort(CallersShell); 
				Collections.sort(CallersExecuted); 
				Collections.sort(CalleesShell); 
				Collections.sort(CalleesExecuted); 
				Collections.sort(CallersCallersShell); 
				Collections.sort(CallersCallersExecuted); 
				Collections.sort(CALLEES); 
				Collections.sort(Callees); 
				Collections.sort(CallersofCallers); 

				if(CalleesExecuted.equals(CalleesShell) && !CalleesExecuted.isEmpty() && !CalleesShell.isEmpty()) {
					bwfile1chessXCalleesExecCallees.write("SAME/"+CalleesShell+"/"+"/");
				}else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesShell.containsAll(CalleesExecuted)){
					bwfile1chessXCalleesExecCallees.write("XCalleeS IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1chessXCalleesExecCallees.write("XCalleeS NOT EMPTY AND EXCUTED CalleeS  EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1chessXCalleesExecCallees.write("BOTH EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}
				else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(CalleesShell)){
					bwfile1chessXCalleesExecCallees.write("CalleeS EXECUTED IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(CalleesShell, CalleesExecuted).isEmpty()) {
					bwfile1chessXCalleesExecCallees.write("INTERSECTION OF XCalleeS AND EXECUTED CalleeS/"+CalleesShell+"/"+CalleesExecuted+"/");
				}
				else if(!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(CalleesShell, CalleesExecuted).isEmpty()){
					bwfile1chessXCalleesExecCallees.write("EXECUTED CalleeS NOT EQUAL TO XCalleeS WITH EMPTY INTERSECTION /"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(CalleesShell.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1chessXCalleesExecCallees.write("XCALLEES EMPTY AND EXCUTED CalleeS  NOT EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}

				bwfile1chessXCalleesExecCallees.newLine();
				
				/*************************************************************************************************************************/
				if(CalleesExecuted.equals(Callees) && !CalleesExecuted.isEmpty() && !Callees.isEmpty()) {
					bwfile1chessCalleesExecCallees.write("SAME/"+Callees+"/"+"/");
				}else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& Callees.containsAll(CalleesExecuted)){
					bwfile1chessCalleesExecCallees.write("CALLEES IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1chessCalleesExecCallees.write("CALLEES NOT EMPTY AND ECUTED CalleeS  EMPTY/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1chessCalleesExecCallees.write("BOTH EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}
				else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(Callees)){
					bwfile1chessCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(Callees, CalleesExecuted).isEmpty()) {
					bwfile1chessCalleesExecCallees.write("INTERSECTION OF CALLEES AND EXECUTED CalleeS/"+Callees+"/"+CalleesExecuted+"/");
				}
				else if(!Callees.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(Callees, CalleesExecuted).isEmpty()){
					bwfile1chessCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO CalleeS WITH EMPTY INTERSECTION /"+Callees+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(Callees.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1chessCalleesExecCallees.write("CALLEES EMPTY AND ECUTED CalleeS  NOT EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}

				bwfile1chessCalleesExecCallees.newLine();
				
				
				count++; 
			}
			bwfile1chessXCalleesExecCallees.close();
		
		}

		if(ProgramName.equals("gantt")) {
			bwfile1ganttXCalleesExecCallees.write("METHOD ID/EQUALITY/ XCALLEES/ EXECUTED CALLEES/ ");
			

			bwfile1ganttXCalleesExecCallees.newLine();
		
			
			
			
			bwfile1ganttCalleesExecCallees.write("METHOD ID/EQUALITY/ CALLEES/ EXECUTED CALLEES/ ");
		

			bwfile1ganttCalleesExecCallees.newLine();
		
			int count=0; 
			for (  Method method : DatabaseInput.MethodHashMap.values()) {
				System.out.println();
				bwfile1ganttXCalleesExecCallees.write(method.ID+"/"); 
				
				MethodList CallersShell = method.getCallersShell(); 
				MethodList CallersCallersShell =method.getCallersCallersShell(); 
				MethodList CalleesShell =method.getCalleesShell(); 
				MethodList CallersExecuted =method.getCallersExecuted(); 
				MethodList CalleesExecuted =method.getCalleesExecuted();
				MethodList CallersCallersExecuted =method.getCallersCallersExecuted(); 
				MethodList CALLEES =method.Callees;
				MethodList Callees =method.Callees; 
				MethodList CallersofCallers =method.CallersofCallers; 
				Collections.sort(CallersShell); 
				Collections.sort(CallersExecuted); 
				Collections.sort(CalleesShell); 
				Collections.sort(CalleesExecuted); 
				Collections.sort(CallersCallersShell); 
				Collections.sort(CallersCallersExecuted); 
				Collections.sort(CALLEES); 
				Collections.sort(Callees); 
				Collections.sort(CallersofCallers); 

				if(CalleesExecuted.equals(CalleesShell) && !CalleesExecuted.isEmpty() && !CalleesShell.isEmpty()) {
					bwfile1ganttXCalleesExecCallees.write("SAME/"+CalleesShell+"/"+"/");
				}else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesShell.containsAll(CalleesExecuted)){
					bwfile1ganttXCalleesExecCallees.write("XCALLEES IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1ganttXCalleesExecCallees.write("XCALLEES NOT EMPTY AND EXCUTED CALLEES  EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1ganttXCalleesExecCallees.write("BOTH EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}
				else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(CalleesShell)){
					bwfile1ganttXCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(CalleesShell, CalleesExecuted).isEmpty()) {
					bwfile1ganttXCalleesExecCallees.write("INTERSECTION OF XCALLEES AND EXECUTED CALLEES/"+CalleesShell+"/"+CalleesExecuted+"/");
				}
				else if(!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(CalleesShell, CalleesExecuted).isEmpty()){
					bwfile1ganttXCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO XCALLEES WITH EMPTY INTERSECTION /"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(CalleesShell.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1ganttXCalleesExecCallees.write("XCALLEES EMPTY AND EXCUTED CALLEES  NOT EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}

				bwfile1ganttXCalleesExecCallees.newLine();
				count++; 
				
				
				/*************************************************************************************************************************/
				if(CalleesExecuted.equals(Callees) && !CalleesExecuted.isEmpty() && !Callees.isEmpty()) {
					bwfile1ganttCalleesExecCallees.write("SAME/"+Callees+"/"+"/");
				}else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& Callees.containsAll(CalleesExecuted)){
					bwfile1ganttCalleesExecCallees.write("CALLEES IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1ganttCalleesExecCallees.write("CALLEES NOT EMPTY AND ECUTED CALLEES  EMPTY/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1ganttCalleesExecCallees.write("BOTH EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}
				else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(Callees)){
					bwfile1ganttCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(Callees, CalleesExecuted).isEmpty()) {
					bwfile1ganttCalleesExecCallees.write("INTERSECTION OF CALLEES AND EXECUTED CALLEES/"+Callees+"/"+CalleesExecuted+"/");
				}
				else if(!Callees.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(Callees, CalleesExecuted).isEmpty()){
					bwfile1ganttCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO CALLEES WITH EMPTY INTERSECTION /"+Callees+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(Callees.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1ganttCalleesExecCallees.write("CALLEES EMPTY AND ECUTED CALLEES  NOT EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}

				bwfile1ganttCalleesExecCallees.newLine();
				
				
				
				
				
			}
			bwfile1ganttXCalleesExecCallees.close();
		

			
			
			
			
			
			
			

		}
		

		if(ProgramName.equals("jhotdraw")) {
			bwfile1jhotdrawXCalleesExecCallees.write("METHOD ID/EQUALITY/ XCALLEES/ EXECUTED CALLEES/ ");
		

			bwfile1jhotdrawXCalleesExecCallees.newLine();
		
			
			bwfile1jhotdrawCalleesExecCallees.write("METHOD ID/EQUALITY/ CALLEES/ EXECUTED CALLEES/ ");
			

			bwfile1jhotdrawCalleesExecCallees.newLine();
		
			int count=0; 
			for (  Method method : DatabaseInput.MethodHashMap.values()) {
				System.out.println();
				bwfile1jhotdrawXCalleesExecCallees.write(method.ID+"/"); 
				bwfile1jhotdrawCalleesExecCallees.write(method.ID+"/"); 
				
				
				MethodList CallersShell = method.getCallersShell(); 
				MethodList CallersCallersShell =method.getCallersCallersShell(); 
				MethodList CalleesShell =method.getCalleesShell(); 
				MethodList CallersExecuted =method.getCallersExecuted(); 
				MethodList CalleesExecuted =method.getCalleesExecuted();
				MethodList CallersCallersExecuted =method.getCallersCallersExecuted(); 
				MethodList CALLEES =method.Callees;
				MethodList Callees =method.Callees; 
				MethodList CallersofCallers =method.CallersofCallers; 
				Collections.sort(CallersShell); 
				Collections.sort(CallersExecuted); 
				Collections.sort(CalleesShell); 
				Collections.sort(CalleesExecuted); 
				Collections.sort(CallersCallersShell); 
				Collections.sort(CallersCallersExecuted); 
				Collections.sort(CALLEES); 
				Collections.sort(Callees); 
				Collections.sort(CallersofCallers); 

				if(CalleesExecuted.equals(CalleesShell) && !CalleesExecuted.isEmpty() && !CalleesShell.isEmpty()) {
					bwfile1jhotdrawXCalleesExecCallees.write("SAME/"+CalleesShell+"/"+"/");
				}else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesShell.containsAll(CalleesExecuted)){
					bwfile1jhotdrawXCalleesExecCallees.write("XCALLEES IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1jhotdrawXCalleesExecCallees.write("XCALLEES NOT EMPTY AND EXCUTED CALLEES  EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1jhotdrawXCalleesExecCallees.write("BOTH EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}
				else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(CalleesShell)){
					bwfile1jhotdrawXCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(CalleesShell, CalleesExecuted).isEmpty()) {
					bwfile1jhotdrawXCalleesExecCallees.write("INTERSECTION OF XCALLEES AND EXECUTED CALLEES/"+CalleesShell+"/"+CalleesExecuted+"/");
				}
				else if(!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(CalleesShell, CalleesExecuted).isEmpty()){
					bwfile1jhotdrawXCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO XCALLEES WITH EMPTY INTERSECTION /"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(CalleesShell.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1jhotdrawXCalleesExecCallees.write("XCALLEES EMPTY AND EXCUTED CALLEES  NOT EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}

				bwfile1jhotdrawXCalleesExecCallees.newLine();
				
				/*************************************************************************************************************************/
				if(CalleesExecuted.equals(Callees) && !CalleesExecuted.isEmpty() && !Callees.isEmpty()) {
					bwfile1jhotdrawCalleesExecCallees.write("SAME/"+Callees+"/"+"/");
				}else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& Callees.containsAll(CalleesExecuted)){
					bwfile1jhotdrawCalleesExecCallees.write("CALLEES IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1jhotdrawCalleesExecCallees.write("CALLEES NOT EMPTY AND ECUTED CALLEES  EMPTY/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1jhotdrawCalleesExecCallees.write("BOTH EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}
				else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(Callees)){
					bwfile1jhotdrawCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(Callees, CalleesExecuted).isEmpty()) {
					bwfile1jhotdrawCalleesExecCallees.write("INTERSECTION OF CALLEES AND EXECUTED CALLEES/"+Callees+"/"+CalleesExecuted+"/");
				}
				else if(!Callees.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(Callees, CalleesExecuted).isEmpty()){
					bwfile1jhotdrawCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO CALLEES WITH EMPTY INTERSECTION /"+Callees+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(Callees.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1jhotdrawCalleesExecCallees.write("CALLEES EMPTY AND ECUTED CALLEES  NOT EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}

				bwfile1jhotdrawCalleesExecCallees.newLine();
				
				
				
				
				count++; 
			}
			bwfile1jhotdrawXCalleesExecCallees.close();
		
			
		}
		if(ProgramName.equals("itrust")) {
			bwfile1itrustXCalleesExecCallees.write("METHOD ID/EQUALITY/ XCALLEES/ EXECUTED CALLEES/ ");
		

			bwfile1itrustXCalleesExecCallees.newLine();
	
			
			
			bwfile1itrustCalleesExecCallees.write("METHOD ID/EQUALITY/ CALLEES/ EXECUTED CALLEES/ ");
		

			bwfile1itrustCalleesExecCallees.newLine();

			int count=0; 
			for (  Method method : DatabaseInput.MethodHashMap.values()) {
				System.out.println(method);
				bwfile1itrustXCalleesExecCallees.write(method.ID+"/"); 
				bwfile1itrustCalleesExecCallees.write(method.ID+"/"); 

				MethodList CallersShell = method.getCallersShell(); 
				MethodList CallersCallersShell =method.getCallersCallersShell(); 
				MethodList CalleesShell =method.getCalleesShell(); 
				MethodList CallersExecuted =method.getCallersExecuted(); 
				MethodList CalleesExecuted =method.getCalleesExecuted();
				MethodList CallersCallersExecuted =method.getCallersCallersExecuted(); 
				MethodList CALLEES =method.Callees;
				MethodList Callees =method.Callees; 
				MethodList CallersofCallers =method.CallersofCallers; 
				Collections.sort(CallersShell); 
				Collections.sort(CallersExecuted); 
				Collections.sort(CalleesShell); 
				Collections.sort(CalleesExecuted); 
				Collections.sort(CallersCallersShell); 
				Collections.sort(CallersCallersExecuted); 
				Collections.sort(CALLEES); 
				Collections.sort(Callees); 
				Collections.sort(CallersofCallers); 

				if(CalleesExecuted.equals(CalleesShell) && !CalleesExecuted.isEmpty() && !CalleesShell.isEmpty()) {
					bwfile1itrustXCalleesExecCallees.write("SAME/"+CalleesShell+"/"+"/");
				}else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesShell.containsAll(CalleesExecuted)){
					bwfile1itrustXCalleesExecCallees.write("XCALLEES IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1itrustXCalleesExecCallees.write("XCALLEES NOT EMPTY AND EXCUTED CALLEES  EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(CalleesShell.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1itrustXCalleesExecCallees.write("BOTH EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}
				else if((!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(CalleesShell)){
					bwfile1itrustXCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
				else if(!CalleesShell.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(CalleesShell, CalleesExecuted).isEmpty()) {
					bwfile1itrustXCalleesExecCallees.write("INTERSECTION OF XCALLEES AND EXECUTED CALLEES/"+CalleesShell+"/"+CalleesExecuted+"/");
				}
				else if(!CalleesShell.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(CalleesShell, CalleesExecuted).isEmpty()){
					bwfile1itrustXCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO XCALLEES WITH EMPTY INTERSECTION /"+CalleesShell+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(CalleesShell.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1itrustXCalleesExecCallees.write("XCALLEES EMPTY AND EXCUTED CALLEES  NOT EMPTY/"+CalleesShell+"/"+CalleesExecuted+"/"); 
				}

				bwfile1itrustXCalleesExecCallees.newLine();
				
				/*************************************************************************************************************************/
				if(CalleesExecuted.equals(Callees) && !CalleesExecuted.isEmpty() && !Callees.isEmpty()) {
					bwfile1itrustXCalleesExecCallees.write("SAME/"+Callees+"/"+"/");
				}else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& Callees.containsAll(CalleesExecuted)){
					bwfile1itrustCalleesExecCallees.write("CALLEES IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1itrustCalleesExecCallees.write("CALLEES NOT EMPTY AND ECUTED CALLEES  EMPTY/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(Callees.isEmpty()&& CalleesExecuted.isEmpty()){
					bwfile1itrustCalleesExecCallees.write("BOTH EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}
				else if((!Callees.isEmpty()&& !CalleesExecuted.isEmpty())&& CalleesExecuted.containsAll(Callees)){
					bwfile1itrustCalleesExecCallees.write("CALLEES EXECUTED IS A SUPERSET/"+Callees+"/"+CalleesExecuted+"/");
					
				}
				else if(!Callees.isEmpty() && !CalleesExecuted.isEmpty() && !intersection(Callees, CalleesExecuted).isEmpty()) {
					bwfile1itrustCalleesExecCallees.write("INTERSECTION OF CALLEES AND EXECUTED CALLEES/"+Callees+"/"+CalleesExecuted+"/");
				}
				else if(!Callees.isEmpty()&& !CalleesExecuted.isEmpty() && intersection(Callees, CalleesExecuted).isEmpty()){
					bwfile1itrustCalleesExecCallees.write("EXECUTED CALLEES NOT EQUAL TO CALLEES WITH EMPTY INTERSECTION /"+Callees+"/"+CalleesExecuted+"/");
					
				}
			
				
				else if(Callees.isEmpty() && !CalleesExecuted.isEmpty()){
					bwfile1itrustCalleesExecCallees.write("CALLEES EMPTY AND ECUTED CALLEES  NOT EMPTY/"+Callees+"/"+CalleesExecuted+"/"); 
				}

				bwfile1itrustCalleesExecCallees.newLine();
				count++; 
			}
			bwfile1itrustCalleesExecCallees.close();
		}

	
		
		
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	

		if(ProgramName.equals("chess")) {
		
			bwfile1chessXCalleesExecCallees.close();
			
		
			bwfile1chessCalleesExecCallees.close();
		}
	
		if(ProgramName.equals("gantt")) {
			
			bwfile1ganttXCalleesExecCallees.close();
			
		
			bwfile1ganttCalleesExecCallees.close();
		}
		if(ProgramName.equals("itrust")) {
		
			bwfile1itrustCalleesExecCallees.close();
			
			
		
			bwfile1itrustXCalleesExecCallees.close();
		}
		if(ProgramName.equals("jhotdraw")) {
		
			bwfile1jhotdrawXCalleesExecCallees.close();
			
		
			bwfile1jhotdrawCalleesExecCallees.close();
			
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
		

		 System.out.println("YES2");
//			ComputeStepResults(TotalPattern, TotalPredictionValues, LogInfoHashMap, ProgramName, "TOTAL  PREDICTION", "total prediction values", zeroPred); 

		 

		 
		 

		 System.out.println("YES6");
		 LogInfo.closeLogFile(); 
		
		

		
		LogInfo.CloseFiles(ProgramName); 
		
		
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
			XCallersExecCallersComparison frame = new XCallersExecCallersComparison(
					ProgramName);

			String ProgramName2 = "gantt";
				 frame = new XCallersExecCallersComparison(ProgramName2);
//			
////			String ProgramName2 = "dummy";
////			AlgoFinal	 frame = new AlgoFinal(ProgramName2);
	////
			String ProgramName3 = "itrust";
			 frame = new XCallersExecCallersComparison(ProgramName3);

				 //ooo
				 
			String ProgramName4 = "jhotdraw";
				frame = new XCallersExecCallersComparison(ProgramName4);
				
			}
		}
		
		
		
		



}
