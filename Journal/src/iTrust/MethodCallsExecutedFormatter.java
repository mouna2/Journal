package iTrust;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodCallsExecutedFormatter {

	
	public static void main (String [] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mouna\\git\\Journal\\Journal\\src\\iTrustFiles\\dataMethodCallsExecutediTrust.txt"));
		String line = reader.readLine(); 
		File myfile3 = new File("C:\\Users\\mouna\\git\\Journal\\Journal\\src\\iTrustFiles\\dataMethodCallsExecutediTrustFormatted2.txt");
		FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
		 BufferedWriter bwWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
		 int counter=1; 
		while(line!=null) {
			
			 String[] lines = line.split("---"); 
			 String caller =lines[0].substring(0, lines[0].indexOf(")")+1); 
			 String callee =lines[1].substring(0, lines[1].indexOf(")")+1); 
			 System.out.println(caller);
			 System.out.println(callee);
			 String callerName= caller.substring(0,  caller.indexOf("(")); 
			 String calleeName= callee.substring(0, callee.indexOf("(")); 
			 String callerParams= caller.substring(caller.indexOf("(")+1, caller.length()-1); 
			 String calleeParams= callee.substring(callee.indexOf("(")+1, callee.length()-1); 
			 Pattern pattern = Pattern.compile("^(?:([\\[ZIJDFSB]+)[a-z])");
			 Matcher matcher = pattern.matcher(callerParams);
			 if (matcher.find())
			 {
				 	
			     System.out.println(matcher.group(1));
			     String remainder=callerParams.substring(matcher.group(1).length()); 
			     callerParams=matcher.group(1)+";"+remainder; 
			    
			 }
			 Matcher matcher2 = pattern.matcher(calleeParams);
			 if (matcher2.find())
			 {
				 	
			     System.out.println(matcher2.group(1));
			     String remainder=calleeParams.substring(matcher2.group(1).length()); 
			     calleeParams=matcher2.group(1)+";"+remainder; 
			    
			 } 
			 
			String[] calleeParamsArr = calleeParams.split(";"); 
			String calleeParamsNew = ""; 
			for(String CalleeParamElement: calleeParamsArr) {
				boolean entered=false; 
				if(CalleeParamElement.matches("^(?:([\\[ZICJDFSB]+))$")){
					 System.out.println("PatternMatched");
					 CalleeParamElement=CalleeParamElement.replaceAll("Z", "boolean;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("I", "int;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("J", "long;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("D", "double;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("F", "float;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("S", "short;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("B", "byte;"); 
					 CalleeParamElement=CalleeParamElement.replaceAll("C", "char;"); 

					 System.out.println(CalleeParamElement);
					 System.out.println("ReplacementFinished");
					 entered=true; 
					 
				 }
				if(entered==true) {
					calleeParamsNew=calleeParamsNew+CalleeParamElement; 

				}else if(!calleeParams.equals("")){
					calleeParamsNew=calleeParamsNew+CalleeParamElement+";"; 

				}
				calleeParams=calleeParamsNew; 
			}
			 
			 
			String[] callerParamsArr = callerParams.split(";"); 
			String callerParamsNew = ""; 
			for(String CallerParamElement: callerParamsArr) {
				boolean entered=false; 
				if(CallerParamElement.matches("^(?:([\\[ZICJDFSB]+))$")){
					 System.out.println("PatternMatched");
					 CallerParamElement=CallerParamElement.replaceAll("Z", "boolean;"); 
					 CallerParamElement=CallerParamElement.replaceAll("I", "int;"); 
					 CallerParamElement=CallerParamElement.replaceAll("J", "long;"); 
					 CallerParamElement=CallerParamElement.replaceAll("D", "double;"); 
					 CallerParamElement=CallerParamElement.replaceAll("F", "float;"); 
					 CallerParamElement=CallerParamElement.replaceAll("S", "short;"); 
					 CallerParamElement=CallerParamElement.replaceAll("B", "byte;");
					 CallerParamElement=CallerParamElement.replaceAll("C", "char;");


					 System.out.println(CallerParamElement);
					 System.out.println("ReplacementFinished");
					 entered=true; 
					 
				 }
				if(entered==true) {
					callerParamsNew=callerParamsNew+CallerParamElement; 

				}else if(!callerParams.equals("")){
					callerParamsNew=callerParamsNew+CallerParamElement+";"; 

				}
				callerParams=callerParamsNew; 
			}
			 String NewCaller = callerName+"("+callerParams+")"; 
			 String NewCallee = calleeName+"("+callerParams+")"; 
			 System.out.println(NewCallee);
			  NewCaller=""; 
			 if(callerParams.contains("[")) {
				 System.out.println("yes");
				 String[] callerParamsArray = callerParams.split(";"); 
				 String CallerParamFinal =""; 
				 for(String callerParam: callerParamsArray) {
				
					 while(callerParam.charAt(0)=='[') {
						  StringBuilder sb = new StringBuilder(callerParam);
						 sb.deleteCharAt(0); 
						 sb.append("[]"); 
						System.out.println(sb.toString());
						callerParam=sb.toString(); 
						
					 }
				
					   CallerParamFinal=CallerParamFinal+callerParam+";"; 

					 
				 }
				 System.out.println("yes");
				  NewCaller= callerName+"("+CallerParamFinal+")"; 
				  System.out.println(NewCaller);

			 }else {
				  NewCaller= callerName+"("+callerParams+")"; 

			 }
			 System.out.println(NewCaller);
			 
			
		

			 
			 
			 
			 NewCallee=""; 
			 if(calleeParams.contains("[")) {
				 System.out.println("yes");
				 String[] calleeParamsArray = calleeParams.split(";"); 
				 String CalleeParamFinal =""; 
				 for(String calleeParam: calleeParamsArray) {
				
					 while(calleeParam.charAt(0)=='[') {
						  StringBuilder sb = new StringBuilder(calleeParam);
						 sb.deleteCharAt(0); 
						 sb.append("[]"); 
						System.out.println(sb.toString());
						calleeParam=sb.toString(); 
						
					 }
				
					   CalleeParamFinal=CalleeParamFinal+calleeParam+";"; 

					 
				 }
				 System.out.println("yes");
				  NewCallee= calleeName+"("+CalleeParamFinal+")"; 
				  System.out.println(NewCallee);

			 }else {
				  NewCallee= calleeName+"("+calleeParams+")"; 

			 }
			 System.out.println(NewCallee);
			 
			 
			
			 line = reader.readLine(); 
			 //replace quote 
			 NewCaller=NewCaller.replaceAll("\"",""); 
			 //replace backslash  
			 NewCaller=NewCaller.replaceAll("\\/","."); 
			 //replace semicolon preceding )
			 NewCaller=NewCaller.replaceAll(";\\)",")"); 
			 //replace ; wlith comma 
			 NewCaller=NewCaller.replaceAll(";",","); 
			 NewCaller=NewCaller.replaceAll("Ljava","java"); 
			 NewCaller=NewCaller.replaceAll("Ledu","edu"); 
			 NewCaller=NewCaller.replaceAll("Lorg","org"); 
			 NewCaller=NewCaller.replaceAll("clinit","init"); 
			 
			 NewCallee=NewCallee.replaceAll("\"",""); 
			 NewCallee=NewCallee.replaceAll("\\/","."); 
			 NewCallee=NewCallee.replaceAll(";\\)",")");
			 NewCallee=NewCallee.replaceAll(";",","); 
			 NewCallee=NewCallee.replaceAll("Ljava","java"); 
			 NewCallee=NewCallee.replaceAll("Ledu","edu"); 
			 NewCallee=NewCallee.replaceAll("Lorg","org"); 
			 NewCallee=NewCallee.replaceAll("clinit","init"); 

			 System.out.println(NewCaller.trim()+"---"+NewCallee.trim());
			
			 bwWriter.write(NewCaller.trim()+"---"+NewCallee.trim());
			 bwWriter.newLine();
			 counter++; 
		}
		bwWriter.close();
	
	}
	
}
