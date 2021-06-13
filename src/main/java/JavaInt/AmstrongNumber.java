package JavaInt;

public class AmstrongNumber {
	public void isAmg(int num)
	{
		int cube=0;
		int r;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(cube==temp)
		{
			System.out.println("Number is amstrong");
		}
		else
		{
			System.out.println("Number is Not Amstrong");
		}
	}
public static void main(String[] args) {
	AmstrongNumber a=new AmstrongNumber();
	a.isAmg(154);
}
}
