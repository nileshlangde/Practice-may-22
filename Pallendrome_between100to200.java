package Interviewprogram;

public class Pallendrome_between100to200 {
	
	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			int n=i;
			int a;
			int b=0;
			
			
			while(n>0) 
			{
				a=n%10;
				b=b*10+a;
				n=n/10;
			}
			if(b==i) {
				System.out.println(""+i);
			         }
			}
}

}
