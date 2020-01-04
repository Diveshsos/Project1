package Pkg1;

public class Student 
{
	int Age;
	int Roll_no;
	
	public void Display()
	{
		System.out.println("welcome to all of you");
	}
	public static void main(String[] args)
	{
		Student Deepak=new Student();
		Deepak.Age=18;
		System.out.println(Deepak.Age);
		Deepak.Roll_no=1;
		System.out.println(Deepak.Roll_no);
		Deepak.Display();
	}
}