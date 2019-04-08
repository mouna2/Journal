package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import ALGO.AlgoFinal;
import ALGO.DatabaseInput;
import ALGO.MethodList;
import ALGO.OwnerClassList;
import Chess.LogInfo;
import spoon.pattern.internal.SubstitutionRequestProvider;

public final class MethodTrace {
	public static boolean modified = false;
	public Method Method= new Method();
	public Requirement Requirement=new Requirement();
	public String gold;
	public String prediction; 
	public String goldfinal;
	public String likelihood;
	public String why;
	boolean SubjectDeveloperEqualityFlag;
	

	public boolean TraceSet; 

	public String SubjectT; 
	public String SubjectN; 
	


	




	
	
	
	

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

	public String getPrediction() {
		return prediction;
	}



	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}


	public void setSubjectDeveloperEqualityFlag(boolean subjectDeveloperEqualityFlag) {
		SubjectDeveloperEqualityFlag = subjectDeveloperEqualityFlag;
	}



	public boolean isTraceSet() {
		return TraceSet;
	}



	public void setTraceSet(boolean traceSet) {
		TraceSet = traceSet;
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
	/************************************************************************************************************************************************/
	public void SetPrediction(LinkedHashMap<String, LogInfo> LogInfoHashMap, String Pred, String reason)
			
			
			{

//		if(this.prediction.trim().equals("E")) {
			
		
			this.prediction=Pred; 

			modified=true; 
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).getIterationValues().add(reason);
			
//		}


		
		
	

		
		
	}
	/************************************************************************************************************************************************/
	/**
	 * @throws CloneNotSupportedException **********************************************************************************************************************************************/
	public void UpdateCallersCallees(LinkedHashMap<String, LogInfo> LogInfoHashMap) throws CloneNotSupportedException
			
			
			{
		// TODO Auto-generated method stub
		List<String> Callers= new ArrayList<String>(); 
		List<String> CallersPredictions= new ArrayList<String>(); 
		List<String> CallersOwners= new ArrayList<String>(); 
		List<String> CallersofCallers= new ArrayList<String>(); 
		List<String> CallersofCallersPredictions= new ArrayList<String>(); 
		List<String> CallersofCallersOwners= new ArrayList<String>(); 
		List<String> InterfaceCallers= new ArrayList<String>(); 
		List<String> InterfaceCallersPredictions= new ArrayList<String>(); 
		List<String> InterfaceCallersOwners= new ArrayList<String>(); 
		List<String> SuperclassCallers= new ArrayList<String>(); 
		List<String> SuperclassCallersPredictions= new ArrayList<String>(); 
		List<String> SuperclassCallersOwners= new ArrayList<String>(); 
		List<String> InterfaceCallersofCallers= new ArrayList<String>(); 
		List<String> InterfaceCallersofCallersPredictions= new ArrayList<String>(); 
		List<String> InterfaceCallersofCallersOwners= new ArrayList<String>(); 
		List<String> SuperclassCallersofCallers= new ArrayList<String>(); 
		List<String> SuperclassCallersofCallersPredictions= new ArrayList<String>(); 
		List<String> SuperclassCallersofCallersOwners= new ArrayList<String>(); 
		List<String> OuterCallersFinal= new ArrayList<String>(); 
		List<String> OuterCallersFinalPredictions= new ArrayList<String>(); 
		List<String> OuterCallersFinalOwners= new ArrayList<String>(); 
		List<String> ImplementationCallersPredictions= new ArrayList<String>(); 
		List<String> ImplementationCallersOwners= new ArrayList<String>(); 
		List<String> SuperclassCalleesOwners= new ArrayList<String>(); 
		List<String> SuperclassCalleesPredictions= new ArrayList<String>(); 
		List<String> SuperclassCallees= new ArrayList<String>(); 

		
		List<String> Callees= new ArrayList<String>(); 
		List<String> CalleesPredictions= new ArrayList<String>(); 
		List<String> CalleesOwners= new ArrayList<String>(); 		
		
		List<String> InterfaceCallees= new ArrayList<String>(); 
		List<String> InterfaceCalleesPredictions= new ArrayList<String>(); 
		List<String> InterfaceCalleesOwners= new ArrayList<String>(); 		
		List<String> CalleesofCallees= new ArrayList<String>(); 
		List<String> CalleesofCalleesPredictions= new ArrayList<String>(); 
		List<String> CalleesofCalleesOwners= new ArrayList<String>(); 
		List<String> ImplementationCallees= new ArrayList<String>(); 
		List<String> ImplementationCallers= new ArrayList<String>(); 

		List<String> ImplementationCalleesPredictions= new ArrayList<String>(); 
		List<String> ImplementationCalleesOwners= new ArrayList<String>(); 
		List<String> ChildrenCallees= new ArrayList<String>(); 
		List<String> ChildrenCallers= new ArrayList<String>(); 

		List<String> ChildrenCalleesPredictions= new ArrayList<String>(); 
		List<String> ChildrenCalleesOwners= new ArrayList<String>(); 
		List<String> ChildrenCallersPredictions= new ArrayList<String>(); 
		List<String> ChildrenCallersOwners= new ArrayList<String>(); 
		List<String> ImplementationCalleesofCallees= new ArrayList<String>(); 
		List<String> ImplementationCalleesofCalleesPredictions= new ArrayList<String>(); 
		List<String> ImplementationCalleesofCalleesOwners= new ArrayList<String>(); 
		List<String> ChildrenCalleesofCallees= new ArrayList<String>(); 
		List<String> ChildrenCalleesofCalleesPredictions= new ArrayList<String>(); 
		List<String> ChildrenCalleesofCalleesOwners= new ArrayList<String>(); 
		List<String> OuterCalleesFinal= new ArrayList<String>(); 
		List<String> OuterCalleesFinalPredictions= new ArrayList<String>(); 
		List<String> OuterCalleesFinalOwners= new ArrayList<String>(); 
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
		String reqMethod=this.Requirement.ID+"-"+this.Method.ID; 
		
		
		

//		
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLERS INTERFACES 
//			for(Method caller: this.Method.CallersInterfaces) {
//					InterfaceCallers.add(caller.toString()); 
//					SetPredictionsSetOwners(caller, this, InterfaceCallersPredictions, InterfaceCallersOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLERS INTERFACES 
//			for(Method caller: this.Method.CallersInterfaces) {
//				SuperclassCallers.add(caller.toString()); 
//				SetPredictionsSetOwners(caller, this, SuperclassCallersPredictions, SuperclassCallersOwners); 
//			}
//		
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES IMPLEMENTATIONS 
//			for(Method callee: this.Method.CalleesImplementations) {
//				ImplementationCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ImplementationCalleesPredictions, ImplementationCalleesOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES CHILDREN  
//			for(Method callee: this.Method.CalleesChildren) {
//				ChildrenCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ChildrenCalleesPredictions, ChildrenCalleesOwners); 
//			}
//		
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES OF CALLEES   
//			for(Method callee: this.Method.CalleesofCallees) {
//				CalleesofCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, CalleesofCalleesPredictions, CalleesofCalleesOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES OF CALLEES IMPLEMENTATIONS 
//			for(Method callee: this.Method.CalleesofCalleesImplementations) {
//				ImplementationCalleesofCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ImplementationCalleesofCalleesPredictions, ImplementationCalleesofCalleesOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES OF CALLEES CHILDREN  
//			for(Method callee: this.Method.CalleesofCalleesChildren) {
//				ChildrenCalleesofCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ChildrenCalleesofCalleesPredictions, ChildrenCalleesofCalleesOwners); 
//			}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS OF CALLERS   
//		for(Method caller: this.Method.CallersofCallers) {
//			CallersofCallers.add(caller.toString()); 
//			SetPredictionsSetOwners(caller, this, CallersofCallersPredictions, CallersofCallersOwners); 
//		}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS OF CALLERS SUPERCLASSES
//		for(Method callee: this.Method.CallersofCallersSuperclasses) {
//			SuperclassCallersofCallers.add(callee.toString()); 
//			SetPredictionsSetOwners(callee, this, SuperclassCallersofCallersPredictions, SuperclassCallersofCallersOwners); 
//		}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS OF CALLERS INTERFACES 
//		for(Method caller: this.Method.CallersofCallersInterfaces) {
//			InterfaceCallersofCallers.add(caller.toString()); 
//			SetPredictionsSetOwners(caller, this, InterfaceCallersofCallersPredictions, InterfaceCallersofCallersOwners); 
//		}
		
		
		
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
		if(AlgoFinal.ProgramName.equals("chess")) {
		for(Method ExecutedCaller: this.Method.CallersExecuted) {
			if(ExecutedCaller!=null) {
				ExecutedCallers.add(ExecutedCaller.toString()); 
				SetPredictionsSetOwners(ExecutedCaller, this, ExecutedCallersPredictions, ExecutedCallersOwners); 
			}
			
			
			
		}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		
			
		
		//EXECUTED CALLEES
		for(Method ExecutedCallee: this.Method.CalleesExecuted) {
			if(ExecutedCallee!=null) {
				ExecutedCallees.add(ExecutedCallee.toString()); 
				SetPredictionsSetOwners(ExecutedCallee, this, ExecutedCalleesPredictions, ExecutedCalleesOwners); 
			}
			

			
			
		}
		}	////////////////////////////////////////////////////////////////////////////////////////////
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



//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
////CALLERS OF CALLERS 
//for(Method caller: this.Method.getCallersAugmentedInterfacesSuperclasses(Requirement)) {
//	
//		for(mypackage.Method callerofcaller: caller.Callers) {
//			CallersofCallers.add(callerofcaller.toString()); 
//			SetPredictionsSetOwners(callerofcaller, this, CallersofCallersPredictions, CallersofCallersOwners); 
//
//			
//			
//			//SUPERCLASS CALLERS OF CALLERS 
//			if(!callerofcaller.Superclasses.isEmpty()) {
//				for(mypackage.Method callerofcallerSuperclass: callerofcaller.Superclasses) {
//					for(mypackage.Method CallerCallerSuperclass: callerofcallerSuperclass.Callers) {
//
//					SuperclassCallersofCallers.add(CallerCallerSuperclass.toString());
//					SetPredictionsSetOwners(CallerCallerSuperclass, this, SuperclassCallersofCallersPredictions, SuperclassCallersofCallersOwners); 
//
//					}
//					
//				}
//			}
//			//INTERFACE CALLERS OF CALLERS 
//			if(!callerofcaller.Interfaces.isEmpty()) {
//				for(mypackage.Method callerofcallerInterface: callerofcaller.Interfaces) {
//					for(mypackage.Method CallerCallerInterface: callerofcallerInterface.Callers) {
//						InterfaceCallersofCallers.add(CallerCallerInterface.toString()); 
//						SetPredictionsSetOwners(CallerCallerInterface, this, InterfaceCallersofCallersPredictions, InterfaceCallersofCallersOwners); 
//					}
//				
//
//				
//					
//				}
//			}
//		}
//	
//
//	
//	
//}
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
////CALLEES OF CALLEES 
//for(Method callee: this.Method.getCalleesAugmentedChildrenImplementations(Requirement)) {
//			for(mypackage.Method calleeofcallee: callee.Callees) {
////				System.out.println(calleeofcallee.toString());
//					CalleesofCallees.add(calleeofcallee.toString()); 
//					SetPredictionsSetOwners(calleeofcallee, this, CalleesofCalleesPredictions, CalleesofCalleesOwners); 
//
//					
//		
//		
//		//CHILDREN CALLEES OF CALLEES 
//		if(!calleeofcallee.Children.isEmpty()) {
//			for(mypackage.Method calleeofcalleeChildren: calleeofcallee.Superclasses) {
//				for(mypackage.Method calleeofcalleeChild: calleeofcalleeChildren.Callees) {
//					ChildrenCalleesofCallees.add(calleeofcalleeChild.toString()); 
//					SetPredictionsSetOwners(calleeofcalleeChild, this, ChildrenCalleesofCalleesPredictions, ChildrenCalleesofCalleesOwners); 
//				}
//				
//
//				
//			}
//		}
//		//IMPLEMENTATION CALLEES OF CALLEES 
//		if(!calleeofcallee.Implementations.isEmpty()) {
//			for(mypackage.Method calleeofcalleeImp: calleeofcallee.Implementations) {
//				for(mypackage.Method calleeofcalleeImplementation: calleeofcalleeImp.Callees) {
//				ImplementationCalleesofCallees.add(calleeofcalleeImplementation.toString()); 
//				SetPredictionsSetOwners(calleeofcalleeImplementation, this, ImplementationCalleesofCalleesPredictions, ImplementationCalleesofCalleesOwners); 
//				}
//			
//				
//			}
//		}
//		
//	}
//		
//
//}
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
////FINAL CALLERS 
//for(Method caller: this.Method.getOuterCallersFinal(Requirement)) {
//OuterCallersFinal.add(caller.toString()); 
//SetPredictionsSetOwners(caller, this, OuterCallersFinalPredictions, OuterCallersFinalOwners); 
//
//
//}
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
////FINAL CALLEES
//for(Method callee: this.Method.getOuterCalleesFinal(Requirement)) {
//OuterCalleesFinal.add(callee.toString()); 
//SetPredictionsSetOwners(callee, this, OuterCalleesFinalPredictions, OuterCalleesFinalOwners); 
//
//
//
//}	

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLERS
for(Method caller: this.Method.getCallersShell()) {
	ExtendedCallers.add(caller.toString()); 
//	ExtendedCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction()); 
	SetPredictionsSetOwners(caller, this, ExtendedCallersPredictions, ExtendedCallersOwners); 


}	

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLEES
for(Method callee: this.Method.getCalleesShell()) {
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
InterfacesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+myinterface.ID).getPrediction()); 

}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//IMPLEMENTATIONS  
for(Method myimplementation: this.Method.Implementations) {
Implementations.add(myimplementation.toString()); 
ImplementationsPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+myimplementation.ID).getPrediction()); 


}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//PARENTS  
for(Method mysuperclass: this.Method.Superclasses) {
Parents.add(mysuperclass.toString()); 
ParentPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+mysuperclass.ID).getPrediction()); 


}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CHILDREN  
for(Method mychild: this.Method.Children) {
Children.add(mychild.toString()); 
ChildrenPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+mychild.ID).getPrediction()); 


}


				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaces(Interfaces);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfacesPredictions(InterfacesPredictions);
				
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementations(Implementations);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationPredictions(ImplementationsPredictions);
				
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildren(Children);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenPredictions(ChildrenPredictions);
				
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setParents(Parents);
				LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setParentsPredictions(ParentPredictions);
				
				
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setPrediction(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+this.Method.ID).prediction);

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCallersFinal(ExtendedCallers);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCallersPredictionsFinal(ExtendedCallersPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedOwnerCallersFinal(ExtendedCallersOwners); 

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCalleesFinal(ExtendedCallees);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCalleesPredictionsFinal(ExtendedCalleesPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedOwnerCalleesFinal(ExtendedCalleesOwners); 


			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCallees(ExecutedCallees);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCalleesPredictions(ExecutedCalleesPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedOwnerCallees(ExecutedCalleesOwners);

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCallers(ExecutedCallers);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedCallersPredictions(ExecutedCallersPredictions);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExecutedOwnerCallers(ExecutedCallersOwners);


		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallers(Callers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersOwners(CallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersPredictions(CallersPredictions);

		
		
		
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
	private void SetPredictionsSetOwners(mypackage.Method caller, MethodTrace methodTrace, List<String> CallersPredictions, List<String> CallersOwners) {
		// TODO Auto-generated method stub
		if(caller.Owner.ID.equals(this.Method.Owner.ID)) {
			CallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction().toLowerCase()); 

		}else {
//			System.out.println(this.Requirement.ID+"-"+caller.ID);
//			System.out.println(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID));
			CallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction()); 
		}
		if(caller.Owner.ID.equals(this.Method.Owner.ID)) {
			CallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+caller.Owner.ID).DeveloperGold.toLowerCase()); 
		}else {
			CallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+caller.Owner.ID).DeveloperGold); 
		}
	}

	@Override
	public String toString() {
		return "MethodTrace [Method=" + Method.toString() + ", Requirement=" + Requirement + ", gold=" + gold + ", prediction="
				+ prediction + ", goldfinal=" + goldfinal + "]";
	}
	

}