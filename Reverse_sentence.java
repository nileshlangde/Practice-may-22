package Interviewprogram;

public class Reverse_sentence {
	public static void main(String[] args) {
		
		String str = "i AM NILESH LANGDE";
		
		String reverse = "";
		String s[]  = str.split(" ");
		 
		for(int i= s.length-1;i>=0;i--) 
		{
			reverse=s[i]+" ";
			System.out.print(reverse);
		}
	}

}
