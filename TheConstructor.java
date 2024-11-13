class Student 
{
	private String name;
	private int age;
	private double marks;

    public student (String x, int y, double z)
	{
		name = x;
		age = y;
		marks = z;
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


public class TheConstructor{
	public static void main(String[] args) 
	{

		Student s = new Student("Kiran",24,99.99);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getMarks());
	}
}