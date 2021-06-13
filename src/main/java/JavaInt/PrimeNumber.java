package JavaInt;

public class PrimeNumber {
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num % i==0)
			{
				return false;
			}
			break;
		}
		return true;
	}
	public static void getPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" " );
			}
		}
	}
public static void main(String[] args) {
	System.out.println(isPrime(2));
	getPrime(20);
}
}
