package javTricky;

public class PrivateConstrictor {
	// ? can we create object for constructor which is private Ans:No
	//But we can create in two ways like in the program:PrivateConstrictor and TestConStructor;
	
	int age;
	static
	{
		PrivateConstrictor p1=new PrivateConstrictor();
	}
	public static  int createMeth()
	{
		PrivateConstrictor p3=new PrivateConstrictor();
		p3.age=40;
		return p3.age;
		
	}
	
	private PrivateConstrictor()
	{
		age=30;
	}
public static void main(String[] args) {
	PrivateConstrictor p=new PrivateConstrictor();
	System.out.println(p.age);
}
}
