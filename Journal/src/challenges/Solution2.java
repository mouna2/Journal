package challenges;

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;


import java.io.*;
class Solution2
 {
	Character c; 
	int count; 
	 
	public Solution2(Character c, int count) {
		super();
		this.c = c;
		this.count = count;
	}

	private static void kSorted(int size, String r){
		char[] arr = r.toCharArray(); 
//		Arrays.sort(arr);
		if(r.contains("1")) {
			System.out.println("1");
		}else { 
			System.out.println("0");
		}
		
	}
	 
	 public static void main (String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String  line = br.readLine();    
		 int t = Integer.parseInt(line); 
        
        int count=0; 
//        System.out.println("T "+t);
        while (t --> 0) {
        	 line = br.readLine();    
//        	System.out.println(line);
        	 line = br.readLine();    
			String[] lines = line.split(" "); 
//			int size=Integer.parseInt(lines[0]); 
//			int index=Integer.parseInt(lines[1]); 
//
//        	 String line2 = br.readLine();    
//        	 String[] lines2 = line2.split(" "); 
//        	 System.out.println(index-1);
//        	 System.out.println(size-index);
//        	 System.out.println(index-1);
        	 Stack<String> mystack = new Stack<String>(); 
        	 for(String s: lines) {
        		 mystack.push(s); 
        	 }
        	
        	 while(!mystack.isEmpty()) {
        		 System.out.print(mystack.pop()+" ");
        	 }
			
			
			
        	 System.out.println();
        	count++; 
        }
    }

	

	public static void kSorted(String base, String s1, String s2, String s3) {
		// TODO Auto-generated method stub
//		System.out.println(base);
//		System.out.println(s1);

	
		
	}
}