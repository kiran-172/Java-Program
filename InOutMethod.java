class Calculator
{
	int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
}
class InOutMethod
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int x = 10;
		int y = 20;
		int res = c.add(x,y);
		System.out.println(res);
	}
}