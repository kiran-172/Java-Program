class Book
{
	private int pgNo;

	void setPgNo(int x){
		if(x > 0){
			pgNo = x;
		}
		else
		{
			System.out.println("Please Enter Valid Page Number");
		}
	}
	int getPgNo(){
			return pgNo;
		}
}

public class TheEncapsulation
{
	public static void main(String[] args){
		Book b = new Book();
		b.setPgNo(-100);
		System.out.println("Page Number is" + b.getPgNo());
	}
}