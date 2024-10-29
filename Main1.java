/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="SACHIN";
		String s2="SAURAV";
		int i = s1.compareTo(s2);
		System.out.println(i);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="SACHINTENDULKAR";
		String s2="SACHIN";
		int i = s1.compareTo(s2);
		System.out.println(i);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2=s1+"SITA";s
		System.out.println(s2);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		System.out.println(s3);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3="RAMA"+"SITA";
		String s4 = "RAMASITA";
		System.out.println(s3 == s4);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2=s1+"SITA";
		String s3="RAMASITA";
		System.out.println(s2 == s3);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		System.out.println(s3);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		String s4 = "RAMASITA";
		System.out.println(s3 == s4);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3=s1+s2;
		String s4 = "RAMASITA";
		System.out.println(s3);
		System.out.println(s3 == s4);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMA";
		String s2="SITA";
		String s3=s1.concat(s2);
		System.out.println(s3);
	}
}*/

/*class Main1
{
	public static void main(String[] args) 
	{
		String s1="RAMAsita";
		String s2=s1.toUpperCase();
		System.out.println(s2);
	}
}*/

/*class Main1{
	public static void main(String[] args){
		String s1="RAMAsita";
		String s2=s1.toLowerCase();
		System.out.println(s2);
		String s3=s2.toUpperCase();
		System.out.println(s3);
		int i=s1.indexOf("m");
		System.out.println(i);
		int f=s1.indexOf("M");
		System.out.println(f);
		String s4=s1.substring(4);
		System.out.println(s4);
		int g=s1.length();
		System.out.println(g);
		char[] ch1=s1.toCharArray();
		System.out.println(ch1);
        boolean a=s1.endsWith("ta");
		System.out.println(a);
		boolean b=s1.startsWith("RAMA");
		System.out.println(b);
		String s5=s1.substring(2, 4);
		System.out.println(s5);
		char ch=s1.charAt(0);
		System.out.println(ch);
  }
}*/

/*class Main1
{
	public static void main(String[] args){
		String s1=new String("Rama");
		String s2=s1.intern();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
	}
}*/

/*class Main1
{
	public static void main(String[] args){
		StringBuffer s1=new StringBuffer();
		s1.append("Rama");
		System.out.println(s1.capacity());
		System.out.println(s1);
	}
}*/

/*class Main1
{
	public static void main(String[] args){
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("Sachin Tendulkar is a Batsman");
		System.out.println(s1.capacity());
		System.out.println(s1);
	}
}*/

/*class Main1
{
	public static void main(String[] args){
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		StringBuffer s2=new StringBuffer();
		System.out.println(s2);
	}
}*/

class Main1
{
	public static void main(String[] args){
		StringBuffer s1=new StringBuffer();
		s1.append("Rama");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.ensureCapacity(100);
		System.out.println(s1.capacity());
		s1.insert(4, "Sita");
		s1.insert(0, "Laxmana");
		s1.delete(12, 16);
		s1.deleteCharAt(7);
		char ch=s1.charAt(0);
		System.out.println(ch);

		StringBuffer s2=new StringBuffer();
		s2.append("RamaSita");
		System.out.println(s2.indexOf("R"));
		System.out.println(s2.lastIndexOf("a"));
		System.out.println(s2.reverse());
	}
}