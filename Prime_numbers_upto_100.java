package Interviewprogram;

public class Prime_numbers_upto_100 {
	public static void main(String[] args) {
		
	  for (int a=1;a<=100;a++)
	  {
		int count =0;
		for(int b=a;b>=a;b--) {
			if(a%b!=0) 
			{
				count=count+1;
			}
		}if(count==2) 
		{
			System.out.println(""+a);
		}
	  }
   }
}
