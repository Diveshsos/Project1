package Pkg1;

public class Student1 
{
	int Age;
	int Roll_no;
	public void display() 
	{
		System.out.println("welcome to all of you ");
	}
	public void display1() {
		System.out.println("Automation in Demand");
	}
	public static void main(String[] args)
	{
		Student1 Div=new Student1();
		Div.Age=12;
		Div.Roll_no=007;
		Div.display();
		Div.display1();
		System.out.println(Div.Age);
		System.out.println(Div.Roll_no);		
	}
	
	
}
