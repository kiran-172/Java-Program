class Student 
{
	private String name;
	private int age;
	private double marks;

    public Student (String name, int age, double marks)
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
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


public class SolveShadowProblem{
	public static void main(String[] args) 
	{

		Student s = new Student("Kiran",24,99.99);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getMarks());
	}
}