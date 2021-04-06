package javTricky;

public class StaticBlockConcepts {
static//Static block is called even before the main method
{
	System.out.println("Hi This is Static block");
}
public static void test()//static method is not directly called by the jvm like static block we can call it implicitly
{
	System.out.println("This is Static Test method");
}
public static void cover()
{
	System.out.println("This is cover Method");
	test();
}
public static void main(String[] args) {
	System.out.println("Hi This is main method");
	test();
	StaticBlockConcepts.test();
	cover();
}
}
