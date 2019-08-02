package Chess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.jdt.core.search.MethodNameMatch;

import ALGO.AlgoFinal;
import ALGO.DatabaseInput;
import ALGO.DatabaseReading;
import ALGO.ENTGoldValues;
import ALGO.MethodList;
import ALGO.Prediction;
import ALGO.PredictionValues;

import Tables.methodcalls;
import mypackage.ClassTrace2;
import mypackage.Method;
import mypackage.MethodTrace;
import mypackage.Requirement;

public class LogInfo {
	String MethodID; 
	String MethodName; 
	String RequirementID; 
	String RequirementName; 
	String ClassID; 
	String ClassName; 
	String TraceValue;
	String TraceClassOldValue; 
	String TraceClassNewValue; 
	String Prediction; 
	public String PrecisionRecall; 
	String GoldFinal; 
	public static BufferedWriter bwchessRunResultsWriter =null; 
	public static BufferedWriter bwGanttRunResultsWriter =null; 
	public static BufferedWriter bwJHotDrawRunResultsWriter =null; 
	public static BufferedWriter bwiTrustRunResultsWriter =null; 

	String SubjectGold; 
	public String PredictionSummary=""; 
	public String MethodGoldSummary=""; 
	public String ClassGeneralizedPredictionSummary=""; 

	List<String> IterationValues= new ArrayList<String>();
	boolean SubjectDeveloperEqualityFlag; 
	String Reason; 
	String input =""; 
	List<String> ExtendedCallersText;
	
	List<String> ClassCalleesOwnerClasses;
	List<String> ClassCallersOwnerClasses;
	int ClassMethodsSize=0; 
	
	List<String> Callers; 
	List<String> CallersPredictions; 
	List<String> CallersOwners; 
	
	List<String> CallersCallers; 
	List<String> CallersCallersPredictions; 
	List<String> CallersCallersOwners; 
	
	
	List<String> CalleesCallees; 
	List<String> CalleesCalleesPredictions; 
	List<String> CalleesCalleesOwners; 
	
	
	public String getClassGoldSummary() {
		return ClassGeneralizedPredictionSummary;
	}
	public void setClassGoldSummary(String classGoldSummary) {
		ClassGeneralizedPredictionSummary = classGoldSummary;
	}
	List<String> Callees; 
	List<String> CalleesPredictions; 
	List<String> CalleesOwners; 
	
	List<String> InterfaceCallers;
	List<String> InterfaceCallerPredictions;
	List<String> InterfaceCallersOwners;
	
	List<String> SuperclassCallers;
	List<String> SuperclassCallerPredictions;
	List<String> SuperclassCallersOwners;
	
	List<String> ImplementationCallers;
	List<String> ImplementationCallerPredictions;
	List<String> ImplementationCallersOwners;
	
	List<String> ChildrenCallers;
	List<String> ChildrenCallerPredictions;
	List<String> ChildrenCallersOwners;

	
	List<String> ImplementationCallees;
	List<String> ImplementationCalleePredictions;
	List<String> ImplementationCalleesOwners;

	

	List<String> ChildrenCallees;
	List<String> ChildrenCalleePredictions;
	List<String> ChildrenCalleesOwners;

	List<String> SuperclassCallees;
	List<String> SuperclassCalleePredictions;
	List<String> SuperclassCalleesOwners;

	
	public List<String> CalleesCalleesInterfaceInheritance; 
	public List<String> CalleesCalleesInterfaceInheritancePredictions; 
	public List<String> CalleesCalleesInterfaceInheritanceOwners; 

	
	
	public List<String> ExtendedCallersFinal; 
	public List<String> ExtendedCalleesFinal; 
	public List<String> ExtendedCallersPredictionsFinal; 
	public List<String> ExtendedCalleesPredictionsFinal; 
	public List<String> ExtendedOwnerCalleesFinal; 
	public List<String> ExtendedOwnerCallersFinal; 
	
	
	public List<String> ExecutedCallers; 
	public List<String> ExecutedCallersPredictions; 
	public List<String> ExecutedOwnerCallers; 
	public List<String> ExecutedCallees; 
	public List<String> ExecutedCalleesPredictions; 
	public List<String> ExecutedOwnerCallees; 
	String predictionGeneralization; 
	
	public List<String> Parents; 
	public List<String> ParentsPredictions; 
	public List<String> Children; 
	public List<String> ChildrenPredictions; 
	public List<String> Interfaces; 
	public List<String> InterfacesPredictions; 
	public List<String> Implementations; 
	public List<String> ImplementationsPredictions; 
	
	
	

	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getInputState() {
		return input;
	}
	public void setInputState(String inputState) {
		this.input = inputState;
	}
	public String getPredictionGeneralization() {
		return predictionGeneralization;
	}
	public void setPredictionGeneralization(String predictionGeneralization) {
		this.predictionGeneralization = predictionGeneralization;
	}
	public List<String> getCalleesCallees() {
		return CalleesCallees;
	}
	public void setCalleesCallees(List<String> calleesCallees) {
		CalleesCallees = calleesCallees;
	}
	public List<String> getCalleesCalleesPredictions() {
		return CalleesCalleesPredictions;
	}
	public void setCalleesCalleesPredictions(List<String> calleesCalleesPredictions) {
		CalleesCalleesPredictions = calleesCalleesPredictions;
	}
	public List<String> getCalleesCalleesOwners() {
		return CalleesCalleesOwners;
	}
	public void setCalleesCalleesOwners(List<String> calleesCalleesOwners) {
		CalleesCalleesOwners = calleesCalleesOwners;
	}
	public List<String> getExecutedCallers() {
		return ExecutedCallers;
	}
	public void setExecutedCallers(List<String> executedCallers) {
		ExecutedCallers = executedCallers;
	}
	public List<String> getExecutedCallersPredictions() {
		return ExecutedCallersPredictions;
	}
	public void setExecutedCallersPredictions(List<String> executedCallersPredictions) {
		ExecutedCallersPredictions = executedCallersPredictions;
	}
	public List<String> getExecutedOwnerCallers() {
		return ExecutedOwnerCallers;
	}
	public void setExecutedOwnerCallers(List<String> executedOwnerCallers) {
		ExecutedOwnerCallers = executedOwnerCallers;
	}
	public List<String> getExecutedCallees() {
		return ExecutedCallees;
	}
	public void setExecutedCallees(List<String> executedCallees) {
		ExecutedCallees = executedCallees;
	}
	public List<String> getExecutedCalleesPredictions() {
		return ExecutedCalleesPredictions;
	}
	public void setExecutedCalleesPredictions(List<String> executedCalleesPredictions) {
		ExecutedCalleesPredictions = executedCalleesPredictions;
	}
	public List<String> getExecutedOwnerCallees() {
		return ExecutedOwnerCallees;
	}
	public void setExecutedOwnerCallees(List<String> executedOwnerCallees) {
		ExecutedOwnerCallees = executedOwnerCallees;
	}
	public List<String> getCalleesCalleesInterfaceInheritancePredictions() {
		return CalleesCalleesInterfaceInheritancePredictions;
	}
	public void setCalleesCalleesInterfaceInheritancePredictions(
			List<String> calleesCalleesInterfaceInheritancePredictions) {
		CalleesCalleesInterfaceInheritancePredictions = calleesCalleesInterfaceInheritancePredictions;
	}
	public List<String> getCalleesCalleesInterfaceInheritanceOwners() {
		return CalleesCalleesInterfaceInheritanceOwners;
	}
	public void setCalleesCalleesInterfaceInheritanceOwners(List<String> calleesCalleesInterfaceInheritanceOwners) {
		CalleesCalleesInterfaceInheritanceOwners = calleesCalleesInterfaceInheritanceOwners;
	}
	public List<String> getCalleesCalleesInterfaceInheritance() {
		return CalleesCalleesInterfaceInheritance;
	}
	public void setCalleesCalleesInterfaceInheritance(List<String> calleesCalleesInterfaceInheritance) {
		CalleesCalleesInterfaceInheritance = calleesCalleesInterfaceInheritance;
	}
	public List<String> getImplementationCallers() {
		return ImplementationCallers;
	}
	public void setImplementationCallers(List<String> implementationCallers) {
		ImplementationCallers = implementationCallers;
	}
	public List<String> getImplementationCallerPredictions() {
		return ImplementationCallerPredictions;
	}
	public void setImplementationCallerPredictions(List<String> implementationCallerPredictions) {
		ImplementationCallerPredictions = implementationCallerPredictions;
	}
	public List<String> getImplementationCallersOwners() {
		return ImplementationCallersOwners;
	}
	public void setImplementationCallersOwners(List<String> implementationCallersOwners) {
		ImplementationCallersOwners = implementationCallersOwners;
	}
	public List<String> getChildrenCallers() {
		return ChildrenCallers;
	}
	public void setChildrenCallers(List<String> childrenCallers) {
		ChildrenCallers = childrenCallers;
	}
	public List<String> getChildrenCallerPredictions() {
		return ChildrenCallerPredictions;
	}
	public void setChildrenCallerPredictions(List<String> childrenCallerPredictions) {
		ChildrenCallerPredictions = childrenCallerPredictions;
	}
	public List<String> getChildrenCallersOwners() {
		return ChildrenCallersOwners;
	}
	public void setChildrenCallersOwners(List<String> childrenCallersOwners2) {
		ChildrenCallersOwners = childrenCallersOwners2;
	}
	public List<String> getSuperclassCallees() {
		return SuperclassCallees;
	}
	public void setSuperclassCallees(List<String> superclassCallees) {
		SuperclassCallees = superclassCallees;
	}
	public List<String> getSuperclassCalleePredictions() {
		return SuperclassCalleePredictions;
	}
	public void setSuperclassCalleePredictions(List<String> superclassCalleePredictions) {
		SuperclassCalleePredictions = superclassCalleePredictions;
	}
	public List<String> getSuperclassCalleesOwners() {
		return SuperclassCalleesOwners;
	}
	public void setSuperclassCalleesOwners(List<String> superclassCalleesOwners) {
		SuperclassCalleesOwners = superclassCalleesOwners;
	}
	public List<String> getExtendedOwnerCalleesFinal() {
		return ExtendedOwnerCalleesFinal;
	}
	public void setExtendedOwnerCalleesFinal(List<String> extendedOwnerCalleesFinal) {
		ExtendedOwnerCalleesFinal = extendedOwnerCalleesFinal;
	}
	public List<String> getExtendedOwnerCallersFinal() {
		return ExtendedOwnerCallersFinal;
	}
	public void setExtendedOwnerCallersFinal(List<String> extendedOwnerCallersFinal) {
		ExtendedOwnerCallersFinal = extendedOwnerCallersFinal;
	}
	public List<String> getExtendedCallersFinal() {
		return ExtendedCallersFinal;
	}
	public void setExtendedCallersFinal(List<String> extendedCallersFinal) {
		ExtendedCallersFinal = extendedCallersFinal;
	}
	public List<String> getExtendedCalleesFinal() {
		return ExtendedCalleesFinal;
	}
	public void setExtendedCalleesFinal(List<String> extendedCalleesFinal) {
		ExtendedCalleesFinal = extendedCalleesFinal;
	}
	public List<String> getExtendedCallersPredictionsFinal() {
		return ExtendedCallersPredictionsFinal;
	}
	public void setExtendedCallersPredictionsFinal(List<String> extendedCallersPredictionsFinal) {
		ExtendedCallersPredictionsFinal = extendedCallersPredictionsFinal;
	}
	public List<String> getExtendedCalleesPredictionsFinal() {
		return ExtendedCalleesPredictionsFinal;
	}
	public void setExtendedCalleesPredictionsFinal(List<String> extendedCalleesPredictionsFinal) {
		ExtendedCalleesPredictionsFinal = extendedCalleesPredictionsFinal;
	}
	
	public List<String> getCallersCallers() {
		return CallersCallers;
	}
	public void setCallersCallers(List<String> callersCallers) {
		CallersCallers = callersCallers;
	}
	public List<String> getCallersCallersPredictions() {
		return CallersCallersPredictions;
	}
	public void setCallersCallersPredictions(List<String> callersCallersPredictions) {
		CallersCallersPredictions = callersCallersPredictions;
	}
	public List<String> getCallersCallersOwners() {
		return CallersCallersOwners;
	}
	public void setCallersCallersOwners(List<String> callersCallersOwners) {
		CallersCallersOwners = callersCallersOwners;
	}
	public List<String> getCallersPredictions() {
		return CallersPredictions;
	}
	public void setCallersPredictions(List<String> callersPredictions) {
		CallersPredictions = callersPredictions;
	}
	public List<String> getCallersOwners() {
		return CallersOwners;
	}
	public void setCallersOwners(List<String> callersOwners) {
		CallersOwners = callersOwners;
	}
	public List<String> getCalleesPredictions() {
		return CalleesPredictions;
	}
	public void setCalleesPredictions(List<String> calleesPredictions) {
		CalleesPredictions = calleesPredictions;
	}
	public List<String> getCalleesOwners() {
		return CalleesOwners;
	}
	public void setCalleesOwners(List<String> calleesOwners2) {
		CalleesOwners = calleesOwners2;
	}
	
	public List<String> getImplementationCalleesOwners() {
		return ImplementationCalleesOwners;
	}
	public void setImplementationCalleesOwners(List<String> implementationCalleesOwners) {
		ImplementationCalleesOwners = implementationCalleesOwners;
	}
	public List<String> getInterfaceCallersOwners() {
		return InterfaceCallersOwners;
	}
	public void setInterfaceCallersOwners(List<String> interfaceCallersOwners) {
		InterfaceCallersOwners = interfaceCallersOwners;
	}
	public List<String> getChildrenCalleesOwners() {
		return ChildrenCalleesOwners;
	}
	public void setChildrenCalleesOwners(List<String> childrenCalleesOwners) {
		ChildrenCalleesOwners = childrenCalleesOwners;
	}
	public List<String> getSuperclassCallersOwners() {
		return SuperclassCallersOwners;
	}
	public void setSuperclassCallersOwners(List<String> superclassCallersOwners) {
		SuperclassCallersOwners = superclassCallersOwners;
	}
	
	public List<String> getImplementations() {
		return Implementations;
	}
	public void setImplementations(List<String> implementations) {
		Implementations = implementations;
	}
	public List<String> getInterfaces() {
		return Interfaces;
	}
	public void setInterfaces(List<String> interfaces) {
		Interfaces = interfaces;
	}
	public List<String> getSuperclasses() {
		return Superclasses;
	}
	public void setSuperclasses(List<String> superclasses) {
		Superclasses = superclasses;
	}
	List<String> ExtendedCallerPredictions;
	List<String> ExtendedCalleesText;
	List<String> ExtendedCalleePredictions;
	List<String> OuterCalleesPredictions;
	List<String> OuterCallersPredictions;
	
	
	List<String> OuterOwnerCalleesPredictions;
	List<String> OuterOwnerCallersPredictions;
	
	
	List<String> OuterOwnerCallees;
	List<String> OuterOwnerCallers;
	

	
	public List<String> CallersText;
	public List<String> CallerPredictionsText;
	public List<String> CalleesText;
	public List<String> CalleePredictionsText;
	
	List<String> ImplementationOwners;
	List<String> InterfaceOwners;
	List<String> SuperclassOwners;
	List<String> ChildrenOwners;
	
	List<String> ImplementationOwnersPredictions;
	List<String> InterfaceOwnersPredictions;
	List<String> SuperclassOwnersPredictions;
	List<String> ChildrenOwnersPredictions;
	
	
//	List<String> Implementations;
//	List<String> Interfaces;
	List<String> Superclasses;
//	List<String> Children;
	
	List<String> ImplementationPredictions;
	List<String> InterfacePredictions;
	List<String> SuperclassPredictions;
//	List<String> ChildrenPredictions;
	
	
	
	
	

	public List<String> getClassCalleesOwnerClasses() {
		return ClassCalleesOwnerClasses;
	}
	public List<String> getParents() {
		return Parents;
	}
	public void setParents(List<String> parents) {
		Parents = parents;
	}
	public List<String> getParentsPredictions() {
		return ParentsPredictions;
	}
	public void setParentsPredictions(List<String> parentsPredictions) {
		ParentsPredictions = parentsPredictions;
	}
	public List<String> getInterfacesPredictions() {
		return InterfacesPredictions;
	}
	public void setInterfacesPredictions(List<String> interfacesPredictions) {
		InterfacesPredictions = interfacesPredictions;
	}
	public List<String> getImplementationsPredictions() {
		return ImplementationsPredictions;
	}
	public void setImplementationsPredictions(List<String> implementationsPredictions) {
		ImplementationsPredictions = implementationsPredictions;
	}
	public void setClassCalleesOwnerClasses(List<String> classCalleesOwnerClasses) {
		ClassCalleesOwnerClasses = classCalleesOwnerClasses;
	}
	public List<String> getClassCallersOwnerClasses() {
		return ClassCallersOwnerClasses;
	}
	public void setClassCallersOwnerClasses(List<String> classCallersOwnerClasses) {
		ClassCallersOwnerClasses = classCallersOwnerClasses;
	}
	public int getClassMethodsSize() {
		return ClassMethodsSize;
	}
	public void setClassMethodsSize(int classMethodsSize) {
		ClassMethodsSize = classMethodsSize;
	}
	public List<String> getImplementation() {
		return Implementations;
	}
	public void setImplementation(List<String> implementation) {
		Implementations = implementation;
	}
	public List<String> getInterface() {
		return Interfaces;
	}
	public void setInterface(List<String> interface1) {
		Interfaces = interface1;
	}
	public List<String> getSuperclass() {
		return Superclasses;
	}
	public void setSuperclass(List<String> superclass) {
		Superclasses = superclass;
	}
	public List<String> getChildren() {
		return Children;
	}
	public void setChildren(List<String> children) {
		Children = children;
	}
	public List<String> getImplementationPredictions() {
		return ImplementationPredictions;
	}
	public void setImplementationPredictions(List<String> implementationsPredictions2) {
		ImplementationPredictions = implementationsPredictions2;
	}
	public List<String> getInterfacePredictions() {
		return InterfacePredictions;
	}
	public void setInterfacePredictions(List<String> interfacePredictions) {
		InterfacePredictions = interfacePredictions;
	}
	public List<String> getSuperclassPredictions() {
		return SuperclassPredictions;
	}
	public void setSuperclassPredictions(List<String> superclassPredictions) {
		SuperclassPredictions = superclassPredictions;
	}
	public List<String> getChildrenPredictions() {
		return ChildrenPredictions;
	}
	public void setChildrenPredictions(List<String> childrenPredictions2) {
		ChildrenPredictions = childrenPredictions2;
	}
	public List<String> getImplementationOwners() {
		return ImplementationOwners;
	}
	public void setImplementationOwners(List<String> implementationOwners) {
		ImplementationOwners = implementationOwners;
	}
	public List<String> getInterfaceOwners() {
		return InterfaceOwners;
	}
	public void setInterfaceOwners(List<String> interfaceOwners) {
		InterfaceOwners = interfaceOwners;
	}
	public List<String> getSuperclassOwners() {
		return SuperclassOwners;
	}
	public void setSuperclassOwners(List<String> superclassOwners) {
		SuperclassOwners = superclassOwners;
	}
	public List<String> getChildrenOwners() {
		return ChildrenOwners;
	}
	public void setChildrenOwners(List<String> childrenOwners) {
		ChildrenOwners = childrenOwners;
	}
	public List<String> getImplementationOwnersPredictions() {
		return ImplementationOwnersPredictions;
	}
	public void setImplementationOwnersPredictions(List<String> implementationOwnersPredictions) {
		ImplementationOwnersPredictions = implementationOwnersPredictions;
	}
	public List<String> getInterfaceOwnersPredictions() {
		return InterfaceOwnersPredictions;
	}
	public void setInterfaceOwnersPredictions(List<String> interfaceOwnersPredictions) {
		InterfaceOwnersPredictions = interfaceOwnersPredictions;
	}
	public List<String> getSuperclassOwnersPredictions() {
		return SuperclassOwnersPredictions;
	}
	public void setSuperclassOwnersPredictions(List<String> superclassOwnersPredictions) {
		SuperclassOwnersPredictions = superclassOwnersPredictions;
	}
	public List<String> getChildrenOwnersPredictions() {
		return ChildrenOwnersPredictions;
	}
	public void setChildrenOwnersPredictions(List<String> childrenOwnersPredictions) {
		ChildrenOwnersPredictions = childrenOwnersPredictions;
	}
	public List<String> getOuterOwnerCalleesPredictions() {
		return OuterOwnerCalleesPredictions;
	}
	public void setOuterOwnerCalleesPredictions(List<String> outerOwnerCalleesPredictions) {
		OuterOwnerCalleesPredictions = outerOwnerCalleesPredictions;
	}
	public List<String> getOuterOwnerCallersPredictions() {
		return OuterOwnerCallersPredictions;
	}
	public void setOuterOwnerCallersPredictions(List<String> outerOwnerCallersPredictions) {
		OuterOwnerCallersPredictions = outerOwnerCallersPredictions;
	}
	public List<String> getOuterOwnerCallees() {
		return OuterOwnerCallees;
	}
	public void setOuterOwnerCallees(List<String> outerOwnerCallees) {
		OuterOwnerCallees = outerOwnerCallees;
	}
	public List<String> getOuterOwnerCallers() {
		return OuterOwnerCallers;
	}
	public void setOuterOwnerCallers(List<String> outerOwnerCallers) {
		OuterOwnerCallers = outerOwnerCallers;
	}
	public List<String> getImplementationCallees() {
		return ImplementationCallees;
	}
	public void setImplementationCallees(List<String> implementationCallees) {
		ImplementationCallees = implementationCallees;
	}
	public List<String> getImplementationCalleePredictions() {
		return ImplementationCalleePredictions;
	}
	public void setImplementationCalleePredictions(List<String> implementationCalleePredictions) {
		ImplementationCalleePredictions = implementationCalleePredictions;
	}
	public List<String> getInterfaceCallers() {
		return InterfaceCallers;
	}
	public void setInterfaceCallers(List<String> interfaceCallers) {
		InterfaceCallers = interfaceCallers;
	}
	public List<String> getInterfaceCallerPredictions() {
		return InterfaceCallerPredictions;
	}
	public void setInterfaceCallerPredictions(List<String> interfaceCallerPredictions) {
		InterfaceCallerPredictions = interfaceCallerPredictions;
	}
	public List<String> getChildrenCallees() {
		return ChildrenCallees;
	}
	public void setChildrenCallees(List<String> childrenCallees) {
		ChildrenCallees = childrenCallees;
	}
	public List<String> getChildrenCalleePredictions() {
		return ChildrenCalleePredictions;
	}
	public void setChildrenCalleePredictions(List<String> childrenCalleePredictions) {
		ChildrenCalleePredictions = childrenCalleePredictions;
	}
	public List<String> getSuperclassCallers() {
		return SuperclassCallers;
	}
	public void setSuperclassCallers(List<String> superclassCallers) {
		SuperclassCallers = superclassCallers;
	}
	public List<String> getSuperclassCallerPredictions() {
		return SuperclassCallerPredictions;
	}
	public void setSuperclassCallerPredictions(List<String> superclassCallerPredictions) {
		SuperclassCallerPredictions = superclassCallerPredictions;
	}
	
	public List<String> getCallers() {
		return Callers;
	}
	public void setCallers(List<String> callers) {
		Callers = callers;
	}
	public List<String> getCallerPredictions() {
		return CallerPredictionsText;
	}
	public void setCallerPredictions(List<String> originalCallerPredictions) {
		CallerPredictionsText = originalCallerPredictions;
	}
	public List<String> getCallees() {
		return CalleesText;
	}
	
	public void setCallees(List<String> callees) {
		Callees = callees;
	}
	public void setCalleePredictions(List<String> originalCalleePredictions) {
		CalleePredictionsText = originalCalleePredictions;
	}
	public static BufferedWriter bwfile4 = null;
	public static BufferedWriter bwfile3 = null;
	public static BufferedWriter bwfile2 = null;
	public static BufferedWriter bwfileChess = null;

	
	public static BufferedWriter bwInterfacesImpChess = null;
	public static BufferedWriter bwSuperclassesChildrenChess = null;
	public static BufferedWriter bwInterfacesImpGantt = null;
	public static BufferedWriter bwSuperclassesChildrenGantt = null;
	public static BufferedWriter bwInterfacesImpiTrust = null;
	public static BufferedWriter bwSuperclassesChildreniTrust = null;	
	public static BufferedWriter bwInterfacesImpJHotDraw = null;
	public static BufferedWriter bwSuperclassesChildrenJHotDraw = null;
	
	
	
	public static BufferedWriter bwfile3Chess =null; 
	public static BufferedWriter bwfile3jHotDraw =null; 

	
	public List<String> getOuterCalleesPredictions() {
		return OuterCalleesPredictions;
	}
	public void setOuterCalleesPredictions(List<String> outerCalleesPredictions) {
		OuterCalleesPredictions = outerCalleesPredictions;
	}
	public List<String> getOuterCallersPredictions() {
		return OuterCallersPredictions;
	}
	public void setOuterCallersPredictions(List<String> outerCallersPredictions) {
		OuterCallersPredictions = outerCallersPredictions;
	}
	
	public static BufferedWriter bwchessMethodCallsWriter =null; 
	public static BufferedWriter bwGANTTMethodCallsWriter =null; 
	public static BufferedWriter bwiTrustMethodCallsWriter =null; 
	public static BufferedWriter bwJHotDrawMethodCallsWriter =null; 
	
	public static BufferedWriter bwChessClassTracesWriter =null; 
	public static BufferedWriter bwGanttClassTracesWriter =null; 
	public static BufferedWriter bwiTrustClassTracesWriter =null; 
	public static BufferedWriter bwJHotDrawClassTracesWriter =null; 


	public static BufferedWriter bwfile1 = null;
	public static BufferedWriter bwMatrix = null;

	public static BufferedWriter bwTraceClass = null;
	public static BufferedWriter bwfileCumulative = null;
	public List<String> getExtendedCallers() {
		return ExtendedCallersText;
	}
	public void setExtendedCallers(List<String> callers) {
		ExtendedCallersText = callers;
	}
	public List<String> getExtendedCallerPredictions() {
		return ExtendedCallerPredictions;
	}
	public void setExtendedCallerPredictions(List<String> callerPredictions) {
		ExtendedCallerPredictions = callerPredictions;
	}
	public List<String> getExtendedCallees() {
		return ExtendedCalleesText;
	}
	public void setExtendedCallees(List<String> callees) {
		ExtendedCalleesText = callees;
	}
	public List<String> getExtendedCalleePredictions() {
		return ExtendedCalleePredictions;
	}
	public void setExtendedCalleePredictions(List<String> calleePredictions) {
		ExtendedCalleePredictions = calleePredictions;
	}
	public boolean isSubjectDeveloperEqual() {
		return SubjectDeveloperEqualityFlag;
	}
	public void setSubjectDeveloperEqualityFlag(boolean myFlag) {
		this.SubjectDeveloperEqualityFlag = myFlag;
	}
	public String getGoldFinal() {
		return GoldFinal;
	}
	public void setGoldFinal(String goldFinal) {
		GoldFinal = goldFinal;
	}
	public String getSubjectGold() {
		return SubjectGold;
	}
	public void setSubjectGold(String subjectGold) {
		SubjectGold = subjectGold;
	}
	public String getPrediction() {
		return Prediction;
	}
	public void setPrediction(String prediction) {
		Prediction = prediction;
	}
	public String getTraceClassOldValue() {
		return TraceClassOldValue;
	}
	public void setTraceClassOldValue(String traceClassOldValue) {
		TraceClassOldValue = traceClassOldValue;
	}
	public String getTraceClassNewValue() {
		return TraceClassNewValue;
	}
	public void setTraceClassNewValue(String traceClassNewValue) {
		TraceClassNewValue = traceClassNewValue;
	}
	public String getMethodID() {
		return MethodID;
	}
	public void setMethodID(String methodID) {
		MethodID = methodID;
	}
	public String getMethodName() {
		return MethodName;
	}
	public void setMethodName(String methodName) {
		MethodName = methodName;
	}
	public String getClassID() {
		return ClassID;
	}
	public void setClassID(String classID) {
		ClassID = classID;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public String getTraceValue() {
		return TraceValue;
	}
	public void setTraceValue(String traceValue) {
		TraceValue = traceValue;
	}
	public List<String> getIterationValues() {
		return IterationValues;
	}
	public void setIterationValues(List<String> iterationValues) {
		IterationValues = iterationValues;
	}
	
	
	
	
	public String getPrecisionRecall() {
		return PrecisionRecall;
	}
	public void setPrecisionRecall(String precisionRecall) {
		PrecisionRecall = precisionRecall;
	}
	public LogInfo() {
		super();
	}
	
	
	
	
	@Override
	public String toString() {
//		System.out.println(MethodName);
		MethodName=MethodName.replaceAll(",", "/"); 
		RequirementName=RequirementName.replaceAll(",", "/"); 
		String CalleesList=""; 
		String CalleesOwnersList=""; 
		String CalleesPredictionsList=""; 
		String CallersList=""; 
		String CallersOwnersList=""; 
		String CallersPredictionsList=""; 
		
		String CallersCallersList=""; 
		String CallersCallersOwnersList=""; 
		String CallersCallersPredictionsList=""; 
		
		String CalleesCalleesList=""; 
		String CalleesCalleesOwnersList=""; 
		String CalleesCalleesPredictionsList=""; 
		
		String InterfaceCallerList=""; 
		String InterfaceCallerOwnerList=""; 
		String InterfaceCallerPredictionList=""; 
		String ImplementationCallerList=""; 
		String ImplementationCallerOwnerList=""; 
		String ImplementationCallerPredictionList=""; 
		String ChildrenCallerList=""; 
		String ChildrenCallerOwnerList=""; 
		String ChildrenCallerPredictionList=""; 
		String ImplementationCalleeList=""; 
		String ImplementationCalleeOwnerList=""; 
		String ImplementationCalleePredictionList=""; 
		String SuperclassCallerList=""; 
		String SuperclassCallerOwnerList=""; 
		String SuperclassCallerPredictionList=""; 
		String ChildrenCalleesList=""; 
		String ChildrenCalleeOwnerList=""; 
		String	ChildrenCalleePredictionList=""; 
		String SuperclassCalleesList=""; 
		String SuperclassCalleesOwnerList=""; 
		String SuperclassCalleesPredictionList=""; 
		String ExtendedCalleesList=""; 
		String ExtendedCalleesOwnerList=""; 
		
		if(CallersCallers!=null) {
			 CallersCallersList=toString3(CallersCallers); 
			 CallersCallersOwnersList=toString3List(CallersCallersOwners); 
			 CallersCallersPredictionsList=toString3List(CallersCallersPredictions); 
		}
		
		
		if(CalleesCallees!=null) {
			 CalleesCalleesList=toString3(CalleesCallees); 
			 CalleesCalleesOwnersList=toString3List(CalleesCalleesOwners); 
			 CalleesCalleesPredictionsList=toString3List(CalleesCalleesPredictions); 
		}
		if(Callers!=null) {
			 CallersList=toString3(Callers); 
			 CallersOwnersList=toString3List(CallersOwners); 
			 CallersPredictionsList=toString3List(CallersPredictions); 
		}
	if(Callees!=null) {
		 CalleesList=toString3(Callees); 
		 CalleesOwnersList=toString3List(CalleesOwners); 
		 CalleesPredictionsList=toString3List(CalleesPredictions); 
		
	}
	
		if(InterfaceCallers!=null) {
			 InterfaceCallerList=toString3(InterfaceCallers); 
			 InterfaceCallerOwnerList=toString3List(InterfaceCallersOwners); 
			 InterfaceCallerPredictionList=toString3List(InterfaceCallerPredictions); 
		}
		
		if(ImplementationCallers!=null) {
			 ImplementationCallerList=toString3(ImplementationCallers); 
			 ImplementationCallerOwnerList=toString3List(ImplementationCallersOwners); 
			 ImplementationCallerPredictionList=toString3List(ImplementationCallerPredictions); 
			
		}
		
		if(ChildrenCallers!=null) {
			 ChildrenCallerList=toString3(ChildrenCallers); 
			 ChildrenCallerOwnerList=toString3List(ChildrenCallersOwners); 
			 ChildrenCallerPredictionList=toString3List(ChildrenCallerPredictions); 
		}
		
		
		if(ImplementationCallees!=null) {
			 ImplementationCalleeList=toString3(ImplementationCallees); 
			 ImplementationCalleeOwnerList=toString3List(ImplementationCalleesOwners); 
			 ImplementationCalleePredictionList=toString3List(ImplementationCalleePredictions); 
		}
		
		if(SuperclassCallers!=null) {
			 SuperclassCallerList=toString3(SuperclassCallers); 
			 SuperclassCallerOwnerList=toString3List(SuperclassCallersOwners); 
			 SuperclassCallerPredictionList=toString3List(SuperclassCallerPredictions); 
		}
		
		if(ChildrenCallees!=null) {
			 ChildrenCalleesList=toString3(ChildrenCallees); 
			 ChildrenCalleeOwnerList=toString3List(ChildrenCalleesOwners); 
			 ChildrenCalleePredictionList=toString3List(ChildrenCalleePredictions); 
		}
		
		if(SuperclassCallees!=null) {
			 SuperclassCalleesList=toString3(SuperclassCallees); 
			 SuperclassCalleesOwnerList=toString3List(SuperclassCalleesOwners); 
			 SuperclassCalleesPredictionList=toString3List(SuperclassCalleePredictions); 
		}
		
		String ExtendedCalleesPredictionsList=""; 
		if(ExtendedCalleesFinal!=null) {
			 ExtendedCalleesList=toString3(ExtendedCalleesFinal); 
			 ExtendedCalleesPredictionsList=toString3List(ExtendedCalleesPredictionsFinal); 
		}
		String ExtendedCallersList=""; 
		String ExtendedCallersPredictionsList=""; 
		if(ExtendedCallersFinal!=null) {
		 ExtendedCallersList=toString3(ExtendedCallersFinal); 
		 ExtendedCallersPredictionsList=toString3List(ExtendedCallersPredictionsFinal); 
		}
		String ExtendedOwnerCalleesList=""; 
		String ExtendedOwnerCallersList=""; 
		if(ExtendedOwnerCalleesFinal!=null) {
			 ExtendedOwnerCalleesList=toString3List(ExtendedOwnerCalleesFinal); 
			 ExtendedOwnerCallersList=toString3List(ExtendedOwnerCallersFinal); 
		}
		String CalleesCalleesInterfaceInheritanceList=""; 
		String CalleesCalleesInterfaceInheritanceOwnersList=""; 
		String CalleesCalleesInterfaceInheritancePredictionsList=""; 
		if(CalleesCalleesInterfaceInheritance!=null) {
			 CalleesCalleesInterfaceInheritanceList=toString3(CalleesCalleesInterfaceInheritance); 
			 CalleesCalleesInterfaceInheritanceOwnersList		 =toString3List(CalleesCalleesInterfaceInheritanceOwners); 
			 CalleesCalleesInterfaceInheritancePredictionsList       =toString3List(CalleesCalleesInterfaceInheritancePredictions); 
		}
		String ExecutedCalleesList=""; 
		String ExecutedCalleesPredictionsList=""; 

	if(ExecutedCallees!=null) {
		 ExecutedCalleesList=toString3(ExecutedCallees); 
		 ExecutedCalleesPredictionsList=toString3List(ExecutedCalleesPredictions); 

	}
	String ExecutedCallersList=""; 
	String ExecutedCallersPredictionsList=""; 
	if(ExecutedCallers!=null) {
		 ExecutedCallersList=toString3(ExecutedCallers); 
		 ExecutedCallersPredictionsList=toString3List(ExecutedCallersPredictions); 
	}
	String ExecutedOwnerCalleesList=""; 
		if(ExecutedOwnerCallees!=null) {
			ExecutedOwnerCalleesList=toString3List(ExecutedOwnerCallees); 

		}
		String ExecutedOwnerCallersList=""; 
		if(ExecutedOwnerCallers!=null) {
		 ExecutedOwnerCallersList=toString3List(ExecutedOwnerCallers); 
		}
		String reqClass= RequirementID+"-"+ClassID; 
		String iterfaces=""; 
		if(Interfaces!=null)
		 iterfaces= toString3(Interfaces); 
		String parentsList=""; 
		if(Parents!=null)
		 parentsList = toString3(Parents);
		String parentsPredictionList=""; 
		if(ParentsPredictions!=null)
		 parentsPredictionList = toString3List(ParentsPredictions); 
		String childrenList=""; 
		if(Children!=null)
		 childrenList = toString3(Children); 
		String childrenPredictionList=""; 
		if(ChildrenPredictions!=null)
		 childrenPredictionList = toString3List(ChildrenPredictions); 
		String interfaceList=""; 
		if(Interfaces!=null)
		 interfaceList = toString3(Interfaces); 
		String interfacePredictionList=""; 
		if(InterfacesPredictions!=null)
		 interfacePredictionList = toString3List(InterfacesPredictions); 
		String implementationList=""; 
		if(Implementations!=null)
		 implementationList = toString3(Implementations); 
		String implementationPredictionList=""; 
		if(ImplementationPredictions!=null)
		 implementationPredictionList = toString3List(ImplementationPredictions); 

		
	
		return MethodID+","+MethodName+","+RequirementID+","+RequirementName+","+ClassID+","+ClassName
				
				+","+TraceValue+","+DatabaseInput.OwnerTraceHashMap.get(reqClass)
				+","+interfaceList+","+interfacePredictionList+","+implementationList+","+implementationPredictionList+","+parentsList+","+parentsPredictionList+","+childrenList+","+childrenPredictionList
				
				+","+CallersList+","+CallersPredictionsList+","+CallersOwnersList
				+","+CallersCallersList+","+CallersCallersPredictionsList+","+CallersCallersOwnersList

				+","+InterfaceCallerList+","+InterfaceCallerPredictionList+","+InterfaceCallerOwnerList
		
				+","+SuperclassCallerList+","+SuperclassCallerPredictionList+","+SuperclassCallerOwnerList
				+","+ImplementationCallerList+","+ImplementationCallerPredictionList+","+ImplementationCallerOwnerList
				+","+ChildrenCallerList+","+ChildrenCallerPredictionList+","+ChildrenCallerOwnerList
				
				+","+CalleesList+","+CalleesPredictionsList+","+CalleesOwnersList
				+","+CalleesCalleesList+","+CalleesCalleesPredictionsList+","+CalleesCalleesOwnersList

				+","+ImplementationCalleeList+","+ImplementationCalleePredictionList+","+ImplementationCalleeOwnerList
				+","+ChildrenCalleesList+","+ChildrenCalleePredictionList+","+ChildrenCalleeOwnerList
				+","+SuperclassCalleesList+","+SuperclassCalleesPredictionList+","+SuperclassCalleesOwnerList
				+","+CalleesCalleesInterfaceInheritanceList+","+CalleesCalleesInterfaceInheritancePredictionsList+","+CalleesCalleesInterfaceInheritanceOwnersList

				+","+ExtendedCalleesList+","+ExtendedCalleesPredictionsList+","+ExtendedOwnerCalleesList+","+ExtendedCallersList+","+ExtendedCallersPredictionsList+","+ExtendedOwnerCallersList
				+","+ExecutedCalleesList+","+ExecutedCalleesPredictionsList+","+ExecutedOwnerCalleesList+","+ExecutedCallersList+","+ExecutedCallersPredictionsList+","+ExecutedOwnerCallersList
				+","+input	

				+","+Prediction	
				+","+ predictionGeneralization

				+","+PrecisionRecall	
				+","+PredictionSummary	
				+","+MethodGoldSummary
				+","+ClassGeneralizedPredictionSummary

		+","+	toString2(IterationValues); 
//		return MethodID+","+MethodName+","+RequirementID+","+RequirementName+","+ClassID+","+ClassName+","+TraceValue+","+TraceClassOldValue+","+TraceClassNewValue+","+
//				PrecisionRecall	+","+toString2(IterationValues)+","+TraceValue+"-"+Reason+"-" +PrecisionRecall;
		
	}
	
	public String toString3(List<String> values) {
		// TODO Auto-generated method stub
		String s= ""; 
		int counter=0; 

		 s= String.join("/", values );

		s=s.replaceAll(",","_");
		
		return s; 
	}
	
	
	public String toString3List(List<String> values) {
		// TODO Auto-generated method stub
		String s= ""; 
		int counter=0; 

		 s= String.join("/", values );

		s=s.replaceAll(",","_");
		
		return s; 
	}
	public String getRequirementID() {
		return RequirementID;
	}
	public void setRequirementID(String requirementID) {
		RequirementID = requirementID;
	}
	public String getRequirementName() {
		return RequirementName;
	}
	public void setRequirementName(String requirementName) {
		RequirementName = requirementName;
	}
	public String toString2(List<String> iterationValues2) {
		 String FinalString=""; 
		 int it=0; 
		 Reason=""; 
		for(String s: iterationValues2) {
			if(it+1<iterationValues2.size()) {
				FinalString=FinalString+s+","; 
				
				it++; 	
			}
			
			else if(it+1==iterationValues2.size()) {
				FinalString=FinalString+s; 
				
			}
			if(!s.equals(" ")) {
				Reason=s; 
			}
		}
		return FinalString;
		
	}
	
	
	/************************************************************************************************************************************************/
	/**
	 * @param methodtraces2HashMap **********************************************************************************************************************************************/
	public static LinkedHashMap<String, LogInfo> InitializeLogInfoHashMap(LinkedHashMap<String, LogInfo> LogInfoHashMap,
			Collection<MethodTrace> methodTracesHashmapValues, HashMap<String, MethodTrace> methodtraces2HashMap) {
		// TODO Auto-generated method stub
		for(MethodTrace methodtrace: methodTracesHashmapValues) {
			String Req= methodtrace.getRequirement().ID; 
			String Method= methodtrace.getMethod().ID; 
			LogInfo loginfo= new LogInfo(); 
			String reqMethod= Req+"-"+Method; 
			if (LogInfoHashMap.get(reqMethod) != null) {
				loginfo = LogInfoHashMap.get(reqMethod);
			}

			loginfo.setRequirementID(methodtrace.getRequirement().ID);
			loginfo.setRequirementName(methodtrace.getRequirement().RequirementName);
			loginfo.setMethodID(methodtrace.getMethod().ID);
			loginfo.setMethodName(methodtrace.getMethod().methodname);
			loginfo.setClassID(methodtrace.Method.Owner.ID);
			loginfo.setClassName(methodtrace.Method.Owner.classname);
			loginfo.setTraceValue(methodtrace.getGold());
			loginfo.setGoldFinal(methodtrace.Method.Owner.DeveloperGold);
			loginfo.setSubjectGold(methodtrace.Method.Owner.SubjectGold);
			loginfo.setPrecisionRecall("E");

			
		
			LogInfoHashMap.put(Req+"-"+Method, loginfo); 
			methodtrace.setPrediction(ALGO.Prediction.EInitializedPrediction);

			String traceClassOldValue= methodtrace.Method.Owner.DeveloperGold; 

			
		
			loginfo.setTraceClassOldValue(traceClassOldValue);
			LogInfoHashMap.put(reqMethod, loginfo); 
		}
		return LogInfoHashMap; 
	}
	public static LinkedHashMap<String, LogInfo> InitializeLogInfoHashMapTraceClassNewValue(
			LinkedHashMap<String, LogInfo> LogInfoHashMap, Collection<MethodTrace> methodTracesHashmapValues,
			HashMap<String, MethodTrace> methodtraces2HashMap) {
		// TODO Auto-generated method stub
		for(MethodTrace methodtrace: methodTracesHashmapValues) {
			String Req= methodtrace.getRequirement().ID; 
			String Method= methodtrace.getMethod().ID; 
			
			String reqMethod= Req+"-"+Method; 
		
			
			

			
		
			
			if(LogInfoHashMap.get(reqMethod)!=null) {
				LogInfo	  LogInfo= LogInfoHashMap.get(reqMethod); 
				
				
				if(LogInfo.getTraceClassOldValue().equals("E") && !methodtrace.Method.Owner.DeveloperGold.equals("E")) {
					String traceClassNewValue= methodtrace.Method.Owner.DeveloperGold; 
					LogInfo.setTraceClassNewValue(traceClassNewValue);
					LogInfoHashMap.put(reqMethod, LogInfo); 
				}
				
				
			 }
			
		}
		return LogInfoHashMap;
	}
	public  static void CreateLogFiles(String ProgramName) throws IOException {
		// TODO Auto-generated method stub
		
	

		if (ProgramName.equals("chess")) {
			File filelogChess = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TableLogChess.txt");
			FileOutputStream fosfilChess = new FileOutputStream(filelogChess);
			bwfileChess = new BufferedWriter(new OutputStreamWriter(fosfilChess));
			
		
//			 File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallChess.txt");
//				FileOutputStream fosfila1 = new FileOutputStream(file1log);
//				bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));
			  bwfile1 = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallChess.txt", true));  //Set true for append mode
				
				File  file2log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallChessCumulative.txt");
				FileOutputStream	 fosfila2 = new FileOutputStream(file2log);
					bwfileCumulative = new BufferedWriter(new OutputStreamWriter(fosfila2));
					
					
					
					File  MatrixLog = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TraceMatrixChess.txt");
					FileOutputStream	 fosMatrix = new FileOutputStream(MatrixLog);
						bwMatrix = new BufferedWriter(new OutputStreamWriter(fosMatrix));

				
				File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TracesClassesChess.txt");
				FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
				bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
				
				
				File myfile = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsChess.txt");
				FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
				bwInterfacesImpChess = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
				
				
				File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildrenChess.txt");
				FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
				bwSuperclassesChildrenChess = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
				
				
				File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\ChessFiles\\MethodCalls.txt");
				FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
				 bwchessMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
//				System.out.println("yes");
				 
				 bwChessClassTracesWriter = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TraceClassesChess.txt", true));  //Set true for append mode

					
				
//				File myfile4 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\RunResultsChess.txt");
//				FileOutputStream myFileOutputStream4 = new FileOutputStream(myfile4);
//				 bwchessRunResultsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream4));
				 
				 bwchessRunResultsWriter = new BufferedWriter(new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\RunResultsChess.txt", true));

		}

		if (ProgramName.equals("gantt")) {
			File filelog2 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TableLogGantt.txt");
			FileOutputStream fosfila2 = new FileOutputStream(filelog2);
			bwfile2 = new BufferedWriter(new OutputStreamWriter(fosfila2));

		
//			 File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallGantt.txt");
//				FileOutputStream fosfila1 = new FileOutputStream(file1log);
//				bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));

				  bwfile1 = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallGantt.txt", true));  //Set true for append mode

				File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TracesClassesGantt.txt");
				FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
				bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
		
				File myfile = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsGantt.txt");
				FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
				bwInterfacesImpGantt = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
				
				
				File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildrenGantt.txt");
				FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
				bwSuperclassesChildrenGantt = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
		
				
				File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\GanttFiles\\MethodCalls.txt");
				FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
				 bwGANTTMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
				 
				 bwGanttRunResultsWriter = new BufferedWriter(new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\RunResultsGantt.txt", true));

				 bwGanttClassTracesWriter = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TraceClassesGantt.txt", true));  //Set true for append mode

				
		}

		if (ProgramName.equals("itrust")) {
			File filelog3 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TableLogiTrust.txt");
			FileOutputStream fosfila5 = new FileOutputStream(filelog3);
			bwfile3 = new BufferedWriter(new OutputStreamWriter(fosfila5));
			
			
			
			
//			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecalliTrust.txt");
//			FileOutputStream fosfila1 = new FileOutputStream(file1log);
//			bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));
			  bwfile1 = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecalliTrust.txt", true));  //Set true for append mode

			
			File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TracesClassesiTrust.txt");
			FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
			bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
			
			File myfile = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsiTrust.txt");
			FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
			bwInterfacesImpiTrust = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			
			
			File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildreniTrust.txt");
			FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
			bwSuperclassesChildreniTrust = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
			
			File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\iTrustFiles\\MethodCalls.txt");
			FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
			 bwiTrustMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
			 
			 bwiTrustRunResultsWriter = new BufferedWriter(new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\RunResultsiTrust.txt", true));

			
				 
				 
				 bwiTrustClassTracesWriter = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TraceClassesiTrust.txt", true));  //Set true for append mode

		
		}

		if (ProgramName.equals("jhotdraw")) {
			File filelog4 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TableLogJHotDraw.txt");
			FileOutputStream fosfila4 = new FileOutputStream(filelog4);
			bwfile4 = new BufferedWriter(new OutputStreamWriter(fosfila4));
			
			
				
				
//				File file1log = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallJHotDraw.txt");
//				FileOutputStream fosfila1 = new FileOutputStream(file1log);
//				bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));

				  bwfile1 = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\PrecisionRecallJHotDraw.txt", true));  //Set true for append mode

				File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TracesClassesJHotDraw.txt");
				FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
				bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
				
				
				File myfile = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsJHotDraw.txt");
				FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
				bwInterfacesImpJHotDraw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
				
				
				File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildrenJHotDraw.txt");
				FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
				bwSuperclassesChildrenJHotDraw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
			
				File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\JHotDrawFiles\\MethodCalls.txt");
				FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
				 bwJHotDrawMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
				 
				 bwJHotDrawRunResultsWriter = new BufferedWriter(new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\RunResultsJHotDraw.txt", true));

				 
			
					 
					 
					 
					 bwJHotDrawClassTracesWriter = new BufferedWriter( new FileWriter("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TraceClassesJHotDraw.txt", true));  //Set true for append mode

				
		}
		// bwfile2.newLine();
		

	}
	
	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	/**
	 * @param ownerClassPredictionValues 
	 * @param logInfoHashMap 
	 * @param string2 
	 * @param string 
	 * @throws CloneNotSupportedException **********************************************************************************************************************************************/

	public static void ComputePrecisionAndRecallNONCUMULATIVE(
			HashMap<String, MethodTrace> methodTraceHashMap,
			PredictionEvaluation Pattern, String ProgramName,  PredictionValues ownerClassPredictionValues, LinkedHashMap<String, LogInfo> logInfoHashMap) throws SQLException, CloneNotSupportedException {
		// TODO Auto-generated method stub
	Pattern.ResetCounters(Pattern);
	int count=0; 
	
	
		for (String mykey : methodTraceHashMap.keySet()) {
			MethodTrace methodTrace = methodTraceHashMap.get(mykey);
			String reqClass=methodTrace.Requirement.ID+"-"+ methodTrace.Method.Owner.ID; 
			ClassTrace2 entry = DatabaseInput.classTraceHashMap.get(reqClass); 

			/**********************************************************************************************/
			/**********************************************************************************************/
			//GENERALIZE THE METHOD TO REQUIREMENT PREDICTIONS INTO CLASS TO REQUIREMENT PREDICTIONS 
				HashMap<String, MethodTrace> methodsList = DatabaseInput.OwnerClassestoMethodsHashMap.get(methodTrace.Requirement.ID+"-"+methodTrace.Method.Owner.ID); 
			  Collection<MethodTrace> methodtraces = methodsList.values();
			  if(methodtraces.stream().filter(o -> o.getPrediction().PredictionValue.equals("T")).findFirst().isPresent()) {
				  methodTrace.setClassPredictionGeneralized("T");
				  logInfoHashMap.get(mykey).setPredictionGeneralization("T");
			  
			  }else if(methodtraces.stream().filter(o -> o.getPrediction().PredictionValue.equals("E")).findFirst().isPresent()) {
				  methodTrace.setClassPredictionGeneralized("E");
				  logInfoHashMap.get(mykey).setPredictionGeneralization("E");

			  }else {
				  methodTrace.setClassPredictionGeneralized("N");
				  logInfoHashMap.get(mykey).setPredictionGeneralization("N");

			  }
				/**********************************************************************************************/
				/**********************************************************************************************/
				ClassTrace2 myclasstrace = DatabaseInput.classTraceHashMap.get(methodTrace.Requirement.ID+"-"+methodTrace.Method.Owner.ID); 
				myclasstrace.setClassPredictionGeneralization(methodTrace.getClassPredictionGeneralized().trim());
				
				entry.ClassPredictionGeneralization=methodTrace.getClassPredictionGeneralized().trim();
				
					
			if((ProgramName.equals("gantt")|| ProgramName.equals("jhotdraw") )&& AlgoFinal.MethodLevelTraces==true){
				
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
//						&& methodTrace.isTraceSet() 
					
						
						
						) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().PredictionValue);
					logInfoHashMap.get(mykey).MethodGoldSummary=methodTrace.getGold().trim()+"/"+methodTrace.getPatternAndType(); 
					logInfoHashMap.get(mykey).ClassGeneralizedPredictionSummary=methodTrace.getClassPredictionGeneralized().trim()+"/"+methodTrace.getPatternAndType(); 

					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					
					ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getGold().trim());
					UpdateCategoryCounters(Result, methodTrace, Pattern, ownerClassPredictionValues, mykey, logInfoHashMap); 
					
				}

			}
			else if((ProgramName.equals("gantt")|| ProgramName.equals("jhotdraw")) && AlgoFinal.ClassLevelTraces==true){
//				System.out.println(mykey+" "+methodTrace.getClassLevelGold());
				
				if (methodTrace.getClassLevelGold() != null && methodTrace.getPrediction() != null 
//						&& methodTrace.isTraceSet()
					) {
//					String Result = Pattern.ComparePredictionToGold(methodTrace.getClassLevelGold(),methodTrace.getClassPredictionGeneralized().trim());
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().PredictionValue);

					logInfoHashMap.get(mykey).MethodGoldSummary=methodTrace.getGold().trim()+"/"+methodTrace.getPatternAndType(); 
					logInfoHashMap.get(mykey).ClassGeneralizedPredictionSummary=methodTrace.getClassPredictionGeneralized().trim()+"/"+methodTrace.getPatternAndType(); 

					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					
					ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getGold().trim());
					UpdateCategoryCounters(Result, methodTrace, Pattern, ownerClassPredictionValues, mykey, logInfoHashMap); 


				}
				

			}
			
			
			
			else if((ProgramName.equals("chess")|| ProgramName.equals("itrust") )&& AlgoFinal.MethodLevelTraces==true) {
				
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
//						&& methodTrace.isTraceSet()
						) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().PredictionValue);
					logInfoHashMap.get(mykey).MethodGoldSummary=methodTrace.getGold().trim()+"/"+methodTrace.getPatternAndType(); 
					logInfoHashMap.get(mykey).ClassGeneralizedPredictionSummary=methodTrace.getClassPredictionGeneralized().trim()+"/"+methodTrace.getPatternAndType(); 

					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					
					ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().PredictionValue.trim());
					UpdateCategoryCounters(Result, methodTrace, Pattern, ownerClassPredictionValues, mykey, logInfoHashMap); 


				}

			}

			else if((ProgramName.equals("chess")|| ProgramName.equals("itrust") )&& AlgoFinal.ClassLevelTraces==true) {
				
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
						) {
//					System.out.println("here");
//					String Result = Pattern.ComparePredictionToGold(methodTrace.getClassLevelGold(),methodTrace.getClassPredictionGeneralized().trim());
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().PredictionValue);

					logInfoHashMap.get(mykey).MethodGoldSummary=methodTrace.getGold().trim()+"/"+methodTrace.getPatternAndType(); 
					logInfoHashMap.get(mykey).ClassGeneralizedPredictionSummary=methodTrace.getClassPredictionGeneralized().trim()+"/"+methodTrace.getPatternAndType(); 

					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					
					ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().PredictionValue.trim());
					UpdateCategoryCounters(Result, methodTrace, Pattern, ownerClassPredictionValues, mykey, logInfoHashMap); 


				}

			}

//			System.out.println(logInfoHashMap.get(mykey).PredictionSummaryPrecisionRecall);


		}
//		System.out.println(Pattern.toString());
		System.out.println(count);
		System.out.println(count);
	}
	
	
	
	
	
	
	private static void UpdateCategoryCounters(String result, MethodTrace methodTrace, PredictionEvaluation pattern, PredictionValues ownerClassPredictionValues, String mykey, LinkedHashMap<String, LogInfo> logInfoHashMap) {
		// TODO Auto-generated method stub
		
		int IterationsSize= logInfoHashMap.get(mykey).IterationValues.size(); 
		if(result.equals("TP") && methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionInner)) {
			pattern.TPPureInnerCount++; 
		}else if(result.equals("TN") && methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionInner)) {
			pattern.TNPureInnerCount++; 
		}else if(result.equals("TP") && methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionInner)) {
			pattern.TPMixedInnerCount++; 
		} 
		else if(result.equals("TN") && methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionInner)) {
			pattern.TNMixedInnerCount++; 
		}
		else if(result.equals("FP") && methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionInner)) {
			pattern.FPPureInnerCount++; 
		}else if(result.equals("FN") && methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionInner)) {
			pattern.FNPureInnerCount++; 
		}else if(result.equals("FP") && methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionInner)) {
			pattern.FPMixedInnerCount++; 
		} 
		else if(result.equals("FN") && methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionInner)) {
			pattern.FNMixedInnerCount++; 
		}
		
		
		/*****************************************************************************/
		else if(result.equals("TP") && methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionLeaf)) {
			pattern.TPPureLeafCount++; 
		}else if(result.equals("TN") && methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionLeaf)) {
			pattern.TNPureLeafCount++; 
		}else if(result.equals("TP") && methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionLeaf)) {
			pattern.TPMixedLeafCount++; 
		} 
		else if(result.equals("TN") && methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionLeaf)) {
			pattern.TNMixedLeafCount++; 
		}
		else if(result.equals("FP") && methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionLeaf)) {
			pattern.FPPureLeafCount++; 
		}else if(result.equals("FN") && methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionLeaf)) {
			pattern.FNPureLeafCount++; 
		}else if(result.equals("FP") && methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionLeaf)) {
			pattern.FPMixedLeafCount++; 
		} 
		else if(result.equals("FN") && methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionLeaf)) {
			pattern.FNMixedLeafCount++; 
		}
		
		
		/*****************************************************************************/

		
		else if(result.equals("TP") && methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionRoot)) {
			pattern.TPPureRootCount++; 
		}else if(result.equals("TN") && methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionRoot)) {
			pattern.TNPureRootCount++; 
		}else if(result.equals("TP") && methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionRoot)) {
			pattern.TPMixedRootCount++; 
		} 
		else if(result.equals("TN") && methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionRoot)) {
			pattern.TNMixedRootCount++; 
		}
		else if(result.equals("FP") && methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionRoot)) {
			pattern.FPPureRootCount++; 
		}else if(result.equals("FN") && methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionRoot)) {
			pattern.FNPureRootCount++; 
		}else if(result.equals("FP") && methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionRoot)) {
			pattern.FPMixedRootCount++; 
		} 
		else if(result.equals("FN") && methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionRoot)) {
			pattern.FNMixedRootCount++; 
		}
		
		/*****************************************************************************/

		
		else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EBoundaryPredictionRoot)) {
			pattern.EBoundaryRootCount++; 
		}else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EUndecidablePredictionRoot)) {
			pattern.EUndecidableRootCount++; 
		}else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EBoundaryPredictionInner)) {
			pattern.EBoundaryInnerCount++; 
		}else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EUndecidablePredictionInner)) {
			pattern.EUndecidableInnerCount++; 
		}else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EBoundaryPredictionLeaf)) {
			pattern.EBoundaryLeafCount++; 
		}else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EUndecidablePredictionLeaf)) {
			pattern.EUndecidableLeafCount++; 
		}
		else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.EIsolatedPrediction)) {
			pattern.EIsolatedECount++; 
		}
		else if(result.equals("E") && methodTrace.getPrediction().equals(ALGO.Prediction.ENotApplicablePrediction)) {
			pattern.ENotApplicableCount++; 
		}
		
		/*********************************************************************************************/
		
		
		if( methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionInner) ) {
			ownerClassPredictionValues.TMixedTInnerCount++; 
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionInner) ) {
			ownerClassPredictionValues.TPureTInnerCount++; 
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionInner) ) {
			ownerClassPredictionValues.NPureNInnerCount++; 
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionInner)) {
			ownerClassPredictionValues.NMixedNInnerCount++;  
		}
		
		else if( methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionLeaf)) {
			ownerClassPredictionValues.NPureNLeafCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionLeaf) ) {
			ownerClassPredictionValues.TPureTLeafCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionLeaf)) {
			ownerClassPredictionValues.NMixedNLeafCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionLeaf)) {
			ownerClassPredictionValues.TMixedTLeafCount++;  
		}
		
		else if( methodTrace.getPrediction().equals(ALGO.Prediction.NPureNPredictionRoot)) {
			ownerClassPredictionValues.NPureNRootCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.TPureTPredictionRoot)) {
			ownerClassPredictionValues.TPureTRootCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.NMixedNPredictionRoot) ) {
			ownerClassPredictionValues.NMixedNRootCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.TMixedTPredictionRoot)) {
			ownerClassPredictionValues.TMixedTRootCount++;  
		}
		
		
		
		else if( methodTrace.getPrediction().equals(ALGO.Prediction.EBoundaryPredictionLeaf)) {
			ownerClassPredictionValues.EBoundaryLeafCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.EUndecidablePredictionLeaf)) {
			ownerClassPredictionValues.EUndecidableLeafCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.EBoundaryPredictionInner)) {
			ownerClassPredictionValues.EBoundaryInnerCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.EUndecidablePredictionInner)) {
			ownerClassPredictionValues.EUndecidableInnerCount++;  
		}
		else if( methodTrace.getPrediction().equals(ALGO.Prediction.EBoundaryPredictionRoot)) {
			ownerClassPredictionValues.EBoundaryRootCount++;  
		}else if( methodTrace.getPrediction().equals(ALGO.Prediction.EUndecidablePredictionRoot)) {
			ownerClassPredictionValues.EUndecidableRootCount++;  
		}
		else if( methodTrace.getPrediction().equals(ALGO.Prediction.EIsolatedPrediction)) {
			ownerClassPredictionValues.EIsolatedECount++; 
		}
		
		else if( methodTrace.getPrediction().equals(ALGO.Prediction.ENotApplicablePrediction)) {
			ownerClassPredictionValues.ENotApplicableCount++; 
		}
	}
	public static void ComputePrecisionAndRecallCUMULATIVE(
			HashMap<String, MethodTrace> methodTraceHashMap,
			PredictionEvaluation Pattern, String ProgramName,  PredictionValues ownerClassPredictionValues, LinkedHashMap<String, LogInfo> logInfoHashMap) throws SQLException {
		// TODO Auto-generated method stub
	Pattern.ResetCounters(Pattern);

		for (String mykey : methodTraceHashMap.keySet()) {
			MethodTrace methodTrace = methodTraceHashMap.get(mykey);
			
			if(ProgramName.equals("gantt")|| ProgramName.equals("jhotdraw")){
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
//						&& methodTraceHashMap.get(mykey).isSubjectDeveloperEqualityFlag()
						) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().PredictionValue.trim());
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					


				}else {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),"E");
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
				}
				
//				ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().trim());

			}else if(ProgramName.equals("chess")|| ProgramName.equals("itrust") ) {
			
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
					) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),
							methodTrace.getPrediction().PredictionValue.trim());
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
				
				


				}
//				ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().trim());

			}

		

			


		}
//		System.out.println(Pattern.toString());

	}
	public static void updateResultsLog(PredictionEvaluation TotalPattern,  PredictionValues ownerClassPredictionValues, String ProgramName, String precisionRecall, String PredictionValues, String Type) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//CODE  TO PASTE INTO EXCEL SPREADSHEET 
		if(Type.equals("INDIVIDUAL") || Type.equals("CUMULATIVE") ) {
			
			//PURE 
			LogInfo.bwfile1.write(ownerClassPredictionValues.TPureTInnerCount+"/"+ownerClassPredictionValues.NPureNInnerCount+"/"+ownerClassPredictionValues.EUndecidableInnerCount+"/"+ownerClassPredictionValues.EBoundaryInnerCount+"/"+
					
					ownerClassPredictionValues.EIsolatedECount+"/"+ ownerClassPredictionValues.ENotApplicableCount
					+"/"+TotalPattern.TPPureInnerCount+"/"+TotalPattern.TNPureInnerCount+"/"+TotalPattern.FPPureInnerCount+"/"+TotalPattern.FNPureInnerCount);
			LogInfo.bwfile1.newLine(); 
			//MIXED 
			LogInfo.bwfile1.write(ownerClassPredictionValues.TMixedTInnerCount+"/"+ownerClassPredictionValues.NMixedNInnerCount+"/"+ownerClassPredictionValues.EUndecidableInnerCount+"/"+ownerClassPredictionValues.EBoundaryInnerCount+"/"+ownerClassPredictionValues.EIsolatedECount
					+"/"+ ownerClassPredictionValues.ENotApplicableCount+"/"+TotalPattern.TPMixedInnerCount+"/"+TotalPattern.TNMixedInnerCount+"/"+TotalPattern.FPMixedInnerCount+"/"+TotalPattern.FNMixedInnerCount);
			LogInfo.bwfile1.newLine(); 
			LogInfo.bwfile1.newLine(); 
			//PURE 
			LogInfo.bwfile1.write(ownerClassPredictionValues.TPureTLeafCount+"/"+ownerClassPredictionValues.NPureNLeafCount+"/"+ownerClassPredictionValues.EUndecidableLeafCount+"/"+ownerClassPredictionValues.EBoundaryLeafCount+"/"+ownerClassPredictionValues.EIsolatedECount
					+"/"+ ownerClassPredictionValues.ENotApplicableCount+"/"+TotalPattern.TPPureLeafCount+"/"+TotalPattern.TNPureLeafCount+"/"+TotalPattern.FPPureLeafCount+"/"+TotalPattern.FNPureLeafCount);
			LogInfo.bwfile1.newLine(); 
			//MIXED 
			LogInfo.bwfile1.write(ownerClassPredictionValues.TMixedTLeafCount+"/"+ownerClassPredictionValues.NMixedNLeafCount+"/"+ownerClassPredictionValues.EUndecidableLeafCount+"/"+ownerClassPredictionValues.EBoundaryLeafCount+"/"+ownerClassPredictionValues.EIsolatedECount
					+"/"+ ownerClassPredictionValues.ENotApplicableCount+"/"+TotalPattern.TPMixedLeafCount+"/"+TotalPattern.TNMixedLeafCount+"/"+TotalPattern.FPMixedLeafCount+"/"+TotalPattern.FNMixedLeafCount);
		
			LogInfo.bwfile1.newLine(); 
			LogInfo.bwfile1.newLine(); 
			//PURE 
			LogInfo.bwfile1.write(ownerClassPredictionValues.TPureTRootCount+"/"+ownerClassPredictionValues.NPureNRootCount+"/"+ownerClassPredictionValues.EUndecidableRootCount+"/"+ownerClassPredictionValues.EBoundaryRootCount+"/"+ownerClassPredictionValues.EIsolatedECount
					+"/"+ ownerClassPredictionValues.ENotApplicableCount+"/"+TotalPattern.TPPureRootCount+"/"+TotalPattern.TNPureRootCount+"/"+TotalPattern.FPPureRootCount+"/"+TotalPattern.FNPureRootCount);
			LogInfo.bwfile1.newLine(); 
			//MIXED 
			LogInfo.bwfile1.write(ownerClassPredictionValues.TMixedTRootCount+"/"+ownerClassPredictionValues.NMixedNRootCount+"/"+ownerClassPredictionValues.EUndecidableRootCount+"/"+ownerClassPredictionValues.EBoundaryRootCount+"/"+ownerClassPredictionValues.EIsolatedECount
					+"/"+ ownerClassPredictionValues.ENotApplicableCount	+"/"+TotalPattern.TPMixedRootCount+"/"+TotalPattern.TNMixedRootCount+"/"+TotalPattern.FPMixedRootCount+"/"+TotalPattern.FNMixedRootCount);
	
			
			LogInfo.bwfile1.newLine(); 
			LogInfo.bwfile1.newLine(); 
			LogInfo.bwfile1.newLine(); 
			
		
			if(Type.equals("CUMULATIVE")) {
//				LogInfo.bwfile1.newLine();
			}
			
		
		}

	}
	public static void updateTableLog(String ProgramName, Collection<MethodTrace> MethodTracesHashmapValues, LinkedHashMap<String, LogInfo> LogInfoHashMap) throws IOException {
		// TODO Auto-generated method stub			
		 // Create a new file output stream.
       		if (ProgramName.equals("chess")) {
			
			LogInfo.bwfileChess.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Interfaces, InterfacesPredictions, Implementations, ImplementationsPredictions, Parents, ParentPredictions, Children, ChildrenPredictions,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
				
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"

					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" ImplementationCallers, ImplementationCallersPredictions, ImplementationCallersOwnerValues,"
					+" ChildrenCallers, ChildrenCallersPredictions, ChildrenCallersOwnerValues,"	
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"

					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" SuperclassCallees, SuperclassCalleesPredictions, SuperclassCalleesOwnerValues,"
					+" CalleesCalleesInterfaceInheritance, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedOwnerCallees, ExtendedCallers, ExtendedCallersPredictions,ExtendedOwnerCallers,"
					+"ExecutedCallees, ExecutedCalleesPredictions, ExecutedOwnerCallees, ExecutedCallers, ExecutedCallersPredictions,ExecutedOwnerCallers,"
					+"InputState,"

					+ "Prediction,"
					+ "ClassPredictionGeneralization,"

					+ "PrecisionRecall,"
					+ "PredictionSummary,"
					+ "MethodGoldSummary,"
					+ "ClassGeneralizedPredictionSummary,"

					+"IterationValues"
					);
			LogInfo.bwfileChess.newLine();
		}
		if (ProgramName.equals("gantt")) {
	
			LogInfo.bwfile2.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Interfaces, InterfacesPredictions, Implementations, ImplementationsPredictions, Parents, ParentPredictions, Children, ChildrenPredictions,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"

					
					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" ImplementationCallers, ImplementationCallersPredictions, ImplementationCallersOwnerValues,"
					+" ChildrenCallers, ChildrenCallersPredictions, ChildrenCallersOwnerValues,"	
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"

					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" SuperclassCallees, SuperclassCalleesPredictions, SuperclassCalleesOwnerValues,"
					+" CalleesCalleesInterfaceInheritance, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedOwnerCallees, ExtendedCallers, ExtendedCallersPredictions,ExtendedOwnerCallers,"
					+"ExecutedCallees, ExecutedCalleesPredictions, ExecutedOwnerCallees, ExecutedCallers, ExecutedCallersPredictions,ExecutedOwnerCallers,"
					+"InputState,"

					+ "Prediction,"
					+ "ClassPredictionGeneralization,"

					+ "PrecisionRecall,"
					
					+ "PredictionSummary,"
					+ "MethodGoldSummary,"
					+ "ClassGeneralizedPredictionSummary,"

					+"IterationValues"
					);
			LogInfo.bwfile2.newLine();
		}
		if (ProgramName.equals("itrust")) {
			

			 // Create a new file output stream.
            PrintStream fileOut = new PrintStream("C:\\Users\\mouna\\ownCloud\\Mouna Hammoudi\\dumps\\LatestLogFiles\\TableLogiTrust.txt");
            
            // Redirect standard out to file.
//            System.setOut(fileOut);
//			System.out.println(
//					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
//					+ "Gold, TraceClassValue,"
//					+" Callers, CallersPredictions, CallersOwnerValues,"
//					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
//					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
//					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"
//					+" InterfaceCallersCallers, InterfaceCallersCallersPredictions, InterfaceCallersCallersOwnerValues,"
//					+" SuperclassCallersCallers, SuperclassCallersCallersPredictions, SuperclassCallersCallersOwnerValues,"
//					
//					+" Callees, CalleesPredictions, CalleesOwnerValues,"
//					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
//					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
//					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"
//					+" ImplementationCalleesCallees, ImplementationCalleesCalleesPredictions, ImplementationCalleesCalleesOwnerValues,"
//					+" ChildrenCalleesCallees, ChildrenCalleesCalleesPredictions, ChildrenCalleesCalleesOwnerValues,"
//					+ "PrecisionRecall,IterationValues"
//					);
			LogInfo.bwfile3.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Interfaces, InterfacesPredictions, Implementations, ImplementationsPredictions, Parents, ParentPredictions, Children, ChildrenPredictions,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"

					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" ImplementationCallers, ImplementationCallersPredictions, ImplementationCallersOwnerValues,"
					+" ChildrenCallers, ChildrenCallersPredictions, ChildrenCallersOwnerValues,"	
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"

					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" SuperclassCallees, SuperclassCalleesPredictions, SuperclassCalleesOwnerValues,"
					+" CalleesCalleesInterfaceInheritance, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedOwnerCallees, ExtendedCallers, ExtendedCallersPredictions,ExtendedOwnerCallers,"
					+"ExecutedCallees, ExecutedCalleesPredictions, ExecutedOwnerCallees, ExecutedCallers, ExecutedCallersPredictions,ExecutedOwnerCallers,"
					+"InputState,"

					+ "Prediction,"
					+ "ClassPredictionGeneralization,"

					+ "PrecisionRecall,"
					
					+ "PredictionSummary,"
					+ "MethodGoldSummary,"
					+ "ClassGeneralizedPredictionSummary,"

					+"IterationValues"
					);
			LogInfo.bwfile3.newLine();
		}
		if (ProgramName.equals("jhotdraw")) {

			LogInfo.bwfile4.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Interfaces, InterfacesPredictions, Implementations, ImplementationsPredictions, Parents, ParentPredictions, Children, ChildrenPredictions,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"

					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" ImplementationCallers, ImplementationCallersPredictions, ImplementationCallersOwnerValues,"
					+" ChildrenCallers, ChildrenCallersPredictions, ChildrenCallersOwnerValues,"	
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"

					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" SuperclassCallees, SuperclassCalleesPredictions, SuperclassCalleesOwnerValues,"
					+" CalleesCalleesInterfaceInheritance, CalleesCalleesInterfaceInheritancePredictions, CalleesCalleesInterfaceInheritanceOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedOwnerCallees, ExtendedCallers, ExtendedCallersPredictions,ExtendedOwnerCallers,"
					+"ExecutedCallees, ExecutedCalleesPredictions, ExecutedOwnerCallees, ExecutedCallers, ExecutedCallersPredictions,ExecutedOwnerCallers,"
					+"InputState,"

					+ "Prediction,"
					+ "ClassPredictionGeneralization,"

					+ "PrecisionRecall,"
					
					+ "PredictionSummary,"
					+ "MethodGoldSummary,"
					+ "ClassGeneralizedPredictionSummary,"

					+"IterationValues"
					);
			LogInfo.bwfile4.newLine();
		}
		int count=0; 
		
		HashMap<String, List<String>> InterfacesImplementationsHashMap= new HashMap<String, List<String>>(); 
		HashMap<String, List<String>> SuperclassChildrenHashMap= new HashMap<String, List<String>>(); 

		for (MethodTrace methodtrace : MethodTracesHashmapValues) {
			String reqmethod = methodtrace.Requirement.ID + "-" + methodtrace.Method.ID;
			
			LogInfoHashMap.get(reqmethod);
		

			if (ProgramName.equals("gantt")) {
				LogInfo.bwfile2.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile2.newLine();
				
			
				
			}
			if (ProgramName.equals("chess")) {
				LogInfo.bwfileChess.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfileChess.newLine();
				
				
				
				
			}
			if (ProgramName.equals("itrust")) {
//				System.out.println(LogInfoHashMap.get(reqmethod).toString());
				
				//UNCOMMENT THESE TWO LINES BELOW 
//				System.out.println(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile3.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile3.newLine();
				
//				System.out.println("=======>"+reqmethod+"------"+count+"---"+LogInfoHashMap.get(reqmethod).toString());
				count++; 
//			
			}
			if (ProgramName.equals("jhotdraw")) {
				LogInfo.bwfile4.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile4.newLine();
				
				
				
				
				
				
			}
		}
		
		
		
		if (ProgramName.equals("chess")) {
			
			LogInfo.bwfileChess.close();
		} else if (ProgramName.equals("gantt")) {
			
			LogInfo.bwfile2.close();
			

		} else if (ProgramName.equals("itrust")) {
		
			LogInfo.bwfile3.close();
		} else if (ProgramName.equals("jhotdraw")) {
			
			LogInfo.bwfile4.close();

		}
	}
	private static void UpdateInheritanceLogFiles(HashMap<String, List<String>> interfacesImplementationsHashMap, HashMap<String, List<String>> superclassChildrenHashMap, BufferedWriter bwInterfacesImpJHotDraw2, BufferedWriter bwSuperclassesChildrenJHotDraw2) throws IOException {
		// TODO Auto-generated method stub

		for(String mykey: interfacesImplementationsHashMap.keySet()) {
			String methname = AlgoFinal.methodtraces2HashMap.get(mykey).Method.methodname.replaceAll("\\,", "/"); 
			bwInterfacesImpJHotDraw2.write("INTERFACE,"+AlgoFinal.methodtraces2HashMap.get(mykey).Method.ID
					+","+methname+","+
					AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.ID
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.classname
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).Requirement.ID
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).gold
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).getPrediction().PredictionValue);

			bwInterfacesImpJHotDraw2.newLine();
			for(String entry: interfacesImplementationsHashMap.get(mykey)) {
				String methname2 = AlgoFinal.methodtraces2HashMap.get(entry).Method.methodname.replaceAll("\\,", "/"); 
				bwInterfacesImpJHotDraw2.write("IMPLEMENTATION,"+AlgoFinal.methodtraces2HashMap.get(entry).Method.ID
								+","+methname2
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.ID
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.classname
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Requirement.ID
								+","+AlgoFinal.methodtraces2HashMap.get(entry).gold
								+","+AlgoFinal.methodtraces2HashMap.get(entry).getPrediction().PredictionValue);
			
				bwInterfacesImpJHotDraw2.newLine();
			}
		}
		for(String mykey: superclassChildrenHashMap.keySet()) {
			String methname = AlgoFinal.methodtraces2HashMap.get(mykey).Method.methodname.replaceAll("\\,", "/"); 
			bwSuperclassesChildrenJHotDraw2.write("SUPERCLASS,"+AlgoFinal.methodtraces2HashMap.get(mykey).Method.ID
					+","+methname+","+
					AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.ID+","+				
					AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.classname
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).Requirement.ID
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).gold
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).getPrediction().PredictionValue);

			bwSuperclassesChildrenJHotDraw2.newLine();
			for(String entry: superclassChildrenHashMap.get(mykey)) {
				String methname2 = AlgoFinal.methodtraces2HashMap.get(entry).Method.methodname.replaceAll("\\,", "/"); 
				bwSuperclassesChildrenJHotDraw2.write("CHILDREN,"+AlgoFinal.methodtraces2HashMap.get(entry).Method.ID
								+","+methname2+","+						
								AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.ID+","+	
								AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.classname
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Requirement.ID
								+","+AlgoFinal.methodtraces2HashMap.get(entry).gold
								+","+AlgoFinal.methodtraces2HashMap.get(entry).getPrediction().PredictionValue);
			
				bwSuperclassesChildrenJHotDraw2.newLine();
			}
		}
	
	}
	public static void CloseFiles(String ProgramName) throws IOException {
		// TODO Auto-generated method stub
		if (ProgramName.equals("chess")) {
			LogInfo.bwfileChess.close();
		} else if (ProgramName.equals("gantt")) {
			LogInfo.bwfile2.close();
			

		} else if (ProgramName.equals("itrust")) {
			LogInfo.bwfile3.close();
		} else if (ProgramName.equals("jhotdraw")) {
			LogInfo.bwfile4.close();

		}
	}
	public static void closeLogFile() throws IOException {
		// TODO Auto-generated method stub
		LogInfo.bwfile1.newLine();
		LogInfo.bwfile1.close(); 
//		LogInfo.bwfileCumulative.close(); 
	}
	public static void updateInheritanceLogs(String ProgramName, Collection<MethodTrace> MethodTracesHashmapValues,
			LinkedHashMap<String, LogInfo> LogInfoHashMap) throws IOException {
		// TODO Auto-generated method stub			
		 // Create a new file output stream.
      
		if (ProgramName.equals("chess")) {
			LogInfo.bwInterfacesImpChess.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpChess.newLine();
			LogInfo.bwSuperclassesChildrenChess.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildrenChess.newLine();
		
		}
		if (ProgramName.equals("gantt")) {
			LogInfo.bwInterfacesImpGantt.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpGantt.newLine();
			LogInfo.bwSuperclassesChildrenGantt.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildrenGantt.newLine();
		
		}
		if (ProgramName.equals("itrust")) {
			
			LogInfo.bwInterfacesImpiTrust.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpiTrust.newLine();
			LogInfo.bwSuperclassesChildreniTrust.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildreniTrust.newLine();

		}
		if (ProgramName.equals("jhotdraw")) {
			LogInfo.bwInterfacesImpJHotDraw.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpJHotDraw.newLine();
			LogInfo.bwSuperclassesChildrenJHotDraw.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildrenJHotDraw.newLine();
			
		}
		int count=0; 
		
		HashMap<String, List<String>> InterfacesImplementationsHashMap= new HashMap<String, List<String>>(); 
		HashMap<String, List<String>> SuperclassChildrenHashMap= new HashMap<String, List<String>>(); 

		for (MethodTrace methodtrace : MethodTracesHashmapValues) {
			String reqmethod = methodtrace.Requirement.ID + "-" + methodtrace.Method.ID;
			
			LogInfoHashMap.get(reqmethod);
			/////////////////////////////////////////////////////////
			if(!methodtrace.Method.Implementations.isEmpty()) {
				List<String> ImpList = new ArrayList<String>(); 
				for(Method myimp: methodtrace.Method.Implementations) {
					ImpList.add(methodtrace.Requirement.ID+"-"+myimp.ID); 
				}
				InterfacesImplementationsHashMap.put(reqmethod,  ImpList); 
			}
			/////////////////////////////////////////////////////////

			if(!methodtrace.Method.Children.isEmpty()) {
				List<String> ChildrenList = new ArrayList<String>(); 
				for(Method mychild: methodtrace.Method.Children) {
					ChildrenList.add(methodtrace.Requirement.ID+"-"+mychild.ID); 
				}
				SuperclassChildrenHashMap.put(reqmethod,  ChildrenList); 
			}
			
		}
		if (ProgramName.equals("chess")) {
			
			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpChess, bwSuperclassesChildrenChess); 

		}
		
		
		
		if (ProgramName.equals("gantt")) {
			
			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpGantt, bwSuperclassesChildrenGantt); 

		}
		
		
		if (ProgramName.equals("itrust")) {			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpiTrust, bwSuperclassesChildreniTrust); 
}
		
		
		if (ProgramName.equals("jhotdraw")) {
			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpJHotDraw, bwSuperclassesChildrenJHotDraw); 
			
			
			
		}
		
		
		if (ProgramName.equals("chess")) {
			bwInterfacesImpChess.close();
			bwSuperclassesChildrenChess.close();
		} else if (ProgramName.equals("gantt")) {
			bwInterfacesImpGantt.close();
			bwSuperclassesChildrenGantt.close();
			

		} else if (ProgramName.equals("itrust")) {
			bwInterfacesImpiTrust.close();
			bwSuperclassesChildreniTrust.close();
		} else if (ProgramName.equals("jhotdraw")) {
			bwInterfacesImpJHotDraw.close();
			bwSuperclassesChildrenJHotDraw.close();
			

		}
	}
	
	
	public static void updateRunMethodResults(List<MethodTrace> methodtraces, int runNumber, int errorSeedingPercentage, String requirementID, BufferedWriter mybufferWriter) throws IOException {

			ALGO.Prediction.Matrix= reinitializeMatrix(ALGO.Prediction.Matrix); 

			for(MethodTrace methodTrace: methodtraces) {
				String reqMethod = methodTrace.Requirement.ID+"-"+methodTrace.Method.ID; 
//				System.out.println(methodTrace +"     "+methodTrace.getPatternAndType()+"   ");
				ENTGoldValues GoldValues=ALGO.Prediction.Matrix.get(methodTrace.getPatternAndType());  
				
					
				
				if(methodTrace.getGold().equals("E")) {
					int E=GoldValues.getE(); 
					E=E+1; 
					GoldValues.setE(E);
					ALGO.Prediction.Matrix.put(methodTrace.getPatternAndType(),GoldValues);

				}else if(methodTrace.getGold().equals("N")) {
					int N=GoldValues.getN(); 
					N=N+1; 
					GoldValues.setN(N);
					ALGO.Prediction.Matrix.put(methodTrace.getPatternAndType(),GoldValues);

				}else if(methodTrace.getGold().equals("T")) {
					int T=GoldValues.getT(); 
					T=T+1; 
					GoldValues.setT(T);
					ALGO.Prediction.Matrix.put(methodTrace.getPatternAndType(),GoldValues);
				}
			}
			
//			String headers="Run#, %Seeding, Requirement, "; 
			String line= runNumber+","+AlgoFinal.ErrorSeedingPercentages.get(runNumber+"-"+requirementID)+","+requirementID+","; 
			
				
			
			for(String mykey: ALGO.Prediction.Matrix.keySet()) {
//				headers=headers+mykey+"/GoldE"+","+mykey+"/GoldN"+","+mykey+"/GoldT"+","; 
				line=line+ALGO.Prediction.Matrix.get(mykey).getE()+","+ALGO.Prediction.Matrix.get(mykey).getN()+","+ALGO.Prediction.Matrix.get(mykey).getT()+","; 
				
	
				}
//			mybufferWriter.write(headers);
//			mybufferWriter.newLine();
			mybufferWriter.write(line);


			mybufferWriter.newLine();

		
		
		if(AlgoFinal.NoSeeding) {
			
				mybufferWriter.close();
			

		}
	}
	
	
	
	
	public static void updateRunClassResults(List<MethodTrace> methodtraces, int runNumber, int errorSeedingPercentage, String requirementID, BufferedWriter mybufferWriter) throws IOException {

		ALGO.Prediction.Matrix= reinitializeMatrix(ALGO.Prediction.Matrix); 

		for(MethodTrace methodTrace: methodtraces) {
			String reqMethod = methodTrace.Requirement.ID+"-"+methodTrace.Method.ID; 
			ENTGoldValues GoldValues=ALGO.Prediction.Matrix.get(methodTrace.getPatternAndType());  
			
				
			
			if(methodTrace.getClassLevelGold().equals("E")) {
				int E=GoldValues.getE(); 
				E=E+1; 
				GoldValues.setE(E);
				ALGO.Prediction.Matrix.put(methodTrace.getPatternAndType(),GoldValues);

			}else if(methodTrace.getClassLevelGold().equals("N")) {
				int N=GoldValues.getN(); 
				N=N+1; 
				GoldValues.setN(N);
				ALGO.Prediction.Matrix.put(methodTrace.getPatternAndType(),GoldValues);

			}else if(methodTrace.getClassLevelGold().equals("T")) {
				int T=GoldValues.getT(); 
				T=T+1; 
				GoldValues.setT(T);
				ALGO.Prediction.Matrix.put(methodTrace.getPatternAndType(),GoldValues);
			}
		}
		
//		String headers="Run#, %Seeding, Requirement, "; 
		String line= runNumber+","+AlgoFinal.ErrorSeedingPercentages.get(runNumber+"-"+requirementID)+","+requirementID+","; 
		
			
		
		for(String mykey: ALGO.Prediction.Matrix.keySet()) {
//			headers=headers+mykey+"/GoldE"+","+mykey+"/GoldN"+","+mykey+"/GoldT"+","; 
			line=line+ALGO.Prediction.Matrix.get(mykey).getE()+","+ALGO.Prediction.Matrix.get(mykey).getN()+","+ALGO.Prediction.Matrix.get(mykey).getT()+","; 
			

			}
//		mybufferWriter.write(headers);
//		mybufferWriter.newLine();
		mybufferWriter.write(line);


		mybufferWriter.newLine();

	
	
	if(AlgoFinal.NoSeeding) {
		
			mybufferWriter.close();
		

	}
}
	public static void updateRunResultsHeaders(List<MethodTrace> methodtraces, int runNumber, int errorSeedingPercentage, String requirementID, BufferedWriter mybufferWriter) throws IOException {

		ALGO.Prediction.Matrix= reinitializeMatrix(ALGO.Prediction.Matrix); 
		String headers="Run#, %Seeding, Requirement, "; 

		
			
				
			
			
		
		
			
		
		for(String mykey: ALGO.Prediction.Matrix.keySet()) {
			headers=headers+mykey+"/GoldE"+","+mykey+"/GoldN"+","+mykey+"/GoldT"+","; 
			

			}
		mybufferWriter.write(headers);
		mybufferWriter.newLine();
	

	
	
	
	}
	private static LinkedHashMap<String, ENTGoldValues> reinitializeMatrix(
			LinkedHashMap<String, ENTGoldValues> matrix) {
		// TODO Auto-generated method stub
		return new LinkedHashMap<String, ENTGoldValues>(){{
			

			put("IsolatedE/", new ENTGoldValues(0,0,0)) ; 
			put("NotApplicableE/", new ENTGoldValues(0,0,0)) ; 

			put("PureTInner/T-T", new ENTGoldValues(0,0,0)) ; 
			put("BoundaryEInner/T-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/T-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/T-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/T-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/T-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/T-ENT",  new ENTGoldValues(0,0,0)) ; 

			put("BoundaryEInner/N-T", new ENTGoldValues(0,0,0)) ; 
			put("PureNInner/N-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/N-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/N-ET", new ENTGoldValues(0,0,0)) ; 
			put("MixedNInner/N-EN",new ENTGoldValues(0,0,0)) ; 
			put("MixedNInner/N-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedNInner/N-ENT", new ENTGoldValues(0,0,0)) ; 


			put("UndecidableEInner/E-T", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/E-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/E-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/E-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/E-EN", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/E-NT", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/E-ENT", new ENTGoldValues(0,0,0)) ; 

			
			put("MixedTInner/ET-T", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/ET-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/ET-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/ET-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/ET-ET",  new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/ET-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/ET-ENT",  new ENTGoldValues(0,0,0)) ; 


			put("UndecidableEInner/EN-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNInner/EN-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/EN-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/EN-NT", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/EN-ET",new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/EN-EN", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/EN-ENT", new ENTGoldValues(0,0,0)) ; 

			put("MixedTInner/NT-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNInner/NT-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/NT-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/NT-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/NT-ET",  new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/NT-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/NT-ENT",new ENTGoldValues(0,0,0)) ; 


			


			put("MixedTInner/ENT-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNInner/ENT-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/ENT-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/ENT-NT",new ENTGoldValues(0,0,0)) ; 	
			put("MixedTInner/ENT-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableEInner/ENT-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTInner/ENT-ENT",new ENTGoldValues(0,0,0)); 
			
			
			/*******************************/

			put("PureTLeaf/T-T", new ENTGoldValues(0,0,0)) ; 
			put("BoundaryELeaf/T-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/T-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/T-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/T-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/T-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/T-ENT",  new ENTGoldValues(0,0,0)) ; 

			put("BoundaryELeaf/N-T", new ENTGoldValues(0,0,0)) ; 
			put("PureNLeaf/N-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/N-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/N-ET", new ENTGoldValues(0,0,0)) ; 
			put("MixedNLeaf/N-EN",new ENTGoldValues(0,0,0)) ; 
			put("MixedNLeaf/N-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedNLeaf/N-ENT", new ENTGoldValues(0,0,0)) ; 


			put("UndecidableELeaf/E-T", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/E-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/E-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/E-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/E-EN", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/E-NT", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/E-ENT", new ENTGoldValues(0,0,0)) ; 

			
			put("MixedTLeaf/ET-T", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/ET-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/ET-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/ET-ET",  new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/ET-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/ET-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/ET-ENT",  new ENTGoldValues(0,0,0)) ; 


			put("UndecidableELeaf/EN-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNLeaf/EN-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/EN-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/EN-ET",new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/EN-EN", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/EN-NT", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/EN-ENT", new ENTGoldValues(0,0,0)) ; 

			put("MixedTLeaf/NT-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNLeaf/NT-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/NT-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/NT-ET",  new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/NT-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/NT-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/NT-ENT",new ENTGoldValues(0,0,0)) ; 


			


			put("MixedTLeaf/ENT-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNLeaf/ENT-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/ENT-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/ENT-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableELeaf/ENT-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTLeaf/ENT-NT",new ENTGoldValues(0,0,0)) ; 	
			put("MixedTLeaf/ENT-ENT",new ENTGoldValues(0,0,0)); 
			
			/*******************************/
			
			put("PureTRoot/T-T", new ENTGoldValues(0,0,0)) ; 
			put("BoundaryERoot/T-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/T-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/T-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/T-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/T-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/T-ENT",  new ENTGoldValues(0,0,0)) ; 

			put("BoundaryERoot/N-T", new ENTGoldValues(0,0,0)) ; 
			put("PureNRoot/N-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/N-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/N-ET", new ENTGoldValues(0,0,0)) ; 
			put("MixedNRoot/N-EN",new ENTGoldValues(0,0,0)) ; 
			put("MixedNRoot/N-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedNRoot/N-ENT", new ENTGoldValues(0,0,0)) ; 


			put("UndecidableERoot/E-T", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/E-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/E-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/E-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/E-EN", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/E-NT", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/E-ENT", new ENTGoldValues(0,0,0)) ; 

			
			put("MixedTRoot/ET-T", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/ET-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/ET-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/ET-ET",  new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/ET-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/ET-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/ET-ENT",  new ENTGoldValues(0,0,0)) ; 


			put("UndecidableERoot/EN-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNRoot/EN-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/EN-E", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/EN-ET",new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/EN-EN", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/EN-NT", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/EN-ENT", new ENTGoldValues(0,0,0)) ; 

			put("MixedTRoot/NT-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNRoot/NT-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/NT-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/NT-ET",  new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/NT-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/NT-NT", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/NT-ENT",new ENTGoldValues(0,0,0)) ; 


			


			put("MixedTRoot/ENT-T", new ENTGoldValues(0,0,0)) ; 
			put("MixedNRoot/ENT-N", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/ENT-E", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/ENT-ET", new ENTGoldValues(0,0,0)) ; 
			put("UndecidableERoot/ENT-EN", new ENTGoldValues(0,0,0)) ; 
			put("MixedTRoot/ENT-NT",new ENTGoldValues(0,0,0)) ; 	
			put("MixedTRoot/ENT-ENT",new ENTGoldValues(0,0,0)); 
		}}; 
	}
	public static void WriteMethodCalls(String programName) throws IOException, CloneNotSupportedException {
		if(programName.equals("chess")) {
			WriteMethodCallsProgram(bwchessMethodCallsWriter); 
		}
		if(programName.equals("gantt")) {
			WriteMethodCallsProgram(bwGANTTMethodCallsWriter); 
		}
		if(programName.equals("itrust")) {
			WriteMethodCallsProgram(bwiTrustMethodCallsWriter); 
		}
		if(programName.equals("jhotdraw")) {
			WriteMethodCallsProgram(bwJHotDrawMethodCallsWriter); 
		}
	}
	private static void WriteMethodCallsProgram(BufferedWriter bwchessMethodCallsWriter) throws IOException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		for( String meth:DatabaseInput.MethodHashMap.keySet()) {
			for(Method callee: DatabaseInput.MethodHashMap.get(meth).getXCallees()) {
				bwchessMethodCallsWriter.write(""+DatabaseInput.MethodHashMap.get(meth).getClassrep().classname+"."+DatabaseInput.MethodHashMap.get(meth).methodname+"---");
				
				bwchessMethodCallsWriter.write(callee.getClassrep().classname+"."+callee.methodname);
				bwchessMethodCallsWriter.newLine();
			}
			

		}
		bwchessMethodCallsWriter.close();
	}
	public static void CheckCallersCalleesSymmetry() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		boolean XCallers=false; 
		boolean ExecutedCallers=true; 
		boolean BasicCallers=false; 
		HashMap<Method, List<Method>>	CallerHashMap= new HashMap<Method, List<Method>>(); 
		HashMap<Method, List<Method>>	CalleeHashMap= new HashMap<Method, List<Method>>(); 
		for (String methodKey : DatabaseInput.MethodHashMap.keySet()) {
			Method method = DatabaseInput.MethodHashMap.get(methodKey); 
			if(XCallers==true) {
				CallerHashMap.put(method, method.getXCallers()); 
				CalleeHashMap.put(method, method.getXCallees()); 	
			}
			else if(ExecutedCallers==true) {
				CallerHashMap.put(method, method.getCallersExecuted()); 
				CalleeHashMap.put(method, method.getCalleesExecuted()); 	
			
			}	else if(BasicCallers==true) {
				CallerHashMap.put(method, method.Callers); 
				CalleeHashMap.put(method, method.Callees); 	
			}
		for(Method calleekey: CallerHashMap.keySet()){
			List<Method> callermethods = CallerHashMap.get(calleekey); 
			for(Method caller: callermethods) {
				if(caller!=null && calleekey!=null && CalleeHashMap.get(caller)!=null && !CalleeHashMap.isEmpty()) {
					if(CalleeHashMap.get(caller).contains(calleekey)) {
//						System.out.println("yes");
					}else {
						System.out.println("no");
					}
				}
				
			}
		}
	}

	}
	public static void writeHeaders(BufferedWriter mybufferWriter) throws IOException {
		// TODO Auto-generated method stub
		
//		mybufferWriter.write("Run#, %Seeding, Requirement, ");
//		int i=0; 
//		for(String mykey: ALGO.Prediction.Matrix.keySet()) {
//		
//			mybufferWriter.write(i+"-"+mykey+"GoldE"+","+i+"-"+mykey+"GoldN"+","+i+"-"+mykey+"GoldT"+",");
//			i++; 
//		}
//		mybufferWriter.write(
//				"1E/Isolated/GoldE, E/Isolated/GoldN, E/Isolated/GoldT,"
//				+ "2E/NotApplicable/GoldE, E/Isolated/GoldN, E/Isolated/GoldT, "
//				
//				+"3PureT/T-T/Inner/GoldE,PureT/T-T/Inner/GoldN,PureT/T-T/Inner/GoldT,"
//				+ "4EBoundary/T-N/Inner/GoldE,EBoundary/T-N/Inner/GoldN,EBoundary/T-N/Inner/GoldT, "
//				+ "5EUndecidable/T-E/Inner/GoldE, EUndecidable/T-E/Inner/GoldN,EUndecidable/T-E/Inner/GoldT,"
//				+ "6MixedT/T-ET/Inner/GoldE,MixedT/T-ET/Inner/GoldN,MixedT/T-ET/Inner/GoldT,"
//				+ "7EUndecidable/T-EN/Inner/GoldE,EUndecidable/T-EN/Inner/GoldN,EUndecidable/T-EN/Inner/GoldT,"
//				+ "8MixedT/T-NT/Inner/GoldE,MixedT/T-NT/Inner/GoldN,MixedT/T-NT/Inner/GoldT,"	
//				+ "9MixedT/T-ENT/Inner/GoldE,MixedT/T-ENT/Inner/GoldN,MixedT/T-ENT/Inner/GoldT,"
//				
//				
//				+"10EBoundary/N-T/Inner/GoldE, EBoundary/N-T/Inner/GoldN,EBoundary/N-T/Inner/GoldT, "
//				+ "11PureN/N-N/Inner/GoldE, PureN/N-N/Inner/GoldN, PureN/N-N/Inner/GoldT,"
//				+ "12EUndecidable/N-E/Inner/GoldE, EUndecidable/N-E/Inner/GoldN, EUndecidable/N-E/Inner/GoldT,"
//				+ "13EUndecidable/N-ET/Inner/GoldE, EUndecidable/N-ET/Inner/GoldN, EUndecidable/N-ET/Inner/GoldT,"
//				+ "14MixedN/N-EN/Inner/GoldE, MixedN/N-EN/Inner/GoldN, MixedN/N-EN/Inner/GoldT,"
//				+ "15MixedN/N-NT/Inner/GoldE, MixedN/N-NT/Inner/GoldN, MixedN/N-NT/Inner/GoldT,"			
//				+ "16MixedN/N-ENT/Inner/GoldE, MixedN/N-ENT/Inner/GoldN, MixedN/N-ENT/Inner/GoldT,"
//
//
//				+"17EUndecidable/E-T/Inner/GoldE, EUndecidable/E-T/Inner/GoldN,EUndecidable/E-T/Inner/GoldT, "
//				+ "18EUndecidable/E-N/Inner/GoldE, EUndecidable/E-N/Inner/GoldN, EUndecidable/E-N/Inner/GoldT,"
//				+ "19EUndecidable/E-E/Inner/GoldE, EUndecidable/E-E/Inner/GoldN, EUndecidable/E-E/Inner/GoldT,"
//				+ "20EUndecidable/E-ET/Inner/GoldE, EUndecidable/E-ET/Inner/GoldN, EUndecidable/E-ET/Inner/GoldT,"
//				+ "21EUndecidable/E-EN/Inner/GoldE, EUndecidable/E-EN/Inner/GoldN, EUndecidable/E-EN/Inner/GoldT,"
//				+ "22EUndecidable/E-NT/Inner/GoldE, EUndecidable/E-NT/Inner/GoldN, EUndecidable/E-NT/Inner/GoldT,"
//				+ "23EUndecidable/E-ENT/Inner/GoldE, EUndecidable/E-ENT/Inner/GoldN, EUndecidable/E-ENT/Inner/GoldT,"
//				
//				
//	+"24MixedT/ET-T/Inner/GoldE, MixedT/ET-T/Inner/GoldN,MixedT/ET-T/Inner/GoldT, "
//	+ "25EUndecidable/ET-N/Inner/GoldE, EUndecidable/ET-N/Inner/GoldN, EUndecidable/ET-N/Inner/GoldT,"
//	+ "26EUndecidable/ET-E/Inner/GoldE, EUndecidable/ET-E/Inner/GoldN, EUndecidable/ET-E/Inner/GoldT,"
//	+ "27MixedT/ET-ET/Inner/GoldE, MixedT/ET-ET/Inner/GoldN, MixedT/ET-ET/Inner/GoldT,"
//	+ "28EUndecidable/ET-EN/Inner/GoldE, EUndecidable/ET-EN/Inner/GoldN, EUndecidable/ET-EN/Inner/GoldT,"
//	+ "29MixedT/ET-NT/Inner/GoldE, MixedT/ET-NT/Inner/GoldN, MixedT/ET-NT/Inner/GoldT,"							
//	+ "30MixedT/ET-ENT/Inner/GoldE, MixedT/ET-ENT/Inner/GoldN, MixedT/ET-ENT/Inner/GoldT,"
//	
//	
//				
//				+ "31MixedT/NT-T/Inner/GoldE, MixedT/NT-T/Inner/GoldN,MixedT/NT-T/Inner/GoldT, "
//				+ "32MixedN/NT-N/Inner/GoldE, MixedN/NT-N/Inner/GoldN, MixedN/NT-N/Inner/GoldT,"
//				+ "33EUndecidable/NT-E/Inner/GoldE, EUndecidable/NT-E/Inner/GoldN, EUndecidable/NT-E/Inner/GoldT,"
//				+ "34MixedT/NT-ET/Inner/GoldE, MixedT/NT-ET/Inner/GoldN, MixedT/NT-ET/Inner/GoldT,"
//				+ "35EUndecidable/NT-EN/Inner/GoldE, EUndecidable/NT-EN/Inner/GoldN, EUndecidable/NT-EN/Inner/GoldT,"
//				+ "36MixedT/NT-NT/Inner/GoldE, MixedT/NT-NT/Inner/GoldN, MixedT/NT-NT/Inner/GoldT,"			
//				+ "37MixedT/NT-ENT/Inner/GoldE, MixedT/NT-ENT/Inner/GoldN, MixedT/NT-ENT/Inner/GoldT,"
//				
//				
//			
//				
//				+ "38EUndecidable/EN-T/Inner/GoldE, EUndecidable/EN-T/Inner/GoldN,EUndecidable/EN-T/Inner/GoldT, "
//				+ "39MixedN/EN-N/Inner/GoldE, MixedN/EN-N/Inner/GoldN, MixedN/EN-N/Inner/GoldT,"
//				+ "40EUndecidable/EN-E/Inner/GoldE, EUndecidable/EN-E/Inner/GoldN, EUndecidable/EN-E/Inner/GoldT,"
//				+ "41EUndecidable/EN-ET/Inner/GoldE, EUndecidable/EN-ET/Inner/GoldN, EUndecidable/EN-ET/Inner/GoldT,"
//				+ "42EUndecidable/EN-EN/Inner/GoldE, EUndecidable/EN-EN/Inner/GoldN, EUndecidable/EN-EN/Inner/GoldT,"
//				+ "43EUndecidable/EN-NT/Inner/GoldE, EUndecidable/EN-NT/Inner/GoldN, EUndecidable/EN-NT/Inner/GoldT,"	
//				+ "44EUndecidable/EN-ENT/Inner/GoldE, EUndecidable/EN-ENT/Inner/GoldN, EUndecidable/EN-ENT/Inner/GoldT,"
//				
//				
//				
//				
//				
//				
//				
//		+ "45MixedT/ENT-T/Inner/GoldE, MixedT/ENT-T/Inner/GoldN,MixedT/ENT-T/Inner/GoldT, "
//		+ "46MixedN/ENT-N/Inner/GoldE, MixedN/ENT-N/Inner/GoldN, MixedN/ENT-N/Inner/GoldT,"
//		+ "47EUndecidable/ENT-E/Inner/GoldE, EUndecidable/ENT-E/Inner/GoldN, EUndecidable/ENT-E/Inner/GoldT,"
//		+ "48MixedT/ENT-ET/Inner/GoldE, MixedT/ENT-ET/Inner/GoldN, MixedT/ENT-ET/Inner/GoldT,"
//		+ "49EUndecidable/ENT-EN/Inner/GoldE, EUndecidable/ENT-EN/Inner/GoldN, EUndecidable/ENT-EN/Inner/GoldT,"
//		+ "50MixedT/ENT-NT/Inner/GoldE,MixedT/ENT-NT/Inner/GoldN, MixedT/ENT-NT/Inner/GoldT,"
//		+ "51MixedT/ENT-ENT/Inner/GoldE, MixedT/ENT-ENT/Inner/GoldN, MixedT/ENT-ENT/Inner/GoldT,"
//		
//		/***********************************************************/
//			
//		+"52PureT/T-T/Leaf/GoldE,PureT/T-T/Leaf/GoldN,PureT/T-T/Leaf/GoldT,"
//		+ "53EBoundary/T-N/Leaf/GoldE,EBoundary/T-N/Leaf/GoldN,EBoundary/T-N/Leaf/GoldT, "
//		+ "54EUndecidable/T-E/Leaf/GoldE, EUndecidable/T-E/Leaf/GoldN,EUndecidable/T-E/Leaf/GoldT,"
//		+ "55MixedT/T-ET/Leaf/GoldE,MixedT/T-ET/Leaf/GoldN,MixedT/T-ET/Leaf/GoldT,"
//		+ "56EUndecidable/T-EN/Leaf/GoldE,EUndecidable/T-EN/Leaf/GoldN,EUndecidable/T-EN/Leaf/GoldT,"
//		+ "57MixedT/T-NT/Leaf/GoldE,MixedT/T-NT/Leaf/GoldN,MixedT/T-NT/Leaf/GoldT,"	
//		+ "58MixedT/T-ENT/Leaf/GoldE,MixedT/T-ENT/Leaf/GoldN,MixedT/T-ENT/Leaf/GoldT,"
//		
//		
//		+"59EBoundary/N-T/Leaf/GoldE, EBoundary/N-T/Leaf/GoldN,EBoundary/N-T/Leaf/GoldT, "
//		+ "60PureN/N-N/Leaf/GoldE, PureN/N-N/Leaf/GoldN, PureN/N-N/Leaf/GoldT,"
//		+ "61EUndecidable/N-E/Leaf/GoldE, EUndecidable/N-E/Leaf/GoldN, EUndecidable/N-E/Leaf/GoldT,"
//		+ "62EUndecidable/N-ET/Leaf/GoldE, EUndecidable/N-ET/Leaf/GoldN, EUndecidable/N-ET/Leaf/GoldT,"
//		+ "63MixedN/N-EN/Leaf/GoldE, MixedN/N-EN/Leaf/GoldN, MixedN/N-EN/Leaf/GoldT,"
//		+ "64MixedN/N-NT/Leaf/GoldE, MixedN/N-NT/Leaf/GoldN, MixedN/N-NT/Leaf/GoldT,"			
//		+ "65MixedN/N-ENT/Leaf/GoldE, MixedN/N-ENT/Leaf/GoldN, MixedN/N-ENT/Leaf/GoldT,"
//
//
//		+"66EUndecidable/E-T/Leaf/GoldE, EUndecidable/E-T/Leaf/GoldN,EUndecidable/E-T/Leaf/GoldT, "
//		+ "67EUndecidable/E-N/Leaf/GoldE, EUndecidable/E-N/Leaf/GoldN, EUndecidable/E-N/Leaf/GoldT,"
//		+ "68EUndecidable/E-E/Leaf/GoldE, EUndecidable/E-E/Leaf/GoldN, EUndecidable/E-E/Leaf/GoldT,"
//		+ "69EUndecidable/E-ET/Leaf/GoldE, EUndecidable/E-ET/Leaf/GoldN, EUndecidable/E-ET/Leaf/GoldT,"
//		+ "70EUndecidable/E-EN/Leaf/GoldE, EUndecidable/E-EN/Leaf/GoldN, EUndecidable/E-EN/Leaf/GoldT,"
//		+ "71EUndecidable/E-NT/Leaf/GoldE, EUndecidable/E-NT/Leaf/GoldN, EUndecidable/E-NT/Leaf/GoldT,"
//		+ "72EUndecidable/E-ENT/Leaf/GoldE, EUndecidable/E-ENT/Leaf/GoldN, EUndecidable/E-ENT/Leaf/GoldT,"
//		
//		
//		+"73MixedT/ET-T/Leaf/GoldE, MixedT/ET-T/Leaf/GoldN,MixedT/ET-T/Leaf/GoldT, "
//		+ "74EUndecidable/ET-N/Leaf/GoldE, EUndecidable/ET-N/Leaf/GoldN, EUndecidable/ET-N/Leaf/GoldT,"
//		+ "75EUndecidable/ET-E/Leaf/GoldE, EUndecidable/ET-E/Leaf/GoldN, EUndecidable/ET-E/Leaf/GoldT,"
//		+ "76MixedT/ET-ET/Leaf/GoldE, MixedT/ET-ET/Leaf/GoldN, MixedT/ET-ET/Leaf/GoldT,"
//		+ "77EUndecidable/ET-EN/Leaf/GoldE, EUndecidable/ET-EN/Leaf/GoldN, EUndecidable/ET-EN/Leaf/GoldT,"
//		+ "78MixedT/ET-NT/Leaf/GoldE, MixedT/ET-NT/Leaf/GoldN, MixedT/ET-NT/Leaf/GoldT,"							
//		+ "79MixedT/ET-ENT/Leaf/GoldE, MixedT/ET-ENT/Leaf/GoldN, MixedT/ET-ENT/Leaf/GoldT,"
//		
//		
//		+ "80MixedT/NT-T/Leaf/GoldE, MixedT/NT-T/Leaf/GoldN,MixedT/NT-T/Leaf/GoldT, "
//		+ "81MixedN/NT-N/Leaf/GoldE, MixedN/NT-N/Leaf/GoldN, MixedN/NT-N/Leaf/GoldT,"
//		+ "82EUndecidable/NT-E/Leaf/GoldE, EUndecidable/NT-E/Leaf/GoldN, EUndecidable/NT-E/Leaf/GoldT,"
//		+ "83MixedT/NT-ET/Leaf/GoldE, MixedT/NT-ET/Leaf/GoldN, MixedT/NT-ET/Leaf/GoldT,"
//		+ "84EUndecidable/NT-EN/Leaf/GoldE, EUndecidable/NT-EN/Leaf/GoldN, EUndecidable/NT-EN/Leaf/GoldT,"
//		+ "85MixedT/NT-NT/Leaf/GoldE, MixedT/NT-NT/Leaf/GoldN, MixedT/NT-NT/Leaf/GoldT,"			
//		+ "86MixedT/NT-ENT/Leaf/GoldE, MixedT/NT-ENT/Leaf/GoldN, MixedT/NT-ENT/Leaf/GoldT,"
//		
//	
//		
//		+ "87EUndecidable/EN-T/Leaf/GoldE, EUndecidable/EN-T/Leaf/GoldN,EUndecidable/EN-T/Leaf/GoldT, "
//		+ "88MixedN/EN-N/Leaf/GoldE, MixedN/EN-N/Leaf/GoldN, MixedN/EN-N/Leaf/GoldT,"
//		+ "89EUndecidable/EN-E/Leaf/GoldE, EUndecidable/EN-E/Leaf/GoldN, EUndecidable/EN-E/Leaf/GoldT,"
//		+ "90EUndecidable/EN-ET/Leaf/GoldE, EUndecidable/EN-ET/Leaf/GoldN, EUndecidable/EN-ET/Leaf/GoldT,"
//		+ "91EUndecidable/EN-EN/Leaf/GoldE, EUndecidable/EN-EN/Leaf/GoldN, EUndecidable/EN-EN/Leaf/GoldT,"
//		+ "92EUndecidable/EN-NT/Leaf/GoldE, EUndecidable/EN-NT/Leaf/GoldN, EUndecidable/EN-NT/Leaf/GoldT,"	
//		+ "93EUndecidable/EN-ENT/Leaf/GoldE, EUndecidable/EN-ENT/Leaf/GoldN, EUndecidable/EN-ENT/Leaf/GoldT,"
//		
//		
//		
//		
//		
//		
//		
//+ "94MixedT/ENT-T/Leaf/GoldE, MixedT/ENT-T/Leaf/GoldN,MixedT/ENT-T/Leaf/GoldT, "
//+ "95MixedN/ENT-N/Leaf/GoldE, MixedN/ENT-N/Leaf/GoldN, MixedN/ENT-N/Leaf/GoldT,"
//+ "96EUndecidable/ENT-E/Leaf/GoldE, EUndecidable/ENT-E/Leaf/GoldN, EUndecidable/ENT-E/Leaf/GoldT,"
//+ "97MixedT/ENT-ET/Leaf/GoldE, MixedT/ENT-ET/Leaf/GoldN, MixedT/ENT-ET/Leaf/GoldT,"
//+ "98EUndecidable/ENT-EN/Leaf/GoldE, EUndecidable/ENT-EN/Leaf/GoldN, EUndecidable/ENT-EN/Leaf/GoldT,"
//+ "99MixedT/ENT-NT/Leaf/GoldE,MixedT/ENT-NT/Leaf/GoldN, MixedT/ENT-NT/Leaf/GoldT,"
//+ "100MixedT/ENT-ENT/Leaf/GoldE, MixedT/ENT-ENT/Leaf/GoldN, MixedT/ENT-ENT/Leaf/GoldT,"
//		
//		/***********************************************************/
//
//		+"101PureT/T-T/Root/GoldE,PureT/T-T/Root/GoldN,PureT/T-T/Root/GoldT,"
//		+ "102EBoundary/T-N/Root/GoldE,EBoundary/T-N/Root/GoldN,EBoundary/T-N/Root/GoldT, "
//		+ "103EUndecidable/T-E/Root/GoldE, EUndecidable/T-E/Root/GoldN,EUndecidable/T-E/Root/GoldT,"
//		+ "104MixedT/T-ET/Root/GoldE,MixedT/T-ET/Root/GoldN,MixedT/T-ET/Root/GoldT,"
//		+ "105EUndecidable/T-EN/Root/GoldE,EUndecidable/T-EN/Root/GoldN,EUndecidable/T-EN/Root/GoldT,"
//		+ "106MixedT/T-NT/Root/GoldE,MixedT/T-NT/Root/GoldN,MixedT/T-NT/Root/GoldT,"	
//		+ "107MixedT/T-ENT/Root/GoldE,MixedT/T-ENT/Root/GoldN,MixedT/T-ENT/Root/GoldT,"
//		
//		
//		+"108EBoundary/N-T/Root/GoldE, EBoundary/N-T/Root/GoldN,EBoundary/N-T/Root/GoldT, "
//		+ "109PureN/N-N/Root/GoldE, PureN/N-N/Root/GoldN, PureN/N-N/Root/GoldT,"
//		+ "110EUndecidable/N-E/Root/GoldE, EUndecidable/N-E/Root/GoldN, EUndecidable/N-E/Root/GoldT,"
//		+ "111EUndecidable/N-ET/Root/GoldE, EUndecidable/N-ET/Root/GoldN, EUndecidable/N-ET/Root/GoldT,"
//		+ "112MixedN/N-EN/Root/GoldE, MixedN/N-EN/Root/GoldN, MixedN/N-EN/Root/GoldT,"
//		+ "113MixedN/N-NT/Root/GoldE, MixedN/N-NT/Root/GoldN, MixedN/N-NT/Root/GoldT,"			
//		+ "114MixedN/N-ENT/Root/GoldE, MixedN/N-ENT/Root/GoldN, MixedN/N-ENT/Root/GoldT,"
//
//
//		+"115EUndecidable/E-T/Root/GoldE, EUndecidable/E-T/Root/GoldN,EUndecidable/E-T/Root/GoldT, "
//		+ "116EUndecidable/E-N/Root/GoldE, EUndecidable/E-N/Root/GoldN, EUndecidable/E-N/Root/GoldT,"
//		+ "117EUndecidable/E-E/Root/GoldE, EUndecidable/E-E/Root/GoldN, EUndecidable/E-E/Root/GoldT,"
//		+ "118EUndecidable/E-ET/Root/GoldE, EUndecidable/E-ET/Root/GoldN, EUndecidable/E-ET/Root/GoldT,"
//		+ "119EUndecidable/E-EN/Root/GoldE, EUndecidable/E-EN/Root/GoldN, EUndecidable/E-EN/Root/GoldT,"
//		+ "120EUndecidable/E-NT/Root/GoldE, EUndecidable/E-NT/Root/GoldN, EUndecidable/E-NT/Root/GoldT,"
//		+ "121EUndecidable/E-ENT/Root/GoldE, EUndecidable/E-ENT/Root/GoldN, EUndecidable/E-ENT/Root/GoldT,"
//		
//		
//	+"122MixedT/ET-T/Root/GoldE, MixedT/ET-T/Root/GoldN,MixedT/ET-T/Root/GoldT, "
//	+ "123EUndecidable/ET-N/Root/GoldE, EUndecidable/ET-N/Root/GoldN, EUndecidable/ET-N/Root/GoldT,"
//	+ "124EUndecidable/ET-E/Root/GoldE, EUndecidable/ET-E/Root/GoldN, EUndecidable/ET-E/Root/GoldT,"
//	+ "125MixedT/ET-ET/Root/GoldE, MixedT/ET-ET/Root/GoldN, MixedT/ET-ET/Root/GoldT,"
//	+ "126EUndecidable/ET-EN/Root/GoldE, EUndecidable/ET-EN/Root/GoldN, EUndecidable/ET-EN/Root/GoldT,"
//	+ "127MixedT/ET-NT/Root/GoldE, MixedT/ET-NT/Root/GoldN, MixedT/ET-NT/Root/GoldT,"							
//	+ "128MixedT/ET-ENT/Root/GoldE, MixedT/ET-ENT/Root/GoldN, MixedT/ET-ENT/Root/GoldT,"
//		
//		+ "129MixedT/NT-T/Root/GoldE, MixedT/NT-T/Root/GoldN,MixedT/NT-T/Root/GoldT, "
//		+ "130MixedN/NT-N/Root/GoldE, MixedN/NT-N/Root/GoldN, MixedN/NT-N/Root/GoldT,"
//		+ "131EUndecidable/NT-E/Root/GoldE, EUndecidable/NT-E/Root/GoldN, EUndecidable/NT-E/Root/GoldT,"
//		+ "132MixedT/NT-ET/Root/GoldE, MixedT/NT-ET/Root/GoldN, MixedT/NT-ET/Root/GoldT,"
//		+ "133EUndecidable/NT-EN/Root/GoldE, EUndecidable/NT-EN/Root/GoldN, EUndecidable/NT-EN/Root/GoldT,"
//		+ "134MixedT/NT-NT/Root/GoldE, MixedT/NT-NT/Root/GoldN, MixedT/NT-NT/Root/GoldT,"			
//		+ "135MixedT/NT-ENT/Root/GoldE, MixedT/NT-ENT/Root/GoldN, MixedT/NT-ENT/Root/GoldT,"
//		
//		
//		
//		
//		+ "136EUndecidable/EN-T/Root/GoldE, EUndecidable/EN-T/Root/GoldN,EUndecidable/EN-T/Root/GoldT, "
//		+ "137MixedN/EN-N/Root/GoldE, MixedN/EN-N/Root/GoldN, MixedN/EN-N/Root/GoldT,"
//		+ "138EUndecidable/EN-E/Root/GoldE, EUndecidable/EN-E/Root/GoldN, EUndecidable/EN-E/Root/GoldT,"
//		+ "139EUndecidable/EN-ET/Root/GoldE, EUndecidable/EN-ET/Root/GoldN, EUndecidable/EN-ET/Root/GoldT,"
//		+ "140EUndecidable/EN-EN/Root/GoldE, EUndecidable/EN-EN/Root/GoldN, EUndecidable/EN-EN/Root/GoldT,"
//		+ "141EUndecidable/EN-NT/Root/GoldE, EUndecidable/EN-NT/Root/GoldN, EUndecidable/EN-NT/Root/GoldT,"	
//		+ "142EUndecidable/EN-ENT/Root/GoldE, EUndecidable/EN-ENT/Root/GoldN, EUndecidable/EN-ENT/Root/GoldT,"
//		
//		
//		
//		
//		
//		
//		
//+ "143MixedT/ENT-T/Root/GoldE, MixedT/ENT-T/Root/GoldN,MixedT/ENT-T/Root/GoldT, "
//+ "144MixedN/ENT-N/Root/GoldE, MixedN/ENT-N/Root/GoldN, MixedN/ENT-N/Root/GoldT,"
//+ "145EUndecidable/ENT-E/Root/GoldE, EUndecidable/ENT-E/Root/GoldN, EUndecidable/ENT-E/Root/GoldT,"
//+ "146MixedT/ENT-ET/Root/GoldE, MixedT/ENT-ET/Root/GoldN, MixedT/ENT-ET/Root/GoldT,"
//+ "147EUndecidable/ENT-EN/Root/GoldE, EUndecidable/ENT-EN/Root/GoldN, EUndecidable/ENT-EN/Root/GoldT,"
//+ "148MixedT/ENT-NT/Root/GoldE,MixedT/ENT-NT/Root/GoldN, MixedT/ENT-NT/Root/GoldT,"
//+ "149MixedT/ENT-ENT/Root/GoldE, MixedT/ENT-ENT/Root/GoldN, MixedT/ENT-ENT/Root/GoldT,"
//			
//			
//			);
//
//
//mybufferWriter.newLine();
	}
	public static void ComputeTraceClasses(BufferedWriter bwClassTracesWriter, int errorSeedingPercentage, int runNumber, String requirementID) throws IOException {
		// TODO Auto-generated method stub
		int completenessBefore=0; 
		int completenessAfter=0; 
		int TP=0; 
		int FP=0; 
		int TN=0; 
		int FN=0; 

		for(String mykey: DatabaseInput.classTraceHashMap.keySet()) {
//			System.out.println("here2");
			MethodTrace methodTrace = AlgoFinal.methodtraces2HashMap.get(mykey);
			String reqClass=methodTrace.Requirement.ID+"-"+ methodTrace.Method.Owner.ID; 
			ClassTrace2 entry = DatabaseInput.classTraceHashMap.get(reqClass); 

			/**********************************************************************************************/
			/**********************************************************************************************/
			//GENERALIZE THE METHOD TO REQUIREMENT PREDICTIONS INTO CLASS TO REQUIREMENT PREDICTIONS 
				HashMap<String, MethodTrace> methodsList = DatabaseInput.OwnerClassestoMethodsHashMap.get(methodTrace.Requirement.ID+"-"+methodTrace.Method.Owner.ID); 
			  Collection<MethodTrace> methodtraces = methodsList.values();
			  if(methodtraces.stream().filter(o -> o.getPrediction().PredictionValue.equals("T")).findFirst().isPresent()) {
				  methodTrace.setClassPredictionGeneralized("T");
				  AlgoFinal.LogInfoHashMap.get(mykey).setPredictionGeneralization("T");
			  
			  }else if(methodtraces.stream().filter(o -> o.getPrediction().PredictionValue.equals("E")).findFirst().isPresent()) {
				  methodTrace.setClassPredictionGeneralized("E");
				  AlgoFinal.LogInfoHashMap.get(mykey).setPredictionGeneralization("E");

			  }else {
				  methodTrace.setClassPredictionGeneralized("N");
				  AlgoFinal.LogInfoHashMap.get(mykey).setPredictionGeneralization("N");

			  }
				/**********************************************************************************************/
				/**********************************************************************************************/
				ClassTrace2 myclasstrace = DatabaseInput.classTraceHashMap.get(methodTrace.Requirement.ID+"-"+methodTrace.Method.Owner.ID); 
				myclasstrace.setClassPredictionGeneralization(methodTrace.getClassPredictionGeneralized().trim());
				
				entry.ClassPredictionGeneralization=methodTrace.getClassPredictionGeneralized().trim();
			
			
			 myclasstrace = DatabaseInput.classTraceHashMap.get(mykey); 
			if(myclasstrace.getGoldfinal().equals("T")|| myclasstrace.getGoldfinal().equals("N")) {
				completenessBefore++; 
			}
			if(myclasstrace.ClassPredictionGeneralization.equals("T")|| myclasstrace.ClassPredictionGeneralization.equals("N")) {
				completenessAfter++; 
			}
			
			if(myclasstrace.ClassPredictionGeneralization.equals("T") && myclasstrace.getGoldfinal().equals("T")) {
				TP++; 
			}else if(myclasstrace.ClassPredictionGeneralization.equals("N") && myclasstrace.getGoldfinal().equals("N")) {
				TN++; 
			}else if(myclasstrace.ClassPredictionGeneralization.equals("T") && myclasstrace.getGoldfinal().equals("N")) {
				FP++; 
			}else if(myclasstrace.ClassPredictionGeneralization.equals("N") && myclasstrace.getGoldfinal().equals("T")) {
				FN++; 
			}
		}
		
		bwClassTracesWriter.write(runNumber+","+requirementID+","+errorSeedingPercentage+","+completenessBefore+","+completenessAfter+","+TP+","+TN+","+FP+","+FN);
		bwClassTracesWriter.newLine();
		System.out.println(" TP "+TP+" FP "+FP+" TN "+TN+" FN "+FN);
		System.out.println("yes");
		if(AlgoFinal.NoSeeding) {
			bwClassTracesWriter.close();
		}
	}
	public static void WriteHeadersTraceClasses(BufferedWriter bwClassTracesWriter) throws IOException {
		// TODO Auto-generated method stub
		bwClassTracesWriter.write("Run#, RequirementID, IncompletenessSeeding, CompletenessBefore, CompletenessAfter, TP, TN, FP, FN");
		bwClassTracesWriter.newLine();
	}
	

}