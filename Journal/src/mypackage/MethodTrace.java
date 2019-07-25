package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import ALGO.AlgoFinal;
import ALGO.DatabaseInput;
import ALGO.MethodList;
import ALGO.OwnerClassList;
import ALGO.Prediction;
import Chess.LogInfo;
import Chess.PredictionEvaluation;
import spoon.pattern.internal.SubstitutionRequestProvider;

public final class MethodTrace {
	public static boolean modified = false;
	public Method Method= new Method();
	public Requirement Requirement=new Requirement();
	public String gold;
	public String Input;

	public Prediction prediction ; 
	public String predictionReason ;
	public String predictionType ;
	public String predictionValue ;
	public String predictionPattern ;


	boolean SubjectDeveloperEqualityFlag;
	public String  ClassLevelGold; 


	public String SubjectT; 
	public String SubjectN; 
	public PredictionEvaluation PredictionEvaluation= new PredictionEvaluation(); 
	public ALGO.PredictionValues PredictionValues= new ALGO.PredictionValues();
	private String PredictionSummary=""; 


//	getcallers
//	   if tzpe)executed return method.executedCallers
//
//   getcallerscallers
//   
//   
//   getcallees


	public String getPredictionSummary() {
		return PredictionSummary;
	}

	public void setPredictionSummary(String predictionSummary) {
		PredictionSummary = predictionSummary;
	}

	public MethodList getCallers() {
		if(AlgoFinal.ExecutedCallsTechnique) {
			return this.Method.getCallersExecuted(); 
		}else if(AlgoFinal.BasicTechnique) {
			return this.Method.Callers; 

		}else if(AlgoFinal.XCallsTechnique) {
			return this.Method.getXCallers(); 
		}
		return null; 
	}
	
	public MethodList getCallees() throws CloneNotSupportedException {
		if(AlgoFinal.ExecutedCallsTechnique) {
			return this.Method.getCalleesExecuted(); 
		}else if(AlgoFinal.BasicTechnique) {
			return this.Method.Callees; 

		}else if(AlgoFinal.XCallsTechnique) {
			return this.Method.getXCallees(); 
		}
		return null; 
	}
	
	public MethodList getCallersCallers() throws CloneNotSupportedException {
		if(AlgoFinal.ExecutedCallsTechnique) {
			return this.Method.getCallersCallersExecuted(); 
		}else if(AlgoFinal.BasicTechnique) {
			return this.Method.getBasicCallersCallers(); 

		}else if(AlgoFinal.XCallsTechnique) {
			return this.Method.getXCallersCallers(); 
		}
		return null; 
	}
	
	public MethodList getCalleesCallees() throws CloneNotSupportedException {
		if(AlgoFinal.ExecutedCallsTechnique) {
			return this.Method.getCalleesCalleesExecuted(); 
		}else if(AlgoFinal.BasicTechnique) {
			return this.Method.getBasicCalleesCallees(); 

		}else if(AlgoFinal.XCallsTechnique) {
			return this.Method.getXCalleesCallees(); 
		}
		return null; 
	}
	
	

	public String getInput() {
		return Input;
	}

	public void setInput(String Input) {
		this.Input = Input;
	}

	public String getClassLevelGold() {
		return ClassLevelGold;
	}

	public void setClassLevelGold(String classLevelGold) {
		ClassLevelGold = classLevelGold;
	}

	public String getSubjectT() {
		return SubjectT;
	}

	public void setSubjectT(String subjectT) {
		SubjectT = subjectT;
	}

	public String getSubjectN() {
		return SubjectN;
	}

	public void setSubjectN(String subjectN) {
		SubjectN = subjectN;
	}

	public boolean isSubjectDeveloperEqualityFlag() {
		return SubjectDeveloperEqualityFlag;
	}

	public String getPredictionOrInput() {
		if(!this.getInput().equals("E")) {
			return this.getInput(); 
		}else {
			return prediction.PredictionValue; 
		}
	}


	

	public void setPrediction(Prediction prediction ) {
	
		this.prediction = prediction;
	}


	public void setSubjectDeveloperEqualityFlag(boolean subjectDeveloperEqualityFlag) {
		SubjectDeveloperEqualityFlag = subjectDeveloperEqualityFlag;
	}




	public  Prediction getPrediction() {
		
			return prediction; 
		
	}


	
	
	
	
	
	



	


	public MethodTrace() {
		
	}

	public Method getMethod() {
		return Method;
	}

	public void setMethod(Method method) {
		Method = method;
	}

	public Requirement getRequirement() {
		return Requirement;
	}

	public void setRequirement(Requirement requirement) {
		Requirement = requirement;
	}

	

	public String getGold() {
		return gold;
	}

	public void setGold(String gold) {
		this.gold = gold;
	}

	
	





	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////


	/************************************************************************************************************************************************/
	/**
	 * @param type 
	 * @param iteration 
	 * @throws CloneNotSupportedException **********************************************************************************************************************************************/
	public void SetPrediction(LinkedHashMap<String, LogInfo> LogInfoHashMap, Prediction Prediction, String type, int iteration) throws CloneNotSupportedException
			
			
			{
		String reqMethod = this.Requirement.ID+"-"+this.Method.ID; 
//		System.out.println("==============>"+AlgoFinal.methodtraces2HashMap.get("1-3").PredictionSummary);
//		System.out.println("==============>"+AlgoFinal.methodtraces2HashMap.get("1-3").prediction.pattern);

		if(this.prediction.PredictionValue.equals("E") && !Prediction.PredictionValue.equals("E")) {
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).getIterationValues().add(Prediction.Reason+type+"/"+Prediction.pattern);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setPrediction(Prediction.PredictionValue);
			MethodTrace.modified=true; 		
			
			String var= this.prediction.PredictionValue+"/"+prediction.Reason+"/"+type+"/"+prediction.pattern; 
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).PredictionSummary=this.prediction.PredictionValue+"/"+prediction.Reason+"/"+type+"/"+prediction.pattern; 
			this.prediction=Prediction; 
			this.PredictionSummary=this.prediction.PredictionValue+"/"+prediction.Reason+"/"+type+"/"+prediction.pattern; 
//			System.out.println("$$$$$$$$$ "+prediction.pattern);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).PredictionSummary=this.PredictionSummary; 
//			System.out.println("hey");
			setValues(Prediction.PredictionValue, Prediction.Reason, Prediction.Type, Prediction.pattern); 
			this.UpdateCallersCallees(LogInfoHashMap, reqMethod);			

			
//			System.out.println("pppppppp   "+AlgoFinal.methodtraces2HashMap.get(reqMethod).prediction.pattern);

		}else if(this.prediction.PredictionValue.equals("E") && Prediction.PredictionValue.equals("E")) {
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).getIterationValues().add(Prediction.Reason+type+"/"+Prediction.pattern);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setPrediction(Prediction.PredictionValue);
			String var= this.prediction.PredictionValue+"/"+prediction.Reason+"/"+type+"/"+prediction.pattern; 
//			System.out.println(var);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).PredictionSummary=this.prediction.PredictionValue+"/"+prediction.Reason+"/"+type+"/"+prediction.pattern; 
			this.prediction=Prediction; 
			this.PredictionSummary=this.prediction.PredictionValue+"/"+prediction.Reason+"/"+type+"/"+prediction.pattern; 
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).PredictionSummary=this.PredictionSummary; 
			setValues(Prediction.PredictionValue, Prediction.Reason, Prediction.Type, Prediction.pattern); 
			this.UpdateCallersCallees(LogInfoHashMap, reqMethod);			

		}
	


			

		

		}


		
		
	

		
		
	
	private void setValues(String predictionValue2, String reason, String type, String pattern) {
		// TODO Auto-generated method stub
		this.predictionReason=reason; 
		this.predictionPattern=pattern; 
		this.predictionType=type; 
		this.predictionValue= predictionValue2; 
		
	}

	/************************************************************************************************************************************************/
	/**
	 * @param reqMethod 
	 * @throws CloneNotSupportedException **********************************************************************************************************************************************/
	public void UpdateCallersCallees(LinkedHashMap<String, LogInfo> LogInfoHashMap, String reqMethod) throws CloneNotSupportedException
			
			
			{
		// TODO Auto-generated method stub
		List<String> Callers= new ArrayList<String>(); 
		List<String> CallersPredictions= new ArrayList<String>(); 
		List<String> CallersOwners= new  ArrayList<String>(); 
		
		// TODO Auto-generated method stub
		List<String> CallersCallers= new ArrayList<String>(); 
		List<String> CallersCallersPredictions= new ArrayList<String>(); 
		List<String> CallersCallersOwners= new  ArrayList<String>(); 
		
		// TODO Auto-generated method stub
		List<String> CalleesCallees= new ArrayList<String>(); 
		List<String> CalleesCalleesPredictions= new ArrayList<String>(); 
		List<String> CalleesCalleesOwners= new  ArrayList<String>(); 

		List<String> InterfaceCallers= new ArrayList<String>(); 
		List<String> InterfaceCallersPredictions= new ArrayList<String>(); 
		List<String> InterfaceCallersOwners= new  ArrayList<String>(); 
		
		List<String> SuperclassCallers= new ArrayList<String>(); 
		List<String> SuperclassCallersPredictions= new ArrayList<String>(); 
		List<String> SuperclassCallersOwners= new  ArrayList<String>(); 
		
		List<String> ImplementationCallers= new ArrayList<String>(); 
		List<String> ImplementationCallersPredictions= new ArrayList<String>(); 
		List<String> ImplementationCallersOwners= new  ArrayList<String>(); 
		
		List<String> SuperclassCallees= new ArrayList<String>(); 
		List<String> SuperclassCalleesOwners= new ArrayList<String>(); 
		List<String> SuperclassCalleesPredictions= new  ArrayList<String>(); 
		
		List<String> Callees= new ArrayList<String>(); 	
		List<String> CalleesPredictions= new ArrayList<String>(); 
		List<String> CalleesOwners= new  ArrayList<String>(); 
		

		List<String> ImplementationCallees= new ArrayList<String>(); 
		List<String> ImplementationCalleesPredictions= new ArrayList<String>(); 
		List<String> ImplementationCalleesOwners= new  ArrayList<String>(); 
		

		
		List<String> ChildrenCallees= new ArrayList<String>(); 
		List<String> ChildrenCalleesPredictions= new ArrayList<String>(); 
		List<String> ChildrenCalleesOwners= new ArrayList<String>(); 
		
		List<String> ChildrenCallers= new ArrayList<String>(); 
		List<String> ChildrenCallersPredictions= new ArrayList<String>(); 
		List<String> ChildrenCallersOwners= new ArrayList<String>(); 
		
		
		
		List<String> ExtendedCallees= new ArrayList<String>(); 
		List<String> ExtendedCalleesOwners= new ArrayList<String>(); 
		List<String> ExtendedCalleesPredictions= new ArrayList<String>(); 
		
		List<String> ExtendedCallers= new ArrayList<String>(); 
		List<String> ExtendedCallersPredictions= new ArrayList<String>(); 
		List<String> ExtendedCallersOwners= new ArrayList<String>(); 

		
		List<String> CalleesCalleesInterfaceInheritance= new ArrayList<String>(); 
		List<String> CalleesCalleesInterfaceInheritancePredictions= new ArrayList<String>(); 
		List<String> CalleesCalleesInterfaceInheritanceOwners= new ArrayList<String>(); 
		
		List<String> ExecutedCallers= new ArrayList<String>(); 
		List<String> ExecutedCallersPredictions= new ArrayList<String>(); 
		List<String> ExecutedCallersOwners= new ArrayList<String>(); 

		List<String> ExecutedCallees= new ArrayList<String>(); 
		List<String> ExecutedCalleesPredictions= new ArrayList<String>(); 
		List<String> ExecutedCalleesOwners= new ArrayList<String>(); 
		
		List<String> Interfaces= new ArrayList<String>(); 
		List<String> InterfacesPredictions= new ArrayList<String>(); 
		
		List<String> Parents= new ArrayList<String>(); 
		List<String> ParentPredictions= new ArrayList<String>(); 
		
		List<String> Children= new ArrayList<String>(); 
		List<String> ChildrenPredictions= new ArrayList<String>(); 	
		
		List<String> Implementations= new ArrayList<String>(); 
		List<String> ImplementationsPredictions= new ArrayList<String>(); 
		
		String reqMethod2=this.Requirement.ID+"-"+this.Method.ID; 
		
		
		


		
		setPrediction(this.prediction);
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS 
		for(Method caller: this.Method.Callers) {
			Callers.add(caller.toString()); 
			SetPredictionsSetOwners(caller, this, CallersPredictions, CallersOwners); 
			
			
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS CALLERS
		for(Method callercaller: this.getCallersCallers()) {
		CallersCallers.add(callercaller.toString()); 
		SetPredictionsSetOwners(callercaller, this, CallersCallersPredictions, CallersCallersOwners); 
		
		
		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLEES CALLEES
		for(Method calleecallee: this.getCalleesCallees()) {
			CalleesCallees.add(calleecallee.toString()); 
			SetPredictionsSetOwners(calleecallee, this, CalleesCalleesPredictions, CalleesCalleesOwners); 
			
			
			}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLEES
		for(Method callee: this.Method.Callees) {
			Callees.add(callee.toString()); 
			SetPredictionsSetOwners(callee, this, CalleesPredictions, CalleesOwners); 

			
			
		}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//EXECUTED CALLERS 
//		if(AlgoFinal.ProgramName.equals("chess")) {
		for(Method ExecutedCaller: this.Method.getCallersExecuted()) {
			if(ExecutedCaller!=null) {
				ExecutedCallers.add(ExecutedCaller.toString()); 
				SetPredictionsSetOwners(ExecutedCaller, this, ExecutedCallersPredictions, ExecutedCallersOwners); 
			}
			}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		
			
		
		//EXECUTED CALLEES
		int count=0; 
//		System.out.println(this.Method+"======>"+this.Method.getCalleesExecuted());

		for(Method ExecutedCallee: this.Method.getCalleesExecuted()) {
//			if(ExecutedCallee!=null) {
				ExecutedCallees.add(ExecutedCallee.toString()); 
				SetPredictionsSetOwners(ExecutedCallee, this, ExecutedCalleesPredictions, ExecutedCalleesOwners); 
				count++; 
//			}
			

			
			
		}
			////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS OF INTERFACES 
		if(!this.Method.Interfaces.isEmpty()) {
			for(Method inter: this.Method.Interfaces) {
				if(!inter.Callers.isEmpty()) {
					for(mypackage.Method interCaller: inter.Callers) {
						InterfaceCallers.add(interCaller.toString()); 
						SetPredictionsSetOwners(interCaller, this, InterfaceCallersPredictions, InterfaceCallersOwners); 

					
					
					}

				}
			}
		}
		
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLEES OF IMPLEMENTATIONS
if(!this.Method.Implementations.isEmpty()) {
		for(Method imp: this.Method.Implementations) {
			if(!imp.Callees.isEmpty()) {
					for(mypackage.Method impCallee: imp.Callees) {
							ImplementationCallees.add(impCallee.toString()); 
							SetPredictionsSetOwners(impCallee, this, ImplementationCalleesPredictions, ImplementationCalleesOwners); 
							
							for(mypackage.Method impCalleeInterface: impCallee.Interfaces) {
								CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
								SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
							}
							for(mypackage.Method impCalleeInterface: impCallee.Implementations) {
								CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
								SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
							}
							for(mypackage.Method impCalleeInterface: impCallee.Children) {
								CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
								SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
							}
							for(mypackage.Method impCalleeInterface: impCallee.Superclasses) {
								CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
								SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
							}
						}
		
							}
			
			//CALLERS OF IMPLEMENTATIONS

			if(!imp.Callers.isEmpty()) {
				for(mypackage.Method impCaller: imp.Callers) {
						ImplementationCallers.add(impCaller.toString()); 
						SetPredictionsSetOwners(impCaller, this, ImplementationCallersPredictions, ImplementationCallersOwners); 

						
						
							}
	
						}
			}
}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS OF SUPERCLASSES 
		if(!this.Method.Superclasses.isEmpty()) {
			for(Method superclass: this.Method.Superclasses) {
				if(!superclass.Callers.isEmpty()) {
					for(mypackage.Method superclassCaller: superclass.Callers) {
						SuperclassCallers.add(superclassCaller.toString()); 
						
						SetPredictionsSetOwners(superclassCaller, this, SuperclassCallersPredictions, SuperclassCallersOwners); 
						
					
					}

				}
				
				//CALLEES OF SUPERCLASSES 
				if(!superclass.Callees.isEmpty()) {
					for(mypackage.Method superclassCallee: superclass.Callees) {
						SuperclassCallees.add(superclassCallee.toString()); 
						
						SetPredictionsSetOwners(superclassCallee, this, SuperclassCalleesPredictions, SuperclassCalleesOwners); 
						
						for(mypackage.Method impCalleeInterface: superclassCallee.Interfaces) {
							CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
							SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
						}
						for(mypackage.Method impCalleeInterface: superclassCallee.Implementations) {
							CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
							SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
						}
						for(mypackage.Method impCalleeInterface: superclassCallee.Children) {
							CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
							SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
						}
						for(mypackage.Method impCalleeInterface: superclassCallee.Superclasses) {
							CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
							SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
						}
					}

				}
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLEES OF CHILDREN 
if(!this.Method.Children.isEmpty()) {
		for(Method children: this.Method.Children) {
				if(!children.Callees.isEmpty()) {
						for(mypackage.Method ChildrenCallee: children.Callees) {
							
								ChildrenCallees.add(ChildrenCallee.toString()); 
								SetPredictionsSetOwners(ChildrenCallee, this, ChildrenCalleesPredictions, ChildrenCalleesOwners); 

								for(mypackage.Method impCalleeInterface: ChildrenCallee.Interfaces) {
									CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
									SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
								}
								for(mypackage.Method impCalleeInterface: ChildrenCallee.Implementations) {
									CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
									SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
								}
								for(mypackage.Method impCalleeInterface: ChildrenCallee.Children) {
									CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
									SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
								}
								for(mypackage.Method impCalleeInterface: ChildrenCallee.Superclasses) {
									CalleesCalleesInterfaceInheritance.add(impCalleeInterface.toString()); 
									SetPredictionsSetOwners(impCalleeInterface, this, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners); 
								}
						}

				}
				
				if(!children.Callers.isEmpty()) {
					for(mypackage.Method ChildrenCaller: children.Callers) {
						
							ChildrenCallers.add(ChildrenCaller.toString()); 
							SetPredictionsSetOwners(ChildrenCaller, this, ChildrenCallersPredictions, ChildrenCallersOwners); 

				
					}

			}
		}
	}





////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLERS
for(Method caller: this.Method.getXCallers()) {
	ExtendedCallers.add(caller.toString()); 
//	ExtendedCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction()); 
	SetPredictionsSetOwners(caller, this, ExtendedCallersPredictions, ExtendedCallersOwners); 


}	

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLEES
for(Method callee: this.Method.getXCallees()) {
ExtendedCallees.add(callee.toString()); 
//ExtendedCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callee.ID).getPrediction()); 
SetPredictionsSetOwners(callee, this, ExtendedCalleesPredictions, ExtendedCalleesOwners); 


}	


////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//INTERFACES  
for(Method myinterface: this.Method.Interfaces) {
Interfaces.add(myinterface.toString()); 
InterfacesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+myinterface.ID).getPrediction().PredictionValue); 

}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//IMPLEMENTATIONS  
for(Method myimplementation: this.Method.Implementations) {
Implementations.add(myimplementation.toString()); 
ImplementationsPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+myimplementation.ID).getPrediction().PredictionValue); 


}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//PARENTS  
for(Method mysuperclass: this.Method.Superclasses) {
Parents.add(mysuperclass.toString()); 
ParentPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+mysuperclass.ID).getPrediction().PredictionValue); 


}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CHILDREN  
for(Method mychild: this.Method.Children) {
Children.add(mychild.toString()); 
ChildrenPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+mychild.ID).getPrediction().PredictionValue); 


}
		

				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaces(Interfaces);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfacesPredictions(InterfacesPredictions);
				
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementations(Implementations);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationPredictions(ImplementationsPredictions);
				
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildren(Children);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenPredictions(ChildrenPredictions);
				
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setParents(Parents);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setParentsPredictions(ParentPredictions);
				
				
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setPrediction(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+this.Method.ID).prediction.PredictionValue);

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCallersFinal(ExtendedCallers);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCallersPredictionsFinal(ExtendedCallersPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedOwnerCallersFinal(ExtendedCallersOwners); 

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCalleesFinal(ExtendedCallees);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCalleesPredictionsFinal(ExtendedCalleesPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedOwnerCalleesFinal(ExtendedCalleesOwners); 

			 reqMethod = this.Requirement.ID+"-"+this.Method.ID; 
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCallees(ExecutedCallees);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCalleesPredictions(ExecutedCalleesPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedOwnerCallees(ExecutedCalleesOwners);

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCallers(ExecutedCallers);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCallersPredictions(ExecutedCallersPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedOwnerCallers(ExecutedCallersOwners);


		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallers(Callers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersOwners(CallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersPredictions(CallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCallees(CalleesCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesOwners(CalleesCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesPredictions(CalleesCalleesPredictions);

		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallers(CallersCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallersOwners(CallersCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallersPredictions(CallersCallersPredictions);
		
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallees(Callees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesOwners(CalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesPredictions(CalleesPredictions);

		
		
		
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaceCallers(InterfaceCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaceCallersOwners(InterfaceCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaceCallerPredictions(InterfaceCallersPredictions);
		
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCallers(ImplementationCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCallersOwners(ImplementationCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCallerPredictions(ImplementationCallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCallers(ChildrenCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCallersOwners(ChildrenCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCallerPredictions(ChildrenCallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallers(SuperclassCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallersOwners(SuperclassCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallerPredictions(SuperclassCallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCallees(ChildrenCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleesOwners(ChildrenCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleePredictions(ChildrenCalleesPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCallees(ImplementationCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleesOwners(ImplementationCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleePredictions(ImplementationCalleesPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallees(SuperclassCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCalleesOwners(SuperclassCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCalleePredictions(SuperclassCalleesPredictions);
		
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesInterfaceInheritance(CalleesCalleesInterfaceInheritance);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesInterfaceInheritancePredictions(CalleesCalleesInterfaceInheritancePredictions);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesInterfaceInheritanceOwners(CalleesCalleesInterfaceInheritanceOwners);
		
	}
	private void SetPredictionsSetOwners(mypackage.Method caller, MethodTrace methodTrace, List<String> callersPredictions, List<String> callersOwners) {
		// TODO Auto-generated method stub
		if(caller.Owner.ID.equals(this.Method.Owner.ID)) {
			callersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction().PredictionValue.toLowerCase()); 

		}else {
//			System.out.println(this.Requirement.ID+"-"+caller.ID);
//			System.out.println(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID));
			callersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction().PredictionValue); 
		}
		if(caller.Owner.ID.equals(this.Method.Owner.ID)) {
			callersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+caller.Owner.ID).DeveloperGold.toLowerCase()); 
		}else {
			callersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+caller.Owner.ID).DeveloperGold); 
		}
	}

	@Override
	public String toString() {
		return "MethodTrace [Method=" + Method.toString() + ", Requirement=" + Requirement + ", gold=" + gold + ", prediction="
				+ prediction + "]";
	}

	public static MethodTrace getMethodTrace(mypackage.Requirement requirement, mypackage.Method method) {
		// TODO Auto-generated method stub
		return 	AlgoFinal.methodtraces2HashMap.get(requirement.ID+"-"+method.ID); 

	}
	

}