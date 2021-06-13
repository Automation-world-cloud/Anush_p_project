package JavaInt;

public class Palindrome {
	public static void main(String[] args) {
		isPolindrome(143);
	}
public static void isPolindrome(int num)
{
	int temp=num;
	int rev=0;
	while(num>0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	if(rev==temp)
	{
		System.out.println("number is polindrome :"+temp);
	}
	else
	{
		System.out.println("Number is not polindrome :"+temp);
	}
}
}
