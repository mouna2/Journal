package challenges;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.Blob;
import com.sun.prism.GraphicsResource;

import ALGO.AlgoFinal;

import java.lang.*;
import java.io.*;

class GFG {

    
	 public static void main (String[] args) throws IOException {
		 
		 Scanner sc= new Scanner(System.in);  
		 int TestCases = sc.nextInt(); 
		 while(TestCases-->0) {
			 String TestCase =sc.next(); 
			char[] chars = TestCase.toCharArray(); 
			List<Integer> mylist = new ArrayList<Integer>(); 
			String s=""; 
			int first=0; 
			int second=0; 

			for(int i=0; i<chars.length; i++) {
				if(Character.isUpperCase(chars[i]) && first==0) {
					second =i; 
					s=s+TestCase.substring(first, second)+" ";
					first=i; 
				}else if(Character.isUpperCase(chars[i]) && first!=0) {
					second =i; 
					s=s+TestCase.substring(first, second)+" ";
					first=i; 
				}
				
			}
			s=s+TestCase.substring(first, TestCase.length())+" ";
			
			System.out.println(s.trim().toLowerCase());
			 
			

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
	
	


	
