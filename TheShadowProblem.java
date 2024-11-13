class Student 
{
	private String name;
	private int age;
	private double marks;

    public Student (String name, int age, double marks)
	{
		name = name; //1: name : same Global variable and local variable it shows shadow problem error in encapsulation using constructor 
		age = age;   //2: age : same Global variable and local variable it shows shadow problem error in encapsulation using constructor
		marks = marks; //3: marks: same Global variable and local variable it shows shadow problem error in encapsulation using constructor
	}

		String getName()
			{
			return name;
			}

		int getAge()
	        {
			return age;
			}

		double getMarks()
	        {
			return marks;
			}
}


public class TheShadowProblem{
	public static void main(String[] args) 
	{

		Student s = new Student("Kiran",24,99.99);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getMarks());
	}
}

//it shows error into the whole program because this error is shadow problem error in encapsulation same instance and local variable name so it refers to this problem