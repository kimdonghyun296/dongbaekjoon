package q10828;

import java.util.Scanner;


public class Main{

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		Dstack dst=new Dstack(num1);
		


		for(int i=0;i<num1;i++)
		{
			String str1=sc.next();
			
			switch(str1)
			{
			case "push":int num2=sc.nextInt(); dst.push(num2);  break;
			case "pop": dst.pop();  break;
			case "size": dst.size();  break;
			case "empty": dst.empty();  break;
			case "top": dst.top();  break;
			}
		}
		sc.close();
		
	
		
	}
}
