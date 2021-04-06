package javTricky;

public class NotAnNumber {
public static void main(String[] args) {
	try {
	
		System.out.println(9/0);
	}
	catch (ArithmeticException e) {
	System.out.println(e.getMessage());
	}
	System.out.println(9/3);
	System.out.println(9.0/0);
	System.out.println(Math.sqrt(-1));
	System.out.println(0.0/0);
	System.out.println(12.24f/0);
}
}
