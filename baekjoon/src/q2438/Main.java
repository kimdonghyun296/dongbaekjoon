package q2438;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		
		for(int i=0;i<num1;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
	}

}
