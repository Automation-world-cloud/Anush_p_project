package javaBasics;

public class MethodOverLoading {
public void m1()
{
	System.out.println("This is normal method");
}
public void m1(int a)
{
	System.out.println("this is method 2");
}
public static void main(String[] args) {
	MethodOverLoading mol=new MethodOverLoading();
	mol.m1();
	mol.m1(1);
}
}
