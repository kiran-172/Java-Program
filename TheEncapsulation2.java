class Student 
{
	private String name;
	private int age;
	private double marks;

	void setDetails(String x, int y, double z)
		{
		if(x.isEmpty() || y<0 || z<0.0)
			{
			System.out.println("Please provide valid details!!");
			}
			else
			{
				name = x;
				age = y;
				marks = z;
			}
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


public class TheEncapsulation2{
	public static void main(String[] args) 
	{

		Student s = new Student();
		s.setDetails("Kiran",24,90);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getMarks());
	}
}