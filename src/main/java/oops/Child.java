package oops;



public class Child extends Parent {
	int speed =90;
	public void run(int speed)
	{
		//super.run();
		System.out.println("children runs at the speed of :"+super.speed);
	}
public static void main(String[] args) 

{

Child c=new Child();
c.run(50);

}
}

