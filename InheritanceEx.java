package testLab.java;

class Student 
{
	int id;
	String name;
	 void Input() 
	 {
	  System.out.println("Student Details... ");
	 }
	}

	class Marks extends Student
	{
		int Marks=99;
		
	 void Display()
	 {
		 id=65;
		 name="Piyush baviskar";
		 
	  System.out.println(id +" "+name +"  "+Marks);
	 }
	}
	
	class Result extends Marks
	{
		

		
	 public static void main(String args[]) 
	 {
	  Marks s = new Marks();
	  s.Input();
	  s.Display();
	 }
	
	}