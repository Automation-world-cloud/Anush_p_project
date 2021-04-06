package javTricky;

public class Test {
	public static void main(String[] args) {
		System.out.println(Main.x);
	}

}
class Main{
	public static final int x=90;
	static
	{
		System.out.println("This is Static value");
	}
}