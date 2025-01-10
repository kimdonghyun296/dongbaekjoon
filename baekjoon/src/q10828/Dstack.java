package q10828;

public class Dstack {
	int[] ary;
	int top;
			
	Dstack(int a)
	{
		ary=new int[a];
		top=-1;
	}

	public void push(int a)
	{
		ary[++top]=a;
	}
	public void pop()
	{
		if(top==-1)
		{
			//return -1;
			System.out.println(-1);		}
		else {
			int num1=ary[top];
			ary[top]=0;
			top--;
			System.out.println(num1);//return num1;
		}
	}
	public void size()
	{
		int result=top+1;
		System.out.println(result);//return result;
	}
	public void empty()
	{
		if(top==-1) {
			System.out.println(1);//return 1;
		}
		else {
			System.out.println(0);//return 0;
		}
	}
	public void top()
	{
		if(top==-1)
		{
			System.out.println(-1);//return -1;
		}
		else {
			System.out.println(ary[top]);//return ary[top];
		}
	}

}
