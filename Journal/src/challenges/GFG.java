package challenges;


//Initial Template for Java
import java.util.*;
import java.util.stream.IntStream;

class GFG
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      Stack<Integer> s = new Stack<Integer>() ; 
      s.size(); 
      while(t-- > 0)
      {
          int size1 = sc.nextInt();
          int i=0; 
          int [] myarray = new int [size1]; 
          while(i<size1) {
        	 myarray[i] = sc.nextInt();
        	  
        	
        	  i++; 
          }
          
          int temp=0; 
          
          for(int k=0; k<myarray.length; k++) {
        	  for(int r=0; r<myarray.length; r++) {
        		  if(myarray[r]>myarray[k]) {
        			  temp=myarray[k]; 
        			  myarray[k]=myarray[r]; 
        			  myarray[r]=temp; 
        		  }
        	  }
          }
          for(int myint: myarray) {
        	  System.out.print(myint+" ");
          }
          System.out.println();
          
    	  
      }
  }

		private static void Function(int size1, int[] myarray) {
			
			
			Arrays.sort(myarray);
			int[] reversed = IntStream.range(0, myarray.length)
			                          .map(i -> myarray[myarray.length-i-1])
			                          .toArray();
			for(int element: reversed) {
				System.out.print(element+" ");
			}
			System.out.println();
			
			
		}



}





/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
//Helper class to find largest number with minimum frequency
class Geeks
{
  // function to check if any pair having specified sum
  // and return 1 if so, else 0
  public static void sumExists(int arr[], int n)
  {
  	
	 HashMap <Integer,Integer> myhashmap= new HashMap <Integer,Integer> (); 
	 int count=0; 
  	int sum=0; 
	  for( int element: arr) {
		  
		 sum=sum+element; 
		 if(sum==0) {
			 count++; 
		 }
		 if(myhashmap.containsKey(sum)) {
			 count=count+myhashmap.get(sum); 
			 myhashmap.put(sum, myhashmap.get(sum)+1); 
		 }else {
			 myhashmap.put(sum, 1); 
		 }
		
	  }
	  System.out.println(count);
  	
  }
  
}