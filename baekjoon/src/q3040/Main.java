package q3040;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int[] ary=new int[9];
		
		for(int i=0;i<ary.length;i++)
		{
			int num1=sc.nextInt();
			if(num1>=1 && num1<=99)
			{
				ary[i]=num1;
			}
			else
			{
				sc.close();
				break;
			}
		}
		
		int count=0;
		
		for(int i=0;i<ary.length;i++)
		{
			count+=ary[i];
		}
		
		int answer=count-100;
		int a1=0;
		int a2=0;
		
		
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<9;j++)
			{
				if(ary[i]+ary[j]==answer)
				{
					a1=i;
					a2=j;
					
					
				}
				
			}
		}
		for(int i=0;i<ary.length;i++)
		{
			if(i!=a1 && i!=a2)
			{
				System.out.println(ary[i]);
			}
		}
		
		
	}

}
