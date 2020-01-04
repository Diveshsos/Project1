package Pkg1;

public class Day3_Assignment1

{
		public Day3_Assignment1 ()
	{
		this(1,2,3);
		System.out.println("Default constructor");
	}
		public Day3_Assignment1 (int a) 
	{
		this();
		System.out.println("1 parameterized constructor");
	}
		public Day3_Assignment1 (int A1,int A2)
	{
		this(1,2,3,4);
		System.out.println("2 parameterized constructor");
	}
		public Day3_Assignment1 (int b1,int b2,int b3) 
	{
		System.out.println("3 parameterized constructor");
	}
		public Day3_Assignment1 (int c1,int c2, int c3,int c4) 
	{
		this(1);
		System.out.println("4 parameterized constructor");
	}
		public static void main(String[] args) 
	{
		Day3_Assignment1 D=new Day3_Assignment1(1,2);
	}
}
