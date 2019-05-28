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

public class PrecisionRecallComparisonExecCallsXCalls {
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

	public PrecisionRecallComparisonExecCallsXCalls(String ProgramName) throws Exception {

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
			bwfile1chessXCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
			

			bwfile1chessXCalleesExecCallees.newLine();
			
			
			bwfile1chessCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
			

			bwfile1chessCalleesExecCallees.newLine();
			
			
			int count=0; 
			for (  Method method : DatabaseInput.MethodHashMap.values()) {
				System.out.println();
			

				
				MethodList XCallees =method.getXCallees(); 
				MethodList XCallers =method.getXCallers(); 
				MethodList CalleesExecuted =method.getCalleesExecuted();
				
				MethodList BasicCallees =method.Callees; 
				
				MethodList XCalleesExecCallees= new MethodList(); 
				XCalleesExecCallees.addAll(XCallees); 
				XCalleesExecCallees.addAll(CalleesExecuted); 
				
				
				for(Method XCalleesExecCallee: XCalleesExecCallees) {
					if(XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
						bwfile1chessXCalleesExecCallees.write(method+"/"+"TP/"+XCalleesExecCallee+"/"); 
					}else if(XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
						bwfile1chessXCalleesExecCallees.write(method+"/"+"FP/"+XCalleesExecCallee+"/"); 

					}else if(!XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
						bwfile1chessXCalleesExecCallees.write(method+"/"+"FN/"+XCalleesExecCallee+"/"); 

					}else if(!XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
						bwfile1chessXCalleesExecCallees.write(method+"/"+"TN/"+XCalleesExecCallee+"/"); 

					}
					bwfile1chessXCalleesExecCallees.newLine();


					}
				
				

				
				/*************************************************************************************************************************/
				
				MethodList BasicCalleesExecCallees= new MethodList(); 
				BasicCalleesExecCallees.addAll(BasicCallees); 
				BasicCalleesExecCallees.addAll(CalleesExecuted); 

				
				
				for(Method BasicCalleesExecCallee: BasicCalleesExecCallees) {
					if(BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
						bwfile1chessCalleesExecCallees.write(method+"/"+"TP/"+BasicCalleesExecCallee+"/"); 
					}else if(BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
						bwfile1chessCalleesExecCallees.write(method+"/"+"FP/"+BasicCalleesExecCallee+"/"); 

					}else if(!BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
						bwfile1chessCalleesExecCallees.write(method+"/"+"FN/"+BasicCalleesExecCallee+"/"); 

					}else if(!BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
						bwfile1chessCalleesExecCallees.write(method+"/"+"TN/"+BasicCalleesExecCallee+"/"); 

					}
					bwfile1chessCalleesExecCallees.newLine();

					}

				}

				
				
				count++; 
			}
		

		
			/*************************************************************************************************************************/
			/*************************************************************************************************************************/
			/*************************************************************************************************************************/

			if(ProgramName.equals("gantt")) {
				bwfile1ganttXCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
				

				bwfile1ganttXCalleesExecCallees.newLine();
				
				
				bwfile1ganttCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
				

				bwfile1ganttCalleesExecCallees.newLine();
				
				
				int count=0; 
				for (  Method method : DatabaseInput.MethodHashMap.values()) {
					System.out.println();
					
				

					
					MethodList XCallees =method.getXCallees(); 
				
					MethodList CalleesExecuted =method.getCalleesExecuted();
					
					MethodList BasicCallees =method.Callees; 
					
					MethodList XCalleesExecCallees= new MethodList(); 
					XCalleesExecCallees.addAll(XCallees); 
					XCalleesExecCallees.addAll(CalleesExecuted); 
					
					
					for(Method XCalleesExecCallee: XCalleesExecCallees) {
						if(XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
							bwfile1ganttXCalleesExecCallees.write(method+"/"+"TP/"+XCalleesExecCallee+"/"); 
						}else if(XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
							bwfile1ganttXCalleesExecCallees.write(method+"/"+"FP/"+XCalleesExecCallee+"/"); 

						}else if(!XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
							bwfile1ganttXCalleesExecCallees.write(method+"/"+"FN/"+XCalleesExecCallee+"/"); 

						}else if(!XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
							bwfile1ganttXCalleesExecCallees.write(method+"/"+"TN/"+XCalleesExecCallee+"/"); 

						}
						bwfile1ganttXCalleesExecCallees.newLine();

						}
					
					

					
					/*************************************************************************************************************************/
					
					MethodList BasicCalleesExecCallees= new MethodList(); 
					BasicCalleesExecCallees.addAll(BasicCallees); 
					BasicCalleesExecCallees.addAll(CalleesExecuted); 

					
					
					for(Method BasicCalleesExecCallee: BasicCalleesExecCallees) {
						if(BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
							bwfile1ganttCalleesExecCallees.write(method+"/"+"TP/"+BasicCalleesExecCallee+"/"); 
						}else if(BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
							bwfile1ganttCalleesExecCallees.write(method+"/"+"FP/"+BasicCalleesExecCallee+"/"); 

						}else if(!BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
							bwfile1ganttCalleesExecCallees.write(method+"/"+"FN/"+BasicCalleesExecCallee+"/"); 

						}else if(!BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
							bwfile1ganttCalleesExecCallees.write(method+"/"+"TN/"+BasicCalleesExecCallee+"/"); 

						}
						bwfile1ganttCalleesExecCallees.newLine();

						}

					}

					
					
					count++; 
				}
			
				
				/*************************************************************************************************************************/
				/*************************************************************************************************************************/
				/*************************************************************************************************************************/


				if(ProgramName.equals("jhotdraw")) {
					bwfile1jhotdrawXCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
					

					bwfile1jhotdrawXCalleesExecCallees.newLine();
					
					
					bwfile1jhotdrawCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
					

					bwfile1jhotdrawCalleesExecCallees.newLine();
					
					
					int count=0; 
					for (  Method method : DatabaseInput.MethodHashMap.values()) {
						System.out.println();
						

						
						MethodList XCallees =method.getXCallees(); 
					
						MethodList CalleesExecuted =method.getCalleesExecuted();
						
						MethodList BasicCallees =method.Callees; 
						
						MethodList XCalleesExecCallees= new MethodList(); 
						XCalleesExecCallees.addAll(XCallees); 
						XCalleesExecCallees.addAll(CalleesExecuted); 
						
						
						for(Method XCalleesExecCallee: XCalleesExecCallees) {
							if(XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
								bwfile1jhotdrawXCalleesExecCallees.write(method+"/"+"TP/"+XCalleesExecCallee+"/"); 
							}else if(XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
								bwfile1jhotdrawXCalleesExecCallees.write(method+"/"+"FP/"+XCalleesExecCallee+"/"); 

							}else if(!XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
								bwfile1jhotdrawXCalleesExecCallees.write(method+"/"+"FN/"+XCalleesExecCallee+"/"); 

							}else if(!XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
								bwfile1jhotdrawXCalleesExecCallees.write(method+"/"+"TN/"+XCalleesExecCallee+"/"); 

							}
							bwfile1jhotdrawXCalleesExecCallees.newLine();

							}
						
						

						
						/*************************************************************************************************************************/
						
						MethodList BasicCalleesExecCallees= new MethodList(); 
						BasicCalleesExecCallees.addAll(BasicCallees); 
						BasicCalleesExecCallees.addAll(CalleesExecuted); 

						
						
						for(Method BasicCalleesExecCallee: BasicCalleesExecCallees) {
							if(BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
								bwfile1jhotdrawCalleesExecCallees.write(method+"/"+"TP/"+BasicCalleesExecCallee+"/"); 
							}else if(BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
								bwfile1jhotdrawCalleesExecCallees.write(method+"/"+"FP/"+BasicCalleesExecCallee+"/"); 

							}else if(!BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
								bwfile1jhotdrawCalleesExecCallees.write(method+"/"+"FN/"+BasicCalleesExecCallee+"/"); 

							}else if(!BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
								bwfile1jhotdrawCalleesExecCallees.write(method+"/"+"TN/"+BasicCalleesExecCallee+"/"); 

							}
							bwfile1jhotdrawCalleesExecCallees.newLine();

							}

						}

						
						
						count++; 
					}
			
					/*************************************************************************************************************************/
					/*************************************************************************************************************************/
					/*************************************************************************************************************************/

					if(ProgramName.equals("itrust")) {
						bwfile1itrustXCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
						

						bwfile1itrustXCalleesExecCallees.newLine();
						
						
						bwfile1itrustCalleesExecCallees.write("METHOD ID/PRECISIONRECALL/ CALLEE /");
						

						bwfile1itrustCalleesExecCallees.newLine();
						
						
						int count=0; 
						for (  Method method : DatabaseInput.MethodHashMap.values()) {
							System.out.println();
							

							
							MethodList XCallees =method.getXCallees(); 
						
							MethodList CalleesExecuted =method.getCalleesExecuted();
							
							MethodList BasicCallees =method.Callees; 
							
							MethodList XCalleesExecCallees= new MethodList(); 
							XCalleesExecCallees.addAll(XCallees); 
							XCalleesExecCallees.addAll(CalleesExecuted); 
							
							
							for(Method XCalleesExecCallee: XCalleesExecCallees) {
								if(XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
									bwfile1itrustXCalleesExecCallees.write(method+"/"+"TP/"+XCalleesExecCallee+"/"); 
								}else if(XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
									bwfile1itrustXCalleesExecCallees.write(method+"/"+"FP/"+XCalleesExecCallee+"/"); 

								}else if(!XCallees.contains(XCalleesExecCallee) && CalleesExecuted.contains(XCalleesExecCallee)) {
									bwfile1itrustXCalleesExecCallees.write(method+"/"+"FN/"+XCalleesExecCallee+"/"); 

								}else if(!XCallees.contains(XCalleesExecCallee) && !CalleesExecuted.contains(XCalleesExecCallee)) {
									bwfile1itrustXCalleesExecCallees.write(method+"/"+"TN/"+XCalleesExecCallee+"/"); 

								}
								bwfile1itrustXCalleesExecCallees.newLine();

								}
							
							

							
							/*************************************************************************************************************************/
							
							MethodList BasicCalleesExecCallees= new MethodList(); 
							BasicCalleesExecCallees.addAll(BasicCallees); 
							BasicCalleesExecCallees.addAll(CalleesExecuted); 

							
							
							for(Method BasicCalleesExecCallee: BasicCalleesExecCallees) {
								if(BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
									bwfile1itrustCalleesExecCallees.write(method+"/"+"TP/"+BasicCalleesExecCallee+"/"); 
								}else if(BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
									bwfile1itrustCalleesExecCallees.write(method+"/"+"FP/"+BasicCalleesExecCallee+"/"); 

								}else if(!BasicCallees.contains(BasicCalleesExecCallee) && CalleesExecuted.contains(BasicCalleesExecCallee)) {
									bwfile1itrustCalleesExecCallees.write(method+"/"+"FN/"+BasicCalleesExecCallee+"/"); 

								}else if(!BasicCallees.contains(BasicCalleesExecCallee) && !CalleesExecuted.contains(BasicCalleesExecCallee)) {
									bwfile1itrustCalleesExecCallees.write(method+"/"+"TN/"+BasicCalleesExecCallee+"/"); 

								}
								bwfile1itrustCalleesExecCallees.newLine();

								}

							}

							
							
							count++; 
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
			PrecisionRecallComparisonExecCallsXCalls frame = new PrecisionRecallComparisonExecCallsXCalls(
					ProgramName);

			String ProgramName2 = "gantt";
				 frame = new PrecisionRecallComparisonExecCallsXCalls(ProgramName2);
//			
////			String ProgramName2 = "dummy";
////			AlgoFinal	 frame = new AlgoFinal(ProgramName2);
	////
			String ProgramName3 = "itrust";
			 frame = new PrecisionRecallComparisonExecCallsXCalls(ProgramName3);

				 //ooo
				 
			String ProgramName4 = "jhotdraw";
				frame = new PrecisionRecallComparisonExecCallsXCalls(ProgramName4);
				
			}
		}
		
		
		
		



}
