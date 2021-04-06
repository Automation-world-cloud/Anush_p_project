package oops;

public class B1 extends A1 {
	int a=20;
	void show(int a)
	{
		System.out.println("The value of a is :"+super.a);
	}
	public static void main(String[] args) 
	{
		B1 b=new B1();
		b.show(30);
	}

}
