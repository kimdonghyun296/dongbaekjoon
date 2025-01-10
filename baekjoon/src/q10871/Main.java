package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int X=sc.nextInt();
		
		int[] arry=new int[N];
		
		for(int i=0;i<N;i++)
		{
			arry[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<N;i++)
		{
			if(arry[i]<X)
			{
				System.out.printf("%d ",arry[i]);
			}
		}
	}
}
