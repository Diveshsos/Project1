package Pkg1;

public class Day3_Assignment2 
{
	public void metod1() 
	{
		this.method4(1,2,3);
		System.out.println("default method");
		this.method2(1);
		this.method5(1,2,3,4);
		this.method3(1,2);
	
	}
	public void method2(int a)
	{
		System.out.println("1 parameterized method");
	}
	public void method3(int a1,int a2)
	{
		System.out.println("2 parameterized method");
	}
	public void method4(int b1,int b2,int b3)
	{
		System.out.println("3 parameterized method");
	}
	public void method5(int c1,int c2, int c3,int c4)
	{
		System.out.println("4 parameterized method");
	}
	public static void main(String[] args) {
		Day3_Assignment2 D1=new Day3_Assignment2();
		D1.metod1();
	}
	
}
