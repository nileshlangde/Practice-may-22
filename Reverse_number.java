package Interviewprogram;
public class Reverse_number {
	public static void main(String[] args) {
	
		int n=211;
		int a;
		int b =0;
		int c;
		c=n;
		while(n>0) 
		{
		  a=n%10;
		  b=b*10+a;
		  n=n/10;
		}System.out.println(b);
		if(c==b) {
			System.out.println("it is pallendrome number");
		}else {
			System.out.println("it is not pallendrome");
		}
	}
}
