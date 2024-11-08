class Calculator
{
	int add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
}
class NinOutMethod
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int res = c.add();
		System.out.println(res);
	}
}