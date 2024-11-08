class Calculator
{
	void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
}
class InNoutMethod
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int x = 10;
		int y = 20;
		c.add(x,y);
	}
}