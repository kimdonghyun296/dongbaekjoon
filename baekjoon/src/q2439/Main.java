package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		
		for(int i=0;i<num1;i++)
		{
			for(int j=1;j<num1-i;j++)
			{
				System.out.printf("%c",' ');
			}

			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c",'*');
			}
			System.out.println();
		}

	}

}
