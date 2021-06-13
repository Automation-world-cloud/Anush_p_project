package Dummy;

public class Ex21 {
	public static void main(String[] args) {
		int num=10;
		try
		{
		System.out.println(num/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hi anush");
		
	}

}
