package q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		sc.close();
		
		int num2=1;
		
		int count=0;
		
		int increasement=0;
		
		for(int i=1;;i++)
		{
			int num3=num2+increasement;

			count++;
			if(num1<=num3)
			{
				break;
			}
			increasement+=6*i;
			
		}
		System.out.println(count);
		
	}

}
