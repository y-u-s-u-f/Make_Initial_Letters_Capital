package yusuf.com;

import java.util.Scanner;

public class capitalize {

	public static void main(String[] args){
		
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.print("Enter a string: ");
	     
		 String input = sc.nextLine();
		 
		 String capitalized_input = ""; 
		 
		 int k = input.length();
		 
		 capitalized_input = capitalized_input+input.toUpperCase().charAt(0);
		 
	      for(int i=1; i<k; i++) {
	    	  
	    	  if(input.charAt(i)==' ') {
	    		  
	    		  capitalized_input = capitalized_input+" ";
	    		  capitalized_input = capitalized_input+input.toUpperCase().charAt(i+1);
	    		  i++;
	    		  
	    	  }
	    	  else
	    	  {
	    		  capitalized_input = capitalized_input+input.charAt(i);
	    	  }
	    	  
	      }
	       
	    System.out.println(capitalized_input);
	         
	    }
	
}
