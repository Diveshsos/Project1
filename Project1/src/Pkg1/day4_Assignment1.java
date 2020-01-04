package Pkg1;

import java.util.Scanner;

//Assignment 1 (((((X1+X2)-X3)+X4)*X5)/X6)
public class day4_Assignment1

{
	public int sum(int X1,int X2) 
	{
		int sum;
		sum=X1+X2;
		return sum;
	}
	public int sub(int X1,int X3)
	{
		int sub;
		sub=X1-X3;
		System.out.println("Second Sub result = " + sub);
		return sub;
	}
	public int mul (int sub, int X5)
	{
		int mul;
		mul=sub*X5;
		System.out.println("Multiplication result = " + mul);
		return mul;
	}
	public void div (int mul, int X6)
	{
		int div;
		div=mul/X6;
		System.out.println("Final result of (((((X1+X2)-X3)+X4)*X5)/X6) = " + div);
	}
	public static void main(String[] args) 
	{
		Scanner test=new Scanner(System.in);
		int X1=test.nextInt();
		System.out.println("X1 value = "+ X1);
		int X2=test.nextInt();
		System.out.println("X2 value = "+ X2);
		int X3=test.nextInt();
		System.out.println("X3 value = "+ X3);
		int X4=test.nextInt();
		System.out.println("X4 value = "+ X4);
		int X5=test.nextInt();
		System.out.println("X5 value = "+ X5);
		int X6=test.nextInt();
		System.out.println("X6 value = "+ X6);
		test.close();
		System.out.println("********Equation Result********");
		day4_Assignment1 Answer=new day4_Assignment1();
		int sum=Answer.sum(X1, X2);
		System.out.println("First Sum result = " + sum);
		int sub=Answer.sub(sum, X3);
		int sum1=Answer.sum(sub, X4);
		System.out.println("Second Sum result = "+ sum1);
		int mul=Answer.mul(sum1, X5);
		Answer.div(mul, X6);			
	}

}
	

