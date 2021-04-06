package Rajineesh;

import java.util.Scanner;

public class StringREv {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter any name :");
	String name=s.nextLine();
	
	String reve="";
	for(int i=name.length()-1;i>=0;i--)
	{
		reve=reve+name.charAt(i);
	

	}
	System.out.println("reverse name is :"+reve);
	
	}
}
