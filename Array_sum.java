package Interviewprogram;

public class Array_sum {
	public static void main(String[] args) {
		
		int[]number= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<number.length;i++) 
		{
			sum=sum+number[i];
		}
		System.out.println(sum);
	}

}
