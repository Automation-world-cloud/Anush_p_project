package javaBasics;

public class Encapsulation {
int age=25;
private String name="Anush";

public void getName()
{
	System.out.println(name);
}
public void setName(String name)
{
	this.name=name;
}


public static void main(String[] args) {
	Encapsulation e=new Encapsulation();
	System.out.println(e.age);
	System.out.println(e.name);
}
}
