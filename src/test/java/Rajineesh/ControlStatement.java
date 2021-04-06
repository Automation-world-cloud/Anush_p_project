package Rajineesh;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter any number :");
	int num=s.nextInt();
	if(num%2==0)
	{
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	}
}
