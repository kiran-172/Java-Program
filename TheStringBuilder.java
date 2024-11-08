class  TheStringBuilder
{
	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder();
		s1.append("Rama");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.ensureCapacity(100);
		System.out.println(s1.capacity());
		s1.insert(4,"Sita");
		s1.insert(0,"Laxmana");
		System.out.println(s1);
		s1.delete(12,16);
		System.out.println(s1);
		s1.deleteCharAt(7);
		char ch = s1.charAt(0);
		System.out.println(ch);
		StringBuilder s2 = new StringBuilder();
		s2.append("RamaSita");
		System.out.println(s2.indexOf("R"));
		System.out.println(s2.lastIndexOf("a"));
		System.out.println(s2.reverse());
	}
}
