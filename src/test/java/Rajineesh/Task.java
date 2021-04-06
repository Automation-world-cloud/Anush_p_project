package Rajineesh;

import java.util.Scanner;

public class Task {
	int a,b,c;
	
	Scanner s=new Scanner(System.in);
	
	public void add()
	{
		System.out.println("------------Addition-------");
		System.out.println("enter first number :");
		a=s.nextInt();
		System.out.println("enter second number :");
		b=s.nextInt();
		c=a+b;
		if(c%2==0)
		{
			System.out.println("number is even :"+c);
		}
		else
		{
			System.out.println("number is odd :"+c);
		}
	}
public void sub()
{
	System.out.println("------------Substraction-------");
	System.out.println("enter first number :");
	a=s.nextInt();
	System.out.println("enter second number :");
	b=s.nextInt();
	c=a-b;
	if(c%2==0)
	{
		System.out.println("number is even :"+c);
	}
	else
	{
		System.out.println("number is odd :"+c);
	}
}
public void mul()
{
	System.out.println("------------Multiplication-------");
	System.out.println("enter first number :");
	a=s.nextInt();
	System.out.println("enter second number :");
	b=s.nextInt();
	c=a*b;
	if(c%2==0)
	{
		System.out.println("number is even :"+c);
	}
	else
	{
		System.out.println("number is odd :"+c);
	}
}
public void div()
{
	System.out.println("------------Division-------");
	System.out.println("enter first number :");
	a=s.nextInt();
	System.out.println("enter second number :");
	b=s.nextInt();
	c=a/b;
	if(c%2==0)
	{
		System.out.println("number is even :"+c);
	}
	else
	{
		System.out.println("number is odd :"+c);
	}
}
public static void main(String[] args) {
	Task t=new Task();
	t.add();
	t.sub();
	t.mul();
	t.div();
}
}
