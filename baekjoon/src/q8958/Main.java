package q8958;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		String[] ary =new String[num1];
		for(int i=0;i<num1;i++)
		{
			ary[i]=sc.next();
		}
		sc.close();
		for(int i=0;i<num1;i++)
		{
			int sum=0;
			int count=0;
			
			for(int j=0;j<ary[i].length();j++)
			{

				if(ary[i].charAt(j)=='O')
				{
					count++;
					sum+=count;
				}
				else
				{
					count=0;
				}
			}
			System.out.println(sum);
		}
	}

}
