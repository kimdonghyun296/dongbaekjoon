package q2588;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int[] ary1=new int[3];
		int[] ary2=new int[3];
		
		//Integer.parseInt(str) 문자열은 정수형으로 바꿔주는 방법
		
		String numberstr1 = String.valueOf(num1);
		String numberstr2 = String.valueOf(num2);
		
		for(int i=0;i<numberstr1.length();i++)
		{
			ary1[i] = numberstr1.charAt(i)-'0';
		}
		for(int i=0;i<numberstr2.length();i++)
		{
			ary2[i] = numberstr2.charAt(i)-'0';
		}
		for(int i=2;i>=0;i--)
		{
			System.out.println(num1*ary2[i]);
		}
		System.out.println(num1*num2);	
	}
	
	/*Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		//int[] ary1=new int[3];
		int[] ary2=new int[3];
		
		//ary1[0]=num1/100;
		//ary1[1]=num1%100;
		//ary1[2]=num1%10;
		
		ary2[0]=num2/100;
		ary2[1]=(num2%100)/10;
		ary2[2]=num2%10;
		
		for(int i=2;i>=0;i--)
		{
			System.out.println(num1*ary2[i]);
		}
	
		
		
		System.out.println(num1*num2);
		*/
}
