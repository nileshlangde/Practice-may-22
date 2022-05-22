package Interviewprogram;

public class Fibonacci_number {
	
	public static void main(String[] args) {
		int n1=3;
		int n2= 5;
		int n3;
		
		for(int i=0;i<5;i++)
		{
		  n3=n1+n2;	
		  System.out.println(""+n3);
		  n1=n2;
		  n2=n3;
		}
	}

}
