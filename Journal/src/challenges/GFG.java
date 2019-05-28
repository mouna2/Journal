package challenges;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mysql.cj.jdbc.Blob;
import com.sun.prism.GraphicsResource;

import ALGO.AlgoFinal;

import java.lang.*;
import java.io.*;

class GFG {

    
	 public static void main (String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in); 
		
			int amount =sc.nextInt(); 
			HashMap<String, String> myhashmap = new HashMap<String, String>(); 
			myhashmap.put("a", "2"); 
			myhashmap.put("b", "2"); 
			myhashmap.put("c", "2"); 
			
			myhashmap.put("d", "3"); 
			myhashmap.put("e", "3"); 
			myhashmap.put("f", "3"); 
			
			myhashmap.put("g", "4"); 
			myhashmap.put("h", "4"); 
			myhashmap.put("i", "4"); 
			
			myhashmap.put("j", "5");
			myhashmap.put("k", "5"); 
			myhashmap.put("l", "5"); 
			
			myhashmap.put("m", "6"); 
			myhashmap.put("n", "6"); 
			myhashmap.put("o", "6"); 
			
			myhashmap.put("p", "7"); 
			myhashmap.put("q", "7");
			myhashmap.put("r", "7"); 
			myhashmap.put("s", "7"); 

			
			myhashmap.put("t", "8"); 
			myhashmap.put("u", "8"); 
			myhashmap.put("v", "8"); 

			myhashmap.put("w", "9"); 
			myhashmap.put("x", "9"); 
			myhashmap.put("y", "9"); 
			myhashmap.put("z", "9"); 

	        while (amount --> 0) {
	        	String s = sc.next(); 
	        	
	        	String[] mystrings = s.split(""); 
	        	String Result=""; 
	        	for(String mystring : mystrings) {
	        		Result=Result+myhashmap.get(mystring); 
	        	}
	        	System.out.println(Result);
	        }
	 }

	private static void FindEven(int number, List<Integer> mylist) {
    	List<Integer> mylist2 = new ArrayList<Integer>(); 

		// TODO Auto-generated method stub
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				mylist2.add(mylist.get(i-1)); 
			}
    	}
		if(mylist2.size()>1) {
			FindEven(mylist2.size(), mylist2); 
		}else {
			System.out.println(mylist2.get(0));

		}
	}

	


	}
	
	


	
