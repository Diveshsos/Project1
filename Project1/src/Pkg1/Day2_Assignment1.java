package Pkg1;

public class Day2_Assignment1 
{
	//((((10+2)-2)+2)*2)/2) ---- Using local variable (Int A, Int B)
	public int sum(int A,int B)
	{
		int sum;
		sum = A+B;
		System.out.println("Sum result = " + sum);
		return sum;
	}
	public int sub(int C,int D)
	{
		int sub;
		sub=C-D;
		System.out.println("Sub result = " + sub);
		return sub;
	}
	public int mul(int E, int F)
	{
		int mul;
		mul=E*F;
		System.out.println("Multiplication result = " + mul);
		return mul;
	
	}
	public void div(int G,int H)
	{
		int div;
		div=G/H;
		System.out.println("Final result of ((((10+2)-2)+2)*2)/2) is " + div);
	}
	public static void main(String[] args)
	{
		Day2_Assignment1 answer=new Day2_Assignment1();
				int sum=answer.sum(10,2);
				int sub=answer.sub(sum,2);
				int sum1=answer.sum(sub,2);					
				int mul=answer.mul(sum1,2);					
				answer.div(mul,2);	
	}	
}
