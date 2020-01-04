package Pkg1;

import java.util.Scanner;

public class Day4_Assignment2 
//(((((X1-X2)*X3)-X4)+X5)/X6)
{
	public int sub(int x1,int x2)
	{
		int sub;
		sub=x1-x2;
		return sub;
	}
	public int mul(int x1, int x2)
	{
		int mul;
		mul=x1*x2;
		System.out.println("Multiply result = " + mul);
		return mul;
	}
	public int sum(int x1, int x2) 
	{
		int sum;
		sum=x1+x2;
		System.out.println("Sum result = " + sum);
		return sum;
	}
	public void div (int x1,int x2)
	{
		int div;
		div=x1/x2;
		System.out.println("Final Result of (((((X1-X2)*X3)-X4)+X5)/X6) = " + div);
	}
	
	public static void main(String[] args) 
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Input Value for X1");
		int X1=d.nextInt();
		System.out.println("X1 value = " + X1);
		System.out.println("Input Value for X2");
		int X2=d.nextInt();
		System.out.println("X2 Value = "+  X2);
		System.out.println("Input Value for X3");
		int X3=d.nextInt();
		System.out.println("X3 Value = " + X3);
		System.out.println("Input Value for X4");
		int X4=d.nextInt();
		System.out.println("X4 Value = " + X4);
		System.out.println("Input Value for X5");
		int X5=d.nextInt();
		System.out.println("X5 Value = " + X5);
		System.out.println("Input Value for X6");
		int X6=d.nextInt();
		System.out.println("X6 Value = " + X6);
		d.close();
		System.out.println("*************Equition result************");
		Day4_Assignment2 Answer=new Day4_Assignment2();
		int sub=Answer.sub(X1, X2);
		System.out.println("First Sub result = " + sub);
		int mul=Answer.mul(sub, X3);
		int sub1=Answer.sub(mul, X4);
		System.out.println("Second Sub result = " + sub1);
		int sum=Answer.sum(sub1, X5);
		Answer.div(sum, X6);	
	}
}
