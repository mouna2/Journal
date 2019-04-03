package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Java program to print all permutations of a 
// given string. 
public class Permutation 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in); 
        int TestCases=sc.nextInt();
        int count=0; 
        while(count<TestCases) {
        	String s= sc.next(); 
        	func(s);         	
        	count++; 
        }
    }

	private static void func(String s) {
		int counter=0; 
		char[] chars=s.toCharArray(); 
		
		char[] chars2 = null;
		char[] chars3 =null; 
		chars2=Arrays.copyOf(chars, chars.length/2); 
		if(chars.length%2==1) {
			chars3 = Arrays.copyOfRange(chars, chars.length/2+1, chars.length); 

		}else {
			 chars3 = Arrays.copyOfRange(chars, chars.length/2, chars.length); 

		}
//		Arrays.sort(chars);
//		System.out.println("chars  "+chars2.toString());
//		System.out.println("chars3  "+chars3.toString());

		Arrays.sort(chars2);
		Arrays.sort(chars3);
		if(String.copyValueOf(chars2).equals(String.copyValueOf(chars3))){
			System.out.println("YES");
		}else {
			System.out.println("NO");

		}
		
		
	}


}
   