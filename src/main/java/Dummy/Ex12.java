package Dummy;

public class Ex12 {
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.print(num+ " ");
			printNum(num+1);
		}
	}
	public static void main(String[] args) {
		int number=1;
		printNum(number);
	}

}
