package Interviewprogram;

public class Armstrong_100to1000 {
	public static void main(String[] args) {
		
		for(int i=100;i<=1000;i++) 
		{
			int n =i;
			int a;
			int b =0;
			
			while(n>0) 
			{
				a=n%10;
				b=b+a*a*a;
				n=n/10;
				
			}
			if(b==i) 
			{
				System.out.println(b);
			}
			
		}
		
	}

}
