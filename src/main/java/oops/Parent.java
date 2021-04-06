package oops;

public class Parent {
	int speed=70;
	
	public void run()
	{
		System.out.println("parents runs at the speed of "+speed);
	}
public static void main(String[] args) {
	Parent p=new Parent();
	p.run();
}

}
