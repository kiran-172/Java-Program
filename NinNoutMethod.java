class Calculator
{
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
}
class NinNoutMethod
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.add();
	}
}