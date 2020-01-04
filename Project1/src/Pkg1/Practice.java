package Pkg1;

public class Practice 
{
	////((((10+2)-2)+2)*2)/2) using global variable
	int A=10;
	int B=2;
	int Sum=A+B;
	int Sub=Sum-B;
	int Sum1=Sub+B;
	int Mul=Sum1*B;
	int Div=Mul/B;
	public int Sum () 
	{
		int Sum=A+B;
		System.out.println("Sum Result = "+ Sum);
		return Sum;
	}
	public int Sub()
	{
		int Sub=Sum-B;
		System.out.println("Sub Result = "+ Sub );
		return Sub;
	}
	public int Sum1() 
	{
		int Sum1=Sub+B;
		System.out.println("Sum1 Result = "+ Sum1);
		return Sum1;
	}
	public int Mul() 
	{
		int Mul=Sum1*B;
		System.out.println("Multiplication Result =" + Mul);
		return Mul;
	}
	public void Div() 
	{
		int Div=Mul/B;
		System.out.println("Final result of ((((10+2)-2)+2)*2)/2) = " + Div);
	}
	public static void main(String[] args) 
	{
	Practice Answer=new Practice();
		Answer.Sum();
		Answer.Sub();
		Answer.Sum1();
		Answer.Mul();
		Answer.Div();
	}
}