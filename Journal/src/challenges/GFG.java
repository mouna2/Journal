package challenges;


//Initial Template for Java
import java.util.*;
import java.util.stream.IntStream;

class GFG
{
  public static void main(String args[])
  {
	  int k=3; 
	  Queue<Integer> queue= new LinkedList<Integer>(); 
	  queue.add(2); 
	  queue.add(3); 
	  queue.add(5); 
	  queue.add(6); 
	  queue.add(7); 
	  queue.add(8); 
	 
	  
	  
	  int i=0; 
	  Stack <Integer> s = new Stack<Integer>(); 
	  while(i<k) {
		  int removed =queue.poll(); 
		  s.push(removed); 
		  i++; 
	  }
	  while(!s.isEmpty()) {
		  	
	  }
	 
	  for(Integer myint: queue) {
		  System.out.println(myint);
	  }
	  
  }

  




}