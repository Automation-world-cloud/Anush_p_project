package javTricky;

public class IntegerCaching {
public static void main(String[] args) {
	Integer i=129;
	Integer j=129;
	if(i==j)//here the range of Integer is -127 to 128 so if we exceed automatically it execute else part
	{
		System.out.println("both are equal");
	}
	else
		
	{
		System.out.println("both are not equal");
	}
}
}
