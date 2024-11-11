class Addition
{
	int add(int x, int y){
		return x+y;
	}
	float add(int x, float y){
		return x+y;
	}
	float add(float x, int y){
		return x+y;
	}
	float add(float x, float y){
		return x+y;
	}
	double add(float x, double y){
		return x+y;
	}
	double add(double x, double y){
		return x+y;
	}
	int add(int x, int y, int z){
		return x+y;
	}
	float add(int x, float y, int z){
		return x+y+z;
	}
	float add(int x, int y, float z){
		return x+y+z;
	}
}

class TheMethodOverloading
{
	public static void main(String[] args){
		Addition a = new Addition();
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,20.0f));
		System.out.println(a.add(10,20,30.0f));
	}
}


/*class Addition
{
	int add(int x, int y){
		return x+y;
	}
	int add(int x, int y){
		return x+y;
	} //error
	//Method add (int, int) is already defined in class addition.
	float add(int x, float y){
		return x+y;
	}
	float add(float x, int y){
		return x+y;
	}
	float add(float x, float y){
		return x+y;
	}
	double add(float x, double y){
		return x+y;
	}
	double add(double x, double y){
		return x+y;
	}
	int add(int x, int y, int z){
		return x+y;
	}
	float add(int x, float y, int z){
		return x+y+z;
	}
	float add(int x, int y, float z){
		return x+y+z;
	}
}

class TheMethodOverloading
{
	public static void main(String[] args){
		Addition a = new Addition();
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,20.0f));
		System.out.println(a.add(10,20,30.0f));
	}
}*/