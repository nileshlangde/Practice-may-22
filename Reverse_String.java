package Interviewprogram;

public class Reverse_String {
	public static void main (String[] args) {
		
		String z="Nilesh";
		int len = z.length();
		String j = "";
		
		
		for(int i =len-1; i>=0; i--) 
		{
		  j=j+z.charAt(i);
		}
		System.out.println(j);
	}

}
