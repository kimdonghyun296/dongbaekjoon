package q10039;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		sc.close();
		
		for(int i=0;i<5;i++)
		{
			int num1=sc.nextInt();
			if(num1<40)
			{
				num1=40;
				sum+=num1;
			}
			else
			{
				sum+=num1;
			}
		}
		System.out.println(sum/5);
	}

}