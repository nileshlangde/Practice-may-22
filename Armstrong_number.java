package Interviewprogram;

public class Armstrong_number {
	public static void main(String[] args) {
		
	int n = 371;
	int a;
	int b= 0;
	int c;
	
	 c=n;
	while(n>0) 
	{
	   a=n%10;
	   b=b+a*a*a;
	   n=n/10;
	}  
	   if(b==c) 
	   {
		  System.out.println(c+ " is armstrong number"); 
	   } 
	    else 
	   {
		   System.out.println(c+ " is not armstrong number");
	   }
	
	
	}
}
