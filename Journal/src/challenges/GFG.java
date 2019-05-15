package challenges;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.mysql.cj.jdbc.Blob;

import ALGO.AlgoFinal;

import java.lang.*;
import java.io.*;

class GFG {

    
	 public static void main (String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in); 
		
			int amount =sc.nextInt(); 

	        while (amount --> 0) {
	        	int size =sc.nextInt(); 
	        	int array[] = new int[size]; 
	        	for(int i=0; i<size; i++) {
	        		array[i]=sc.nextInt(); 
	        	}
	        	
	        	Arrays.sort(array);
//	        	System.out.println(Arrays.toString(array));
	        	HashSet<Integer> myhashset = new HashSet<Integer>(); 
	        	int copy=0; 
	        	for(int i=0; i<array.length-1; i++) {
	        			if(i%2==0 && !myhashset.contains(array[i])) {
			        		myhashset.add(array[i]); 
			        		copy=array[i]; 
	        			}
	        			else if(i%2==1 && !myhashset.contains(array[i])) {
//	        				System.out.println(array[i]);
	        				System.out.println(copy);
	        			}
	        		
	        	}
	        	
	        	
	        	
	        	
	        	
	     
	        	
	        	
	        	
	        	
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
	
	


	
